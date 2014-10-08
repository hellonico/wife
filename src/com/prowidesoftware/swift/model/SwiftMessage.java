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
/*
 * Created on Sep 23, 2005 
 */
package com.prowidesoftware.swift.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.utils.IMessageVisitor;

/**
 * <p>Base class for swift messages.<br />
 * This class is a generic data structure container for SWIFT messages.</p>
 * 
 * <p>Instances of this class may have a list of unparsed texts (UnparsedTextList).
 * For easy access, methods have been created that first ensure the lists exists (the
 * real object is created and then call the base method).<br />
 * However, not all the base list methods have been implemented. If you need to use not
 * exposed functionality, retrieve the underlying list with (see getUnparsedTexts method).</p>
 * 
 * @author www.prowidesoftware.com
 */
public class SwiftMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SwiftMessage.class.getName());

	private static final int JSON_VERSION = 1;

	/**
	 * Block 1
	 */
	private SwiftBlock1 block1;

	/**
	 * Block 2
	 */
	private SwiftBlock2 block2;

	/**
	 * Block 3
	 */
	private SwiftBlock3 block3;

	/**
	 * Block 4
	 */
	private SwiftBlock4 block4;

	/**
	 * Block 5
	 */
	private SwiftBlock5 block5;

	/**
	 * Placeholder for the root of the sequences parsed in this message
	 */
	private SequenceNode parsedSequences;
	
	/**
	 * User defined blocks
	 * List of {@link SwiftBlockUser}.
	 * 
	 * @since 5.0
	 */
	protected List<SwiftBlockUser> userBlocks;

	/**
	 * List of unparsed texts. For performance reasons, this will be null until really needed.
	 */
	protected UnparsedTextList unparsedTexts = null;

	/**
	 * Identification of the message when persisted
	 */
	protected Long id;

	private boolean initBlocks = false;

	/**
	 * Default constructor.
	 * Must be called since here is performed default handler registration
	 * @see #SwiftMessage(boolean) 
	 */
	public SwiftMessage() {
		super();
		initBlocks();
	}

	/**
	 * Constructor that initializes blocks
	 * TODO document hibernate didn't work
	 * @param initBlocks when <code>false</code> the message will not have any blocks when constructed, if <code>true</code> blocks are created, just like with default constructor
	 */
	public SwiftMessage(final boolean initBlocks) {
		super();
		this.initBlocks = initBlocks;
		if (initBlocks) {
			initBlocks();
		}
	}

	/**
	 * Constructor for an unparsed text list that initializes blocks
	 * @param initBlocks when <code>false</code> the message will not have any blocks when constructed, if <code>true</code> blocks are created, just like with default consturctor
	 * @param unparsedText the list of unparsed texts
	 * @see SwiftMessage#SwiftMessage()
	 */
	public SwiftMessage(final boolean initBlocks, final UnparsedTextList unparsedText) {

		// base constructor
		this(initBlocks);

		// set the unparsed text list
		this.unparsedTexts = unparsedText;
	}

	/**
	 * Constructor for an unparsed text list
	 * @param unparsedText the list of unparsed texts
	 * @see SwiftMessage#SwiftMessage()
	 */
	public SwiftMessage(final UnparsedTextList unparsedText) {

		// base constructor
		this();

		// set the unparsed text list
		this.unparsedTexts = unparsedText;
	}

	/**
	 * initializes blocks
	 */
	private void initBlocks() {
		if (initBlocks) {
			addBlock(new SwiftBlock1());
			addBlock(new SwiftBlock2Input());
			addBlock(new SwiftBlock3());
			addBlock(new SwiftBlock4());
			addBlock(new SwiftBlock5());
			this.userBlocks = new ArrayList<SwiftBlockUser>();
		}
	}

	/**
	 * Get the block number specified by b.
	 * 
	 * @param b the block number to retrieve, must be greater or equal to 1 and smaller or equal to 5.
	 * @return the block number specified in this message
	 * @throws IllegalArgumentException if b &lt; 1 or b &gt; 5  
	 */
	public SwiftBlock getBlock(final int b) {

		// sanity check
		Validate.isTrue(1 <= b && b <= 5, "block index must be 1-5 (was " + b + ")");

		switch (b) {
		case 1:
			return (this.block1);
		case 2:
			return (this.block2);
		case 3:
			return (this.block3);
		case 4:
			return (this.block4);
		case 5:
			return (this.block5);
		}
		// should not be reached
		return null;
	}

	/**
	 * Commons-lang reflection toString implementation 
	 */
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * Add a block to this message.
	 * <pNotes: on user blocks, no checks are done, on swift blocks, block number 
	 * must be non null and have a value from 1-5 both inclusive</p>
	 * 
	 * @param b the block to add, may be <code>null</code> in which case nothing happens
	 * @throws IllegalArgumentException <code>b</code> is <code>null</code> or the method getInt in the block returns a value out of range (non user blocks)
	 */
	public void addBlock(final SwiftBlock b) {
		if (log.isLoggable(Level.FINE)) {
			log.fine("Add block " + b);
		}
		Validate.notNull(b);

		// support for user blocks in this method is useful for XML parser and other code that
		// takes advantages of using SwiftTagListBlock
		if (b instanceof SwiftBlockUser) {
			addUserBlock((SwiftBlockUser) b);
		} else {
			Validate.notNull(b.getNumber(), "SwiftBlock.getNumber() is null");
			final int index = b.getNumber().intValue();
			Validate.isTrue(index >= 1 && index <= 5, "SwiftBlock.getNumber int did not return an int between 1-5");
			switch (index) {
			case 1:
				setBlock1((SwiftBlock1) b);
				break;
			case 2:
				setBlock2((SwiftBlock2) b);
				break;
			case 3:
				setBlock3((SwiftBlock3) b);
				break;
			case 4:
				setBlock4((SwiftBlock4) b);
				break;
			case 5:
				setBlock5((SwiftBlock5) b);
				break;
			}
		}
	}

	/**
	 * Attempt to identify the current message type (MT).
	 * 
	 * @param type must be a valid registered handler id
	 * @return <code>true</code> if this message is successfully identified as the given MT and <code>false</code> in other case	 * 
	 * @throws IllegalArgumentException if parameter type is <code>null</code> or not a valid type (i.e: 3 chars len)
	 * @see SwiftBlock2#getMessageType()
	 * @see #getType()
	 * 
	 */
	public boolean isMT(final String type) {

		// sanity check
		Validate.notNull(type);
		Validate.isTrue(type.length() == 3, "The string must be exactly 3 chars size (type=" + type + ")");

		return (getType() != null && getType().equals(type));
	}

	/**
	 * Tell the message type associated with this object if a block 2 is present.
	 * 
	 * @return a String containing the SWIFT numeric code for the message types or <code>null</code> if the message does not have a block 2.
	 * @see SwiftBlock2#getMessageType()
	 */
	public String getType() {
		final SwiftBlock2 b2 = getBlock2();
		if (b2 == null) {
			return null;
		} else if (b2 instanceof SwiftBlock2Input) {
			return ((SwiftBlock2Input) b2).getMessageType();
		} else if (b2 instanceof SwiftBlock2Output) {
			return ((SwiftBlock2Output) b2).getMessageType();
		} else {
			return null;
		}
	}

	/**
	 * Visit the current message with the given visitor.
	 * This is a simple implementation of the visitor pattern.
	 * 
	 * @param visitor the visitor to use
	 * @throws IllegalArgumentException if parameter visitor is <code>null</code>
	 */
	public void visit(final IMessageVisitor visitor) {

		Validate.notNull(visitor);

		// start visiting
		visitor.startMessage(this);

		// visit block 1 and value
		final SwiftBlock1 b1 = getBlock1();
		if (b1 != null) {
			visitor.startBlock1(b1);
			visitor.value(b1, b1.getValue());
			visitor.endBlock1(b1);
		}
		;

		// visit block 1 and value
		final SwiftBlock2 b2 = getBlock2();
		if (b2 != null) {
			visitor.startBlock2(b2);
			visitor.value(b2, b2.getValue());
			visitor.endBlock2(b2);
		}
		;

		final SwiftBlock3 b3 = getBlock3();
		if (b3 != null) {
			visitor.startBlock3(b3);
			visit(b3, visitor);
			visitor.endBlock3(b3);
		}
		;

		final SwiftBlock4 b4 = getBlock4();
		if (b4 != null) {
			visitor.startBlock4(b4);
			visit(b4, visitor);
			visitor.endBlock4(b4);
		}
		;

		final SwiftBlock5 b5 = getBlock5();
		if (b5 != null) {
			visitor.startBlock5(b5);
			visit(b5, visitor);
			visitor.endBlock5(b5);
		}
		;

		// visit user defined blocks
		if (this.userBlocks != null) {

			// visit every user defined block
			for (int i = 0; i < this.userBlocks.size(); i++) {

				final SwiftBlockUser userBlock = (SwiftBlockUser) this.userBlocks.get(i);
				if (userBlock != null) {
					visitor.startBlockUser(userBlock);
					visit(userBlock, visitor);
					visitor.endBlockUser(userBlock);
				}
				;
			}
			;
		}
		;

		// stop visiting
		visitor.endMessage(this);
	}

	/**
	 * Visit a Block 3 (SwiftBlock3), i.e: call the tag method for block 3
	 * This method is called from {@link #visit(IMessageVisitor)} or the deprecated
	 * {@link #visit(SwiftBlock, IMessageVisitor)} but may be used independently, in such case,
	 * the startBlockX and endBlockX in the visitor will not be called.
	 * 
	 * @param block the block containing the tags to visit
	 * @param visitor the visitor to use
	 * @throws IllegalArgumentException if parameter block or visitor are <code>null</code>
	 * 
	 * @since 5.0
	 */
	public void visit(final SwiftBlock3 block, final IMessageVisitor visitor) {
		// sanity check
		Validate.notNull(block);
		Validate.notNull(visitor);

		// iterate thru tags
		for (final Iterator<Tag> it = block.tagIterator(); it.hasNext();) {
			visitor.tag(block, it.next());
		}
		;
	}

	/**
	 * Visit a Block 4 (SwiftBlock4), i.e: call the tag method for block 4
	 * This method is called from {@link #visit(IMessageVisitor)} or the deprecated
	 * {@link #visit(SwiftBlock, IMessageVisitor)} but may be used independently, in such case,
	 * the startBlockX and endBlockX in the visitor will not be called.
	 * 
	 * @param block the block containing the tags to visit
	 * @param visitor the visitor to use
	 * @throws IllegalArgumentException if parameter block or visitor are <code>null</code>
	 * 
	 * @since 5.0
	 */
	public void visit(final SwiftBlock4 block, final IMessageVisitor visitor) {
		// sanity check
		Validate.notNull(block);
		Validate.notNull(visitor);

		// iterate thru tags
		for (final Iterator<Tag> it = block.tagIterator(); it.hasNext();) {
			final Tag t = (Tag) it.next();
			visitor.tag(block, t);
		}
		;
	}

	/**
	 * Visit a Block 5 (SwiftBlock5), i.e: call the tag method for block 4
	 * This method is called from {@link #visit(IMessageVisitor)} or the deprecated
	 * {@link #visit(SwiftBlock, IMessageVisitor)} but may be used independently, in such case,
	 * the startBlockX and endBlockX in the visitor will not be called.
	 * 
	 * @param block the block containing the tags to visit
	 * @param visitor the visitor to use
	 * @throws IllegalArgumentException if parameter block or visitor are <code>null</code>
	 * 
	 * @since 5.0
	 */
	public void visit(final SwiftBlock5 block, final IMessageVisitor visitor) {
		// sanity check
		Validate.notNull(block);
		Validate.notNull(visitor);

		// iterate thru tags
		for (final Iterator<Tag> it = block.tagIterator(); it.hasNext();) {
			final Tag t = (Tag) it.next();
			visitor.tag(block, t);
		}
		;
	}

	/**
	 * Visit a User Defined Block (SwiftBlockUser), i.e: call the tag method for block 4
	 * This method is called from {@link #visit(IMessageVisitor)} or the deprecated
	 * {@link #visit(SwiftBlock, IMessageVisitor)} but may be used independently, in such case,
	 * the startBlockX and endBlockX in the visitor will not be called.
	 * 
	 * @param block the block containing the tags to visit
	 * @param visitor the visitor to use
	 * @throws IllegalArgumentException if parameter block or visitor are <code>null</code>
	 * 
	 * @since 5.0
	 */
	public void visit(final SwiftBlockUser block, final IMessageVisitor visitor) {
		// sanity check
		Validate.notNull(block);
		Validate.notNull(visitor);

		// iterate thru tags
		for (final Iterator<Tag> it = block.tagIterator(); it.hasNext();) {

			final Tag t = (Tag) it.next();
			visitor.tag(block, t);
		}
		;
	}

	/**
	 * Get the unique identifier of this message
	 * @return the message id
	 * @see #id
	 */
	public Long getId() {
		return (this.id);
	}

	/**
	 * Set the unique identifier of this message
	 * @param id the id to be set
	 * @see #id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Get the number of blocks in this message, including the user blocks
	 * @return an int greater or equal to zero
	 */
	public int getBlockCount() {
		return (this.getBlockCount(Boolean.TRUE));
	}

	/**
	 * Get the number of blocks in this message, optionally including the user blocks.<br>
	 * A block is summed if it is not <code>null</code> and is not empty.
	 * <b><em>NOTE: that isEmpty() will be called in each block, the behaviour of isEmpty is block 
	 * dependent</em></b>
	 *  
	 * @param includeUserBlocks indicates whether or not user defined blocks should be counted
	 * @return an int greater or equal to zero
	 * @see SwiftBlock1#isEmpty()
	 * @see SwiftBlock2Input#isEmpty()
	 * @see SwiftBlock2Output#isEmpty()
	 * @see SwiftBlock3#isEmpty()
	 * @see SwiftBlock4#isEmpty()
	 * @see SwiftBlock5#isEmpty()
	 */
	public int getBlockCount(final Boolean includeUserBlocks) {

		// count the basic blocks
		int count = 0;
		if (this.block1 != null && !getBlock1().isEmpty()) {
			count++;
		}
		if (this.block2 != null && !getBlock2().isEmpty()) {
			count++;
		}
		if (this.block3 != null && !getBlock3().isEmpty()) {
			count++;
		}
		if (this.block4 != null && !getBlock4().isEmpty()) {
			count++;
		}
		if (this.block5 != null && !getBlock5().isEmpty()) {
			count++;
		}

		// count user defined blocks (if requested to do so)
		if (includeUserBlocks.booleanValue() && this.userBlocks != null) {
			count += this.userBlocks.size();
		}

		return count;
	}

	/**
	 * Get block number 1 of this message, may be <code>null</code> if not set
	 * @return the block 1 of the message or <code>null</code>
	 */
	public SwiftBlock1 getBlock1() {
		return (this.block1);
	}

	/**
	 * Set the block 1 of the message
	 * @param block1 the content of the block 1
	 */
	public void setBlock1(final SwiftBlock1 block1) {
		this.block1 = block1;
	}

	/**
	 * Get block number 2 of this message, may be <code>null</code> if not set
	 * @return the block 2 of the message or <code>null</code>
	 */
	public SwiftBlock2 getBlock2() {
		return (this.block2);
	}

	/**
	 * Set the block 2 of the message
	 * @param block2 the content of the block 1
	 */
	public void setBlock2(final SwiftBlock2 block2) {
		this.block2 = block2;
	}

	/**
	 * Get block number 3 of this message, may be <code>null</code> if not set
	 * @return the block 3 of the message or <code>null</code>
	 */
	public SwiftBlock3 getBlock3() {
		return (this.block3);
	}

	/**
	 * Set the block 3 of the message
	 * @param block3 the content of the block 1
	 */
	public void setBlock3(final SwiftBlock3 block3) {
		this.block3 = block3;
	}

	/**
	 * Get block number 4 of this message, may be <code>null</code> if not set
	 * @return the block 4 of the message or <code>null</code>
	 */
	public SwiftBlock4 getBlock4() {
		return (this.block4);
	}

	/**
	 * Set the block 4 of the message
	 * @param block4 the content of the block 1
	 */
	public void setBlock4(final SwiftBlock4 block4) {
		this.block4 = block4;
	}

	/**
	 * Get block number 5 of this message, may be <code>null</code> if not set
	 * @return the block 5 of the message or <code>null</code>
	 */
	public SwiftBlock5 getBlock5() {
		return (this.block5);
	}

	/**
	 * Set the block 5 of the message
	 * @param block5 the content of the block 5
	 */
	public void setBlock5(final SwiftBlock5 block5) {
		this.block5 = block5;
	}

	/**
	 * Finds the position of a given User Defined Block in the internal list
	 * @param blockName the block name to find may be empty or null, in which case this method does nothing
	 * @return the position or <code>-1</code> if not found
	 *
	 * @since 5.0
	 */
	public int getUserBlockPosition(final String blockName) {
		// check parameters
		if (StringUtils.isBlank(blockName) || //check user blocks array
		(this.userBlocks == null)) {
			return -1;
		}

		// start scanning the list
		for (int i = 0; i < this.userBlocks.size(); i++) {
			final SwiftBlockUser userBlock = (SwiftBlockUser) this.userBlocks.get(i);
			if (userBlock != null && StringUtils.equals(userBlock.getName(), blockName)) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Get the list of List of {@link SwiftBlockUser} user defined blocks.
	 * The requested object may be <code>null</code> if the message was cleared or not initialized.
	 *
	 * @return the list or user blocks or null
	 * @since 5.0
	 */
	public List<SwiftBlockUser> getUserBlocks() {
		return (this.userBlocks);
	}

	/**
	 * Set the list of user defined blocks.<br>
	 * This method is mainly needed for persistence services.
	 * 
	 * @param userBlocks the new list of user defined blocks
	 * @throws IllegalArgumentException if parameter userBlocks is <code>null</code>
	 * @throws IllegalArgumentException if parameter userBlocks has elements of class other than SwiftBlockUser
	 * @since 5.0
	 * @see SwiftBlockUser
	 */
	protected void setUserBlocks(final List<SwiftBlockUser> userBlocks) {
		// sanity check
		Validate.notNull(userBlocks, "parameter 'userBlocks' cannot be null");
		Validate.allElementsOfType(userBlocks, SwiftBlockUser.class, "parameter 'userBlocks' may only have SwiftBlockUser elements");

		// setup the new list
		this.userBlocks = userBlocks;
	}

	/**
	 * Get a user defined block by name, may be <code>null</code> if not set
	 * 
	 * @param blockName the name of the block to find 
	 * @return the requested user defined block or <code>null</code>
	 * @throws IllegalArgumentException if parameter blockName is <code>null</code>
	 * @throws IllegalArgumentException if parameter blockName has an invalid block name
	 * @since 5.0
	 */
	public SwiftBlockUser getUserBlock(final String blockName) {
		// sanity check
		Validate.notNull(blockName, "parameter 'blockName' cannot be null");

		// find the block position
		int pos = getUserBlockPosition(blockName);
		if (pos != -1) {
			return ((SwiftBlockUser) this.userBlocks.get(pos));
		}

		return (null);
	}

	/**
	 * Get a user defined block by number, may be <code>null</code> if not set
	 * 
	 * @param blockNumber the number of the block to find 
	 * @return the requested user defined block or <code>null</code>
	 * @throws IllegalArgumentException if parameter userBlock is <code>null</code>
	 * @throws IllegalArgumentException if parameter userBlock has an invalid block name
	 *
	 * @since 5.0
	 */
	public SwiftBlockUser getUserBlock(final Integer blockNumber) {
		// sanity check
		Validate.notNull(blockNumber, "parameter 'blockNumber' cannot be null");

		return (this.getUserBlock(blockNumber.toString()));
	}

	/**
	 * Add a user defined block to the message (if the block already exists, it is replaced)
	 * @param userBlock the user defined block
	 * @throws IllegalArgumentException if parameter userBlock is <code>null</code>
	 * @throws IllegalArgumentException if parameter userBlock has an invalid block name
	 * @since 5.0
	 */
	public void addUserBlock(final SwiftBlockUser userBlock) {
		// sanity check
		Validate.notNull(userBlock);
		Validate.isTrue(userBlock.isValidName().booleanValue(), "Invalid name for User Defined Blocks (" + userBlock.getName() + ")");

		if (this.userBlocks == null) {
			this.userBlocks = new ArrayList<SwiftBlockUser>();
		}

		// find the block position (if it's already there)
		int pos = getUserBlockPosition(userBlock.getName());
		if (pos != -1) {
			this.userBlocks.add(pos, userBlock);
		} else {
			this.userBlocks.add(userBlock);
		}
	}

	/**
	 * removes a user defined block to the message (if the block does not exists, nothing is done)
	 * @param blockNumber the block number to remove
	 * @throws IllegalArgumentException if parameter blockNumber is <code>null</code>
	 * @throws IllegalArgumentException if parameter blockNumber is invalid
	 * @since 5.0
	 * @see SwiftBlockUser#isValidName(Integer)
	 */
	public void removeUserBlock(final Integer blockNumber) {
		// sanity check
		Validate.notNull(blockNumber, "parameter 'blockNumber' cannot be null");
		Validate.isTrue(SwiftBlockUser.isValidName(blockNumber).booleanValue(), "Invalid name for User Defined Blocks (" + blockNumber.toString() + ")");

		this.removeUserBlock(blockNumber.toString());
	}

	/**
	 * removes a user defined block to the message (if the block does not exists, nothing is done)
	 * @param blockName the block name to remove
	 * @throws IllegalArgumentException if parameter blockName is <code>null</code>
	 * @throws IllegalArgumentException if parameter blockName is invalid
	 * @since 5.0
	 */
	public void removeUserBlock(final String blockName) {
		// sanity check
		Validate.notNull(blockName, "parameter 'blockName' cannot be null");
		Validate.isTrue(SwiftBlockUser.isValidName(blockName).booleanValue(), "Invalid name for User Defined Blocks (" + blockName + ")");

		// find the block position (if it's there)
		final int pos = getUserBlockPosition(blockName);
		if (pos != -1) {
			this.userBlocks.remove(pos);
		}
	}

	/**
	 * remove all blocks from these message, including user blocks
	 */
	public void clear() {
		// release all blocks
		this.block1 = null;
		this.block2 = null;
		this.block3 = null;
		this.block4 = null;
		this.block5 = null;

		// release user blocks
		this.userBlocks = null;
	}

	/**
	 * Checks if the message is a fragment
	 * @return true if the message is a fragment
	 * 
	 * @since 5.0
	 */
	public Boolean isFragment() {
		// get the block 4 (if exists)
		final SwiftBlock4 b4 = this.getBlock4();
		if (b4 != null) {
			final String t202 = b4.getTagValue("202");
			final String t203 = b4.getTagValue("203");

			// if both tag exists => this is a fragment
			return (t202 != null && t203 != null ? Boolean.TRUE : Boolean.FALSE);
		}
		;

		return (Boolean.FALSE);
	}

	/**
	 * Checks if the message is the last fragment
	 * @return true if the message is the last fragment of a fragmented message
	 * 
	 * @since 5.0
	 */
	public Boolean isLastFragment() {
		if (!this.isFragment().booleanValue()) {
			return (Boolean.FALSE);
		}

		try {
			final Integer count = this.fragmentCount();
			final Integer number = this.fragmentNumber();
			return (count.intValue() == number.intValue() ? Boolean.TRUE : Boolean.FALSE);
		} catch (final UnsupportedOperationException uoe) {
		}
		;

		return (Boolean.FALSE);
	}

	/**
	 * Gets the total number of fragments of a fragmented message as informed in tag 203.
	 * 
	 * @return the total number of fragments or zero if the message is not fragmented
	 * @since 5.0
	 */
	public Integer fragmentCount() {
		// if this is not a fragment => 0
		if (!this.isFragment().booleanValue()) {
			return new Integer(0);
		}

		// get the block 4 and tag 203 (they BOTH exists here)
		final SwiftBlock4 b4 = this.getBlock4();
		final String t203 = b4.getTagValue("203");

		// process the number
		Integer _t203;
		try {
			_t203 = new Integer(Integer.parseInt(t203, 10));
		} catch (final NumberFormatException nfe) {
			throw new UnsupportedOperationException("message is not a fragment");
		}
		;

		return (_t203);
	}

	/**
	 * Gets the number of this fragment
	 * 
	 * @return the number of this fragment
	 * @throws UnsupportedOperationException if the message is not a part of a fragmented message
	 * @since 5.0
	 */
	public Integer fragmentNumber() {
		// if this is not a fragment => 0
		if (!this.isFragment().booleanValue()) {
			throw new UnsupportedOperationException("message is not a fragment");
		}

		// get the block 4 and tag 203 (they BOTH exists here)
		final SwiftBlock4 b4 = this.getBlock4();
		final String t202 = b4.getTagValue("202");

		// process the number
		Integer _t202;
		try {
			_t202 = new Integer(Integer.parseInt(t202, 10));
		} catch (final NumberFormatException nfe) {
			throw new UnsupportedOperationException("message is not a fragment");
		}
		;

		return (_t202);
	}

	/**
	 * verifies that the unparsed text list exists
	 */
	protected void unparsedTextVerify() {
		if (this.unparsedTexts == null) {
			this.unparsedTexts = new UnparsedTextList();
		}
	}

	/**
	 * returns the unparsed text list
	 * @return the unparsed text attached to this message
	 */
	public UnparsedTextList getUnparsedTexts() {
		// create the list if needed
		unparsedTextVerify();
		return (this.unparsedTexts);
	}

	/**
	 * sets the list of unparsed texts
	 * @param texts the new list of unparsed texts (may be null)
	 */
	public void setUnparsedTexts(final UnparsedTextList texts) {
		this.unparsedTexts = texts;
	}

	/**
	 * returns the size of the unparsed text list
	 * @return the count of unparsed texts attached to this message
	 */
	public Integer getUnparsedTextsSize() {
		// no list => size is zero...
		if (this.unparsedTexts == null) {
			return new Integer(0);
		}

		return this.unparsedTexts.size();
	}

	/**
	 * decides if a specific text (by index) is likely a SWIFT FIN message. Exceptions are inherited from
	 * base implementation methods.
	 * @param index the unparsed text number
	 * @return true if the unparsed text at position index is a full SWIFT message
	 * @throws IllegalArgumentException if parameter index is <code>null</code>
	 * @throws IndexOutOfBoundsException if parameter index is out of bounds
	 */
	public Boolean unparsedTextIsMessage(final Integer index) {
		// create the list if needed
		unparsedTextVerify();
		return (this.unparsedTexts.isMessage(index));
	}

	/**
	 * get an unparsed text
	 * @param index the unparsed text number
	 * @return the requested text
	 * @throws IllegalArgumentException if parameter index is <code>null</code>
	 * @throws IndexOutOfBoundsException if parameter index is out of bounds
	 */
	public String unparsedTextGetText(final Integer index) {
		// create the list if needed
		unparsedTextVerify();
		return (this.unparsedTexts.getText(index));
	}

	/**
	 * get an unparsed text as a parsed swift message
	 * @param index the unparsed text number
	 * @return the unparsed text at position index parsed into a SwiftMessage object
	 * @throws IllegalArgumentException if parameter index is <code>null</code> 
	 */
	public SwiftMessage unparsedTextGetAsMessage(final Integer index) {
		// create the list if needed
		unparsedTextVerify();
		return (this.unparsedTexts.getTextAsMessage(index));
	}

	/**
	 * adds a new unparsed text
	 * @param text the unparsed text to append
	 * @throws IllegalArgumentException if parameter text is <code>null</code> 
	 */
	public void unparsedTextAddText(final String text) {
		// create the list if needed
		unparsedTextVerify();
		this.unparsedTexts.addText(text);
	}

	/**
	 * adds a new unparsed text from a message
	 * @param message the message to be appended
	 * @throws IllegalArgumentException if parameter message is <code>null</code> 
	 */
	public void unparsedTextAddText(final SwiftMessage message) {
		// create the list if needed
		unparsedTextVerify();
		this.unparsedTexts.addText(message);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((block1 == null) ? 0 : block1.hashCode());
		result = prime * result + ((block2 == null) ? 0 : block2.hashCode());
		result = prime * result + ((block3 == null) ? 0 : block3.hashCode());
		result = prime * result + ((block4 == null) ? 0 : block4.hashCode());
		result = prime * result + ((block5 == null) ? 0 : block5.hashCode());
		result = prime * result + ((unparsedTexts == null) ? 0 : unparsedTexts.hashCode());
		result = prime * result + ((userBlocks == null) ? 0 : userBlocks.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SwiftMessage other = (SwiftMessage) obj;
		if (block1 == null) {
			if (other.block1 != null)
				return false;
		} else if (!block1.equals(other.block1))
			return false;
		if (block2 == null) {
			if (other.block2 != null)
				return false;
		} else if (!block2.equals(other.block2))
			return false;
		if (block3 == null) {
			if (other.block3 != null)
				return false;
		} else if (!block3.equals(other.block3))
			return false;
		if (block4 == null) {
			if (other.block4 != null)
				return false;
		} else if (!block4.equals(other.block4))
			return false;
		if (block5 == null) {
			if (other.block5 != null)
				return false;
		} else if (!block5.equals(other.block5))
			return false;
		if (unparsedTexts == null) {
			if (other.unparsedTexts != null)
				return false;
		} else if (!unparsedTexts.equals(other.unparsedTexts))
			return false;
		if (userBlocks == null) {
			if (other.userBlocks != null)
				return false;
		} else if (!userBlocks.equals(other.userBlocks))
			return false;
		return true;
	}
	
	/**
	 * Checks if the message is a cover payment, based on the content of the User Header (block3). 
	 * @return <code>true</code> if tag119:COV is found at User Header (block3)
	 */
	public boolean isCOV() {
		if (this.block3 != null) {
			return this.block3.containsTag(new Tag("119", "COV"));
		}
		return false;
	}
	
	/**
	 * Checks if the message is Straight Through Processing (STP), based on the content of the User Header (block3).
	 * @return <code>true</code> if tag119:STP is found at User Header (block3)
	 */
	public boolean isSTP() {
		if (this.block3 != null) {
			return this.block3.containsTag(new Tag("119", "STP"));
		}
		return false;
	}
	
	/**
	 * Gets the message sender BIC from the message headers.
	 * For outgoing messages this is the the logical terminal at block 1,
	 * and for incoming messages this is logical terminal at the MIR of block 2. 
	 * 
	 * @return the proper sender address or <code>null</code> if blocks 1 or 2 are not found or incomplete
	 */
	public String getSender() {
		try {
			if (getDirection() == MessageIOType.incoming) {
				return ((SwiftBlock2Output) getBlock2()).getMIRLogicalTerminal();
			} else if (getDirection() == MessageIOType.outgoing) {
				return getBlock1().getLogicalTerminal();
			} else {
				return null;
			}
		} catch (Exception e) {
			log.severe("Exception ocurred while retrieving sender's BIC from message data: "+e);
			return null;
		}
	}

	/**
	 * Gets the message receiver BIC from the message headers.
	 * For outgoing messages this is the receiver address at block 2,
	 * and for incoming messages this is logical terminal at block 1.
	 * 
	 * @return the proper receiver address or <code>null</code> if blocks 1 or 2 are not found or incomplete
	 */
	public String getReceiver() {
		try {
			if (getDirection() == MessageIOType.incoming) {
				return getBlock1().getLogicalTerminal();
			} else if (getDirection() == MessageIOType.outgoing) {
				return ((SwiftBlock2Input) getBlock2()).getReceiverAddress();
			} else {
				return null;
			}
		} catch (Exception e) {
			log.severe("Exception ocurred while retrieving receiver's BIC from message data: "+e);
			return null;
		}
	}
	
	/**
	 * Get all fields with the given name in the block 4.
	 * <em>Only direct naming is supported, 55a notation is NOT SUPPORTED</em>.
	 * 
	 * @param names list of names to add in fields to search
	 * @return a list with fields matching the given names. an empty list if none found
	 * @throws IllegalArgumentException if names is <code>null</code>
	 */
	public List<Field> fields (String ... names) {
		Validate.notNull(names, "names is null");
		final List<Field>result = new ArrayList<Field>();
		for (String n:names) {
			Tag[] tl = getBlock4().getTagsByName(n);
			if (tl != null && tl.length>0) {
				for (Tag t:tl) {
					result.add(t.getField());
				}
			}
		}
		return result;
	}

	/**
	 * Checks all blocks (1 to 5) and if a block is empty, it is removed from the message.
	 * @since 6.4
	 */
	public void removeEmptyBlocks() {
		if (this.block1 != null && getBlock1().isEmpty()) {
			this.block1 = null;
		}
		if (this.block2 != null && getBlock2().isEmpty()) {
			this.block2 = null;
		}
		if (this.block3 != null && getBlock3().isEmpty()) {
			this.block3 = null;
		}
		if (this.block4 != null && getBlock4().isEmpty()) {
			this.block4 = null;
		}
		if (this.block5 != null && getBlock5().isEmpty()) {
			this.block5 = null;
		}
	}

	/**
	 * get message type as an int or -1 if an error occurrs or it is not set
	 * @return
	 * @since 6.4.1
	 */
	public int getTypeInt() {
		try {
			return Integer.valueOf(getType());
		} catch (NumberFormatException e) {
			log.log(Level.WARNING, "Erorr converting type to int "+getType(),e);
			return -1;
		}
	}
	
	/**
	 * Returns the message direction from block 2 or null if block 2 is not found or incomplete
	 * @since 7.0
	 */
	public MessageIOType getDirection() {
		try {
			if (getBlock2().isOutput()) {
				return MessageIOType.incoming;
			} else if (getBlock2().isInput()) {
				return MessageIOType.outgoing;
			} else {
				return null;
			}
		} catch (Exception e) {
			log.severe("Exception ocurred while determining direction from message data: "+e);
			return null;
		}
	}
	
	/**
	 * Gets PDE from the trailer block or null if the trailer or the PDE field is not present
	 * @since 7.0
	 */
	public String getPDE() {
		return getBlock5() != null? getBlock5().getTagValue("PDE") : null;
	}

	/**
	 * Gets PDM from the trailer block or null if the trailer or the PDE field is not present
	 * @since 7.0
	 */
	public String getPDM() {
		return getBlock5() != null? getBlock5().getTagValue("PDM") : null;
	}
	
	/**
	 * Gets MIR from the application header block or null if the the message is not incoming or the application header block is null
	 * @since 7.0
	 */
	public String getMIR() {
		if (getBlock2() != null && getBlock2().isOutput()) {
			SwiftBlock2Output b2 = (SwiftBlock2Output) getBlock2();
			return b2.getMIR();
		} else {
			return null;
		}
	}

	/**
	 * Gets MUR from the application header block or null if the the message is not incoming or the application header block is null
	 * @since 7.0
	 */
	public String getMUR() {
		return getBlock3() != null? getBlock3().getTagValue("108") : null;
	}

	/**
	 * Gets UUID
	 * @since 7.0
	 */
	public String getUUID() {
		//TODO missing implementation
		return null;
	}

	public SequenceNode getParsedSequences() {
		return parsedSequences;
	}

	public void setParsedSequences(SequenceNode parsedSequences) {
		this.parsedSequences = parsedSequences;
	}

	/**
	 * return first results of fields() or <code>null</code> if none
	 * @param name
	 * @see #fields(String...)
	 * @return <code>null</code> if not found
	 */
	public Field field(String name) {
		final List<Field> l = fields(name);
		if (l.size()==0) 
			return null;
		return l.get(0);
	}
	
	/**
	 * Checks if the message is linked to other message based on the presence of a LINK sequence.
	 * @return true if the message has a LINK sequence, false if it hasn't, and <code>null</code> if cannot determine
	 * 
	 * @since 7.4
	 */
	public Boolean isLinked() {
		final SwiftBlock4 b4 = this.getBlock4();
		if (b4 != null) {
			return !b4.getSubBlock("LINK").isEmpty();
		}
		return null;
	}
	
	/**
	 * Return the message's LINK sequences if any.
	 * @return a block containing the found linkage sequences or <code>null</code> if cannot determine
	 * 
	 * @since 7.4
	 */
	public List<SwiftTagListBlock> getLinkages() {
		final SwiftBlock4 b4 = this.getBlock4();
		if (b4 != null) {
			return b4.getSubBlocks("LINK");
		}
		return null;
	}

	/**
	 * Get a json representation of this object.
	 * @since 7.5
	 */
	public String toJson() {
		final StringBuilder sb = new StringBuilder();
		sb.append("{ \"version\" : ").append(JSON_VERSION).append(",\n");
		
		final String ts = new SimpleDateFormat("yyyy-MM-dd HH:mm Z").format(Calendar.getInstance().getTime());
		sb.append(" \"timestamp\" : '").append(ts).append("',\n");
		
		sb.append(" \"data\" : { \n");

		sb.append("\"block1\" : \n");
		if (this.block1 == null) {
			sb.append(" {}");
		} else {
			sb.append(this.block1.toJson());
		}
		sb.append(",\n");

		sb.append("\"block2\" : \n");
		if (this.block2 == null) {
			sb.append(" {}");
		} else {
			sb.append(this.block2.toJson());
		}
		sb.append(",\n"); // block

		appendBlock("3", sb, this.block3);
		sb.append(',');
		appendBlock("4", sb, this.block4);
		sb.append(',');
		appendBlock("5", sb, this.block5);

		// add user blocks add if present - requires starting with a comma  
		if (this.userBlocks != null && !this.userBlocks.isEmpty()) {
			final Iterator<SwiftBlockUser> ubit = this.userBlocks.iterator();
			sb.append(',');
			sb.append("\"userblocks\" : [ \n");
			while (ubit.hasNext()) {
				final SwiftBlockUser ub = ubit.next();
				sb.append("{ ");
				sb.append("\"name\" :  \"").append(ub.getName()).append("\",\n \"tags\" : ");
				sb.append(ub.toJson());
				sb.append("}\n");
			}
			sb.append("] \n");
		}
		
		sb.append("}\n"); // data
		sb.append("}\n"); // message
		
		return sb.toString();
	}
	
	private void appendBlock(String blockName, StringBuilder sb, SwiftTagListBlock b) {
		sb.append("\"block"+blockName+"\" : \n");
		if (b == null) {
			sb.append("{ }");
		} else {
			sb.append(b.toJson());
		}
		sb.append("\n"); // block 
	}
	

}
