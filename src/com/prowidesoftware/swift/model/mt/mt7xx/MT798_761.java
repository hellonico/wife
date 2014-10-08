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
package com.prowidesoftware.swift.model.mt.mt7xx;

import java.io.Serializable;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 798_761<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT798_761 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "798_761";
// begin qualifiers constants	
	/**
	* Constant for qualifier with value ACTP 
	*/
	public static final String ACTP = "ACTP";
	/**
	* Constant for qualifier with value ADVP 
	*/
	public static final String ADVP = "ADVP";
	/**
	* Constant for qualifier with value ALTA 
	*/
	public static final String ALTA = "ALTA";
	/**
	* Constant for qualifier with value APPL 
	*/
	public static final String APPL = "APPL";
	/**
	* Constant for qualifier with value BENE 
	*/
	public static final String BENE = "BENE";
	/**
	* Constant for qualifier with value BILL 
	*/
	public static final String BILL = "BILL";
	/**
	* Constant for qualifier with value CONFIRM 
	*/
	public static final String CONFIRM = "CONFIRM";
	/**
	* Constant for qualifier with value CONT 
	*/
	public static final String CONT = "CONT";
	/**
	* Constant for qualifier with value COUR 
	*/
	public static final String COUR = "COUR";
	/**
	* Constant for qualifier with value CRED 
	*/
	public static final String CRED = "CRED";
	/**
	* Constant for qualifier with value CUST 
	*/
	public static final String CUST = "CUST";
	/**
	* Constant for qualifier with value DELV 
	*/
	public static final String DELV = "DELV";
	/**
	* Constant for qualifier with value DIRC 
	*/
	public static final String DIRC = "DIRC";
	/**
	* Constant for qualifier with value EFCT 
	*/
	public static final String EFCT = "EFCT";
	/**
	* Constant for qualifier with value EFRE 
	*/
	public static final String EFRE = "EFRE";
	/**
	* Constant for qualifier with value EMAL 
	*/
	public static final String EMAL = "EMAL";
	/**
	* Constant for qualifier with value FACT 
	*/
	public static final String FACT = "FACT";
	/**
	* Constant for qualifier with value FAXT 
	*/
	public static final String FAXT = "FAXT";
	/**
	* Constant for qualifier with value GUAR 
	*/
	public static final String GUAR = "GUAR";
	/**
	* Constant for qualifier with value ICST 
	*/
	public static final String ICST = "ICST";
	/**
	* Constant for qualifier with value IIAC 
	*/
	public static final String IIAC = "IIAC";
	/**
	* Constant for qualifier with value IINT 
	*/
	public static final String IINT = "IINT";
	/**
	* Constant for qualifier with value INDC 
	*/
	public static final String INDC = "INDC";
	/**
	* Constant for qualifier with value LEAS 
	*/
	public static final String LEAS = "LEAS";
	/**
	* Constant for qualifier with value LIMT 
	*/
	public static final String LIMT = "LIMT";
	/**
	* Constant for qualifier with value MAIL 
	*/
	public static final String MAIL = "MAIL";
	/**
	* Constant for qualifier with value MESS 
	*/
	public static final String MESS = "MESS";
	/**
	* Constant for qualifier with value OFFR 
	*/
	public static final String OFFR = "OFFR";
	/**
	* Constant for qualifier with value ORDR 
	*/
	public static final String ORDR = "ORDR";
	/**
	* Constant for qualifier with value OTHR 
	*/
	public static final String OTHR = "OTHR";
	/**
	* Constant for qualifier with value OWNB 
	*/
	public static final String OWNB = "OWNB";
	/**
	* Constant for qualifier with value PAYM 
	*/
	public static final String PAYM = "PAYM";
	/**
	* Constant for qualifier with value PGCO 
	*/
	public static final String PGCO = "PGCO";
	/**
	* Constant for qualifier with value PGDO 
	*/
	public static final String PGDO = "PGDO";
	/**
	* Constant for qualifier with value PGWO 
	*/
	public static final String PGWO = "PGWO";
	/**
	* Constant for qualifier with value PINV 
	*/
	public static final String PINV = "PINV";
	/**
	* Constant for qualifier with value PRIN 
	*/
	public static final String PRIN = "PRIN";
	/**
	* Constant for qualifier with value PROJ 
	*/
	public static final String PROJ = "PROJ";
	/**
	* Constant for qualifier with value REDC 
	*/
	public static final String REDC = "REDC";
	/**
	* Constant for qualifier with value REGM 
	*/
	public static final String REGM = "REGM";
	/**
	* Constant for qualifier with value SPDM 
	*/
	public static final String SPDM = "SPDM";
	/**
	* Constant for qualifier with value SPEC 
	*/
	public static final String SPEC = "SPEC";
	/**
	* Constant for qualifier with value STLC 
	*/
	public static final String STLC = "STLC";
	/**
	* Constant for qualifier with value STND 
	*/
	public static final String STND = "STND";
	/**
	* Constant for qualifier with value SURT 
	*/
	public static final String SURT = "SURT";
	/**
	* Constant for qualifier with value TELE 
	*/
	public static final String TELE = "TELE";
	/**
	* Constant for qualifier with value TEND 
	*/
	public static final String TEND = "TEND";
	/**
	* Constant for qualifier with value UNLM 
	*/
	public static final String UNLM = "UNLM";
	/**
	* Constant for qualifier with value WDAP 
	*/
	public static final String WDAP = "WDAP";
	/**
	* Constant for qualifier with value WDBF 
	*/
	public static final String WDBF = "WDBF";
	/**
	* Constant for qualifier with value WITHOUT 
	*/
	public static final String WITHOUT = "WITHOUT";
	/**
	* Constant for qualifier with value XCST 
	*/
	public static final String XCST = "XCST";
	/**
	* Constant for qualifier with value XIAC 
	*/
	public static final String XIAC = "XIAC";
	/**
	* Constant for qualifier with value XINT 
	*/
	public static final String XINT = "XINT";
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT798_761.class.getName());

	/**
	 * Creates an MT798_761 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT798_761 content
	 */
	public MT798_761(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT798_761 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT798_761 content
	 */
	public MT798_761(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT798_761 initialized with a new SwiftMessage
	 */
	/*
	public MT798_761() {
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
		return "798761";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20 at MT798_761 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 12, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 12 at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field12 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field12 getField12() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("12");
			if (t == null) {
				log.fine("field 12 not found");
				return null;
			} else {
				return new Field12(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 77E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 77E at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field77E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field77E getField77E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("77E");
			if (t == null) {
				log.fine("field 77E not found");
				return null;
			} else {
				return new Field77E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 27A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 27A at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field27A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field27A getField27A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("27A");
			if (t == null) {
				log.fine("field 27A not found");
				return null;
			} else {
				return new Field27A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21A at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field21A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21A getField21A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("21A");
			if (t == null) {
				log.fine("field 21A not found");
				return null;
			} else {
				return new Field21A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 13E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 13E at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field13E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field13E getField13E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("13E");
			if (t == null) {
				log.fine("field 13E not found");
				return null;
			} else {
				return new Field13E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22D at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field22D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22D getField22D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22D");
			if (t == null) {
				log.fine("field 22D not found");
				return null;
			} else {
				return new Field22D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22K, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22K at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field22K object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22K getField22K() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22K");
			if (t == null) {
				log.fine("field 22K not found");
				return null;
			} else {
				return new Field22K(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22E at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field22E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22E getField22E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22E");
			if (t == null) {
				log.fine("field 22E not found");
				return null;
			} else {
				return new Field22E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22J at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field22J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22J getField22J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22J");
			if (t == null) {
				log.fine("field 22J not found");
				return null;
			} else {
				return new Field22J(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22B at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field22B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22B getField22B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22B");
			if (t == null) {
				log.fine("field 22B not found");
				return null;
			} else {
				return new Field22B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22L, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22L at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field22L object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22L getField22L() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22L");
			if (t == null) {
				log.fine("field 22L not found");
				return null;
			} else {
				return new Field22L(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 50, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 50 at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field50 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field50 getField50() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("50");
			if (t == null) {
				log.fine("field 50 not found");
				return null;
			} else {
				return new Field50(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 50M, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 50M at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field50M object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field50M getField50M() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("50M");
			if (t == null) {
				log.fine("field 50M not found");
				return null;
			} else {
				return new Field50M(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 12E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 12E at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field12E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field12E getField12E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("12E");
			if (t == null) {
				log.fine("field 12E not found");
				return null;
			} else {
				return new Field12E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 39P, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 39P at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field39P object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field39P getField39P() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("39P");
			if (t == null) {
				log.fine("field 39P not found");
				return null;
			} else {
				return new Field39P(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 39C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 39C at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field39C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field39C getField39C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("39C");
			if (t == null) {
				log.fine("field 39C not found");
				return null;
			} else {
				return new Field39C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23B at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field23B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23B getField23B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("23B");
			if (t == null) {
				log.fine("field 23B not found");
				return null;
			} else {
				return new Field23B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 31L, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 31L at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field31L object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field31L getField31L() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("31L");
			if (t == null) {
				log.fine("field 31L not found");
				return null;
			} else {
				return new Field31L(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 31S, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 31S at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field31S object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field31S getField31S() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("31S");
			if (t == null) {
				log.fine("field 31S not found");
				return null;
			} else {
				return new Field31S(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 35L, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 35L at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field35L object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field35L getField35L() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("35L");
			if (t == null) {
				log.fine("field 35L not found");
				return null;
			} else {
				return new Field35L(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23E at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field23E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23E getField23E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("23E");
			if (t == null) {
				log.fine("field 23E not found");
				return null;
			} else {
				return new Field23E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 24E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 24E at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field24E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field24E getField24E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("24E");
			if (t == null) {
				log.fine("field 24E not found");
				return null;
			} else {
				return new Field24E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22G at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field22G object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22G getField22G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22G");
			if (t == null) {
				log.fine("field 22G not found");
				return null;
			} else {
				return new Field22G(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 50B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 50B at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field50B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field50B getField50B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("50B");
			if (t == null) {
				log.fine("field 50B not found");
				return null;
			} else {
				return new Field50B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53C at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field53C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53C getField53C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("53C");
			if (t == null) {
				log.fine("field 53C not found");
				return null;
			} else {
				return new Field53C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 25A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 25A at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field25A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field25A getField25A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("25A");
			if (t == null) {
				log.fine("field 25A not found");
				return null;
			} else {
				return new Field25A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 59, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 59 at MT798_761 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 52A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 52A at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field52A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field52A getField52A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("52A");
			if (t == null) {
				log.fine("field 52A not found");
				return null;
			} else {
				return new Field52A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 52D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 52D at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field52D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field52D getField52D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("52D");
			if (t == null) {
				log.fine("field 52D not found");
				return null;
			} else {
				return new Field52D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 58A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 58A at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field58A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field58A getField58A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("58A");
			if (t == null) {
				log.fine("field 58A not found");
				return null;
			} else {
				return new Field58A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 58D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 58D at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field58D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field58D getField58D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("58D");
			if (t == null) {
				log.fine("field 58D not found");
				return null;
			} else {
				return new Field58D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 49, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 49 at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field49 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field49 getField49() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("49");
			if (t == null) {
				log.fine("field 49 not found");
				return null;
			} else {
				return new Field49(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 26D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 26D at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field26D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field26D getField26D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("26D");
			if (t == null) {
				log.fine("field 26D not found");
				return null;
			} else {
				return new Field26D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20E at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field20E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field20E getField20E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("20E");
			if (t == null) {
				log.fine("field 20E not found");
				return null;
			} else {
				return new Field20E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 31R, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 31R at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field31R object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field31R getField31R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("31R");
			if (t == null) {
				log.fine("field 31R not found");
				return null;
			} else {
				return new Field31R(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 71F, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 71F at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field71F object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field71F getField71F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("71F");
			if (t == null) {
				log.fine("field 71F not found");
				return null;
			} else {
				return new Field71F(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 37J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 37J at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field37J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field37J getField37J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("37J");
			if (t == null) {
				log.fine("field 37J not found");
				return null;
			} else {
				return new Field37J(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 29A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 29A at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field29A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field29A getField29A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("29A");
			if (t == null) {
				log.fine("field 29A not found");
				return null;
			} else {
				return new Field29A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 29D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 29D at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field29D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field29D getField29D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("29D");
			if (t == null) {
				log.fine("field 29D not found");
				return null;
			} else {
				return new Field29D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 72C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 72C at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field72C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field72C getField72C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("72C");
			if (t == null) {
				log.fine("field 72C not found");
				return null;
			} else {
				return new Field72C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23X, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23X at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field23X object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23X getField23X() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("23X");
			if (t == null) {
				log.fine("field 23X not found");
				return null;
			} else {
				return new Field23X(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 29S, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 29S at MT798_761 is expected to be the only one.
	 * 
	 * @return a Field29S object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field29S getField29S() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("29S");
			if (t == null) {
				log.fine("field 29S not found");
				return null;
			} else {
				return new Field29S(t.getValue());
			}
		}
	}
	

/*
 * sequences code
 *
 */ 





}
