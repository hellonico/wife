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
 * This class models and parses the Message Output Reference (MOR).
 * 
 * @author www.prowidesoftware.com
 * @since 7.4
 * @version $Id: MOR.java,v 1.2 2014/01/29 14:34:46 sebastian Exp $
 * @see MIR
 */
public class MOR extends MIR {
	@SuppressWarnings("unused")
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MOR.class.getName());
	
	public MOR(String date, String logicalTerminal, String sessionNumber, String sequenceNumber) {
		super(date, logicalTerminal, sessionNumber, sequenceNumber);
	}
		
	public MOR(String value) {
		super(value);
	}
	
	public MOR() {
		super();
	}
	
	/**
	 * @see #getMIR() 
	 */
	public String getMOR() {
		return getMIR();
	}
}