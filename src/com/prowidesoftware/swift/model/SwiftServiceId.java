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

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.enums.Enum;

/**
 * Class to hold valid service id values.
 * 
 * @author www.prowidesoftware.com
 * @since 6.0
 * @version $Id: SwiftServiceId.java,v 1.1 2013/12/06 10:38:40 mgriffa Exp $
 */
public class SwiftServiceId extends Enum {
	/**
	 * Constant for Service ID 01
	 */
	public static final SwiftServiceId _01 = new SwiftServiceId("01");
	/**
	 * Constant for Service ID 02
	 */
	public static final SwiftServiceId _02 = new SwiftServiceId("02");
	/**
	 * Constant for Service ID 03
	 */
	public static final SwiftServiceId _03 = new SwiftServiceId("03");
	/**
	 * Constant for Service ID 05
	 */
	public static final SwiftServiceId _05 = new SwiftServiceId("05");
	/**
	 * Constant for Service ID 06
	 */
	public static final SwiftServiceId _06 = new SwiftServiceId("06");
	/**
	 * Constant for Service ID 12
	 */
	public static final SwiftServiceId _12 = new SwiftServiceId("12");
	/**
	 * Constant for Service ID 13
	 */
	public static final SwiftServiceId _13 = new SwiftServiceId("13");
	/**
	 * Constant for Service ID 14
	 */
	public static final SwiftServiceId _14 = new SwiftServiceId("14");
	/**
	 * Constant for Service ID 15
	 */
	public static final SwiftServiceId _15 = new SwiftServiceId("15");
	/**
	 * Constant for Service ID 21
	 */
	public static final SwiftServiceId _21 = new SwiftServiceId("21");
	/**
	 * Constant for Service ID 22
	 */
	public static final SwiftServiceId _22 = new SwiftServiceId("22");
	/**
	 * Constant for Service ID 23
	 */
	public static final SwiftServiceId _23 = new SwiftServiceId("23");
	/**
	 * Constant for Service ID 25
	 */
	public static final SwiftServiceId _25 = new SwiftServiceId("25");
	/**
	 * Constant for Service ID 26
	 */
	public static final SwiftServiceId _26 = new SwiftServiceId("26");
	/**
	 * Constant for Service ID 33
	 */
	public static final SwiftServiceId _33 = new SwiftServiceId("33");
	/**
	 * Constant for Service ID 35
	 */
	public static final SwiftServiceId _35 = new SwiftServiceId("35");
	/**
	 * Constant for Service ID 42
	 */
	public static final SwiftServiceId _42 = new SwiftServiceId("42");
	/**
	 * Constant for Service ID 43
	 */
	public static final SwiftServiceId _43 = new SwiftServiceId("43");

	private static final long serialVersionUID = 1L;

	/**
	 * @param name
	 */
	protected SwiftServiceId(String name) {
		super(name);
	}

	/**
	 * Tell if name is a valid service id, true if it is, and false ni any other
	 * case. This method is null-safe.
	 * 
	 * @param name
	 *            the name to test as service id, may be <code>null</code>
	 * @return <code>true</code> if the parameter name is a valid service id
	 * @since 6.0
	 */
	@SuppressWarnings("unchecked")
	public static boolean contains(String name) {
		if (StringUtils.isNotEmpty(name)) {
			List values = getEnumList(SwiftServiceId.class);
			for (int i = 0; i < values.size(); i++) {
				if (StringUtils.equals(((Enum) values.get(i)).getName(), name)) {
					return true;
				}
			}
		}
		return false;
	}

}
