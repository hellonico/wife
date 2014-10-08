
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

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 98D<br /><br />
 *
 * validation pattern: &lt;DATE4&gt;&lt;TIME2&gt;[,3n][/[N]&lt;TIME3&gt;]<br />
 * parser pattern: &lt;DATE4&gt;&lt;TIME2&gt;[,S][/[c]&lt;TIME3&gt;]<br />
 * components pattern: DTNCW<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Calendar</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * 		<li>component3: <code>Number</code></li> 
 * 		<li>component4: <code>Currency</code></li> 
 * 		<li>component5: <code>Calendar</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field98D extends Field implements Serializable , DateContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 98D
	 */
    public static final String NAME = "98D";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_98D = "98D";
	public static final String PARSER_PATTERN ="<DATE4><TIME2>[,S][/[c]<TIME3>]";
	public static final String COMPONENTS_PATTERN = "DTNCW";

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
	public Field98D() {
		super(5);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field98D(String value) {
		this();

		if (value != null) {
			if (value.length() >= 8) {
				setComponent1(org.apache.commons.lang.StringUtils.substring(value, 0, 8));
			}
			if (value.length() >= 14) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(value, 8, 14));
			}
			if (value.length() > 14) {
			    String toparse2 = org.apache.commons.lang.StringUtils.substring(value, 14);
			    setComponent3(SwiftParseUtils.getTokenFirst(toparse2, ",", "/"));
			    String toparse3 = SwiftParseUtils.getTokenSecondLast(toparse2, "/");
			    if (toparse3 != null) {
					if (toparse3.length() < 2) {
					    setComponent4(toparse3);
					} else if (toparse3.length() == 2) {
					    //HH
					    setComponent5(toparse3);
					} else if (toparse3.length() == 3) {
					    //[N]HH
					    setComponent4(org.apache.commons.lang.StringUtils.substring(toparse3, 0, 1));
					    setComponent5(org.apache.commons.lang.StringUtils.substring(toparse3, 1));
					} else if (toparse3.length() == 4) {
					    //HH[MM]
					    setComponent5(toparse3);
					} else if (toparse3.length() == 5) {
					    //[N]HH[MM]
					    setComponent4(org.apache.commons.lang.StringUtils.substring(toparse3, 0, 1));
					    setComponent5(org.apache.commons.lang.StringUtils.substring(toparse3, 1));
					} if (toparse3.length() > 4) {
					    setComponent4(SwiftParseUtils.getAlphaPrefix(toparse3));
					    setComponent5(SwiftParseUtils.getNumericSuffix(toparse3));
					}
			    }
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
	 * Get the component1 as Calendar
	 * @return the component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent1AsCalendar() {
		return SwiftFormatUtils.getDate4(getComponent(1));
	}

	/**
	 * Get the Date (component1).
	 * @return the Date from component1
	 */
	public String getDate() {
		return getComponent(1);
	}
	
	/**
	 * Get the Date (component1) as Calendar
	 * @return the Date from component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getDateAsCalendar() {
		return SwiftFormatUtils.getDate4(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field98D setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Calendar with the component1 content to set
	 */
	public Field98D setComponent1(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getDate4(component1));
		return this;
	}
	
	/**
	 * Set the Date (component1).
	 * @param component1 the Date to set
	 */
	public Field98D setDate(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Date (component1) as Calendar
	 * @param component1 Calendar with the Date content to set
	 */
	public Field98D setDate(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getDate4(component1));
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
		return SwiftFormatUtils.getTime2(getComponent(2));
	}

	/**
	 * Get the Time (component2).
	 * @return the Time from component2
	 */
	public String getTime() {
		return getComponent(2);
	}
	
	/**
	 * Get the Time (component2) as Calendar
	 * @return the Time from component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getTimeAsCalendar() {
		return SwiftFormatUtils.getTime2(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field98D setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field98D setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getTime2(component2));
		return this;
	}
	
	/**
	 * Set the Time (component2).
	 * @param component2 the Time to set
	 */
	public Field98D setTime(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Time (component2) as Calendar
	 * @param component2 Calendar with the Time content to set
	 */
	public Field98D setTime(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getTime2(component2));
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
	 * Get the Decimals (component3).
	 * @return the Decimals from component3
	 */
	public String getDecimals() {
		return getComponent(3);
	}
	
	/**
	 * Get the Decimals (component3) as Number
	 * @return the Decimals from component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getDecimalsAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field98D setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Number with the component3 content to set
	 */
	public Field98D setComponent3(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
		return this;
	}
	
	/**
	 * Set the Decimals (component3).
	 * @param component3 the Decimals to set
	 */
	public Field98D setDecimals(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Decimals (component3) as Number
	 * @param component3 Number with the Decimals content to set
	 */
	public Field98D setDecimals(java.lang.Number component3) {
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
	 * Get the component4 as Currency
	 * @return the component4 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent4AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(4));
	}

	/**
	 * Get the Sign (component4).
	 * @return the Sign from component4
	 */
	public String getSign() {
		return getComponent(4);
	}
	
	/**
	 * Get the Sign (component4) as Currency
	 * @return the Sign from component4 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getSignAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field98D setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Currency with the component4 content to set
	 */
	public Field98D setComponent4(java.util.Currency component4) {
		setComponent(4, SwiftFormatUtils.getCurrency(component4));
		return this;
	}
	
	/**
	 * Set the Sign (component4).
	 * @param component4 the Sign to set
	 */
	public Field98D setSign(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Sign (component4) as Currency
	 * @param component4 Currency with the Sign content to set
	 */
	public Field98D setSign(java.util.Currency component4) {
		setComponent(4, SwiftFormatUtils.getCurrency(component4));
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
	 * Get the component5 as Calendar
	 * @return the component5 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent5AsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(5));
	}

	/**
	 * Get the UTC Indicator (component5).
	 * @return the UTC Indicator from component5
	 */
	public String getUTCIndicator() {
		return getComponent(5);
	}
	
	/**
	 * Get the UTC Indicator (component5) as Calendar
	 * @return the UTC Indicator from component5 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getUTCIndicatorAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field98D setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Calendar with the component5 content to set
	 */
	public Field98D setComponent5(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime3(component5));
		return this;
	}
	
	/**
	 * Set the UTC Indicator (component5).
	 * @param component5 the UTC Indicator to set
	 */
	public Field98D setUTCIndicator(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the UTC Indicator (component5) as Calendar
	 * @param component5 Calendar with the UTC Indicator content to set
	 */
	public Field98D setUTCIndicator(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime3(component5));
		return this;
	}
    
    public List<Calendar> dates() {
		List<Calendar> result = new java.util.ArrayList<Calendar>();
		result.add(SwiftFormatUtils.getDate4(getComponent(1)));
		result.add(SwiftFormatUtils.getTime2(getComponent(2)));
		result.add(SwiftFormatUtils.getTime3(getComponent(5)));
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
	* @deprecated use constant Field98D	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field98D get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field98D) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field98D in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field98D get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field98D in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field98D> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field98D from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field98D> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field98D> result = new java.util.ArrayList<Field98D>(arr.length);
			for (final Field f : arr) {
				result.add((Field98D) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
