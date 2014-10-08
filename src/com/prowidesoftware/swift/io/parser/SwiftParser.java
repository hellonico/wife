/* 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
*/
package com.prowidesoftware.swift.io.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import com.prowidesoftware.swift.WifeException;
import com.prowidesoftware.swift.model.*;

/**
 * FIN Parser. This implementation now properly supports all system messages (i.e: messages for MT 0xx) and
 * service messages (for example: ACK).<br />
 * As part of this, the following is now also accepted:<br />
 * <ul>
 * <li>Block 4 may be a non-text block (for example: {4:{101:xx}{102:xx}})
 * <li>Support for unparsed texts (at message, block and tag levels)
 * <li>Support for user defined blocks (for example: {S:{T01:xxx}{T02:yyy}})
 * </ul><br />
 * This is based in the old SwiftParser2, that is now deprecated.<br />
 * 
 * @author www.prowidesoftware.com
 */
public class SwiftParser {

	/**
	 * Helper constant with the content of <code>System.getProperty("line.separator", "\n")</code>
	 */
	public static final String EOL = System.getProperty("line.separator", "\n");

	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SwiftParser.class.getName());

	private Reader reader;

	private StringBuffer buffer;

	/**
	 * Reference to the current message being parsed.
	 * This should be used when some parsing decision needs to be made based on a previous item parsed,
	 * like a value in a previous tag or block.
	 */
	private SwiftMessage currentMessage;

	/**
	 * Errors found while parsing the message.
	 */
	private final List errors = new ArrayList();

	private int lastBlockStartOffset = 0;

	/**
	 * Constructor with an input stream for parsing a message 
	 * @param is stream to read
	 */
	public SwiftParser(final InputStream is) {
		this(new InputStreamReader(is));
	}

	/**
	 * Constructor with a reader for parsing a message 
	 * @param r the Reader with the swift message to read
	 */
	public SwiftParser(final Reader r) {
		setReader(r);
	}

	/**
	 * Constructor with a String for parsing a message 
	 * @param message the String with the swift message to read
	 */
	public SwiftParser(final String message) {
		this(new StringReader(message));
	}

	/**
	 * default constructor.<br />
	 * <b>NOTE</b>: If this constructor is called, setReader must be called to use the parser
	 */
	public SwiftParser() {
	}

	/**
	 * sets the input reader.<br />
	 * <b>NOTE</b>: this resets the internal buffer
	 * @param r the reader to use
	 */
	public void setReader(final Reader r) {
		this.buffer = new StringBuffer();
		this.reader = r;
	}

	/**
	 * sets the input data to the received string.
	 * @param data the data to use as input
	 */
	public void setData(final String data) {
		setReader(new StringReader(data));
	}

	/**
	 * Parse a SWIFT message into a data structure
	 *  
	 * @return the parsed swift message object
	 * @throws IOException
	 */
	public SwiftMessage message() throws IOException {

		// create a message and store for local reference
		final SwiftMessage message = new SwiftMessage(false);
		this.currentMessage = message;

		// Clear all errors before starting the parse process
		this.errors.clear();
		try {
			boolean done = false;
			SwiftBlock b = null;
			do {
				// try to consume a block
				if ((b = consumeBlock()) != null) {
					if (log.isLoggable(Level.FINER)) {
						log.finer("consumed block: " + b);
					}
					this.currentMessage.addBlock(b);
				} else {
					if (log.isLoggable(Level.FINER)) {
						log.finer("no block consumed");
					}
					done = true;
				}
			} while (!done);
		} finally {
			// Clean the reference to the message being parsed
			this.currentMessage = null;
		}

		return (message);
	}

	/**
	 * Sets the parameter string as this parser data and returns the parsed object.
	 * 
	 * @param message the String with the swift message to parse
	 * @return the parsed swift message object
	 * @throws IOException
	 * 
	 * @since 6.0
	 */
	public SwiftMessage parse(final String message) throws IOException {
		setData(message);
		return message();
	}
	
	/**
	 * Consume the next block of the message on the reader.
	 * This methods seeks to a block start, then identifies the block
	 * and calls the proper method to consume the block type 
	 * that is coming, not all blocks are parsed in the same manner.
	 * @param blockHint 
	 * 
	 * @return the next block in the reader or <code>null</code> if none was found (i.e: end of input)
	 * @throws IOException if an error occurred during read
	 */
	protected SwiftBlock consumeBlock() throws IOException {

		// search for block start
		if (log.isLoggable(Level.FINEST)) {
			log.finest("consumeBlock: findBlockStart()");
		}
		findBlockStart();
		if (log.isLoggable(Level.FINEST)) {
			log.finest("block start found");
		}

		// read the block contents
		final String s = readUntilBlockEnds();
		if (log.isLoggable(Level.FINEST)) {
			log.finest("block buffer: [" + s + "]");
		}
		if (s.equals("")) {
			if (log.isLoggable(Level.FINEST)) {
				log.finest("end of input");
			}
			return (null);
		}

		// analyze if it is an unparsed text
		//
		// NOTE: This can happen when we have got a block 1 and there is already a block 1
		//
		if (s.startsWith("1:")) {

			if (log.isLoggable(Level.FINEST)) {
				log.finest("Possible unparsed text");
			}

			// check if the block 1 is already here
			if (this.currentMessage != null && this.currentMessage.getBlock1() != null) {

				// unparsed text => initialize value to append
				if (log.isLoggable(Level.FINEST)) {
					log.finest("It is an unparsed text");
				}
				final StringBuffer utBuffer = new StringBuffer();
				utBuffer.append("{");
				utBuffer.append(s);
				utBuffer.append("}");
				boolean done = false;
				while (!done) {

					// try to read a block of data
					final char data[] = new char[128];
					final int size = this.reader.read(data);
					if (size > 0) {

						// append the read buffer
						utBuffer.append(data);
					} else {
						// we are done
						done = true;
					}
				}
				final String unparsedText = utBuffer.toString();
				if (log.isLoggable(Level.FINEST)) {
					log.finest("unparsed texts to process: [" + unparsedText + "]");
				}

				// build an unparsed text list
				final UnparsedTextList list = processUnparsedText(unparsedText);
				if (list != null) {
					this.currentMessage.setUnparsedTexts(list);
				}

				// no more reading
				return (null);
			} else {
				if (log.isLoggable(Level.FINEST)) {
					log.finest("Regular block");
				}
			}
		}

		// identify and create the proper block
		final char blockId = identifyBlock(s);
		if (log.isLoggable(Level.FINEST)) {
			log.finest("blockId: " + blockId);
		}
		SwiftBlock b = null;
		if (blockId == ' ') {
			// block cannot be identified
			if (log.isLoggable(Level.SEVERE)) {
				log.severe("A block could not be identified!");
				log.severe("unidentified block:" + s);
			}

			throw new WifeException("The block " + s + " could not be identified");
		}

		// create the block object
		switch (blockId) {
		case '1': // block 1 (single valued)
			b = new SwiftBlock1(s);
			break;
		case '2': // block 2 (single valued)
			if (isInput(s)) {
				b = new SwiftBlock2Input(s);
			} else {
				b = new SwiftBlock2Output(s);
			}
			break;
		case '3': // block 3 (tag list)
			b = tagListBlockConsume(new SwiftBlock3(), s);
			break;
		case '4': // block 4
			if (isTextBlock(s)) {
				b = block4Consume(new SwiftBlock4(), s);
			} else {
				b = tagListBlockConsume(new SwiftBlock4(), s);
			}
			break;
		case '5': // block 5 (tag list)
			b = tagListBlockConsume(new SwiftBlock5(), s);
			break;
		default: // user defined block (tag list)
			b = tagListBlockConsume(new SwiftBlockUser(Character.toString(blockId)), s);
			break;
		}

		if (log.isLoggable(Level.FINEST)) {
			log.finest("Block consumed: " + b);
		}

		return (b);
	}
	
	/**
	 * adds an error to the error list
	 * @param string the error to add
	 */
	/*private void addError(String string) {
		// TODO add error generation
	}*/

	/**
	 * Attempt to detect if block 2 refers to an input or output message
	 * @param s the block 2 value (as a FIN value)
	 * @return whether it's an input block 2 (true) or an output one (false) 
	 */
	private boolean isInput(final String s) {

		if (log.isLoggable(Level.FINEST)) {
			log.finest("block 2 type detection: " + s);
		}

		// try to find out the in/out type
		final int i = s.indexOf(':');
		if (i >= 0 && (i + 1) < s.length()) {

			if (log.isLoggable(Level.FINEST)) {
				log.finest("checking if [" + Character.toUpperCase(s.charAt(i + 1)) + "] is input");
			}

			// check for input mark
			return (Character.toUpperCase(s.charAt(i + 1)) == 'I');
		}

		if (log.isLoggable(Level.FINEST)) {
			log.finest("assuming output block 2");
		}

		return (false);
	}

	/**
	 * consumes a tag list block (i.e: block 3, block 5 or user defined block)
	 * 
	 * @param b the block to set up tags into
	 * @param s the block data to process
	 * @return the processed block (the parameter b)
	 * @throws IOException 
	 */
	protected SwiftTagListBlock tagListBlockConsume(final SwiftTagListBlock b, final String s) throws IOException {

		if (log.isLoggable(Level.FINEST)) {
			log.finest("data to consume: " + s);
		}

		// start processing the block data
		final int start = s.indexOf(':');
		if (start >= 0 && (start + 1) < s.length()) {
			final String data = s.substring(start + 1);
			if (log.isLoggable(Level.FINEST)) {
				log.finest("data: " + data);
			}

			/*
			 * Enter a loop that will read any block or inner data
			 * The idea is to accept equally these strings:
			 * {block1}{block2}
			 * data1{block1}data2{block2}data3
			 */
			for (int i = 0; i < data.length(); i++) {
				final char c = data.charAt(i);
				if (c == '{') {
					final int end = data.indexOf('}', i);
					if (end >= 0 && data.length() > end) {

						final String inner = data.substring(i + 1, end);
						// Seek the cursor to last 'processed' position
						i = end;
						final Tag t = new Tag(inner);
						log.finest("" + t);
						b.addTag(t);
					}
				} else {
					// read all the characters until data end or a new '{'
					int end;
					for (end = i; end < data.length() && data.charAt(end) != '{'; end++) {
						;
					}
					final String unparsedText = data.substring(i, end).trim();
					if (log.isLoggable(Level.FINEST)) {
						log.finest("possible block unparsed text: \"" + unparsedText + "\"");
					}
					if (!"".equals(unparsedText)) {
						if (log.isLoggable(Level.FINEST)) {
							log.finest("adding block unparsed text: \"" + unparsedText + "\"");
						}
						b.unparsedTextAddText(unparsedText);
					} else {
						if (log.isLoggable(Level.FINEST)) {
							log.finest("ingoring empty trimed unparsed text");
						}
					}
					i = end - 1;
				}
			}
		}

		if (log.isLoggable(Level.FINEST)) {
			log.finest("processed block: " + b);
		}

		return (b);
	}

	/**
	 * Parses a block 4 from an input string. This method supports the two possible formats of
	 * a swift block 4:<br />
	 * <ul>
	 * <li><b>Text mode</b>: this is the common block 4 for categories 1 to 9.
	 * <li><b>Tag mode</b>: this is the same format as for blocks 3 and 5. This format is used by
	 * service messages (for example: ACK) and system messages (category 0).
	 * </ul><br />
	 * 
	 * @param b the block to set up tags into
	 * @param s the block data to process
	 * @return the processed block (the parameter b)
	 * @throws IOException 
	 */
	protected SwiftBlock4 block4Consume(final SwiftBlock4 b, String s) throws IOException {
		/*
		 * Note that if the block4 is a text block last character is -, which is part of the EOB
		 * since the parser removes the last }
		 */

		if (log.isLoggable(Level.FINEST)) {
			log.finest("block4Consume [" + s + "]");
		}

		// process by "tokenizing" the input, this meaning:
		// - skip the "4:" (block identifier)
		// - scan for a tag start character (maybe '{' or ':')
		//   - if start is '{' => find tag end by balancing braces => split tag (considering unparsed texts)
		//   - if start is ':' => find tag end as '<CR><LF>:[X]' => split tag (no unparsed texts)
		// - detect block end as '<CR><LF>-}' or '}'
		//
		int start = 0;
		if (s.charAt(start) == '4') {
			start++;
		}
		if (s.charAt(start) == ':') {
			start++;
		}

		final boolean isTextBlock = isTextBlock(s);
		
		Tag lastTag = null;
		// start processing tags
		while (start < s.length()) {

			if (log.isLoggable(Level.FINEST)) {
				log.finest("parsing at: begin [" + start + "] buffer [" + s.substring(start) + "]");
			}

			// position ourselves at something meaningful
			int begin = start;
			char c = ' ', prev;
			do {
				prev = c;
				c = s.charAt(start++);
			} while (start < s.length() && c != ':' && c != '{' && !(prev=='-' && c == '}'));
			if (log.isLoggable(Level.FINEST)) {
				log.finest("position: begin [" + begin + "] current [" + start + "]");
			}

			// check if we must correct end of unparsed text by "-}" (we don't want "-" to be unparsed text)
			int ignore = 0;
			if (c == '}') {
				if (s.charAt(start - 1) == '-') {
					ignore = 1;
				}
			}

			// check if we skiped an block unparsed text
			String unparsedText = s.substring(begin, start - ignore - 1).trim();
			if (log.isLoggable(Level.FINEST)) {
				log.finest("possible block unparsed text: \"" + unparsedText + "\"");
			}
			if (!"".equals(unparsedText)) {
				if (log.isLoggable(Level.FINEST)) {
					log.finest("adding block unparsed text: \"" + unparsedText + "\"");
				}
				b.unparsedTextAddText(unparsedText);
			} else {
				if (log.isLoggable(Level.FINEST)) {
					log.finest("ingoring empty trimed unparsed text");
				}
			}

			// if no more buffer => terminate
			if (start == s.length()) {
				if (log.isLoggable(Level.FINEST)) {
					log.finest("reached end of input, terminating");
				}
				continue;
			}

			// decide what are we looking at (notice that "-}" is detected by "}")
			int end = 0;
			String tag = null;
			String tagUnparsedText = null;
			switch (c) {
			case '}':
				// sanity check
				if (start != s.length()) {
					if (log.isLoggable(Level.FINEST)) {
						log.finest("reached end of block with pending input [" + s.substring(start) + "]");
					}
				}

				// force termination only if  ending string is -}
				if ((isTextBlock && ignore==1) || !isTextBlock) {
					start = s.length();
				}
				/*
				 * De la terminacion anterior debemos contemplar que termino el mensaje de alguna forma porque 
				 * parece que no se esta detectando bien y entra en loop infinito (bug reportado de hecho) 
				 */
				/// TODO review this log seems to be part of an infinite loop
				log.severe("malformed message: exit by bracket");
//				break;
			case ':':
				// get the tag text
				end = textTagEndBlock4(s, start, isTextBlock);
				tag = s.substring(start, end);
				break;
			case '{':
				// two things are possible here:
				// A) this is an unparsed text (i.e: the tag id is 1)
				// B) this is a valid tag (i.e: the tag id is not one)
				if (s.startsWith("1:", start)) {
					//
					// CASE A (an unparsed text)
					//
					if (log.isLoggable(Level.FINEST)) {
						log.finest("processing block unparsed text at [" + (start - 1) + "]");
					}

					// keep our position
					begin = start > 0 ? start - 1 : 0;
					end = begin + 1;
					while (end < s.length() && !s.startsWith("{1:", end)) {
						end = blockTagEnd(s, end + 1);
					}

					// get the unparsed text
					unparsedText = s.substring(begin, end);

					if (log.isLoggable(Level.FINEST)) {
						log.finest("block unparsed text from [" + begin + "] to [" + end + "] is [" + unparsedText + "]");
					}

					// add the unparsed text
					b.unparsedTextAddText(unparsedText);
				} else {
					//
					// CASE B (a tag)
					//

					// get the tag text
					end = blockTagEnd(s, start);
					tag = s.substring(start, end - 1);
					final int utPos = tag.indexOf("{1:");
					if (utPos != -1) {
						// separate unparsed texts from value 
						tagUnparsedText = tag.substring(utPos);
						tag = tag.substring(0, utPos);
					}
				}
				break;
			} /* switch(c) */

			// process the tag (only if we have a tag)
			if (tag != null) {
				if (log.isLoggable(Level.FINEST)) {
					log.finest("position: begin [" + begin + "] current [" + start + "] end [" + end + "]");
					log.finest("processing tag [" + tag + "]");
				}

				// process the tag
				final Tag t = consumeTag(tag, tagUnparsedText);
				if (log.isLoggable(Level.FINEST)) {
					log.finest("consumed tag [" + t + "]");
				}
				if (t != null) {
					b.addTag(t);
					lastTag = t;
				}
			}

			// continue processing from the end of this tag
			start = end;
		}

		// Strip EOB from last tags value
		stripEOB(lastTag);
		
		if (log.isLoggable(Level.FINEST)) {
			log.finest("processed block: " + b);
		}

		return (b);
	}

	private void stripEOB(Tag lastTag) {
		if (lastTag != null) {
			String v = lastTag.getValue();
			if (v != null) {
				/*
				 * In the parser we support both \r\n or \n as line separator
				 */
				if (v.endsWith("\r\n-"))
					lastTag.setValue(v.substring(0, v.length()-3));
				else if (v.endsWith("\n-")) {
					lastTag.setValue(v.substring(0, v.length()-2));
				}
			}
		}
	}

	/**
	 * finds the end of a text tag (i.e: ":TAG:VALUE"). This is used to parse block 4.<br />
	 * The function search the string looking for the occurrence of any of the sequences:<br />
	 * <ul>
	 * <li>"[LBR]:[X]"</li>
	 * <li>"[LBR]}"</li>
	 * <li>"[LBR]{"</li>
	 * <li>"}"</li>
	 * </ul>
	 * where "[LBR]" stands for any of: "[CR]", "[LF]" or "[CR][LF]"
	 * and "[X]" is any character other than [CR] and [LF].<br />
	 * Then considers the end of the tag as <b>NOT</b> containing the found sequence.<br />
	 * <b>NOTE</b>: the condition "-}" cannot happen because the terminating dash is already removed.<br />
	 * 
	 * renamed to state clearly that this search is only used in block4Consume
	 * 
	 * @param s the FIN input text
	 * @param start the position to start analysis at
	 * @return the position where the tag ends (excluding the <CR><LF>)
	 */
	protected int textTagEndBlock4(final String s, int start, boolean isTextBlock) {

		if (log.isLoggable(Level.FINEST)) {
			log.finest("textTagEnd: scan for text tag end starting at [" + start + "]");
		}

		// start scanning for tag end
		for (; start < s.length(); start++) {

			// check if we found tag end
			char c = s.charAt(start);
			if (log.isLoggable(Level.FINEST)) {
				log.finest("textTagEnd: cheking char [" + c + "]");
			}
			if (c == '\r' || c == '\n') {

				// keep this position
				final int begin = start;

				// repeat cause "\r\n", accept "\n\r" also
				if ((start + 1) == s.length()) {
					break;
				}
				c = s.charAt(++start);
				if (log.isLoggable(Level.FINEST)) {
					log.finest("textTagEnd: CR|LF cheking char [" + c + "]");
				}
				if (c == '\r' || c == '\n') {
					if ((start +1) == s.length()) {
						break;
					}
					c = s.charAt(++start);
				}
				if (log.isLoggable(Level.FINEST)) {
					log.finest("textTagEnd: final CR|LF char to check [" + c + "]");
				}

				// if open brace => it's a proper tag end (mixing BLOCK and TEXT tags, rare but...)
				// if closing brace => it's a proper tag end (because of block end)
				if ((!isTextBlock) && (c == '{' || c == '}' )) {
					// found it
					start = begin;
					break;
				}
				// if it's a colon followed by a character different than CR or LF (':x') => it's a proper tag end
				// because we have reached a new line with a beginning new tag.
				// Note: It is note sufficient to check for a starting colon because for some fields like
				// 77E for example, it is allowed the field content to have a ':<CR><LF>' as the second line
				// of its content.
				else if (c == ':' && !(start == s.length())) {
					final char z = s.charAt(++start);
					if (z != '\r' && z != '\n') {
						// found it
						start = begin;
						break;
					}
				}

				// not matched => skip current char and continue
				start = begin;
				continue;
			}

			// check if we found block end (as "-}")
			if (c == '-') {

				// check for closing brace
				c = (start + 1) < s.length() ? s.charAt(start + 1) : ' ';
				if (c == '}' && isTextBlock) {
					break;
				}
			}

			// check if we found block end (as "}")
			if (c == '}' && !isTextBlock) {
				break;
			}
		}

		if (log.isLoggable(Level.FINEST)) {
			log.finest("textTagEnd: found tag end at [" + start + "]");
		}

		return (start);
	}

	/**
	 * Finds the end of a block tag (i.e: "{TAG:VALUE}"). This is used to parse blocks other than 4.<br />
	 * The function search the string looking for the occurrence of the sequence "}". It is important to
	 * note that curly braces are balanced along the search.
	 * @param s the FIN input text
	 * @param start the position to start analysis at
	 * @return the position where the tag ends (including the "}")
	 */
	private int blockTagEnd(final String s, int start) {

		if (log.isLoggable(Level.FINEST)) {
			log.finest("blockTagEnd: scan for text tag end starting at [" + start + "]");
		}

		// scan until end or end of string
		int balance = 0;
		char c;
		do {
			// analyze this position
			switch ((c = s.charAt(start++))) {
			case '{':
				balance++;
				break;
			case '}':
				balance--;
				break;
			}
		} while (start < s.length() && (balance >= 0 || (balance == 0 && c != '}')));

		if (log.isLoggable(Level.FINEST)) {
			log.finest("blockTagEnd: found tag end at [" + start + "]");
		}

		return (start);
	}

	/**
	 * Process the input as a tag. That is: split name and value (and possibly unparsed texts).<br />
	 * The received buffer contains only the pertinent data for the tag (name and value). Trailing
	 * [CR][LF] on the text <b>MUST</b> not be present.
	 * 
	 * @param buffer the buffer containing the tag
	 * @param unparsedText the unparsed text to assign (use <code>null</code> if none is wanted).
	 * This single text is fragmented in multiple texts if there are more than one message. 
	 * @return a swift Tag
	 * @throws IOException
	 */
	protected Tag consumeTag(final String buffer, final String unparsedText) throws IOException {

		if (log.isLoggable(Level.FINEST)) {
			log.finest("consumeTag: buffer [" + buffer + "]");
			log.finest("consumeTag: unparsedText [" + unparsedText + "]");
		}

		// separate name and value
		final int sep = buffer.indexOf(':');
		String name = null;
		String value = null;
		if (sep != -1) {
			name = buffer.substring(0, sep);
			value = buffer.substring(sep + 1);
		} else {
			value = buffer;
		}

		// ignore empty tags (most likely, an "{}" in an unparsed text...)
		if ((name == null || name.equals("")) && (value == null || value.equals(""))) {

			if (log.isLoggable(Level.FINEST)) {
				log.finest("consumeTag: ignoring empty tag");
			}

			return (null); // no tag...
		}

		// remove terminating [CR][LF] (or any combination)
		int size = value.length();
		if (size > 0) {
			final char c = value.charAt(size - 1);
			if (c == '\r' || c == '\n') {
				size--;
			}
		}
		if (size > 0) {
			final char c = value.charAt(size - 1);
			if (c == '\r' || c == '\n') {
				size--;
			}
		}
		if (size != value.length()) {
			value = value.substring(0, size);
		}

		if (log.isLoggable(Level.FINE)) {
			log.log(Level.FINE, "consumeTag: name [{0}] value [{1}]", new Object[]{name, value});
		}

		// build the tag
		//
		// NOTE: if we will use different Tag classes, here is the instantiation point
		//
		final Tag t = new Tag();
		if (name!=null) {
			t.setName(name);
			t.setValue(value);
		} else {
			log.severe("Avoiding tag with null name and value "+value);
		}

		// if there is unparsed text => process it
		if (unparsedText != null) {
			t.setUnparsedTexts(processUnparsedText(unparsedText));
		}

		return (t);
	}

	/**
	 * this method receives a string that is a sequence of unparsed text and splits it into
	 * different unparsed texts. The algorithm is to split on message begin (i.e: "{1:" and
	 * balance curly braces). This last thing ensures that a single message with unparsed text
	 * inner messages is treated as one single unparsed text.<br />
	 * That is:<br />
	 * 
	 * <pre>
	 * {1:...}                 -- message block 1
	 * {4:...                  -- message block 4
	 *    {1:...}              -- \
	 *    {4:...               -- | one single unparsed text
	 *        {1:...}          -- | for block 4
	 *        {4:...}          -- /
	 *    }
	 * }
	 * </pre>
	 *   
	 * @param unparsedText the unparsed text to split (this parameter cannot be <b>null</b>).
	 * @return the list of unparsed texts. This can be <b>null</b> if the input is the empty string.
	 */
	private UnparsedTextList processUnparsedText(final String unparsedText) {

		if (log.isLoggable(Level.FINEST)) {
			log.finest("processUnparsedText: len [" + unparsedText.length() + "] input [" + unparsedText + "]");
		}

		// prepare to process
		UnparsedTextList list = null;

		// we start a new unparsed text at every "{1:"
		int start = 0;
		while (start < unparsedText.length()) {

			// find the block end (balancing braces)
			if (log.isLoggable(Level.FINEST)) {
				log.finest("processUnparsedText: starting scan at [" + start + "] len [" + unparsedText.length() + "]");
			}
			int end = start + 1;
			while ((end + 1) < unparsedText.length() && !unparsedText.startsWith("{1:", end)) {
				if (log.isLoggable(Level.FINEST)) {
					log.finest("processUnparsedText: entering end [" + end + "]");
				}
				end = blockTagEnd(unparsedText, end + 1);

				// include trailing white spaces
				while (end < unparsedText.length() && Character.isWhitespace(unparsedText.charAt(end))) {
					if (log.isLoggable(Level.FINEST)) {
						log.finest("processUnparsedText: skip white space char at [" + unparsedText.charAt(end) + "] pos [" + end + "]");
					}
					end++;
				}
			}

			// separate a text
			final String text = unparsedText.substring(start, end).trim();
			if (log.isLoggable(Level.FINEST)) {
				log.finest("processUnparsedText: unparsed text is [" + text + "]");
			}
			if (!text.equals("")) {

				// add it to the list (create it if needed)
				if (list == null) {
					list = new UnparsedTextList();
				}
				list.addText(text);
			}

			// continue with next text
			start = end;
		}

		if (log.isLoggable(Level.FINEST)) {
			log.finest("processUnparsedText: returning [" + list + "]");
		}

		return (list);
	}

	/**
	 * Identify the block to be consumed.
	 * 
	 * @param s the block identifier
	 * @return the block identifier or a space if the block can not be identified
	 */
	protected char identifyBlock(final String s) {
		if (log.isLoggable(Level.FINEST)) {
			log.finest("identifyBlock('" + s + "')");
		}
		if (s != null && s.length() > 1) {
			final char c = s.charAt(0);
			if ('0' <= c && c <= '9') {
				return (c);
			}
			if ('a' <= c && c <= 'z') {
				return (c);
			}
			if ('A' <= c && c <= 'Z') {
				return (c);
			}
		}
		return (' ');
	}

	/**
	 * Reads the buffer until end of block is reached.
	 * The initial character of the block must be already consumed and the
	 * reader has to be ready to consume the first character inside the block
	 * 
	 * <p>This method assumes that the starting block character was consumed 
	 * because that is required in order to identify the start of a block, and
	 * call this method which reads until this block ends.</p>
	 *  
	 * @return a string with the block contents
	 * @throws IOException
	 */
	protected String readUntilBlockEnds() throws IOException {
		final int start = buffer==null?0:buffer.length();
		int len = 0;
		int c;

		/*
		 * Best effort reading includes this End Of Block (EOB) logic:
		 * first proper end of block or last block start.
		 */
		boolean checkNested = true;
		
		// starts holds the amount of blockstart chars encountered, when this method
		// is called, the initial block start was consumed, and therefore, this is initialized in 1
		// this is needed to be able to include inner {} inside blocks
		int starts = 1;
		boolean done = false;
		int count=0;
		Boolean isTextBlock = null; 
		while (!done) {
			c = getChar();
			// check if we can set the textblock flag first
			if (isTextBlock == null && count++ >=3) {
				isTextBlock = isTextBlock();
				if (isTextBlock) {
					checkNested = false;
				}
			}
			// found EOF?
			if (c == -1) {
				if (log.isLoggable(Level.FINEST)) {
					log.finest("Found EOF");
				}
				done = true;
			} else {
				if (checkNested && isBlockStart((char) c)) {
					starts++;
				}
				if (isBlockEnd(isTextBlock, c)) {
					if (checkNested) {
						starts--;
						if (starts == 0) {
							done = true;
						} else {
							len++;
						}
					} else {
						done = true;
					}
				} else {
					len++;
					if (log.isLoggable(Level.FINEST)) {
						log.finest("len: " + len);
						log.finest("block spans: " + buffer.substring(start));
					}
				}
			}
		}

		final int end = start + len;
		// check for unbalanced { and }
		if (checkNested) {
			if (starts != 0 && (end - start) > 0) {
				if (log.isLoggable(Level.FINEST)) {
					log.finest("unbalanced '{' and '}' inside block (starts=" + starts + ")");
				}
			}
		}

		if (log.isLoggable(Level.FINEST)) {
			log.finest("start: " + start);
			log.finest("end: " + end);
			log.finest("substring from start: " + buffer.substring(start));
			log.finest("len: " + len);
		}

		return (buffer.substring(start, end));
	}

	private boolean isTextBlock() {
		// hack to report as block4 only text blocks 4 , check data in buffer
		if (this.lastBlockStartOffset >=0 && buffer.length()>this.lastBlockStartOffset)
			return isTextBlock(buffer.substring(this.lastBlockStartOffset));
		return false;
	}
	/** 
	 * Determines if the given string is the start of a textblock
	 */
	private boolean isTextBlock(String s) {
		// hack to report as block4 only text blocks 4 , check data in buffer
		if (s.length()<3)
			return false;
		final int offset;
		if (s.charAt(0)=='{')
			offset = 1;
		else
			offset = 0;
		final char c1 = s.charAt(offset+0);
		final char c2 = s.charAt(offset+1);
		if (c1=='4' && c2==':'){
			int c = offset+2;
			char tmp;
			while ((offset+c)<s.length()) {
				tmp = s.charAt(offset+c);
				c++;
				if (tmp == '{') {
					return false;
				} else if (tmp == ':') {
					return true;
				}
			}
			// Notice: for all 4: default is true since it's more lenient than tagmode
			return true;
		}
		return false;
	}


	private boolean isBlockEnd(Boolean isTextBlock, int curChar) {
		// check buffer
		if (isBlockEnd((char) curChar)) {
			if (log.isLoggable(Level.FINEST)) log.finest("EOB char reached");
			
			if ((isTextBlock!=null) && isTextBlock.booleanValue()) {
				char ult = buffer.charAt(buffer.length()-2);
				char antUlt = buffer.charAt(buffer.length()-3);
				if (antUlt == '\n' && ult == '-' )
					return true;
			} else {
				return true;
			}
		}
		return false;
	}

	private boolean isBlockEnd(final char c) {
		return c == '}';
	}

	/**
	 * read on the reader until a block start character or EOF is reached.
	 * @throws IOException if thrown during read
	 */
	protected void findBlockStart() throws IOException {
		int c;
		do {
			c = getChar();
		} while (c != -1 && !isBlockStart((char) c));
	}

	private boolean isBlockStart(final char c) {
		if (c == '{') {
			lastBlockStartOffset = buffer.length()-1;
			return true;
		}
		return false;
	}

	/**
	 * Read a char from stream and append it to the inner buffer
	 * @return the next char read
	 * @throws IOException if an error occurs during read
	 */
	private int getChar() throws IOException {
		final int c = reader.read();
		if (c >= 0) {
			buffer.append((char) c);
		}
		return c;
	}

	/**
	 * Get a copy of the errors found.
	 * users can manipulate this copy without affecting the original.
	 * 
	 * @return the list of errors found
	 */
	public List getErrors() {
		return new ArrayList(this.errors);
	}
}
