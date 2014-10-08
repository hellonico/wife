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
 * MT 564<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT564 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "564";
// begin qualifiers constants	
	/**
	* Constant for qualifier with value ACCTINFO 
	*/
	public static final String ACCTINFO = "ACCTINFO";
	/**
	* Constant for qualifier with value ACIN 
	*/
	public static final String ACIN = "ACIN";
	/**
	* Constant for qualifier with value ACOW 
	*/
	public static final String ACOW = "ACOW";
	/**
	* Constant for qualifier with value ACRU 
	*/
	public static final String ACRU = "ACRU";
	/**
	* Constant for qualifier with value ADDB 
	*/
	public static final String ADDB = "ADDB";
	/**
	* Constant for qualifier with value ADDINFO 
	*/
	public static final String ADDINFO = "ADDINFO";
	/**
	* Constant for qualifier with value ADEX 
	*/
	public static final String ADEX = "ADEX";
	/**
	* Constant for qualifier with value ADSR 
	*/
	public static final String ADSR = "ADSR";
	/**
	* Constant for qualifier with value ADTX 
	*/
	public static final String ADTX = "ADTX";
	/**
	* Constant for qualifier with value AFFB 
	*/
	public static final String AFFB = "AFFB";
	/**
	* Constant for qualifier with value ANOU 
	*/
	public static final String ANOU = "ANOU";
	/**
	* Constant for qualifier with value AREV 
	*/
	public static final String AREV = "AREV";
	/**
	* Constant for qualifier with value ATAX 
	*/
	public static final String ATAX = "ATAX";
	/**
	* Constant for qualifier with value AVAL 
	*/
	public static final String AVAL = "AVAL";
	/**
	* Constant for qualifier with value BAIN 
	*/
	public static final String BAIN = "BAIN";
	/**
	* Constant for qualifier with value BASE 
	*/
	public static final String BASE = "BASE";
	/**
	* Constant for qualifier with value BIDI 
	*/
	public static final String BIDI = "BIDI";
	/**
	* Constant for qualifier with value BLOK 
	*/
	public static final String BLOK = "BLOK";
	/**
	* Constant for qualifier with value BOCL 
	*/
	public static final String BOCL = "BOCL";
	/**
	* Constant for qualifier with value BOLQ 
	*/
	public static final String BOLQ = "BOLQ";
	/**
	* Constant for qualifier with value BORR 
	*/
	public static final String BORR = "BORR";
	/**
	* Constant for qualifier with value CACN 
	*/
	public static final String CACN = "CACN";
	/**
	* Constant for qualifier with value CADETL 
	*/
	public static final String CADETL = "CADETL";
	/**
	* Constant for qualifier with value CAEP 
	*/
	public static final String CAEP = "CAEP";
	/**
	* Constant for qualifier with value CAEV 
	*/
	public static final String CAEV = "CAEV";
	/**
	* Constant for qualifier with value CALD 
	*/
	public static final String CALD = "CALD";
	/**
	* Constant for qualifier with value CAMV 
	*/
	public static final String CAMV = "CAMV";
	/**
	* Constant for qualifier with value CAON 
	*/
	public static final String CAON = "CAON";
	/**
	* Constant for qualifier with value CAOP 
	*/
	public static final String CAOP = "CAOP";
	/**
	* Constant for qualifier with value CAOPTN 
	*/
	public static final String CAOPTN = "CAOPTN";
	/**
	* Constant for qualifier with value CAPG 
	*/
	public static final String CAPG = "CAPG";
	/**
	* Constant for qualifier with value CASH 
	*/
	public static final String CASH = "CASH";
	/**
	* Constant for qualifier with value CASHMOVE 
	*/
	public static final String CASHMOVE = "CASHMOVE";
	/**
	* Constant for qualifier with value CAVA 
	*/
	public static final String CAVA = "CAVA";
	/**
	* Constant for qualifier with value CEFI 
	*/
	public static final String CEFI = "CEFI";
	/**
	* Constant for qualifier with value CERT 
	*/
	public static final String CERT = "CERT";
	/**
	* Constant for qualifier with value CETI 
	*/
	public static final String CETI = "CETI";
	/**
	* Constant for qualifier with value CHAN 
	*/
	public static final String CHAN = "CHAN";
	/**
	* Constant for qualifier with value CHAR 
	*/
	public static final String CHAR = "CHAR";
	/**
	* Constant for qualifier with value CINL 
	*/
	public static final String CINL = "CINL";
	/**
	* Constant for qualifier with value CLAS 
	*/
	public static final String CLAS = "CLAS";
	/**
	* Constant for qualifier with value CLCP 
	*/
	public static final String CLCP = "CLCP";
	/**
	* Constant for qualifier with value COAF 
	*/
	public static final String COAF = "COAF";
	/**
	* Constant for qualifier with value COAP 
	*/
	public static final String COAP = "COAP";
	/**
	* Constant for qualifier with value CODO 
	*/
	public static final String CODO = "CODO";
	/**
	* Constant for qualifier with value CODS 
	*/
	public static final String CODS = "CODS";
	/**
	* Constant for qualifier with value COLI 
	*/
	public static final String COLI = "COLI";
	/**
	* Constant for qualifier with value COLO 
	*/
	public static final String COLO = "COLO";
	/**
	* Constant for qualifier with value COMP 
	*/
	public static final String COMP = "COMP";
	/**
	* Constant for qualifier with value CONT 
	*/
	public static final String CONT = "CONT";
	/**
	* Constant for qualifier with value CONV 
	*/
	public static final String CONV = "CONV";
	/**
	* Constant for qualifier with value CORP 
	*/
	public static final String CORP = "CORP";
	/**
	* Constant for qualifier with value COUP 
	*/
	public static final String COUP = "COUP";
	/**
	* Constant for qualifier with value CRDB 
	*/
	public static final String CRDB = "CRDB";
	/**
	* Constant for qualifier with value CSPD 
	*/
	public static final String CSPD = "CSPD";
	/**
	* Constant for qualifier with value CVPR 
	*/
	public static final String CVPR = "CVPR";
	/**
	* Constant for qualifier with value DAAC 
	*/
	public static final String DAAC = "DAAC";
	/**
	* Constant for qualifier with value DDTE 
	*/
	public static final String DDTE = "DDTE";
	/**
	* Constant for qualifier with value DECL 
	*/
	public static final String DECL = "DECL";
	/**
	* Constant for qualifier with value DENO 
	*/
	public static final String DENO = "DENO";
	/**
	* Constant for qualifier with value DEVI 
	*/
	public static final String DEVI = "DEVI";
	/**
	* Constant for qualifier with value DFLT 
	*/
	public static final String DFLT = "DFLT";
	/**
	* Constant for qualifier with value DISC 
	*/
	public static final String DISC = "DISC";
	/**
	* Constant for qualifier with value DISF 
	*/
	public static final String DISF = "DISF";
	/**
	* Constant for qualifier with value DITY 
	*/
	public static final String DITY = "DITY";
	/**
	* Constant for qualifier with value DIVI 
	*/
	public static final String DIVI = "DIVI";
	/**
	* Constant for qualifier with value DIVR 
	*/
	public static final String DIVR = "DIVR";
	/**
	* Constant for qualifier with value DOMI 
	*/
	public static final String DOMI = "DOMI";
	/**
	* Constant for qualifier with value DROP 
	*/
	public static final String DROP = "DROP";
	/**
	* Constant for qualifier with value DSBT 
	*/
	public static final String DSBT = "DSBT";
	/**
	* Constant for qualifier with value DSDA 
	*/
	public static final String DSDA = "DSDA";
	/**
	* Constant for qualifier with value DSDE 
	*/
	public static final String DSDE = "DSDE";
	/**
	* Constant for qualifier with value DSPL 
	*/
	public static final String DSPL = "DSPL";
	/**
	* Constant for qualifier with value DSSE 
	*/
	public static final String DSSE = "DSSE";
	/**
	* Constant for qualifier with value DSWA 
	*/
	public static final String DSWA = "DSWA";
	/**
	* Constant for qualifier with value DSWN 
	*/
	public static final String DSWN = "DSWN";
	/**
	* Constant for qualifier with value DSWO 
	*/
	public static final String DSWO = "DSWO";
	/**
	* Constant for qualifier with value DSWS 
	*/
	public static final String DSWS = "DSWS";
	/**
	* Constant for qualifier with value DVCP 
	*/
	public static final String DVCP = "DVCP";
	/**
	* Constant for qualifier with value EARD 
	*/
	public static final String EARD = "EARD";
	/**
	* Constant for qualifier with value EARL 
	*/
	public static final String EARL = "EARL";
	/**
	* Constant for qualifier with value ECDT 
	*/
	public static final String ECDT = "ECDT";
	/**
	* Constant for qualifier with value ECIO 
	*/
	public static final String ECIO = "ECIO";
	/**
	* Constant for qualifier with value ECPD 
	*/
	public static final String ECPD = "ECPD";
	/**
	* Constant for qualifier with value EFFD 
	*/
	public static final String EFFD = "EFFD";
	/**
	* Constant for qualifier with value ELCT 
	*/
	public static final String ELCT = "ELCT";
	/**
	* Constant for qualifier with value ELIG 
	*/
	public static final String ELIG = "ELIG";
	/**
	* Constant for qualifier with value ENTL 
	*/
	public static final String ENTL = "ENTL";
	/**
	* Constant for qualifier with value EQUL 
	*/
	public static final String EQUL = "EQUL";
	/**
	* Constant for qualifier with value ESOF 
	*/
	public static final String ESOF = "ESOF";
	/**
	* Constant for qualifier with value ESTA 
	*/
	public static final String ESTA = "ESTA";
	/**
	* Constant for qualifier with value ETPD 
	*/
	public static final String ETPD = "ETPD";
	/**
	* Constant for qualifier with value EUTR 
	*/
	public static final String EUTR = "EUTR";
	/**
	* Constant for qualifier with value EXCH 
	*/
	public static final String EXCH = "EXCH";
	/**
	* Constant for qualifier with value EXEC 
	*/
	public static final String EXEC = "EXEC";
	/**
	* Constant for qualifier with value EXPI 
	*/
	public static final String EXPI = "EXPI";
	/**
	* Constant for qualifier with value FDAT 
	*/
	public static final String FDAT = "FDAT";
	/**
	* Constant for qualifier with value FDIV 
	*/
	public static final String FDIV = "FDIV";
	/**
	* Constant for qualifier with value FIA 
	*/
	public static final String FIA = "FIA";
	/**
	* Constant for qualifier with value FILL 
	*/
	public static final String FILL = "FILL";
	/**
	* Constant for qualifier with value FISC 
	*/
	public static final String FISC = "FISC";
	/**
	* Constant for qualifier with value FLFR 
	*/
	public static final String FLFR = "FLFR";
	/**
	* Constant for qualifier with value FOLQ 
	*/
	public static final String FOLQ = "FOLQ";
	/**
	* Constant for qualifier with value FRNR 
	*/
	public static final String FRNR = "FRNR";
	/**
	* Constant for qualifier with value FXDT 
	*/
	public static final String FXDT = "FXDT";
	/**
	* Constant for qualifier with value GENL 
	*/
	public static final String GENL = "GENL";
	/**
	* Constant for qualifier with value GRSS 
	*/
	public static final String GRSS = "GRSS";
	/**
	* Constant for qualifier with value GUPA 
	*/
	public static final String GUPA = "GUPA";
	/**
	* Constant for qualifier with value HEAR 
	*/
	public static final String HEAR = "HEAR";
	/**
	* Constant for qualifier with value IDFX 
	*/
	public static final String IDFX = "IDFX";
	/**
	* Constant for qualifier with value IFIX 
	*/
	public static final String IFIX = "IFIX";
	/**
	* Constant for qualifier with value INBA 
	*/
	public static final String INBA = "INBA";
	/**
	* Constant for qualifier with value INCE 
	*/
	public static final String INCE = "INCE";
	/**
	* Constant for qualifier with value INCO 
	*/
	public static final String INCO = "INCO";
	/**
	* Constant for qualifier with value INCR 
	*/
	public static final String INCR = "INCR";
	/**
	* Constant for qualifier with value INDC 
	*/
	public static final String INDC = "INDC";
	/**
	* Constant for qualifier with value INDM 
	*/
	public static final String INDM = "INDM";
	/**
	* Constant for qualifier with value INDX 
	*/
	public static final String INDX = "INDX";
	/**
	* Constant for qualifier with value INFA 
	*/
	public static final String INFA = "INFA";
	/**
	* Constant for qualifier with value INPE 
	*/
	public static final String INPE = "INPE";
	/**
	* Constant for qualifier with value INTP 
	*/
	public static final String INTP = "INTP";
	/**
	* Constant for qualifier with value INTR 
	*/
	public static final String INTR = "INTR";
	/**
	* Constant for qualifier with value INTSEC 
	*/
	public static final String INTSEC = "INTSEC";
	/**
	* Constant for qualifier with value ISAG 
	*/
	public static final String ISAG = "ISAG";
	/**
	* Constant for qualifier with value ISSU 
	*/
	public static final String ISSU = "ISSU";
	/**
	* Constant for qualifier with value ITYP 
	*/
	public static final String ITYP = "ITYP";
	/**
	* Constant for qualifier with value LAPD 
	*/
	public static final String LAPD = "LAPD";
	/**
	* Constant for qualifier with value LEOG 
	*/
	public static final String LEOG = "LEOG";
	/**
	* Constant for qualifier with value LINK 
	*/
	public static final String LINK = "LINK";
	/**
	* Constant for qualifier with value LOAN 
	*/
	public static final String LOAN = "LOAN";
	/**
	* Constant for qualifier with value LOCO 
	*/
	public static final String LOCO = "LOCO";
	/**
	* Constant for qualifier with value LOTO 
	*/
	public static final String LOTO = "LOTO";
	/**
	* Constant for qualifier with value LTRD 
	*/
	public static final String LTRD = "LTRD";
	/**
	* Constant for qualifier with value MAEX 
	*/
	public static final String MAEX = "MAEX";
	/**
	* Constant for qualifier with value MATU 
	*/
	public static final String MATU = "MATU";
	/**
	* Constant for qualifier with value MAXP 
	*/
	public static final String MAXP = "MAXP";
	/**
	* Constant for qualifier with value MCTD 
	*/
	public static final String MCTD = "MCTD";
	/**
	* Constant for qualifier with value MEE3 
	*/
	public static final String MEE3 = "MEE3";
	/**
	* Constant for qualifier with value MEET 
	*/
	public static final String MEET = "MEET";
	/**
	* Constant for qualifier with value MEET2 
	*/
	public static final String MEET2 = "MEET2";
	/**
	* Constant for qualifier with value MEOR 
	*/
	public static final String MEOR = "MEOR";
	/**
	* Constant for qualifier with value MERE 
	*/
	public static final String MERE = "MERE";
	/**
	* Constant for qualifier with value MET2 
	*/
	public static final String MET2 = "MET2";
	/**
	* Constant for qualifier with value MET3 
	*/
	public static final String MET3 = "MET3";
	/**
	* Constant for qualifier with value MFDV 
	*/
	public static final String MFDV = "MFDV";
	/**
	* Constant for qualifier with value MFIX 
	*/
	public static final String MFIX = "MFIX";
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
	* Constant for qualifier with value MINO 
	*/
	public static final String MINO = "MINO";
	/**
	* Constant for qualifier with value MINP 
	*/
	public static final String MINP = "MINP";
	/**
	* Constant for qualifier with value MKDT 
	*/
	public static final String MKDT = "MKDT";
	/**
	* Constant for qualifier with value MKTC 
	*/
	public static final String MKTC = "MKTC";
	/**
	* Constant for qualifier with value MQSO 
	*/
	public static final String MQSO = "MQSO";
	/**
	* Constant for qualifier with value MRKT 
	*/
	public static final String MRKT = "MRKT";
	/**
	* Constant for qualifier with value _NAME 
	*/
	public static final String _NAME = "_NAME";
	/**
	* Constant for qualifier with value NBLT 
	*/
	public static final String NBLT = "NBLT";
	/**
	* Constant for qualifier with value NDOM 
	*/
	public static final String NDOM = "NDOM";
	/**
	* Constant for qualifier with value NELP 
	*/
	public static final String NELP = "NELP";
	/**
	* Constant for qualifier with value NETT 
	*/
	public static final String NETT = "NETT";
	/**
	* Constant for qualifier with value NEWD 
	*/
	public static final String NEWD = "NEWD";
	/**
	* Constant for qualifier with value NEWO 
	*/
	public static final String NEWO = "NEWO";
	/**
	* Constant for qualifier with value NOMI 
	*/
	public static final String NOMI = "NOMI";
	/**
	* Constant for qualifier with value NPLI 
	*/
	public static final String NPLI = "NPLI";
	/**
	* Constant for qualifier with value NRES 
	*/
	public static final String NRES = "NRES";
	/**
	* Constant for qualifier with value NSER 
	*/
	public static final String NSER = "NSER";
	/**
	* Constant for qualifier with value NSIS 
	*/
	public static final String NSIS = "NSIS";
	/**
	* Constant for qualifier with value NWFC 
	*/
	public static final String NWFC = "NWFC";
	/**
	* Constant for qualifier with value NXRT 
	*/
	public static final String NXRT = "NXRT";
	/**
	* Constant for qualifier with value OAPD 
	*/
	public static final String OAPD = "OAPD";
	/**
	* Constant for qualifier with value OBAL 
	*/
	public static final String OBAL = "OBAL";
	/**
	* Constant for qualifier with value OCMT 
	*/
	public static final String OCMT = "OCMT";
	/**
	* Constant for qualifier with value OFFE 
	*/
	public static final String OFFE = "OFFE";
	/**
	* Constant for qualifier with value OFFO 
	*/
	public static final String OFFO = "OFFO";
	/**
	* Constant for qualifier with value OFFR 
	*/
	public static final String OFFR = "OFFR";
	/**
	* Constant for qualifier with value OPST 
	*/
	public static final String OPST = "OPST";
	/**
	* Constant for qualifier with value OPTF 
	*/
	public static final String OPTF = "OPTF";
	/**
	* Constant for qualifier with value OPTN 
	*/
	public static final String OPTN = "OPTN";
	/**
	* Constant for qualifier with value OSTA 
	*/
	public static final String OSTA = "OSTA";
	/**
	* Constant for qualifier with value OSUB 
	*/
	public static final String OSUB = "OSUB";
	/**
	* Constant for qualifier with value OVEP 
	*/
	public static final String OVEP = "OVEP";
	/**
	* Constant for qualifier with value PACO 
	*/
	public static final String PACO = "PACO";
	/**
	* Constant for qualifier with value PAMM 
	*/
	public static final String PAMM = "PAMM";
	/**
	* Constant for qualifier with value PARL 
	*/
	public static final String PARL = "PARL";
	/**
	* Constant for qualifier with value PAYA 
	*/
	public static final String PAYA = "PAYA";
	/**
	* Constant for qualifier with value PAYD 
	*/
	public static final String PAYD = "PAYD";
	/**
	* Constant for qualifier with value PDIV 
	*/
	public static final String PDIV = "PDIV";
	/**
	* Constant for qualifier with value PEND 
	*/
	public static final String PEND = "PEND";
	/**
	* Constant for qualifier with value PENR 
	*/
	public static final String PENR = "PENR";
	/**
	* Constant for qualifier with value PLDT 
	*/
	public static final String PLDT = "PLDT";
	/**
	* Constant for qualifier with value PLIS 
	*/
	public static final String PLIS = "PLIS";
	/**
	* Constant for qualifier with value PODT 
	*/
	public static final String PODT = "PODT";
	/**
	* Constant for qualifier with value POST 
	*/
	public static final String POST = "POST";
	/**
	* Constant for qualifier with value PPDT 
	*/
	public static final String PPDT = "PPDT";
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
	* Constant for qualifier with value PRIN 
	*/
	public static final String PRIN = "PRIN";
	/**
	* Constant for qualifier with value PROC 
	*/
	public static final String PROC = "PROC";
	/**
	* Constant for qualifier with value PROD 
	*/
	public static final String PROD = "PROD";
	/**
	* Constant for qualifier with value PROR 
	*/
	public static final String PROR = "PROR";
	/**
	* Constant for qualifier with value PRPP 
	*/
	public static final String PRPP = "PRPP";
	/**
	* Constant for qualifier with value PSAG 
	*/
	public static final String PSAG = "PSAG";
	/**
	* Constant for qualifier with value PTSC 
	*/
	public static final String PTSC = "PTSC";
	/**
	* Constant for qualifier with value PUTT 
	*/
	public static final String PUTT = "PUTT";
	/**
	* Constant for qualifier with value PWAL 
	*/
	public static final String PWAL = "PWAL";
	/**
	* Constant for qualifier with value QINT 
	*/
	public static final String QINT = "QINT";
	/**
	* Constant for qualifier with value QTSO 
	*/
	public static final String QTSO = "QTSO";
	/**
	* Constant for qualifier with value RATE 
	*/
	public static final String RATE = "RATE";
	/**
	* Constant for qualifier with value RCHG 
	*/
	public static final String RCHG = "RCHG";
	/**
	* Constant for qualifier with value RDDT 
	*/
	public static final String RDDT = "RDDT";
	/**
	* Constant for qualifier with value RDIS 
	*/
	public static final String RDIS = "RDIS";
	/**
	* Constant for qualifier with value RDTE 
	*/
	public static final String RDTE = "RDTE";
	/**
	* Constant for qualifier with value REDP 
	*/
	public static final String REDP = "REDP";
	/**
	* Constant for qualifier with value REGF 
	*/
	public static final String REGF = "REGF";
	/**
	* Constant for qualifier with value REGI 
	*/
	public static final String REGI = "REGI";
	/**
	* Constant for qualifier with value REGO 
	*/
	public static final String REGO = "REGO";
	/**
	* Constant for qualifier with value REGR 
	*/
	public static final String REGR = "REGR";
	/**
	* Constant for qualifier with value REIN 
	*/
	public static final String REIN = "REIN";
	/**
	* Constant for qualifier with value RELA 
	*/
	public static final String RELA = "RELA";
	/**
	* Constant for qualifier with value RESA 
	*/
	public static final String RESA = "RESA";
	/**
	* Constant for qualifier with value RESU 
	*/
	public static final String RESU = "RESU";
	/**
	* Constant for qualifier with value REVO 
	*/
	public static final String REVO = "REVO";
	/**
	* Constant for qualifier with value RHDI 
	*/
	public static final String RHDI = "RHDI";
	/**
	* Constant for qualifier with value RINR 
	*/
	public static final String RINR = "RINR";
	/**
	* Constant for qualifier with value RLOS 
	*/
	public static final String RLOS = "RLOS";
	/**
	* Constant for qualifier with value RSPR 
	*/
	public static final String RSPR = "RSPR";
	/**
	* Constant for qualifier with value RTUN 
	*/
	public static final String RTUN = "RTUN";
	/**
	* Constant for qualifier with value SAFE 
	*/
	public static final String SAFE = "SAFE";
	/**
	* Constant for qualifier with value SECMOVE 
	*/
	public static final String SECMOVE = "SECMOVE";
	/**
	* Constant for qualifier with value SELL 
	*/
	public static final String SELL = "SELL";
	/**
	* Constant for qualifier with value SEME 
	*/
	public static final String SEME = "SEME";
	/**
	* Constant for qualifier with value SETT 
	*/
	public static final String SETT = "SETT";
	/**
	* Constant for qualifier with value SHIP 
	*/
	public static final String SHIP = "SHIP";
	/**
	* Constant for qualifier with value SHRT 
	*/
	public static final String SHRT = "SHRT";
	/**
	* Constant for qualifier with value SIZE 
	*/
	public static final String SIZE = "SIZE";
	/**
	* Constant for qualifier with value SOFE 
	*/
	public static final String SOFE = "SOFE";
	/**
	* Constant for qualifier with value SOIC 
	*/
	public static final String SOIC = "SOIC";
	/**
	* Constant for qualifier with value SOLA 
	*/
	public static final String SOLA = "SOLA";
	/**
	* Constant for qualifier with value SPLT 
	*/
	public static final String SPLT = "SPLT";
	/**
	* Constant for qualifier with value SPOS 
	*/
	public static final String SPOS = "SPOS";
	/**
	* Constant for qualifier with value STAM 
	*/
	public static final String STAM = "STAM";
	/**
	* Constant for qualifier with value STEX 
	*/
	public static final String STEX = "STEX";
	/**
	* Constant for qualifier with value STIN 
	*/
	public static final String STIN = "STIN";
	/**
	* Constant for qualifier with value SUBS 
	*/
	public static final String SUBS = "SUBS";
	/**
	* Constant for qualifier with value SUSP 
	*/
	public static final String SUSP = "SUSP";
	/**
	* Constant for qualifier with value SXDT 
	*/
	public static final String SXDT = "SXDT";
	/**
	* Constant for qualifier with value TAXB 
	*/
	public static final String TAXB = "TAXB";
	/**
	* Constant for qualifier with value TAXC 
	*/
	public static final String TAXC = "TAXC";
	/**
	* Constant for qualifier with value TAXE 
	*/
	public static final String TAXE = "TAXE";
	/**
	* Constant for qualifier with value TAXR 
	*/
	public static final String TAXR = "TAXR";
	/**
	* Constant for qualifier with value TDMT 
	*/
	public static final String TDMT = "TDMT";
	/**
	* Constant for qualifier with value TDTA 
	*/
	public static final String TDTA = "TDTA";
	/**
	* Constant for qualifier with value TEMP 
	*/
	public static final String TEMP = "TEMP";
	/**
	* Constant for qualifier with value TPDT 
	*/
	public static final String TPDT = "TPDT";
	/**
	* Constant for qualifier with value TRAD 
	*/
	public static final String TRAD = "TRAD";
	/**
	* Constant for qualifier with value TRAN 
	*/
	public static final String TRAN = "TRAN";
	/**
	* Constant for qualifier with value TRAT 
	*/
	public static final String TRAT = "TRAT";
	/**
	* Constant for qualifier with value TRDP 
	*/
	public static final String TRDP = "TRDP";
	/**
	* Constant for qualifier with value TSDT 
	*/
	public static final String TSDT = "TSDT";
	/**
	* Constant for qualifier with value TXAP 
	*/
	public static final String TXAP = "TXAP";
	/**
	* Constant for qualifier with value TXDF 
	*/
	public static final String TXDF = "TXDF";
	/**
	* Constant for qualifier with value TXFR 
	*/
	public static final String TXFR = "TXFR";
	/**
	* Constant for qualifier with value TXIN 
	*/
	public static final String TXIN = "TXIN";
	/**
	* Constant for qualifier with value TXNR 
	*/
	public static final String TXNR = "TXNR";
	/**
	* Constant for qualifier with value TXPR 
	*/
	public static final String TXPR = "TXPR";
	/**
	* Constant for qualifier with value TXRC 
	*/
	public static final String TXRC = "TXRC";
	/**
	* Constant for qualifier with value UNAF 
	*/
	public static final String UNAF = "UNAF";
	/**
	* Constant for qualifier with value UNBA 
	*/
	public static final String UNBA = "UNBA";
	/**
	* Constant for qualifier with value UNCO 
	*/
	public static final String UNCO = "UNCO";
	/**
	* Constant for qualifier with value UNFR 
	*/
	public static final String UNFR = "UNFR";
	/**
	* Constant for qualifier with value USECU 
	*/
	public static final String USECU = "USECU";
	/**
	* Constant for qualifier with value VALU 
	*/
	public static final String VALU = "VALU";
	/**
	* Constant for qualifier with value VATA 
	*/
	public static final String VATA = "VATA";
	/**
	* Constant for qualifier with value WAPA 
	*/
	public static final String WAPA = "WAPA";
	/**
	* Constant for qualifier with value WEBB 
	*/
	public static final String WEBB = "WEBB";
	/**
	* Constant for qualifier with value WITF 
	*/
	public static final String WITF = "WITF";
	/**
	* Constant for qualifier with value WITL 
	*/
	public static final String WITL = "WITL";
	/**
	* Constant for qualifier with value WTHD 
	*/
	public static final String WTHD = "WTHD";
	/**
	* Constant for qualifier with value WUCO 
	*/
	public static final String WUCO = "WUCO";
	/**
	* Constant for qualifier with value XDTE 
	*/
	public static final String XDTE = "XDTE";
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT564.class.getName());

	/**
	 * Creates an MT564 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT564 content
	 */
	public MT564(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT564 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT564 content
	 */
	public MT564(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT564 initialized with a new SwiftMessage
	 */
	/*
	public MT564() {
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
		return "564";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 28E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 28E at MT564 is expected to be the only one.
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
	 * The first occurrence of field 23G at MT564 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 25D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 25D at MT564 is expected to be the only one.
	 * 
	 * @return a Field25D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field25D getField25D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("25D");
			if (t == null) {
				log.fine("field 25D not found");
				return null;
			} else {
				return new Field25D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 36E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 36E at MT564 is expected to be the only one.
	 * 
	 * @return a Field36E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field36E getField36E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("36E");
			if (t == null) {
				log.fine("field 36E not found");
				return null;
			} else {
				return new Field36E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 99A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 99A at MT564 is expected to be the only one.
	 * 
	 * @return a Field99A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field99A getField99A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("99A");
			if (t == null) {
				log.fine("field 99A not found");
				return null;
			} else {
				return new Field99A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 20C at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22F at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 16R at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13A at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13B at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 16S at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 12A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 12A at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 12C at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 12B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92K, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92K at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92K objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92K> getField92K() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92K");
			final List<Field92K> result = new ArrayList<Field92K>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92K(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92D at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92D> getField92D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92D");
			final List<Field92D> result = new ArrayList<Field92D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 36B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 36B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95P at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 95R at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 97A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 97C at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97C> getField97C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("97C");
			final List<Field97C> result = new ArrayList<Field97C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field97C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94B at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 94C at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 94F at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 93B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 93B at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field93B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field93B> getField93B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("93B");
			final List<Field93B> result = new ArrayList<Field93B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field93B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 93C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 93C at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field93C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field93C> getField93C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("93C");
			final List<Field93C> result = new ArrayList<Field93C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field93C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98C at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98E at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98E> getField98E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("98E");
			final List<Field98E> result = new ArrayList<Field98E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field98E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 69A at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69A> getField69A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("69A");
			final List<Field69A> result = new ArrayList<Field69A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field69A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 69B at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69B> getField69B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("69B");
			final List<Field69B> result = new ArrayList<Field69B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field69B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 69C at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69C> getField69C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("69C");
			final List<Field69C> result = new ArrayList<Field69C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field69C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 69D at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69D> getField69D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("69D");
			final List<Field69D> result = new ArrayList<Field69D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field69D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 69E at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69E> getField69E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("69E");
			final List<Field69E> result = new ArrayList<Field69E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field69E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 69F at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69F> getField69F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("69F");
			final List<Field69F> result = new ArrayList<Field69F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field69F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 69J at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69J> getField69J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("69J");
			final List<Field69J> result = new ArrayList<Field69J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field69J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92F at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92F> getField92F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92F");
			final List<Field92F> result = new ArrayList<Field92F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 90B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 90A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 90E at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90E> getField90E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("90E");
			final List<Field90E> result = new ArrayList<Field90E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field90E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 36C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 36C at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field36C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field36C> getField36C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("36C");
			final List<Field36C> result = new ArrayList<Field36C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field36C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 17B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 17B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94E at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94E> getField94E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("94E");
			final List<Field94E> result = new ArrayList<Field94E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field94E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 70E at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70G, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 70G at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70G objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70G> getField70G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("70G");
			final List<Field70G> result = new ArrayList<Field70G>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field70G(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 11A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 11A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98F at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98F> getField98F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("98F");
			final List<Field98F> result = new ArrayList<Field98F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field98F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92J at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92J> getField92J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92J");
			final List<Field92J> result = new ArrayList<Field92J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22H at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 90F at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90F> getField90F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("90F");
			final List<Field90F> result = new ArrayList<Field90F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field90F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 90J at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90J> getField90J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("90J");
			final List<Field90J> result = new ArrayList<Field90J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field90J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92L at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92L> getField92L() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92L");
			final List<Field92L> result = new ArrayList<Field92L>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92L(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92N, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92N at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92N objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92N> getField92N() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92N");
			final List<Field92N> result = new ArrayList<Field92N>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92N(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 97E at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 19B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 19B at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field19B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field19B> getField19B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("19B");
			final List<Field19B> result = new ArrayList<Field19B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field19B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92M, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92M at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92M objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92M> getField92M() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92M");
			final List<Field92M> result = new ArrayList<Field92M>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92M(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90K, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 90K at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90K objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90K> getField90K() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("90K");
			final List<Field90K> result = new ArrayList<Field90K>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field90K(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95Q at MT564 are expected at one sequence or across several sequences.
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>USECU</em>
		*/
		public static final String START_END_16RS = "USECU";
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>FIA</em>
		*/
		public static final String START_END_16RS = "FIA";
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
	* Get the single occurrence of SequenceB1 delimited by 16R/16S {@value SequenceB1#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB1</code> is returned</em>  
	*/ 
	public SequenceB1 getSequenceB1() {
		return new SequenceB1(this.getSwiftMessage());
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ACCTINFO</em>
		*/
		public static final String START_END_16RS = "ACCTINFO";
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>INTSEC</em>
		*/
		public static final String START_END_16RS = "INTSEC";
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CADETL</em>
		*/
		public static final String START_END_16RS = "CADETL";
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
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CAOPTN</em>
		*/
		public static final String START_END_16RS = "CAOPTN";
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
	* Get the list of SequenceE delimited by 16R/16S {@value SequenceE#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceE> getSequenceEList() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceE.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceE> result = new ArrayList<SequenceE>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceE(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceE1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceE1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceE1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SECMOVE</em>
		*/
		public static final String START_END_16RS = "SECMOVE";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceE1 newInstance(final Tag ... tags) {
			final SequenceE1 result = new SequenceE1();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceE1(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceE1 delimited by 16R/16S {@value SequenceE1#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceE1> getSequenceE1List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceE1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceE1> result = new ArrayList<SequenceE1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceE1(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceE1a extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceE1a() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceE1a(final SwiftTagListBlock content) {
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
		public static SequenceE1a newInstance(final Tag ... tags) {
			final SequenceE1a result = new SequenceE1a();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceE1a(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the single occurrence of SequenceE1a delimited by 16R/16S {@value SequenceE1a#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceE1a</code> is returned</em>  
	*/ 
	public SequenceE1a getSequenceE1a() {
		return new SequenceE1a(this.getSwiftMessage());
	}
 


	public static class SequenceE2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceE2() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceE2(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CASHMOVE</em>
		*/
		public static final String START_END_16RS = "CASHMOVE";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		public static SequenceE2 newInstance(final Tag ... tags) {
			final SequenceE2 result = new SequenceE2();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceE2(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the list of SequenceE2 delimited by 16R/16S {@value SequenceE2#START_END_16RS} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	*/
	public List<SequenceE2> getSequenceE2List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceE2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceE2> result = new ArrayList<SequenceE2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceE2(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceF extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceF() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceF(final SwiftTagListBlock content) {
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
		public static SequenceF newInstance(final Tag ... tags) {
			final SequenceF result = new SequenceF();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		private SequenceF(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}

	/**
	* Get the single occurrence of SequenceF delimited by 16R/16S {@value SequenceF#START_END_16RS}.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceF</code> is returned</em>  
	*/ 
	public SequenceF getSequenceF() {
		return new SequenceF(this.getSwiftMessage());
	}
 





}
