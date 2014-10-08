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

import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Base class for SWIFT <b>Application Header Block (block 2)</b>.<br>
 * The Application Header contains information about the 
 * message type and the destination of the message.
 * This is an optional blockin SWIFT messages.<br><br>
 * 
 * There are two types of application headers: Input and Output.
 * Both, input and output block 2 flavors are fixed-length and continuous with no field delimiters. 
 * The fields that conform the blocks's value are represented in the subclasses
 * as individual attributes for easier managment.<br><br>
 * 
 * This is an <b>abstract</b> class so especific block 2 subclasses should be instantiated.
 * 
 * @author www.prowidesoftware.com
 * @since 4.0
 * @version $Id: SwiftBlock2.java,v 1.2 2014/03/10 12:55:48 mgriffa Exp $
 */
public abstract class SwiftBlock2 extends SwiftValueBlock implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 
	 * String of 1 character containing the message priority as follows:<br>
	 * S = System<br>
	 * N = Normal<br>
	 * U = Urgent
	 */
	protected String messagePriority = "N";

	//private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SwiftBlock2.class);

	/**
	 * String of 3 character containing the Message Type (MT) 
	 * as classified and numbered by SWIFT. 
	 * Three-digit FIN message type, 000 � 999.
	 */
	protected String messageType;

	/**
	 * Default Constructor
	 */
	public SwiftBlock2() {

	}

	/**
	 * Sets the block number. Will cause an exception unless setting block number to 2.
	 * @param blockNumber the block number to set
	 * @throws IllegalArgumentException if parameter blockName is not the integer 2
	 * @since 5.0
	 */
	protected void setBlockNumber(final Integer blockNumber) {

		// sanity check
		Validate.notNull(blockNumber, "parameter 'blockNumber' cannot be null");
		Validate.isTrue(blockNumber.intValue() == 2, "blockNumber must be 2");
	}

	/**
	 * Sets the block name. Will cause an exception unless setting block number to "2".
	 * @param blockName the block name to set
	 * @throws IllegalArgumentException if parameter blockName is not the string "2"
	 * @since 5.0
	 */
	protected void setBlockName(final String blockName) {

		// sanity check
		Validate.notNull(blockName, "parameter 'blockName' cannot be null");
		Validate.isTrue(blockName.compareTo("2") == 0, "blockName must be string '2'");
	}

	/**
	 * Returns the block number (the value 2 as an integer)
	 * @return Integer containing the block's number
	 */
	public Integer getNumber() {
		return new Integer(2);
	}

	/**
	 * Returns the block name (the value 2 as a string)
	 * @return block name
	 * 
	 * @since 5.0
	 */
	public String getName() {
		return ("2");
	}

	/**
	 * convert this to string
	 */
	public String toString() {
		return (ToStringBuilder.reflectionToString(this));
	}

	/**
	 * Sets the Message Type (MT) as classified and numbered by SWIFT.
	 * Three-digit FIN message type, 000 � 999.
	 * 
	 * @param messageType String of 3 character
	 */
	public void setMessageType(final String messageType) {
		this.messageType = messageType;
	}

	/**
	 * Gets the Message Type (MT) as classified and numbered by SWIFT.
	 * @return messageType String of 3 character
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * Set the message priority 
	 * @param messagePriority the message priority
	 */
	public void setMessagePriority(final String messagePriority) {
		this.messagePriority = messagePriority;
	}

	/**
	 * Gets the message priority
	 * @return message priority
	 */
	public String getMessagePriority() {
		return messagePriority;
	}

	/**
	 * Returns <code>true</code> if this block 2 is an input block 2.
	 * @return <code>true</code> if block 2 is input, of <code>false</code> in other case
	 */
	public boolean isInput() {
		return (this instanceof SwiftBlock2Input);
	}

	/**
	 * Returns <code>true</code> if this block 2 is an output block 2.
	 * @return <code>true</code> if block 2 is output, of <code>false</code> in other case
	 */
	public boolean isOutput() {
		return (this instanceof SwiftBlock2Output);
	}
	
	/**
	 * Sets all attributes to null
	 * @since 6.4
	 */
	public void clean() {
		messagePriority = null;
		messageType = null;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((messagePriority == null) ? 0 : messagePriority.hashCode());
		result = prime * result + ((messageType == null) ? 0 : messageType.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SwiftBlock2 other = (SwiftBlock2) obj;
		if (messagePriority == null) {
			if (other.messagePriority != null)
				return false;
		} else if (!messagePriority.equals(other.messagePriority))
			return false;
		if (messageType == null) {
			if (other.messageType != null)
				return false;
		} else if (!messageType.equals(other.messageType))
			return false;
		return true;
	}
	
	/**
	 * intended to be overwritten
	 * @since 7.5
	 */
	public String toJson() {
		return null;		
	}	
}
