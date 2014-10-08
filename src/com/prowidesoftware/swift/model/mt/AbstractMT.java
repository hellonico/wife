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
package com.prowidesoftware.swift.model.mt;

import com.prowidesoftware.swift.io.ConversionService;
import com.prowidesoftware.swift.io.IConversionService;
import com.prowidesoftware.swift.model.BIC;
import com.prowidesoftware.swift.model.MtSwiftMessage;
import com.prowidesoftware.swift.model.SwiftBlock1;
import com.prowidesoftware.swift.model.SwiftBlock2;
import com.prowidesoftware.swift.model.SwiftBlock2Input;
import com.prowidesoftware.swift.model.SwiftBlock2Output;
import com.prowidesoftware.swift.model.SwiftMessage;
import com.prowidesoftware.swift.model.field.Field;


/**
 * Base class for specific MTs.<br />
 * This class implements several high level delegate methods of SwiftMessage.
 *
 * @author www.prowidesoftware.com
 * @since 6.0
 * @version $Id: AbstractMT.java,v 1.2 2014/02/19 12:50:04 sebastian Exp $
 */
abstract public class AbstractMT {
	private SwiftMessage m;
	
	/**
	 * @param m swift message to model as a particular MT
	 */
	public AbstractMT(SwiftMessage m) {
		this.m = m;
	}
	
	/**
	 * @param m swift message to model as a particular MT
	 */
	public AbstractMT(MtSwiftMessage m) {
		this.m = m.getModelMessage();
	}

	/**
	 * Creates a particular MT initialized with a new SwiftMessage.
	 * All blocks are initialized.
	 */
	public AbstractMT() {
		this.m = new SwiftMessage(true);
		if (getMessageType() != null) {
			this.m.getBlock2().setMessageType(getMessageType());
		}
	}

	/**
	 * @return the swift message object modeled as this particular MT
	 */
	public SwiftMessage getSwiftMessage() {
		return m;
	}

	/**
	 * @param m swift message to model as a particular MT
	 */
	public void setSwiftMessage(SwiftMessage m) {
		this.m = m;
	}
	
	/**
	 * @return application id from block 1
	 * @see SwiftBlock1#getApplicationId()
	 */
	public String getApplicationId() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getApplicationId();
		} else {
			return null;
		}
	}

	/**
	 * @return service id from block 1
	 * @see SwiftBlock1#getServiceId()
	 */
	public String getServiceId() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getServiceId();
		} else {
			return null;
		}
	}

	/**
	 * @return logical terminal from block 1
	 * @see SwiftBlock1#getLogicalTerminal()
	 */
	public String getLogicalTerminal() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getLogicalTerminal();
		} else {
			return null;
		}
	}

	/**
	 * @return session number from block 1
	 * @see SwiftBlock1#getSessionNumber()
	 */
	public String getSessionNumber() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getSessionNumber();
		} else {
			return null;
		}
	}

	/**
	 * @return sequence number from block 1
	 * @see SwiftBlock1#getSequenceNumber()
	 */
	public String getSequenceNumber() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getSequenceNumber();
		} else {
			return null;
		}
	}
	
	/**
	 * @return message priority from block 2
	 * @see com.prowidesoftware.swift.model.SwiftBlock2#getMessagePriority()
	 */
	public String getMessagePriority() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock2() != null) {
			return m.getBlock2().getMessagePriority();
		} else {
			return null;
		}
	}

	/**
	 * @return true if message is an input message sent to SWIFTNet, false otherwise
	 * @see com.prowidesoftware.swift.model.SwiftBlock2#isInput()
	 */
	public boolean isInput() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock2() != null) {
			return m.getBlock2().isInput();
		} else {
			return false;
		}
	}
	
	/**
	 * @return true if message is an output message received from SWIFTNet, false otherwise
	 * @see com.prowidesoftware.swift.model.SwiftBlock2#isOutput()
	 */
	public boolean isOutput() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock2() != null) {
			return m.getBlock2().isOutput();
		} else {
			return false;
		}
	}
	
	/**
	 * Sets the logical terminal field of the header block.<br> 
	 * It is fixed at 12 characters; it must not have X in position 9
	 * (padded with "X" if no branch is required).
	 * 
	 * @since 6.4
	 * @param BIC the SWIFT BIC code to set as sender address.
	 */
	public void setSender(String BIC) {
		if (getSwiftMessage() == null) {
			this.m = new SwiftMessage();
		}
		getSwiftMessage().getBlock1().setLogicalTerminal(BIC);
	}
	
	/**
	 * @since 6.4
	 * @see #setSender(String)
	 */
	public void setSender(BIC bic) {
		if (bic != null) {
			setSender(bic.getBic());
		}
	}

	/**
	 * Gets the logical terminal field of the header block.<br> 
	 * @return the found BIC code of the sender or null if the message or the header block are null.
	 * @since 6.4
	 */
	public String getSender() {
		if (getSwiftMessage() != null && getSwiftMessage().getBlock1() != null) {
			return getSwiftMessage().getBlock1().getLogicalTerminal();
		}
		return null;
	}

	/**
	 * Sets the logical terminal field of the application header block.<br> 
	 * It is fixed at 12 characters; it must have X in position 9
	 * (padded with "X" if no branch is required).
	 * 
	 * @since 6.4
	 * @param BIC the SWIFT BIC code to set as sender address.
	 */
	public void setReceiver(String BIC) {
		if (getSwiftMessage() == null) {
			this.m = new SwiftMessage();
		}
		SwiftBlock2 b2 = getSwiftMessage().getBlock2();
		if (b2.isInput()) {
			((SwiftBlock2Input)b2).setReceiverAddress(BIC);
		} else {
			((SwiftBlock2Output)b2).setMIRLogicalTerminal(BIC);			
		}
	}
	
	/**
	 * @since 6.4
	 * @see #setReceiver(String)
	 */
	public void setReceiver(BIC bic) {
		if (bic != null) {
			setReceiver(bic.getBic());
		}
	}

	/**
	 * Gets the logical terminal field of the application header block.<br> 
	 * @return the found BIC code of the sender or null if the message or the header block are null.
	 * @since 6.4
	 */
	public String getReceiver() {
		if (getSwiftMessage() != null && getSwiftMessage().getBlock2() != null) {
			SwiftBlock2 b2 = getSwiftMessage().getBlock2();
			if (b2.isInput()) {
				return ((SwiftBlock2Input)b2).getReceiverAddress();
			} else {
				return ((SwiftBlock2Output)b2).getMIRLogicalTerminal();			
			}
		}
		return null;
	}

	/**
	 * Adds the given field to the body block.
	 * @param f
	 */
	public void addField(Field f) {
		if (getSwiftMessage() == null) {
			this.m = new SwiftMessage();
		}
		getSwiftMessage().getBlock4().add(f);
	}
	
	/**
	 * Gets a String containing the FIN message (SWIFT MT message).
	 * 
	 * @return a string with the FIN format representation of the message
	 */
	public String FIN() {
		this.m.removeEmptyBlocks();
		IConversionService srv = new ConversionService();
		return srv.getFIN(this.m);
	}

	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	public abstract String getMessageType();

}