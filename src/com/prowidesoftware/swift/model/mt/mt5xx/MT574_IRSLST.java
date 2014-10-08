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
package com.prowidesoftware.swift.model.mt.mt5xx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 574_IRSLST<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT574_IRSLST extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "574_IRSLST";
// begin qualifiers constants	
	/**
	* Constant for qualifier with value ACCL 
	*/
	public static final String ACCL = "ACCL";
	/**
	* Constant for qualifier with value ACOW 
	*/
	public static final String ACOW = "ACOW";
	/**
	* Constant for qualifier with value ADDINFO 
	*/
	public static final String ADDINFO = "ADDINFO";
	/**
	* Constant for qualifier with value ADDR 
	*/
	public static final String ADDR = "ADDR";
	/**
	* Constant for qualifier with value ADDRESS 
	*/
	public static final String ADDRESS = "ADDRESS";
	/**
	* Constant for qualifier with value ADTX 
	*/
	public static final String ADTX = "ADTX";
	/**
	* Constant for qualifier with value ALTE 
	*/
	public static final String ALTE = "ALTE";
	/**
	* Constant for qualifier with value BENODET 
	*/
	public static final String BENODET = "BENODET";
	/**
	* Constant for qualifier with value BIMY 
	*/
	public static final String BIMY = "BIMY";
	/**
	* Constant for qualifier with value CITY 
	*/
	public static final String CITY = "CITY";
	/**
	* Constant for qualifier with value COAF 
	*/
	public static final String COAF = "COAF";
	/**
	* Constant for qualifier with value COUN 
	*/
	public static final String COUN = "COUN";
	/**
	* Constant for qualifier with value DOCT 
	*/
	public static final String DOCT = "DOCT";
	/**
	* Constant for qualifier with value ETYP 
	*/
	public static final String ETYP = "ETYP";
	/**
	* Constant for qualifier with value GENL 
	*/
	public static final String GENL = "GENL";
	/**
	* Constant for qualifier with value GRSS 
	*/
	public static final String GRSS = "GRSS";
	/**
	* Constant for qualifier with value INCOME 
	*/
	public static final String INCOME = "INCOME";
	/**
	* Constant for qualifier with value INRE 
	*/
	public static final String INRE = "INRE";
	/**
	* Constant for qualifier with value ITYP 
	*/
	public static final String ITYP = "ITYP";
	/**
	* Constant for qualifier with value LINK 
	*/
	public static final String LINK = "LINK";
	/**
	* Constant for qualifier with value LOCA 
	*/
	public static final String LOCA = "LOCA";
	/**
	* Constant for qualifier with value MAIL 
	*/
	public static final String MAIL = "MAIL";
	/**
	* Constant for qualifier with value MEOR 
	*/
	public static final String MEOR = "MEOR";
	/**
	* Constant for qualifier with value MERE 
	*/
	public static final String MERE = "MERE";
	/**
	* Constant for qualifier with value NETT 
	*/
	public static final String NETT = "NETT";
	/**
	* Constant for qualifier with value OWND 
	*/
	public static final String OWND = "OWND";
	/**
	* Constant for qualifier with value PERM 
	*/
	public static final String PERM = "PERM";
	/**
	* Constant for qualifier with value PREP 
	*/
	public static final String PREP = "PREP";
	/**
	* Constant for qualifier with value PREV 
	*/
	public static final String PREV = "PREV";
	/**
	* Constant for qualifier with value RECT 
	*/
	public static final String RECT = "RECT";
	/**
	* Constant for qualifier with value RELA 
	*/
	public static final String RELA = "RELA";
	/**
	* Constant for qualifier with value RESI 
	*/
	public static final String RESI = "RESI";
	/**
	* Constant for qualifier with value SAFE 
	*/
	public static final String SAFE = "SAFE";
	/**
	* Constant for qualifier with value SEME 
	*/
	public static final String SEME = "SEME";
	/**
	* Constant for qualifier with value TAXR 
	*/
	public static final String TAXR = "TAXR";
	/**
	* Constant for qualifier with value WITF 
	*/
	public static final String WITF = "WITF";
	/**
	* Constant for qualifier with value WITL 
	*/
	public static final String WITL = "WITL";
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT574_IRSLST.class.getName());

	/**
	 * Creates an MT574_IRSLST initialized with the parameter SwiftMessage
	 * @param m swift message with the MT574_IRSLST content
	 */
	public MT574_IRSLST(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT574_IRSLST initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT574_IRSLST content
	 */
	public MT574_IRSLST(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT574_IRSLST initialized with a new SwiftMessage
	 */
	/*
	public MT574_IRSLST() {
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
		return "574";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 28E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 28E at MT574_IRSLST is expected to be the only one.
	 * 
	 * @return a Field28E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field28E getField28E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("28E");
			if (t == null) {
				log.fine("field 28E not found");
				return null;
			} else {
				return new Field28E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23G at MT574_IRSLST is expected to be the only one.
	 * 
	 * @return a Field23G object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23G getField23G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("23G");
			if (t == null) {
				log.fine("field 23G not found");
				return null;
			} else {
				return new Field23G(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 98A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 98A at MT574_IRSLST is expected to be the only one.
	 * 
	 * @return a Field98A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98A getField98A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("98A");
			if (t == null) {
				log.fine("field 98A not found");
				return null;
			} else {
				return new Field98A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 98C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 98C at MT574_IRSLST is expected to be the only one.
	 * 
	 * @return a Field98C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98C getField98C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("98C");
			if (t == null) {
				log.fine("field 98C not found");
				return null;
			} else {
				return new Field98C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 98E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 98E at MT574_IRSLST is expected to be the only one.
	 * 
	 * @return a Field98E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98E getField98E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("98E");
			if (t == null) {
				log.fine("field 98E not found");
				return null;
			} else {
				return new Field98E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 70E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 70E at MT574_IRSLST is expected to be the only one.
	 * 
	 * @return a Field70E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field70E getField70E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("70E");
			if (t == null) {
				log.fine("field 70E not found");
				return null;
			} else {
				return new Field70E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 20C at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field20C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field20C> getField20C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("20C");
			final List<Field20C> result = new ArrayList<Field20C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field20C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 16R at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field16R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field16R> getField16R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("16R");
			final List<Field16R> result = new ArrayList<Field16R>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field16R(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 13A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 13A at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field13A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field13A> getField13A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("13A");
			final List<Field13A> result = new ArrayList<Field13A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field13A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 13B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 13B at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field13B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field13B> getField13B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("13B");
			final List<Field13B> result = new ArrayList<Field13B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field13B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 16S at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field16S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field16S> getField16S() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("16S");
			final List<Field16S> result = new ArrayList<Field16S>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field16S(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 97A at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97A> getField97A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("97A");
			final List<Field97A> result = new ArrayList<Field97A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field97A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22F at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22F> getField22F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22F");
			final List<Field22F> result = new ArrayList<Field22F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 17B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 17B at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field17B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field17B> getField17B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("17B");
			final List<Field17B> result = new ArrayList<Field17B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field17B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95T, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95T at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95T objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95T> getField95T() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95T");
			final List<Field95T> result = new ArrayList<Field95T>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95T(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95S at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95S> getField95S() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95S");
			final List<Field95S> result = new ArrayList<Field95S>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95S(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94G, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94G at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94G objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94G> getField94G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("94G");
			final List<Field94G> result = new ArrayList<Field94G>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field94G(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94D at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94D> getField94D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("94D");
			final List<Field94D> result = new ArrayList<Field94D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field94D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94C at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94C> getField94C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("94C");
			final List<Field94C> result = new ArrayList<Field94C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field94C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92A at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92A> getField92A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92A");
			final List<Field92A> result = new ArrayList<Field92A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 19A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 19A at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field19A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field19A> getField19A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("19A");
			final List<Field19A> result = new ArrayList<Field19A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field19A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95P at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95P objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95P> getField95P() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95P");
			final List<Field95P> result = new ArrayList<Field95P>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95P(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95R at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95R> getField95R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95R");
			final List<Field95R> result = new ArrayList<Field95R>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95R(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95Q at MT574_IRSLST are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95Q objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95Q> getField95Q() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95Q");
			final List<Field95Q> result = new ArrayList<Field95Q>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95Q(tags[i].getValue()));
			}
			return result;
		}
	}
	

/*
 * sequences code
 *
 */ 


	public static class SequenceA extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>GENL</em>
		*/
		public static final String START_END_16RS = "GENL";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceA newInstance(final Tag ... tags) {
			final SequenceA result = new SequenceA();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceA(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the single occurrence of SequenceA delimited by 16R/16S {@value SequenceA#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceA</code> is returned</em>  
	*/ 
	public SequenceA getSequenceA() {
		return new SequenceA(this.getSwiftMessage());
	}
 


	public static class SequenceA1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>LINK</em>
		*/
		public static final String START_END_16RS = "LINK";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceA1 newInstance(final Tag ... tags) {
			final SequenceA1 result = new SequenceA1();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceA1(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceA1 delimited by 16R/16S {@value SequenceA1#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceA1> getSequenceA1List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceA1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceA1> result = new ArrayList<SequenceA1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceA1(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceB extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>BENODET</em>
		*/
		public static final String START_END_16RS = "BENODET";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceB newInstance(final Tag ... tags) {
			final SequenceB result = new SequenceB();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceB(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceB delimited by 16R/16S {@value SequenceB#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceB> getSequenceBList() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceB.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceB> result = new ArrayList<SequenceB>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceB(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceB1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ADDRESS</em>
		*/
		public static final String START_END_16RS = "ADDRESS";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceB1 newInstance(final Tag ... tags) {
			final SequenceB1 result = new SequenceB1();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceB1(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceB1 delimited by 16R/16S {@value SequenceB1#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceB1> getSequenceB1List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceB1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceB1> result = new ArrayList<SequenceB1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceB1(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceB2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB2() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB2(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>INCOME</em>
		*/
		public static final String START_END_16RS = "INCOME";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceB2 newInstance(final Tag ... tags) {
			final SequenceB2 result = new SequenceB2();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceB2(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceB2 delimited by 16R/16S {@value SequenceB2#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceB2> getSequenceB2List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceB2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceB2> result = new ArrayList<SequenceB2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceB2(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceC extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ADDINFO</em>
		*/
		public static final String START_END_16RS = "ADDINFO";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceC newInstance(final Tag ... tags) {
			final SequenceC result = new SequenceC();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceC(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the single occurrence of SequenceC delimited by 16R/16S {@value SequenceC#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceC</code> is returned</em>  
	*/ 
	public SequenceC getSequenceC() {
		return new SequenceC(this.getSwiftMessage());
	}
 





}
