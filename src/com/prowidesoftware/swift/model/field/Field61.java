
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
package com.prowidesoftware.swift.model.field;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 61<br /><br />
 *
 * validation pattern: CUSTOM<br />
 * parser pattern: CUSTOM<br />
 * components pattern: EFSSNSSSS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Calendar</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>String</code></li> 
 * 		<li>component5: <code>Number</code></li> 
 * 		<li>component6: <code>String</code></li> 
 * 		<li>component7: <code>String</code></li> 
 * 		<li>component8: <code>String</code></li> 
 * 		<li>component9: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field61 extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 61
	 */
    public static final String NAME = "61";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_61 = "61";
	public static final String PARSER_PATTERN ="CUSTOM";
	public static final String COMPONENTS_PATTERN = "EFSSNSSSS";

	/**
	* Create a Tag with this field name and the given value.
	* Shorthand for <code>new Tag(NAME, value)</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag tag(final String value) {
		return new Tag(NAME, value);
	}

	/**
	* Create a Tag with this field name and an empty string as value
	* Shorthand for <code>new Tag(NAME, "")</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag emptyTag() {
		return new Tag(NAME, "");
	}


	/**
	 * Default constructor
	 */
	public Field61() {
		super(9);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field61(String value) {
		this();

      //parse code from merge file
      parseCustom(value);
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		// CUSTOM pattern for field 61
		result.append(StringUtils.trimToEmpty(getComponent1()));
		result.append(StringUtils.trimToEmpty(getComponent2()));
		result.append(StringUtils.trimToEmpty(getComponent3()));
		result.append(StringUtils.trimToEmpty(getComponent4()));
		result.append(StringUtils.trimToEmpty(getComponent5()));
		result.append(StringUtils.trimToEmpty(getComponent6()));
		result.append(StringUtils.trimToEmpty(getComponent7()));
		if (StringUtils.isNotEmpty(getComponent8())) {	
			result.append("//");
			result.append(getComponent8());
		}
		if (StringUtils.isNotEmpty(getComponent9())) {	
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);
			result.append(getComponent9());
		}
		return result.toString();
	}


	/**
	 * Get the component1
	 * @return the component1
	 */
	public String getComponent1() {
		return getComponent(1);
	}

	/**
	 * Get the component1 as Calendar
	 * @return the component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent1AsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(1));
	}

	/**
	 * Get the Value Date (component1).
	 * @return the Value Date from component1
	 */
	public String getValueDate() {
		return getComponent(1);
	}
	
	/**
	 * Get the Value Date (component1) as Calendar
	 * @return the Value Date from component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getValueDateAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field61 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Calendar with the component1 content to set
	 */
	public Field61 setComponent1(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getDate2(component1));
		return this;
	}
	
	/**
	 * Set the Value Date (component1).
	 * @param component1 the Value Date to set
	 */
	public Field61 setValueDate(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Value Date (component1) as Calendar
	 * @param component1 Calendar with the Value Date content to set
	 */
	public Field61 setValueDate(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getDate2(component1));
		return this;
	}

	/**
	 * Get the component2
	 * @return the component2
	 */
	public String getComponent2() {
		return getComponent(2);
	}

	/**
	 * Get the component2 as Calendar
	 * @return the component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent2AsCalendar() {
		return SwiftFormatUtils.getDate1(getComponent(2));
	}

	/**
	 * Get the Entry Date (component2).
	 * @return the Entry Date from component2
	 */
	public String getEntryDate() {
		return getComponent(2);
	}
	
	/**
	 * Get the Entry Date (component2) as Calendar
	 * @return the Entry Date from component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getEntryDateAsCalendar() {
		return SwiftFormatUtils.getDate1(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field61 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field61 setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate1(component2));
		return this;
	}
	
	/**
	 * Set the Entry Date (component2).
	 * @param component2 the Entry Date to set
	 */
	public Field61 setEntryDate(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Entry Date (component2) as Calendar
	 * @param component2 Calendar with the Entry Date content to set
	 */
	public Field61 setEntryDate(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate1(component2));
		return this;
	}

	/**
	 * Get the component3
	 * @return the component3
	 */
	public String getComponent3() {
		return getComponent(3);
	}

	/**
	 * Same as getComponent(3)
	 */
	@Deprecated
	public java.lang.String getComponent3AsString() {
		return getComponent(3);
	}

	/**
	 * Get the D/C Mark (component3).
	 * @return the D/C Mark from component3
	 */
	public String getDCMark() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field61 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the D/C Mark (component3).
	 * @param component3 the D/C Mark to set
	 */
	public Field61 setDCMark(String component3) {
		setComponent(3, component3);
		return this;
	}

	/**
	 * Get the component4
	 * @return the component4
	 */
	public String getComponent4() {
		return getComponent(4);
	}

	/**
	 * Same as getComponent(4)
	 */
	@Deprecated
	public java.lang.String getComponent4AsString() {
		return getComponent(4);
	}

	/**
	 * Get the Funds Code (component4).
	 * @return the Funds Code from component4
	 */
	public String getFundsCode() {
		return getComponent(4);
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field61 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Funds Code (component4).
	 * @param component4 the Funds Code to set
	 */
	public Field61 setFundsCode(String component4) {
		setComponent(4, component4);
		return this;
	}

	/**
	 * Get the component5
	 * @return the component5
	 */
	public String getComponent5() {
		return getComponent(5);
	}

	/**
	 * Get the component5 as Number
	 * @return the component5 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent5AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(5));
	}

	/**
	 * Get the Amount (component5).
	 * @return the Amount from component5
	 */
	public String getAmount() {
		return getComponent(5);
	}
	
	/**
	 * Get the Amount (component5) as Number
	 * @return the Amount from component5 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getAmountAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field61 setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Number with the component5 content to set
	 */
	public Field61 setComponent5(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
		return this;
	}
	
	/**
	 * Set the Amount (component5).
	 * @param component5 the Amount to set
	 */
	public Field61 setAmount(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Amount (component5) as Number
	 * @param component5 Number with the Amount content to set
	 */
	public Field61 setAmount(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
		return this;
	}

	/**
	 * Get the component6
	 * @return the component6
	 */
	public String getComponent6() {
		return getComponent(6);
	}

	/**
	 * Same as getComponent(6)
	 */
	@Deprecated
	public java.lang.String getComponent6AsString() {
		return getComponent(6);
	}

	/**
	 * Get the Transaction Type (component6).
	 * @return the Transaction Type from component6
	 */
	public String getTransactionType() {
		return getComponent(6);
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field61 setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the Transaction Type (component6).
	 * @param component6 the Transaction Type to set
	 */
	public Field61 setTransactionType(String component6) {
		setComponent(6, component6);
		return this;
	}

	/**
	 * Get the component7
	 * @return the component7
	 */
	public String getComponent7() {
		return getComponent(7);
	}

	/**
	 * Same as getComponent(7)
	 */
	@Deprecated
	public java.lang.String getComponent7AsString() {
		return getComponent(7);
	}

	/**
	 * Get the Reference For The Account Owner (component7).
	 * @return the Reference For The Account Owner from component7
	 */
	public String getReferenceForTheAccountOwner() {
		return getComponent(7);
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field61 setComponent7(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the Reference For The Account Owner (component7).
	 * @param component7 the Reference For The Account Owner to set
	 */
	public Field61 setReferenceForTheAccountOwner(String component7) {
		setComponent(7, component7);
		return this;
	}

	/**
	 * Get the component8
	 * @return the component8
	 */
	public String getComponent8() {
		return getComponent(8);
	}

	/**
	 * Same as getComponent(8)
	 */
	@Deprecated
	public java.lang.String getComponent8AsString() {
		return getComponent(8);
	}

	/**
	 * Get the Reference Of The Account Servicing Institution (component8).
	 * @return the Reference Of The Account Servicing Institution from component8
	 */
	public String getReferenceOfTheAccountServicingInstitution() {
		return getComponent(8);
	}

	/**
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field61 setComponent8(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the Reference Of The Account Servicing Institution (component8).
	 * @param component8 the Reference Of The Account Servicing Institution to set
	 */
	public Field61 setReferenceOfTheAccountServicingInstitution(String component8) {
		setComponent(8, component8);
		return this;
	}

	/**
	 * Get the component9
	 * @return the component9
	 */
	public String getComponent9() {
		return getComponent(9);
	}

	/**
	 * Same as getComponent(9)
	 */
	@Deprecated
	public java.lang.String getComponent9AsString() {
		return getComponent(9);
	}

	/**
	 * Get the Supplementary Details (component9).
	 * @return the Supplementary Details from component9
	 */
	public String getSupplementaryDetails() {
		return getComponent(9);
	}

	/**
	 * Set the component9.
	 * @param component9 the component9 to set
	 */
	public Field61 setComponent9(String component9) {
		setComponent(9, component9);
		return this;
	}
	
	/**
	 * Set the Supplementary Details (component9).
	 * @param component9 the Supplementary Details to set
	 */
	public Field61 setSupplementaryDetails(String component9) {
		setComponent(9, component9);
		return this;
	}

   /**
    * Given a component number it returns true if the component is optional,
    * regardless of the field being mandatory in a particular message.<br />
    * Being the field's value conformed by a composition of one or several 
    * internal component values, the field may be present in a message with
    * a proper value but with some of its internal components not set.
    *
    * @param component component number, first component of a field is referenced as 1
    * @return true if the component is optional for this field, false otherwise
    */
   @Override
   public boolean isOptional(int component) {   
       return false;
   }

   /**
    * Returns true if the field is a GENERIC FIELD as specified by the standard.
    *
    * @return true if the field is generic, false otherwise
    */
   @Override
   public boolean isGeneric() {   
       return false;
   }
   
   public String componentsPattern() {
           return COMPONENTS_PATTERN;
   }

   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	* @deprecated use constant Field61	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field61 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field61) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field61 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field61 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field61 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field61> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field61 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field61> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field61> result = new java.util.ArrayList<Field61>(arr.length);
			for (final Field f : arr) {
				result.add((Field61) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	

	/**
	 * Custom parser for Field61.<br />
	 * Uses semantic information to split components 3 and 4 (assuming component 3 can only be D, C, RD, RC).
	 * It also splits VAR-SEQU-1 into components 7 and 8.<br /><br />
	 *
	 * Thanks to Mark Karatovic for his contribution.
	 */
	protected void parseCustom(String value) {
		java.util.List<String>lines = SwiftParseUtils.getLines(value);
		if (lines.size() > 0) {
			//parse dates
			String dates = SwiftParseUtils.getNumericPrefix(lines.get(0));
			int dates_length = dates != null ? dates.length() : 0;
			if (dates_length >= 6) {
				setComponent1(org.apache.commons.lang.StringUtils.substring(dates, 0, 6));
			}
			if (dates_length >= 10) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(dates, 6));
			}
			String toparse = org.apache.commons.lang.StringUtils.substring(lines.get(0), dates_length);
			
			//parse component 3 and 4
			String comp3and4 = SwiftParseUtils.getAlphaPrefix(toparse);	
			int comp3and4_length = comp3and4 != null ? comp3and4.length() : 0;
    		if(comp3and4.charAt(0) != 'R') 
    		{
    			if (comp3and4_length >= 1) {
    				setComponent3(org.apache.commons.lang.StringUtils.substring(comp3and4, 0, 1));
    			}
    			if (comp3and4_length >= 2) {
    				setComponent4(org.apache.commons.lang.StringUtils.substring(comp3and4, 1));
    			}
    		} else{
    			if (comp3and4_length >= 2) {
    				setComponent3(org.apache.commons.lang.StringUtils.substring(comp3and4, 0, 2));
    			}
    			if (comp3and4_length >= 3) {
    				setComponent4(org.apache.commons.lang.StringUtils.substring(comp3and4, 2));
    			}
    		}	
			
			String toparse2 = org.apache.commons.lang.StringUtils.substring(toparse, comp3and4_length);

			//parse component 5
			String comp5 = SwiftParseUtils.getNumericPrefix(toparse2);
			int comp5_length = comp5 != null ? comp5.length() : 0;
			setComponent5(comp5);
			
			//parse components 6 and 7
			String toparse3 = org.apache.commons.lang.StringUtils.substring(toparse2, comp5_length);
			String toParseTxnCode = org.apache.commons.lang.StringUtils.substring(toparse3, 0, 4);
			int toParseTxnCodeLength = toParseTxnCode != null ? toParseTxnCode.length() : 0;
			String toparse4 = org.apache.commons.lang.StringUtils.substring(toparse3, toParseTxnCodeLength);
			setComponent6(toParseTxnCode);
			//component 7 - max 16 chars separated by // if more fields present.
			setComponent7(org.apache.commons.lang.StringUtils.substringBefore(toparse4, "//"));
			//component 8 must be 16 chars and 9 is 34 chars max however both are optional
			String toparse5 = org.apache.commons.lang.StringUtils.substringAfter(toparse4, "//"); 
			int toParse5Length = toparse5 != null ? toparse5.length() : 0;
			if(toParse5Length > 0){
				setComponent8(org.apache.commons.lang.StringUtils.substring(toparse5, 0, 16));
				//if length > 16 chars then statement line has supplementary details as its last optional field
				if(toParse5Length > 16) setComponent9(org.apache.commons.lang.StringUtils.substring(toparse5, 16));
			}
		}
		if (lines.size() > 1) {
			setComponent9(lines.get(1));
		}
	}
}
