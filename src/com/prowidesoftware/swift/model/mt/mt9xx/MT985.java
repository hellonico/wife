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
package com.prowidesoftware.swift.model.mt.mt9xx;

import java.io.Serializable;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 985<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT985 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "985";
// begin qualifiers constants	
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT985.class.getName());

	/**
	 * Creates an MT985 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT985 content
	 */
	public MT985(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT985 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT985 content
	 */
	public MT985(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT985 initialized with a new SwiftMessage
	 */
	/*
	public MT985() {
		super();
	}
	*/
	
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "985";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20 at MT985 is expected to be the only one.
	 * 
	 * @return a Field20 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field20 getField20() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("20");
			if (t == null) {
				log.fine("field 20 not found");
				return null;
			} else {
				return new Field20(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57A at MT985 is expected to be the only one.
	 * 
	 * @return a Field57A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57A getField57A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("57A");
			if (t == null) {
				log.fine("field 57A not found");
				return null;
			} else {
				return new Field57A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57B at MT985 is expected to be the only one.
	 * 
	 * @return a Field57B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57B getField57B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("57B");
			if (t == null) {
				log.fine("field 57B not found");
				return null;
			} else {
				return new Field57B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57D at MT985 is expected to be the only one.
	 * 
	 * @return a Field57D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57D getField57D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("57D");
			if (t == null) {
				log.fine("field 57D not found");
				return null;
			} else {
				return new Field57D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 59, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 59 at MT985 is expected to be the only one.
	 * 
	 * @return a Field59 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field59 getField59() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("59");
			if (t == null) {
				log.fine("field 59 not found");
				return null;
			} else {
				return new Field59(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 75, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 75 at MT985 is expected to be the only one.
	 * 
	 * @return a Field75 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field75 getField75() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("75");
			if (t == null) {
				log.fine("field 75 not found");
				return null;
			} else {
				return new Field75(t.getValue());
			}
		}
	}
	

/*
 * sequences code
 *
 */ 





}
