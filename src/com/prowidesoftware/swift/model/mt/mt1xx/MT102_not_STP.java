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
package com.prowidesoftware.swift.model.mt.mt1xx;

import com.prowidesoftware.swift.model.SwiftMessage;

/**
 * MT 102_not_STP<br /><br />
 *
 *		 
 * @author www.prowidesoftware.com
 * @since 6.0
 */
public class MT102_not_STP extends MT102 {
	private static final long serialVersionUID = 1L;
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT102_not_STP.class.getName());

	public MT102_not_STP(SwiftMessage m) {
		super(m);
	}
}