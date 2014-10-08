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
package com.prowidesoftware.swift.model.mt.mt4xx;

import java.io.Serializable;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 495<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT495 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "495";
// begin qualifiers constants	
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT495.class.getName());

	/**
	 * Creates an MT495 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT495 content
	 */
	public MT495(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT495 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT495 content
	 */
	public MT495(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT495 initialized with a new SwiftMessage
	 */
	/*
	public MT495() {
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
		return "495";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20 at MT495 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 21, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21 at MT495 is expected to be the only one.
	 * 
	 * @return a Field21 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21 getField21() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("21");
			if (t == null) {
				log.fine("field 21 not found");
				return null;
			} else {
				return new Field21(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 75, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 75 at MT495 is expected to be the only one.
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
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 77A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 77A at MT495 is expected to be the only one.
	 * 
	 * @return a Field77A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field77A getField77A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("77A");
			if (t == null) {
				log.fine("field 77A not found");
				return null;
			} else {
				return new Field77A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 11R, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 11R at MT495 is expected to be the only one.
	 * 
	 * @return a Field11R object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field11R getField11R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("11R");
			if (t == null) {
				log.fine("field 11R not found");
				return null;
			} else {
				return new Field11R(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 11S, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 11S at MT495 is expected to be the only one.
	 * 
	 * @return a Field11S object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field11S getField11S() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("11S");
			if (t == null) {
				log.fine("field 11S not found");
				return null;
			} else {
				return new Field11S(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 79, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 79 at MT495 is expected to be the only one.
	 * 
	 * @return a Field79 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field79 getField79() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("79");
			if (t == null) {
				log.fine("field 79 not found");
				return null;
			} else {
				return new Field79(t.getValue());
			}
		}
	}
	

/*
 * sequences code
 *
 */ 





}
