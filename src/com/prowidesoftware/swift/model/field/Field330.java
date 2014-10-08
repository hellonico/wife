
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
 * Field 330<br /><br />
 *
 * validation pattern: 4!n6!n6!n6!n6!n1!n<br />
 * parser pattern: 4!N6!N6!N6!N6!N1!N<br />
 * components pattern: NNNNNN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Number</code></li> 
 * 		<li>component2: <code>Number</code></li> 
 * 		<li>component3: <code>Number</code></li> 
 * 		<li>component4: <code>Number</code></li> 
 * 		<li>component5: <code>Number</code></li> 
 * 		<li>component6: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field330 extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 330
	 */
    public static final String NAME = "330";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_330 = "330";
	public static final String PARSER_PATTERN ="4!N6!N6!N6!N6!N1!N";
	public static final String COMPONENTS_PATTERN = "NNNNNN";

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
	public Field330() {
		super(6);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field330(String value) {
		this();

		if (value != null) {
        	if (value.length() >= 4) {
				setComponent1(org.apache.commons.lang.StringUtils.substring(value, 0, 4));
			}
        	if (value.length() >= 10) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(value, 4, 10));
			}
        	if (value.length() >= 16) {
				setComponent3(org.apache.commons.lang.StringUtils.substring(value, 10, 16));
			}
			if (value.length() >= 22) {
				setComponent4(org.apache.commons.lang.StringUtils.substring(value, 16, 22));
			}
			if (value.length() >= 28) {
				setComponent5(org.apache.commons.lang.StringUtils.substring(value, 22, 28));
			}
			if (value.length() > 28) {
				setComponent6(org.apache.commons.lang.StringUtils.substring(value, 28));
			}
		}
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		//FIXME serialization
		// @NotImplemented
		int notImplemented;
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
	 * Get the component1 as Number
	 * @return the component1 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent1AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(1));
	}

	/**
	 * Get the Session Number (component1).
	 * @return the Session Number from component1
	 */
	public String getSessionNumber() {
		return getComponent(1);
	}
	
	/**
	 * Get the Session Number (component1) as Number
	 * @return the Session Number from component1 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getSessionNumberAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field330 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Number with the component1 content to set
	 */
	public Field330 setComponent1(java.lang.Number component1) {
		setComponent(1, SwiftFormatUtils.getNumber(component1));
		return this;
	}
	
	/**
	 * Set the Session Number (component1).
	 * @param component1 the Session Number to set
	 */
	public Field330 setSessionNumber(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Session Number (component1) as Number
	 * @param component1 Number with the Session Number content to set
	 */
	public Field330 setSessionNumber(java.lang.Number component1) {
		setComponent(1, SwiftFormatUtils.getNumber(component1));
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
	 * Get the component2 as Number
	 * @return the component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent2AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Get the ISN (component2).
	 * @return the ISN from component2
	 */
	public String getISN() {
		return getComponent(2);
	}
	
	/**
	 * Get the ISN (component2) as Number
	 * @return the ISN from component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getISNAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field330 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Number with the component2 content to set
	 */
	public Field330 setComponent2(java.lang.Number component2) {
		setComponent(2, SwiftFormatUtils.getNumber(component2));
		return this;
	}
	
	/**
	 * Set the ISN (component2).
	 * @param component2 the ISN to set
	 */
	public Field330 setISN(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the ISN (component2) as Number
	 * @param component2 Number with the ISN content to set
	 */
	public Field330 setISN(java.lang.Number component2) {
		setComponent(2, SwiftFormatUtils.getNumber(component2));
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
	 * Get the component3 as Number
	 * @return the component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent3AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Get the ISNNAK (component3).
	 * @return the ISNNAK from component3
	 */
	public String getISNNAK() {
		return getComponent(3);
	}
	
	/**
	 * Get the ISNNAK (component3) as Number
	 * @return the ISNNAK from component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getISNNAKAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field330 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Number with the component3 content to set
	 */
	public Field330 setComponent3(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
		return this;
	}
	
	/**
	 * Set the ISNNAK (component3).
	 * @param component3 the ISNNAK to set
	 */
	public Field330 setISNNAK(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the ISNNAK (component3) as Number
	 * @param component3 Number with the ISNNAK content to set
	 */
	public Field330 setISNNAK(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
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
	 * Get the component4 as Number
	 * @return the component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent4AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Get the OSN (component4).
	 * @return the OSN from component4
	 */
	public String getOSN() {
		return getComponent(4);
	}
	
	/**
	 * Get the OSN (component4) as Number
	 * @return the OSN from component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getOSNAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field330 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Number with the component4 content to set
	 */
	public Field330 setComponent4(java.lang.Number component4) {
		setComponent(4, SwiftFormatUtils.getNumber(component4));
		return this;
	}
	
	/**
	 * Set the OSN (component4).
	 * @param component4 the OSN to set
	 */
	public Field330 setOSN(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the OSN (component4) as Number
	 * @param component4 Number with the OSN content to set
	 */
	public Field330 setOSN(java.lang.Number component4) {
		setComponent(4, SwiftFormatUtils.getNumber(component4));
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
	 * Get the OSNNAK (component5).
	 * @return the OSNNAK from component5
	 */
	public String getOSNNAK() {
		return getComponent(5);
	}
	
	/**
	 * Get the OSNNAK (component5) as Number
	 * @return the OSNNAK from component5 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getOSNNAKAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field330 setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Number with the component5 content to set
	 */
	public Field330 setComponent5(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
		return this;
	}
	
	/**
	 * Set the OSNNAK (component5).
	 * @param component5 the OSNNAK to set
	 */
	public Field330 setOSNNAK(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the OSNNAK (component5) as Number
	 * @param component5 Number with the OSNNAK content to set
	 */
	public Field330 setOSNNAK(java.lang.Number component5) {
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
	 * Get the component6 as Number
	 * @return the component6 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent6AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(6));
	}

	/**
	 * Get the ACK Replay Indicator (component6).
	 * @return the ACK Replay Indicator from component6
	 */
	public String getACKReplayIndicator() {
		return getComponent(6);
	}
	
	/**
	 * Get the ACK Replay Indicator (component6) as Number
	 * @return the ACK Replay Indicator from component6 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getACKReplayIndicatorAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(6));
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field330 setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the component6.
	 * @param component6 the Number with the component6 content to set
	 */
	public Field330 setComponent6(java.lang.Number component6) {
		setComponent(6, SwiftFormatUtils.getNumber(component6));
		return this;
	}
	
	/**
	 * Set the ACK Replay Indicator (component6).
	 * @param component6 the ACK Replay Indicator to set
	 */
	public Field330 setACKReplayIndicator(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the ACK Replay Indicator (component6) as Number
	 * @param component6 Number with the ACK Replay Indicator content to set
	 */
	public Field330 setACKReplayIndicator(java.lang.Number component6) {
		setComponent(6, SwiftFormatUtils.getNumber(component6));
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
	* @deprecated use constant Field330	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field330 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field330) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field330 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field330 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field330 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field330> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field330 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field330> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field330> result = new java.util.ArrayList<Field330>(arr.length);
			for (final Field f : arr) {
				result.add((Field330) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
