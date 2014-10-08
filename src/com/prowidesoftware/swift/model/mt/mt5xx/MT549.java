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
 * MT 549<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT549 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "549";
// begin qualifiers constants	
	/**
	* Constant for qualifier with value ACOW 
	*/
	public static final String ACOW = "ACOW";
	/**
	* Constant for qualifier with value ADDINFO 
	*/
	public static final String ADDINFO = "ADDINFO";
	/**
	* Constant for qualifier with value AFFM 
	*/
	public static final String AFFM = "AFFM";
	/**
	* Constant for qualifier with value ALOC 
	*/
	public static final String ALOC = "ALOC";
	/**
	* Constant for qualifier with value BASK 
	*/
	public static final String BASK = "BASK";
	/**
	* Constant for qualifier with value BYSTAREA 
	*/
	public static final String BYSTAREA = "BYSTAREA";
	/**
	* Constant for qualifier with value CACK 
	*/
	public static final String CACK = "CACK";
	/**
	* Constant for qualifier with value CALL 
	*/
	public static final String CALL = "CALL";
	/**
	* Constant for qualifier with value CAND 
	*/
	public static final String CAND = "CAND";
	/**
	* Constant for qualifier with value CANP 
	*/
	public static final String CANP = "CANP";
	/**
	* Constant for qualifier with value CGEN 
	*/
	public static final String CGEN = "CGEN";
	/**
	* Constant for qualifier with value CODE 
	*/
	public static final String CODE = "CODE";
	/**
	* Constant for qualifier with value COMM 
	*/
	public static final String COMM = "COMM";
	/**
	* Constant for qualifier with value CORP 
	*/
	public static final String CORP = "CORP";
	/**
	* Constant for qualifier with value CPRC 
	*/
	public static final String CPRC = "CPRC";
	/**
	* Constant for qualifier with value DEND 
	*/
	public static final String DEND = "DEND";
	/**
	* Constant for qualifier with value EPRC 
	*/
	public static final String EPRC = "EPRC";
	/**
	* Constant for qualifier with value ESTA 
	*/
	public static final String ESTA = "ESTA";
	/**
	* Constant for qualifier with value GENL 
	*/
	public static final String GENL = "GENL";
	/**
	* Constant for qualifier with value INDX 
	*/
	public static final String INDX = "INDX";
	/**
	* Constant for qualifier with value INMH 
	*/
	public static final String INMH = "INMH";
	/**
	* Constant for qualifier with value IPRC 
	*/
	public static final String IPRC = "IPRC";
	/**
	* Constant for qualifier with value LINK 
	*/
	public static final String LINK = "LINK";
	/**
	* Constant for qualifier with value LIST 
	*/
	public static final String LIST = "LIST";
	/**
	* Constant for qualifier with value MAST 
	*/
	public static final String MAST = "MAST";
	/**
	* Constant for qualifier with value MEOR 
	*/
	public static final String MEOR = "MEOR";
	/**
	* Constant for qualifier with value MERE 
	*/
	public static final String MERE = "MERE";
	/**
	* Constant for qualifier with value MITI 
	*/
	public static final String MITI = "MITI";
	/**
	* Constant for qualifier with value MOPN 
	*/
	public static final String MOPN = "MOPN";
	/**
	* Constant for qualifier with value MTCH 
	*/
	public static final String MTCH = "MTCH";
	/**
	* Constant for qualifier with value NAFI 
	*/
	public static final String NAFI = "NAFI";
	/**
	* Constant for qualifier with value NMAT 
	*/
	public static final String NMAT = "NMAT";
	/**
	* Constant for qualifier with value PACK 
	*/
	public static final String PACK = "PACK";
	/**
	* Constant for qualifier with value PCTI 
	*/
	public static final String PCTI = "PCTI";
	/**
	* Constant for qualifier with value PEND 
	*/
	public static final String PEND = "PEND";
	/**
	* Constant for qualifier with value PENF 
	*/
	public static final String PENF = "PENF";
	/**
	* Constant for qualifier with value POOL 
	*/
	public static final String POOL = "POOL";
	/**
	* Constant for qualifier with value PPRC 
	*/
	public static final String PPRC = "PPRC";
	/**
	* Constant for qualifier with value PREV 
	*/
	public static final String PREV = "PREV";
	/**
	* Constant for qualifier with value PROG 
	*/
	public static final String PROG = "PROG";
	/**
	* Constant for qualifier with value REF 
	*/
	public static final String REF = "REF";
	/**
	* Constant for qualifier with value REJT 
	*/
	public static final String REJT = "REJT";
	/**
	* Constant for qualifier with value RELA 
	*/
	public static final String RELA = "RELA";
	/**
	* Constant for qualifier with value REPR 
	*/
	public static final String REPR = "REPR";
	/**
	* Constant for qualifier with value REQU 
	*/
	public static final String REQU = "REQU";
	/**
	* Constant for qualifier with value RERC 
	*/
	public static final String RERC = "RERC";
	/**
	* Constant for qualifier with value REST 
	*/
	public static final String REST = "REST";
	/**
	* Constant for qualifier with value RPRC 
	*/
	public static final String RPRC = "RPRC";
	/**
	* Constant for qualifier with value SAFE 
	*/
	public static final String SAFE = "SAFE";
	/**
	* Constant for qualifier with value SEME 
	*/
	public static final String SEME = "SEME";
	/**
	* Constant for qualifier with value SETT 
	*/
	public static final String SETT = "SETT";
	/**
	* Constant for qualifier with value SFRE 
	*/
	public static final String SFRE = "SFRE";
	/**
	* Constant for qualifier with value STAT 
	*/
	public static final String STAT = "STAT";
	/**
	* Constant for qualifier with value STBA 
	*/
	public static final String STBA = "STBA";
	/**
	* Constant for qualifier with value STTY 
	*/
	public static final String STTY = "STTY";
	/**
	* Constant for qualifier with value TPRC 
	*/
	public static final String TPRC = "TPRC";
	/**
	* Constant for qualifier with value TRRF 
	*/
	public static final String TRRF = "TRRF";
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT549.class.getName());

	/**
	 * Creates an MT549 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT549 content
	 */
	public MT549(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT549 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT549 content
	 */
	public MT549(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT549 initialized with a new SwiftMessage
	 */
	/*
	public MT549() {
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
		return "549";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23G at MT549 is expected to be the only one.
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
	 * The first occurrence of field 98A at MT549 is expected to be the only one.
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
	 * The first occurrence of field 98C at MT549 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 69A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 69A at MT549 is expected to be the only one.
	 * 
	 * @return a Field69A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field69A getField69A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("69A");
			if (t == null) {
				log.fine("field 69A not found");
				return null;
			} else {
				return new Field69A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 69B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 69B at MT549 is expected to be the only one.
	 * 
	 * @return a Field69B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field69B getField69B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("69B");
			if (t == null) {
				log.fine("field 69B not found");
				return null;
			} else {
				return new Field69B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 97A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 97A at MT549 is expected to be the only one.
	 * 
	 * @return a Field97A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field97A getField97A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("97A");
			if (t == null) {
				log.fine("field 97A not found");
				return null;
			} else {
				return new Field97A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 97B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 97B at MT549 is expected to be the only one.
	 * 
	 * @return a Field97B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field97B getField97B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("97B");
			if (t == null) {
				log.fine("field 97B not found");
				return null;
			} else {
				return new Field97B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22F at MT549 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 16R at MT549 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13A at MT549 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13B at MT549 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 20C at MT549 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 16S at MT549 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 25D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 25D at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field25D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field25D> getField25D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("25D");
			final List<Field25D> result = new ArrayList<Field25D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field25D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 24B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 24B at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field24B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field24B> getField24B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("24B");
			final List<Field24B> result = new ArrayList<Field24B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field24B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95P at MT549 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 95R at MT549 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 95Q at MT549 are expected at one sequence or across several sequences.
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>BYSTAREA</em>
		*/
		public static final String START_END_16RS = "BYSTAREA";
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>REF</em>
		*/
		public static final String START_END_16RS = "REF";
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
	* Get the list of SequenceC delimited by 16R/16S {@value SequenceC#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceC> getSequenceCList() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceC.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC> result = new ArrayList<SequenceC>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceC(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceD extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD(final SwiftTagListBlock content) {
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
		public static SequenceD newInstance(final Tag ... tags) {
			final SequenceD result = new SequenceD();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceD(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the single occurrence of SequenceD delimited by 16R/16S {@value SequenceD#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceD</code> is returned</em>  
	*/ 
	public SequenceD getSequenceD() {
		return new SequenceD(this.getSwiftMessage());
	}
 





}
