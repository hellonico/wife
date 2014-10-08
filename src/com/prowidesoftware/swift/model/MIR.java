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
package com.prowidesoftware.swift.model;


/**
 * This class models and parses the Message Input Reference (MIR), 
 * String of 28 characters, always local to the sender of the message.
 * It includes the date the sender sent the message to SWIFT,
 * followed by the full LT address of the sender of the 
 * message, and the sender's session and sequence to SWIFT.
 * YYMMDD BANKBEBBAXXX 2222 123456<br><br>
 * 
 * @author www.prowidesoftware.com
 * @since 6.0
 * @version $Id: MIR.java,v 1.1 2013/12/06 10:38:40 mgriffa Exp $
 */
public class MIR {
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MIR.class.getName());

	/**
	 * @param date
	 * @param logicalTerminal
	 * @param sessionNumber
	 * @param sequenceNumber
	 */
	public MIR(String date, String logicalTerminal, String sessionNumber, String sequenceNumber) {
		super();
		this.date = date;
		this.logicalTerminal = logicalTerminal;
		this.sessionNumber = sessionNumber;
		this.sequenceNumber = sequenceNumber;
	}
	
	/**
	 * Creates a MIR object parsing the literal string value. 
	 * If the value is incorrect (cannot be parsed) the object will not be initialized.
	 * @param value the MIR value, it is expected to 28 characters length
	 */
	public MIR(String value) {
		super();
		if (value != null && value.length() == 28) {
			final StringBuffer sb = new StringBuffer(value);
	
			int offset = 0;
			int len;
	
			len = 6;
			this.date = String.valueOf(sb.subSequence(offset, offset + len));
			offset += len;
	
			len = 12;
			this.logicalTerminal = String.valueOf(sb.subSequence(offset, offset + len));
			offset += len;
	
			len = 4;
			this.sessionNumber = String.valueOf(sb.subSequence(offset, offset + len));
			offset += len;
	
			len = 6;
			this.sequenceNumber = String.valueOf(sb.subSequence(offset, offset + len));
		} else {
			log.severe("invalid MIR value "+value);
		}
	}

	/**
	 * Default constructor
	 */
	public MIR() {
		super();
	}

	/**
	 * 6 characters string containing the date field of the MIR.
	 */
	private String date;

	/**
	 * String of 12 characters containing the logical terminal field of the MIR
	 * (address of the sender of the message).
	 * @see "MIR on the WIFE Wiki"
	 */
	private String logicalTerminal;

	/**
	 * String of 4 characters containing the session number field of the MIR.
	 * @see "MIR on the WIFE Wiki"
	 */
	private String sessionNumber;

	/**
	 * String of 6 characters containing the sequence number field of the MIR.
	 * @see "MIR on the WIFE Wiki"
	 */
	private String sequenceNumber;

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the logical terminal
	 */
	public String getLogicalTerminal() {
		return logicalTerminal;
	}

	/**
	 * @param logicalTerminal
	 */
	public void setLogicalTerminal(String logicalTerminal) {
		this.logicalTerminal = logicalTerminal;
	}

	/**
	 * @return the session number
	 */
	public String getSessionNumber() {
		return sessionNumber;
	}

	/**
	 * @param sessionNumber
	 */
	public void setSessionNumber(String sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	/**
	 * @return the sequence number
	 */
	public String getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * @param sequenceNumber
	 */
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	/**
	 * Gets the full MIR (Message Input Reference) string of 28 
	 * characters containing the sender's date, LT address,
	 * session and sequence:<br>
	 * for example YYMMDDBANKBEBBAXXX2222123456<br>
	 * 
	 * @return a String with MIR, returns <code>null</code> if all MIR components are <code>null</code> 
	 */
	public String getMIR() {
		if (date == null && logicalTerminal == null && sessionNumber == null && sequenceNumber == null) {
			return null;
		}
		final StringBuffer v = new StringBuffer();
		if (date != null) {
			v.append(date);
		}
		if (logicalTerminal != null) {
			v.append(logicalTerminal);
		}
		if (sessionNumber != null) {
			v.append(sessionNumber);
		}
		if (sequenceNumber != null) {
			v.append(sequenceNumber);
		}
		return v.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((logicalTerminal == null) ? 0 : logicalTerminal.hashCode());
		result = prime * result
				+ ((sequenceNumber == null) ? 0 : sequenceNumber.hashCode());
		result = prime * result
				+ ((sessionNumber == null) ? 0 : sessionNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MIR other = (MIR) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (logicalTerminal == null) {
			if (other.logicalTerminal != null)
				return false;
		} else if (!logicalTerminal.equals(other.logicalTerminal))
			return false;
		if (sequenceNumber == null) {
			if (other.sequenceNumber != null)
				return false;
		} else if (!sequenceNumber.equals(other.sequenceNumber))
			return false;
		if (sessionNumber == null) {
			if (other.sessionNumber != null)
				return false;
		} else if (!sessionNumber.equals(other.sessionNumber))
			return false;
		return true;
	}
}