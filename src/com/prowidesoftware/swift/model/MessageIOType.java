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
package com.prowidesoftware.swift.model;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;

/**
 * Enumeration of messages flow types.
 * 
 * @author www.prowidesoftware.com
 * @since 7.0
 */
public enum MessageIOType {
	/**
	 * Message coming to the institution from SWIFT network
	 */
	incoming,
	/**
	 * Message produced in the institution to be introduced (or already did) in the SWIFT network
	 */
	outgoing,
	/**
	 * Messages coming from and going to the swift network
	 */
	both;

	public static boolean isValid(String ioType) {
		Validate.notNull(ioType, "ioType can not be null");
		for (MessageIOType t: values()) {
			if (StringUtils.equals(ioType.trim(), t.name()))
				return true;
		}
		return false;
	}
	
	public boolean isIncoming() {
		return StringUtils.equals(this.name(), MessageIOType.incoming.name());
	}
	public boolean isOutgoing() {
		return StringUtils.equals(this.name(), MessageIOType.outgoing.name());
	}
	public boolean isBoth() {
		return StringUtils.equals(this.name(), MessageIOType.both.name());
	}
}
