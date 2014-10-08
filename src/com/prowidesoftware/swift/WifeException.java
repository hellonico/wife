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
package com.prowidesoftware.swift;

/**
 * Base class for exceptions.
 * 
 * @author www.prowidesoftware.com
 * @version $Id: WifeException.java,v 1.1 2013/12/06 10:38:41 mgriffa Exp $
 */
public class WifeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * @see RuntimeException#RuntimeException()
	 */
	public WifeException() {
		super();
	}

	/**
	 * @see RuntimeException#RuntimeException(String, Throwable)
	 */
	public WifeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @see RuntimeException#RuntimeException(String)
	 */
	public WifeException(String message) {
		super(message);
	}

	/**
	 * @see RuntimeException#RuntimeException(Throwable)
	 */
	public WifeException(Throwable cause) {
		super(cause);
	}

}
