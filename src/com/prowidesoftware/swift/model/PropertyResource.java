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

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang.Validate;

/**
 * Common code for subclasses.
 * 
 * @author www.prowidesoftware.com
 * @since 3.3
 * @version $Id: PropertyResource.java,v 1.1 2013/12/06 10:38:40 mgriffa Exp $
 */
public abstract class PropertyResource {

	/**
	 * Property object to handle
	 */
	protected static final Properties prop = new Properties();

	/**
	 * Default constructor, loads the property file
	 */
	protected PropertyResource() {
		load();
	}


	private void load() {
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(getResourceName());
		if (is!=null) {
			try {
				prop.load(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Gets the resource name for the managed property
	 * @return String containing the resource name
	 */
	protected abstract String getResourceName();
	

	/**
	 * Checks the parameter code in the managed prperty
	 * @param code key to look for in the properties
	 * @return true if the property contains <code>code</code> as key
	 */
	public boolean isValidCode(String code) {
		Validate.notNull(code);
		return prop.containsKey(code.toUpperCase());
	}
	
}
