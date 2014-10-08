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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import com.prowidesoftware.swift.model.field.CurrencyContainer;
import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.field.Field30;
import com.prowidesoftware.swift.model.field.Field32A;

/**
 * Utility methods that provide higher level access to {@link SwiftMessage}
 * 
 * @author www.prowidesoftware.com
 * @since 6.0
 */
public class SwiftMessageUtils {
	private final SwiftMessage msg;
	
	public SwiftMessageUtils() {
		this(null);
	}

	public SwiftMessageUtils(SwiftMessage m) {
		this.msg = m;
	}
	
	public List<String> currencyStrings() {
		return SwiftMessageUtils.currencyStrings(msg);
	}

	/**
	 * Mirrors logic on {@link CurrencyContainer#currencyStrings()} including all fields
	 * @param m
	 * @return an empty list if none found
	 */
	public static List<String> currencyStrings(SwiftMessage m) {
		if (m != null) {
			final SwiftBlock4 b4 = m.getBlock4();
			if (b4 != null && !b4.isEmpty()) {
				final ArrayList<String> curs = new ArrayList<String>();
				for(Tag t: b4.getTags()) {
					final Field f = t.getField();
					if (f instanceof CurrencyContainer) {
						final CurrencyContainer cc = (CurrencyContainer) f;
						curs.addAll(cc.currencyStrings());
					}
				}
				return curs;
			}
		}
		return Collections.emptyList();
	}
	
	public Calendar valueDate() {
		return SwiftMessageUtils.valueDate(msg);
	}
	
	/**
	 * Get the value date for for the current message or null if non found.
	 * If more than one the first found is returned.
	 * 
	 * @param m
	 * @return
	 */
	public static Calendar valueDate(SwiftMessage m) {
		if (m != null) {
			final SwiftBlock4 b4 = m.getBlock4();
			if (b4 != null && !b4.isEmpty()) {
				// TODO rework this once we have DateContainer interface implemented and working
				if (b4.containsTag("32A")) {
					Field32A f = (Field32A) b4.getTagByName("32A").getField();
					return f.getComponent1AsCalendar();
				}
				if (b4.containsTag("30")) {
					Field30 f = (Field30) b4.getTagByName("30").getField();
					return f.getComponent1AsCalendar();
				}
			}
		}
		return null;
	}

	/**
	 * Proprietary checksum for message integrity verification.
	 * Please notice this is not the SWIFT trailer CHK field.
	 * @param model
	 * @return
	 */
	public static String calculateChecksum(SwiftMessage model) {
		//TODO missing implementation
		return null;
	}

}
