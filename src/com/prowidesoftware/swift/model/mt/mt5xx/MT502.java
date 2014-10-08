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
 * MT 502<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT502 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "502";
// begin qualifiers constants	
	/**
	* Constant for qualifier with value ACCW 
	*/
	public static final String ACCW = "ACCW";
	/**
	* Constant for qualifier with value ACRU 
	*/
	public static final String ACRU = "ACRU";
	/**
	* Constant for qualifier with value ALTE 
	*/
	public static final String ALTE = "ALTE";
	/**
	* Constant for qualifier with value AMT 
	*/
	public static final String AMT = "AMT";
	/**
	* Constant for qualifier with value AUTO 
	*/
	public static final String AUTO = "AUTO";
	/**
	* Constant for qualifier with value BASK 
	*/
	public static final String BASK = "BASK";
	/**
	* Constant for qualifier with value BENE 
	*/
	public static final String BENE = "BENE";
	/**
	* Constant for qualifier with value BENM 
	*/
	public static final String BENM = "BENM";
	/**
	* Constant for qualifier with value BRCR 
	*/
	public static final String BRCR = "BRCR";
	/**
	* Constant for qualifier with value BUSE 
	*/
	public static final String BUSE = "BUSE";
	/**
	* Constant for qualifier with value BUYR 
	*/
	public static final String BUYR = "BUYR";
	/**
	* Constant for qualifier with value CADE 
	*/
	public static final String CADE = "CADE";
	/**
	* Constant for qualifier with value CALD 
	*/
	public static final String CALD = "CALD";
	/**
	* Constant for qualifier with value CALL 
	*/
	public static final String CALL = "CALL";
	/**
	* Constant for qualifier with value CANC 
	*/
	public static final String CANC = "CANC";
	/**
	* Constant for qualifier with value CANR 
	*/
	public static final String CANR = "CANR";
	/**
	* Constant for qualifier with value CAOP 
	*/
	public static final String CAOP = "CAOP";
	/**
	* Constant for qualifier with value CASH 
	*/
	public static final String CASH = "CASH";
	/**
	* Constant for qualifier with value CASY 
	*/
	public static final String CASY = "CASY";
	/**
	* Constant for qualifier with value CATB 
	*/
	public static final String CATB = "CATB";
	/**
	* Constant for qualifier with value CERT 
	*/
	public static final String CERT = "CERT";
	/**
	* Constant for qualifier with value CFRE 
	*/
	public static final String CFRE = "CFRE";
	/**
	* Constant for qualifier with value CHAR 
	*/
	public static final String CHAR = "CHAR";
	/**
	* Constant for qualifier with value CLAS 
	*/
	public static final String CLAS = "CLAS";
	/**
	* Constant for qualifier with value CLBR 
	*/
	public static final String CLBR = "CLBR";
	/**
	* Constant for qualifier with value CLCL 
	*/
	public static final String CLCL = "CLCL";
	/**
	* Constant for qualifier with value CLTY 
	*/
	public static final String CLTY = "CLTY";
	/**
	* Constant for qualifier with value COAX 
	*/
	public static final String COAX = "COAX";
	/**
	* Constant for qualifier with value COLR 
	*/
	public static final String COLR = "COLR";
	/**
	* Constant for qualifier with value COMM 
	*/
	public static final String COMM = "COMM";
	/**
	* Constant for qualifier with value CONV 
	*/
	public static final String CONV = "CONV";
	/**
	* Constant for qualifier with value CORA 
	*/
	public static final String CORA = "CORA";
	/**
	* Constant for qualifier with value COST 
	*/
	public static final String COST = "COST";
	/**
	* Constant for qualifier with value COUN 
	*/
	public static final String COUN = "COUN";
	/**
	* Constant for qualifier with value COUP 
	*/
	public static final String COUP = "COUP";
	/**
	* Constant for qualifier with value COVE 
	*/
	public static final String COVE = "COVE";
	/**
	* Constant for qualifier with value COWA 
	*/
	public static final String COWA = "COWA";
	/**
	* Constant for qualifier with value CSHPRTY 
	*/
	public static final String CSHPRTY = "CSHPRTY";
	/**
	* Constant for qualifier with value CUFC 
	*/
	public static final String CUFC = "CUFC";
	/**
	* Constant for qualifier with value DBNM 
	*/
	public static final String DBNM = "DBNM";
	/**
	* Constant for qualifier with value DDTE 
	*/
	public static final String DDTE = "DDTE";
	/**
	* Constant for qualifier with value DEAL 
	*/
	public static final String DEAL = "DEAL";
	/**
	* Constant for qualifier with value DEBT 
	*/
	public static final String DEBT = "DEBT";
	/**
	* Constant for qualifier with value DECL 
	*/
	public static final String DECL = "DECL";
	/**
	* Constant for qualifier with value DENO 
	*/
	public static final String DENO = "DENO";
	/**
	* Constant for qualifier with value EXCH 
	*/
	public static final String EXCH = "EXCH";
	/**
	* Constant for qualifier with value EXEC 
	*/
	public static final String EXEC = "EXEC";
	/**
	* Constant for qualifier with value EXER 
	*/
	public static final String EXER = "EXER";
	/**
	* Constant for qualifier with value EXPI 
	*/
	public static final String EXPI = "EXPI";
	/**
	* Constant for qualifier with value FCOU 
	*/
	public static final String FCOU = "FCOU";
	/**
	* Constant for qualifier with value FIA 
	*/
	public static final String FIA = "FIA";
	/**
	* Constant for qualifier with value FIAN 
	*/
	public static final String FIAN = "FIAN";
	/**
	* Constant for qualifier with value FORF 
	*/
	public static final String FORF = "FORF";
	/**
	* Constant for qualifier with value FORM 
	*/
	public static final String FORM = "FORM";
	/**
	* Constant for qualifier with value FRNF 
	*/
	public static final String FRNF = "FRNF";
	/**
	* Constant for qualifier with value FRNR 
	*/
	public static final String FRNR = "FRNR";
	/**
	* Constant for qualifier with value FXIB 
	*/
	public static final String FXIB = "FXIB";
	/**
	* Constant for qualifier with value FXIS 
	*/
	public static final String FXIS = "FXIS";
	/**
	* Constant for qualifier with value GENL 
	*/
	public static final String GENL = "GENL";
	/**
	* Constant for qualifier with value INBR 
	*/
	public static final String INBR = "INBR";
	/**
	* Constant for qualifier with value INCA 
	*/
	public static final String INCA = "INCA";
	/**
	* Constant for qualifier with value INDC 
	*/
	public static final String INDC = "INDC";
	/**
	* Constant for qualifier with value INDX 
	*/
	public static final String INDX = "INDX";
	/**
	* Constant for qualifier with value INTM 
	*/
	public static final String INTM = "INTM";
	/**
	* Constant for qualifier with value INTR 
	*/
	public static final String INTR = "INTR";
	/**
	* Constant for qualifier with value INVE 
	*/
	public static final String INVE = "INVE";
	/**
	* Constant for qualifier with value ISDI 
	*/
	public static final String ISDI = "ISDI";
	/**
	* Constant for qualifier with value ISSU 
	*/
	public static final String ISSU = "ISSU";
	/**
	* Constant for qualifier with value LEGA 
	*/
	public static final String LEGA = "LEGA";
	/**
	* Constant for qualifier with value LEOG 
	*/
	public static final String LEOG = "LEOG";
	/**
	* Constant for qualifier with value LEVY 
	*/
	public static final String LEVY = "LEVY";
	/**
	* Constant for qualifier with value LIMI 
	*/
	public static final String LIMI = "LIMI";
	/**
	* Constant for qualifier with value LINK 
	*/
	public static final String LINK = "LINK";
	/**
	* Constant for qualifier with value LIST 
	*/
	public static final String LIST = "LIST";
	/**
	* Constant for qualifier with value LOCL 
	*/
	public static final String LOCL = "LOCL";
	/**
	* Constant for qualifier with value LOCO 
	*/
	public static final String LOCO = "LOCO";
	/**
	* Constant for qualifier with value LOTS 
	*/
	public static final String LOTS = "LOTS";
	/**
	* Constant for qualifier with value MAIN 
	*/
	public static final String MAIN = "MAIN";
	/**
	* Constant for qualifier with value MAST 
	*/
	public static final String MAST = "MAST";
	/**
	* Constant for qualifier with value MATU 
	*/
	public static final String MATU = "MATU";
	/**
	* Constant for qualifier with value MAXF 
	*/
	public static final String MAXF = "MAXF";
	/**
	* Constant for qualifier with value MEOR 
	*/
	public static final String MEOR = "MEOR";
	/**
	* Constant for qualifier with value MERE 
	*/
	public static final String MERE = "MERE";
	/**
	* Constant for qualifier with value MFKT 
	*/
	public static final String MFKT = "MFKT";
	/**
	* Constant for qualifier with value MICO 
	*/
	public static final String MICO = "MICO";
	/**
	* Constant for qualifier with value MIEX 
	*/
	public static final String MIEX = "MIEX";
	/**
	* Constant for qualifier with value MILT 
	*/
	public static final String MILT = "MILT";
	/**
	* Constant for qualifier with value MINI 
	*/
	public static final String MINI = "MINI";
	/**
	* Constant for qualifier with value MINO 
	*/
	public static final String MINO = "MINO";
	/**
	* Constant for qualifier with value MPLE 
	*/
	public static final String MPLE = "MPLE";
	/**
	* Constant for qualifier with value NAVD 
	*/
	public static final String NAVD = "NAVD";
	/**
	* Constant for qualifier with value NWFC 
	*/
	public static final String NWFC = "NWFC";
	/**
	* Constant for qualifier with value NXRT 
	*/
	public static final String NXRT = "NXRT";
	/**
	* Constant for qualifier with value OCMT 
	*/
	public static final String OCMT = "OCMT";
	/**
	* Constant for qualifier with value ODDC 
	*/
	public static final String ODDC = "ODDC";
	/**
	* Constant for qualifier with value OPST 
	*/
	public static final String OPST = "OPST";
	/**
	* Constant for qualifier with value OPTI 
	*/
	public static final String OPTI = "OPTI";
	/**
	* Constant for qualifier with value ORDR 
	*/
	public static final String ORDR = "ORDR";
	/**
	* Constant for qualifier with value ORDRDET 
	*/
	public static final String ORDRDET = "ORDRDET";
	/**
	* Constant for qualifier with value ORGV 
	*/
	public static final String ORGV = "ORGV";
	/**
	* Constant for qualifier with value OTHR 
	*/
	public static final String OTHR = "OTHR";
	/**
	* Constant for qualifier with value OTHRPRTY 
	*/
	public static final String OTHRPRTY = "OTHRPRTY";
	/**
	* Constant for qualifier with value PACO 
	*/
	public static final String PACO = "PACO";
	/**
	* Constant for qualifier with value PAYE 
	*/
	public static final String PAYE = "PAYE";
	/**
	* Constant for qualifier with value PAYM 
	*/
	public static final String PAYM = "PAYM";
	/**
	* Constant for qualifier with value PAYS 
	*/
	public static final String PAYS = "PAYS";
	/**
	* Constant for qualifier with value PFRE 
	*/
	public static final String PFRE = "PFRE";
	/**
	* Constant for qualifier with value PLIS 
	*/
	public static final String PLIS = "PLIS";
	/**
	* Constant for qualifier with value POOL 
	*/
	public static final String POOL = "POOL";
	/**
	* Constant for qualifier with value PRCO 
	*/
	public static final String PRCO = "PRCO";
	/**
	* Constant for qualifier with value PREP 
	*/
	public static final String PREP = "PREP";
	/**
	* Constant for qualifier with value PREV 
	*/
	public static final String PREV = "PREV";
	/**
	* Constant for qualifier with value PRFC 
	*/
	public static final String PRFC = "PRFC";
	/**
	* Constant for qualifier with value PRIC 
	*/
	public static final String PRIC = "PRIC";
	/**
	* Constant for qualifier with value PRIR 
	*/
	public static final String PRIR = "PRIR";
	/**
	* Constant for qualifier with value PROC 
	*/
	public static final String PROC = "PROC";
	/**
	* Constant for qualifier with value PROG 
	*/
	public static final String PROG = "PROG";
	/**
	* Constant for qualifier with value PUTT 
	*/
	public static final String PUTT = "PUTT";
	/**
	* Constant for qualifier with value REGF 
	*/
	public static final String REGF = "REGF";
	/**
	* Constant for qualifier with value REGI 
	*/
	public static final String REGI = "REGI";
	/**
	* Constant for qualifier with value REGT 
	*/
	public static final String REGT = "REGT";
	/**
	* Constant for qualifier with value RELA 
	*/
	public static final String RELA = "RELA";
	/**
	* Constant for qualifier with value REPO 
	*/
	public static final String REPO = "REPO";
	/**
	* Constant for qualifier with value REPP 
	*/
	public static final String REPP = "REPP";
	/**
	* Constant for qualifier with value REPT 
	*/
	public static final String REPT = "REPT";
	/**
	* Constant for qualifier with value RERA 
	*/
	public static final String RERA = "RERA";
	/**
	* Constant for qualifier with value RERT 
	*/
	public static final String RERT = "RERT";
	/**
	* Constant for qualifier with value REST 
	*/
	public static final String REST = "REST";
	/**
	* Constant for qualifier with value RESU 
	*/
	public static final String RESU = "RESU";
	/**
	* Constant for qualifier with value REVA 
	*/
	public static final String REVA = "REVA";
	/**
	* Constant for qualifier with value RMTH 
	*/
	public static final String RMTH = "RMTH";
	/**
	* Constant for qualifier with value RPOR 
	*/
	public static final String RPOR = "RPOR";
	/**
	* Constant for qualifier with value RQBR 
	*/
	public static final String RQBR = "RQBR";
	/**
	* Constant for qualifier with value RSET 
	*/
	public static final String RSET = "RSET";
	/**
	* Constant for qualifier with value RSPR 
	*/
	public static final String RSPR = "RSPR";
	/**
	* Constant for qualifier with value RTGS 
	*/
	public static final String RTGS = "RTGS";
	/**
	* Constant for qualifier with value SAFE 
	*/
	public static final String SAFE = "SAFE";
	/**
	* Constant for qualifier with value SECO 
	*/
	public static final String SECO = "SECO";
	/**
	* Constant for qualifier with value SELL 
	*/
	public static final String SELL = "SELL";
	/**
	* Constant for qualifier with value SEME 
	*/
	public static final String SEME = "SEME";
	/**
	* Constant for qualifier with value SETDET 
	*/
	public static final String SETDET = "SETDET";
	/**
	* Constant for qualifier with value SETG 
	*/
	public static final String SETG = "SETG";
	/**
	* Constant for qualifier with value SETPRTY 
	*/
	public static final String SETPRTY = "SETPRTY";
	/**
	* Constant for qualifier with value SETR 
	*/
	public static final String SETR = "SETR";
	/**
	* Constant for qualifier with value SETS 
	*/
	public static final String SETS = "SETS";
	/**
	* Constant for qualifier with value SHAI 
	*/
	public static final String SHAI = "SHAI";
	/**
	* Constant for qualifier with value SHIP 
	*/
	public static final String SHIP = "SHIP";
	/**
	* Constant for qualifier with value SIZE 
	*/
	public static final String SIZE = "SIZE";
	/**
	* Constant for qualifier with value SLMG 
	*/
	public static final String SLMG = "SLMG";
	/**
	* Constant for qualifier with value SPCN 
	*/
	public static final String SPCN = "SPCN";
	/**
	* Constant for qualifier with value STAM 
	*/
	public static final String STAM = "STAM";
	/**
	* Constant for qualifier with value STBR 
	*/
	public static final String STBR = "STBR";
	/**
	* Constant for qualifier with value STCO 
	*/
	public static final String STCO = "STCO";
	/**
	* Constant for qualifier with value STEX 
	*/
	public static final String STEX = "STEX";
	/**
	* Constant for qualifier with value STOP 
	*/
	public static final String STOP = "STOP";
	/**
	* Constant for qualifier with value SWRT 
	*/
	public static final String SWRT = "SWRT";
	/**
	* Constant for qualifier with value TAPC 
	*/
	public static final String TAPC = "TAPC";
	/**
	* Constant for qualifier with value TAXE 
	*/
	public static final String TAXE = "TAXE";
	/**
	* Constant for qualifier with value TERM 
	*/
	public static final String TERM = "TERM";
	/**
	* Constant for qualifier with value TILI 
	*/
	public static final String TILI = "TILI";
	/**
	* Constant for qualifier with value TOCO 
	*/
	public static final String TOCO = "TOCO";
	/**
	* Constant for qualifier with value TOOR 
	*/
	public static final String TOOR = "TOOR";
	/**
	* Constant for qualifier with value TPRO 
	*/
	public static final String TPRO = "TPRO";
	/**
	* Constant for qualifier with value TRAD 
	*/
	public static final String TRAD = "TRAD";
	/**
	* Constant for qualifier with value TRADPRTY 
	*/
	public static final String TRADPRTY = "TRADPRTY";
	/**
	* Constant for qualifier with value TRAG 
	*/
	public static final String TRAG = "TRAG";
	/**
	* Constant for qualifier with value TRAN 
	*/
	public static final String TRAN = "TRAN";
	/**
	* Constant for qualifier with value TRAX 
	*/
	public static final String TRAX = "TRAX";
	/**
	* Constant for qualifier with value TRCA 
	*/
	public static final String TRCA = "TRCA";
	/**
	* Constant for qualifier with value TRCN 
	*/
	public static final String TRCN = "TRCN";
	/**
	* Constant for qualifier with value TRRE 
	*/
	public static final String TRRE = "TRRE";
	/**
	* Constant for qualifier with value TRSE 
	*/
	public static final String TRSE = "TRSE";
	/**
	* Constant for qualifier with value TRTE 
	*/
	public static final String TRTE = "TRTE";
	/**
	* Constant for qualifier with value TRTR 
	*/
	public static final String TRTR = "TRTR";
	/**
	* Constant for qualifier with value TTCO 
	*/
	public static final String TTCO = "TTCO";
	/**
	* Constant for qualifier with value VALU 
	*/
	public static final String VALU = "VALU";
	/**
	* Constant for qualifier with value VASU 
	*/
	public static final String VASU = "VASU";
	/**
	* Constant for qualifier with value VATA 
	*/
	public static final String VATA = "VATA";
	/**
	* Constant for qualifier with value VEND 
	*/
	public static final String VEND = "VEND";
	/**
	* Constant for qualifier with value VERN 
	*/
	public static final String VERN = "VERN";
	/**
	* Constant for qualifier with value WITH 
	*/
	public static final String WITH = "WITH";
	/**
	* Constant for qualifier with value WRTS 
	*/
	public static final String WRTS = "WRTS";
	/**
	* Constant for qualifier with value YTMR 
	*/
	public static final String YTMR = "YTMR";
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT502.class.getName());

	/**
	 * Creates an MT502 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT502 content
	 */
	public MT502(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT502 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT502 content
	 */
	public MT502(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT502 initialized with a new SwiftMessage
	 */
	/*
	public MT502() {
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
		return "502";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23G at MT502 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 98E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 98E at MT502 is expected to be the only one.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22F at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 16R at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13A at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13B at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 20C at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 16S at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94B> getField94B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("94B");
			final List<Field94B> result = new ArrayList<Field94B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field94B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94C at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94F at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94F> getField94F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("94F");
			final List<Field94F> result = new ArrayList<Field94F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field94F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 90A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90A> getField90A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("90A");
			final List<Field90A> result = new ArrayList<Field90A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field90A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 90B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90B> getField90B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("90B");
			final List<Field90B> result = new ArrayList<Field90B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field90B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22H at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22H objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22H> getField22H() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22H");
			final List<Field22H> result = new ArrayList<Field22H>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22H(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98A> getField98A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("98A");
			final List<Field98A> result = new ArrayList<Field98A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field98A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98C> getField98C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("98C");
			final List<Field98C> result = new ArrayList<Field98C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field98C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98B> getField98B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("98B");
			final List<Field98B> result = new ArrayList<Field98B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field98B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92A at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95P at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95Q at MT502 are expected at one sequence or across several sequences.
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
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95R at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95S at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 97A at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 97B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97B> getField97B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("97B");
			final List<Field97B> result = new ArrayList<Field97B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field97B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 97E at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97E> getField97E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("97E");
			final List<Field97E> result = new ArrayList<Field97E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field97E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 70C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70C> getField70C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("70C");
			final List<Field70C> result = new ArrayList<Field70C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field70C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 70E at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70E> getField70E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("70E");
			final List<Field70E> result = new ArrayList<Field70E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field70E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 36B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 36B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field36B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field36B> getField36B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("36B");
			final List<Field36B> result = new ArrayList<Field36B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field36B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 19A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 19A at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 12A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 12A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field12A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field12A> getField12A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("12A");
			final List<Field12A> result = new ArrayList<Field12A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field12A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 12C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 12C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field12C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field12C> getField12C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("12C");
			final List<Field12C> result = new ArrayList<Field12C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field12C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 12B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 12B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field12B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field12B> getField12B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("12B");
			final List<Field12B> result = new ArrayList<Field12B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field12B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 11A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 11A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field11A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field11A> getField11A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("11A");
			final List<Field11A> result = new ArrayList<Field11A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field11A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 17B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 17B at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35B> getField35B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("35B");
			final List<Field35B> result = new ArrayList<Field35B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field35B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95C> getField95C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95C");
			final List<Field95C> result = new ArrayList<Field95C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 70D at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70D> getField70D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("70D");
			final List<Field70D> result = new ArrayList<Field70D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field70D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92B> getField92B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92B");
			final List<Field92B> result = new ArrayList<Field92B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92C> getField92C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92C");
			final List<Field92C> result = new ArrayList<Field92C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 99B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 99B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field99B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field99B> getField99B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("99B");
			final List<Field99B> result = new ArrayList<Field99B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field99B(tags[i].getValue()));
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ORDRDET</em>
		*/
		public static final String START_END_16RS = "ORDRDET";
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
	* Get the single occurrence of SequenceB delimited by 16R/16S {@value SequenceB#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB</code> is returned</em>  
	*/ 
	public SequenceB getSequenceB() {
		return new SequenceB(this.getSwiftMessage());
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>PRIC</em>
		*/
		public static final String START_END_16RS = "PRIC";
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>TRADPRTY</em>
		*/
		public static final String START_END_16RS = "TRADPRTY";
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
 


	public static class SequenceB3 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB3() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB3(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>FIA</em>
		*/
		public static final String START_END_16RS = "FIA";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceB3 newInstance(final Tag ... tags) {
			final SequenceB3 result = new SequenceB3();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceB3(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the single occurrence of SequenceB3 delimited by 16R/16S {@value SequenceB3#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB3</code> is returned</em>  
	*/ 
	public SequenceB3 getSequenceB3() {
		return new SequenceB3(this.getSwiftMessage());
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SETDET</em>
		*/
		public static final String START_END_16RS = "SETDET";
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
 


	public static class SequenceC1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SETPRTY</em>
		*/
		public static final String START_END_16RS = "SETPRTY";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceC1 newInstance(final Tag ... tags) {
			final SequenceC1 result = new SequenceC1();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceC1(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceC1 delimited by 16R/16S {@value SequenceC1#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceC1> getSequenceC1List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceC1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC1> result = new ArrayList<SequenceC1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceC1(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceC2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC2() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC2(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CSHPRTY</em>
		*/
		public static final String START_END_16RS = "CSHPRTY";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceC2 newInstance(final Tag ... tags) {
			final SequenceC2 result = new SequenceC2();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceC2(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceC2 delimited by 16R/16S {@value SequenceC2#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceC2> getSequenceC2List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceC2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC2> result = new ArrayList<SequenceC2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceC2(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceC3 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC3() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC3(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>AMT</em>
		*/
		public static final String START_END_16RS = "AMT";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceC3 newInstance(final Tag ... tags) {
			final SequenceC3 result = new SequenceC3();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceC3(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceC3 delimited by 16R/16S {@value SequenceC3#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceC3> getSequenceC3List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceC3.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC3> result = new ArrayList<SequenceC3>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceC3(b));
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>OTHRPRTY</em>
		*/
		public static final String START_END_16RS = "OTHRPRTY";
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
	* Get the list of SequenceD delimited by 16R/16S {@value SequenceD#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceD> getSequenceDList() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceD.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceD> result = new ArrayList<SequenceD>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceD(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceE extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceE() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceE(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>REPO</em>
		*/
		public static final String START_END_16RS = "REPO";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceE newInstance(final Tag ... tags) {
			final SequenceE result = new SequenceE();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceE(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the single occurrence of SequenceE delimited by 16R/16S {@value SequenceE#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceE</code> is returned</em>  
	*/ 
	public SequenceE getSequenceE() {
		return new SequenceE(this.getSwiftMessage());
	}
 





}
