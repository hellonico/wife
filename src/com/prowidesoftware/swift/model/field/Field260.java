
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
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import com.prowidesoftware.swift.model.BIC;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 260<br /><br />
 *
 * validation pattern: &lt;SWIFTBIC&gt;|&lt;NON-SWIFTBIC&gt;&lt;DATE2&gt;&lt;HHMM&gt;&lt;HHMM&gt;[4!n]<br />
 * parser pattern: 12!S&lt;DATE2&gt;&lt;HHMM&gt;&lt;HHMM&gt;[N]<br />
 * components pattern: BEHHN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>BIC</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * 		<li>component3: <code>Calendar</code></li> 
 * 		<li>component4: <code>Calendar</code></li> 
 * 		<li>component5: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field260 extends Field implements Serializable , DateContainer, BICContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 260
	 */
    public static final String NAME = "260";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_260 = "260";
	public static final String PARSER_PATTERN ="12!S<DATE2><HHMM><HHMM>[N]";
	public static final String COMPONENTS_PATTERN = "BEHHN";

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
	public Field260() {
		super(5);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field260(String value) {
		this();

		if (value != null) {
			if (value.length() >= 12) {
				setComponent1(org.apache.commons.lang.StringUtils.substring(value, 0, 12));
			}
			if (value.length() >= 18) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(value, 12, 18));
			}
			if (value.length() >= 22) {
				setComponent3(org.apache.commons.lang.StringUtils.substring(value, 18, 22));
			}
			if (value.length() >= 26) {
				setComponent4(org.apache.commons.lang.StringUtils.substring(value, 22, 26));
			}
			if (value.length() >= 26) {
				setComponent5(org.apache.commons.lang.StringUtils.substring(value, 26));
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
	 * Get the component1 as BIC
	 * @return the component1 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getComponent1AsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(1));
	}

	/**
	 * Get the BIC (component1).
	 * @return the BIC from component1
	 */
	public String getBIC() {
		return getComponent(1);
	}
	
	/**
	 * Get the BIC (component1) as BIC
	 * @return the BIC from component1 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getBICAsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field260 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the BIC with the component1 content to set
	 */
	public Field260 setComponent1(com.prowidesoftware.swift.model.BIC component1) {
		setComponent(1, SwiftFormatUtils.getBIC(component1));
		return this;
	}
	
	/**
	 * Set the BIC (component1).
	 * @param component1 the BIC to set
	 */
	public Field260 setBIC(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the BIC (component1) as BIC
	 * @param component1 BIC with the BIC content to set
	 */
	public Field260 setBIC(com.prowidesoftware.swift.model.BIC component1) {
		setComponent(1, SwiftFormatUtils.getBIC(component1));
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
		return SwiftFormatUtils.getDate2(getComponent(2));
	}

	/**
	 * Get the Date (component2).
	 * @return the Date from component2
	 */
	public String getDate() {
		return getComponent(2);
	}
	
	/**
	 * Get the Date (component2) as Calendar
	 * @return the Date from component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getDateAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field260 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field260 setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate2(component2));
		return this;
	}
	
	/**
	 * Set the Date (component2).
	 * @param component2 the Date to set
	 */
	public Field260 setDate(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Date (component2) as Calendar
	 * @param component2 Calendar with the Date content to set
	 */
	public Field260 setDate(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate2(component2));
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
	 * Get the component3 as Calendar
	 * @return the component3 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent3AsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(3));
	}

	/**
	 * Get the Start Time (component3).
	 * @return the Start Time from component3
	 */
	public String getStartTime() {
		return getComponent(3);
	}
	
	/**
	 * Get the Start Time (component3) as Calendar
	 * @return the Start Time from component3 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getStartTimeAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field260 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Calendar with the component3 content to set
	 */
	public Field260 setComponent3(java.util.Calendar component3) {
		setComponent(3, SwiftFormatUtils.getTime3(component3));
		return this;
	}
	
	/**
	 * Set the Start Time (component3).
	 * @param component3 the Start Time to set
	 */
	public Field260 setStartTime(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Start Time (component3) as Calendar
	 * @param component3 Calendar with the Start Time content to set
	 */
	public Field260 setStartTime(java.util.Calendar component3) {
		setComponent(3, SwiftFormatUtils.getTime3(component3));
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
	 * Get the component4 as Calendar
	 * @return the component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent4AsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(4));
	}

	/**
	 * Get the End Time (component4).
	 * @return the End Time from component4
	 */
	public String getEndTime() {
		return getComponent(4);
	}
	
	/**
	 * Get the End Time (component4) as Calendar
	 * @return the End Time from component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getEndTimeAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field260 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Calendar with the component4 content to set
	 */
	public Field260 setComponent4(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getTime3(component4));
		return this;
	}
	
	/**
	 * Set the End Time (component4).
	 * @param component4 the End Time to set
	 */
	public Field260 setEndTime(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the End Time (component4) as Calendar
	 * @param component4 Calendar with the End Time content to set
	 */
	public Field260 setEndTime(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getTime3(component4));
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
	 * Get the Session Number (component5).
	 * @return the Session Number from component5
	 */
	public String getSessionNumber() {
		return getComponent(5);
	}
	
	/**
	 * Get the Session Number (component5) as Number
	 * @return the Session Number from component5 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getSessionNumberAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field260 setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Number with the component5 content to set
	 */
	public Field260 setComponent5(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
		return this;
	}
	
	/**
	 * Set the Session Number (component5).
	 * @param component5 the Session Number to set
	 */
	public Field260 setSessionNumber(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Session Number (component5) as Number
	 * @param component5 Number with the Session Number content to set
	 */
	public Field260 setSessionNumber(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
		return this;
	}
    
    public List<Calendar> dates() {
		List<Calendar> result = new java.util.ArrayList<Calendar>();
		result.add(SwiftFormatUtils.getDate2(getComponent(2)));
		result.add(SwiftFormatUtils.getTime3(getComponent(3)));
		result.add(SwiftFormatUtils.getTime3(getComponent(4)));
		return result;
	}

	public List<BIC> bics () {
		final List<BIC> result = new ArrayList<BIC>();
		result.add(SwiftFormatUtils.getBIC(getComponent(1)));
		return result;
	}
	public List<String> bicStrings () {
		final List<String> result = new ArrayList<String>();
		result.add(getComponent(1));
		return result;
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
	* @deprecated use constant Field260	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field260 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field260) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field260 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field260 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field260 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field260> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field260 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field260> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field260> result = new java.util.ArrayList<Field260>(arr.length);
			for (final Field f : arr) {
				result.add((Field260) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
