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
 * 
 */
package com.prowidesoftware.swift.model.mt.mt2xx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 203<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT203 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "203";
// begin qualifiers constants	
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT203.class.getName());

	/**
	 * Creates an MT203 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT203 content
	 */
	public MT203(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT203 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT203 content
	 */
	public MT203(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT203 initialized with a new SwiftMessage
	 */
	/*
	public MT203() {
		super();
	}
	*/
	
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "203";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 19, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 19 at MT203 is expected to be the only one.
	 * 
	 * @return a Field19 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field19 getField19() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("19");
			if (t == null) {
				log.fine("field 19 not found");
				return null;
			} else {
				return new Field19(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30 at MT203 is expected to be the only one.
	 * 
	 * @return a Field30 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30 getField30() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("30");
			if (t == null) {
				log.fine("field 30 not found");
				return null;
			} else {
				return new Field30(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 52A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 52A at MT203 is expected to be the only one.
	 * 
	 * @return a Field52A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field52A getField52A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("52A");
			if (t == null) {
				log.fine("field 52A not found");
				return null;
			} else {
				return new Field52A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 52D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 52D at MT203 is expected to be the only one.
	 * 
	 * @return a Field52D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field52D getField52D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("52D");
			if (t == null) {
				log.fine("field 52D not found");
				return null;
			} else {
				return new Field52D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53A at MT203 is expected to be the only one.
	 * 
	 * @return a Field53A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53A getField53A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("53A");
			if (t == null) {
				log.fine("field 53A not found");
				return null;
			} else {
				return new Field53A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53B at MT203 is expected to be the only one.
	 * 
	 * @return a Field53B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53B getField53B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("53B");
			if (t == null) {
				log.fine("field 53B not found");
				return null;
			} else {
				return new Field53B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53D at MT203 is expected to be the only one.
	 * 
	 * @return a Field53D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53D getField53D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("53D");
			if (t == null) {
				log.fine("field 53D not found");
				return null;
			} else {
				return new Field53D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 54A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 54A at MT203 is expected to be the only one.
	 * 
	 * @return a Field54A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field54A getField54A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("54A");
			if (t == null) {
				log.fine("field 54A not found");
				return null;
			} else {
				return new Field54A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 54B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 54B at MT203 is expected to be the only one.
	 * 
	 * @return a Field54B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field54B getField54B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("54B");
			if (t == null) {
				log.fine("field 54B not found");
				return null;
			} else {
				return new Field54B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 54D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 54D at MT203 is expected to be the only one.
	 * 
	 * @return a Field54D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field54D getField54D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("54D");
			if (t == null) {
				log.fine("field 54D not found");
				return null;
			} else {
				return new Field54D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 20 at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field20 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field20> getField20() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("20");
			final List<Field20> result = new ArrayList<Field20>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field20(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 21, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 21 at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field21 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field21> getField21() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("21");
			final List<Field21> result = new ArrayList<Field21>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field21(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 32B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 32B at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field32B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field32B> getField32B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("32B");
			final List<Field32B> result = new ArrayList<Field32B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field32B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 56A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 56A at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field56A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field56A> getField56A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("56A");
			final List<Field56A> result = new ArrayList<Field56A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field56A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 56D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 56D at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field56D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field56D> getField56D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("56D");
			final List<Field56D> result = new ArrayList<Field56D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field56D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 57A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 57A at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field57A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field57A> getField57A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("57A");
			final List<Field57A> result = new ArrayList<Field57A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field57A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 57B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 57B at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field57B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field57B> getField57B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("57B");
			final List<Field57B> result = new ArrayList<Field57B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field57B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 57D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 57D at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field57D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field57D> getField57D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("57D");
			final List<Field57D> result = new ArrayList<Field57D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field57D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 58A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 58A at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field58A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field58A> getField58A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("58A");
			final List<Field58A> result = new ArrayList<Field58A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field58A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 58D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 58D at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field58D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field58D> getField58D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("58D");
			final List<Field58D> result = new ArrayList<Field58D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field58D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 72, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 72 at MT203 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field72 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field72> getField72() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("72");
			final List<Field72> result = new ArrayList<Field72>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field72(tags[i].getValue()));
			}
			return result;
		}
	}
	

/*
 * sequences code
 *
 */ 


	public static class SequenceA extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"19"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "19"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"30"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "30"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "52A", "52D", "53A", "53B", "53D", "54A", "54B", "54D", "72"   };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceA newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceA newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceA result = new SequenceA();

			result.addTag(new Tag(START[start], ""));

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(new Tag(END[end], ""));

			return result;
		}

			}

 	/**
	* Get the single occurrence of SequenceA delimited by {@value SequenceA#START} and {@value SequenceA#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceA getSequenceA() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceA.START, SequenceA.END, SequenceA.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceA: is null");
				} else {
					log.fine("content for sequence SequenceA: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceA();
			} else {
				return new SequenceA(content);
			}
		}
		return null;
	}
 


	public static class SequenceB extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"20"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "20"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"58A", "58D"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "58A", "58D"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "72"   };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceB newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceB newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceB result = new SequenceB();

			result.addTag(new Tag(START[start], ""));

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(new Tag(END[end], ""));

			return result;
		}

			}

	/**
	* Get the list of SequenceB delimited by  {@value SequenceB#START} and {@value SequenceB#END} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* 
	*/
	public List<SequenceB> getSequenceBList() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final List<SequenceB> result = new ArrayList<SequenceB>();
			final List<SwiftTagListBlock> bs = b4.getSubBlocksDelimitedWithOptionalTail(SequenceB.START, SequenceB.END, SequenceB.TAIL); 
			if (bs != null && !bs.isEmpty()) {
				for (final SwiftTagListBlock s : bs) {
					result.add(new SequenceB(s));
				}
			}
			return result;
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 





}
