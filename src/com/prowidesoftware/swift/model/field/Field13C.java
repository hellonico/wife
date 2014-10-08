
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
 * Field 13C<br /><br />
 *
 * validation pattern: /8c/&lt;HHMM&gt;&lt;SIGN&gt;&lt;OFFSET&gt;<br />
 * parser pattern: /S/&lt;HHMM&gt;&lt;SIGN&gt;&lt;OFFSET&gt;<br />
 * components pattern: SHGO<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * 		<li>component3: <code>Character</code></li> 
 * 		<li>component4: <code>Calendar</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field13C extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 13C
	 */
    public static final String NAME = "13C";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_13C = "13C";
	public static final String PARSER_PATTERN ="/S/<HHMM><SIGN><OFFSET>";
	public static final String COMPONENTS_PATTERN = "SHGO";

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
	public Field13C() {
		super(4);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field13C(String value) {
		this();

		setComponent1(SwiftParseUtils.getTokenFirst(value, "/", "/"));
		String toparse = SwiftParseUtils.getTokenSecondLast(SwiftParseUtils.removePrefix(value, "/"), "/");
		if (toparse != null) {
			if (toparse.length() >= 4) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(toparse, 0, 4));
			}
			if (toparse.length() >= 5) {
				setComponent3(org.apache.commons.lang.StringUtils.substring(toparse, 4, 5));
			}
			if (toparse.length() > 5) {
				setComponent4(org.apache.commons.lang.StringUtils.substring(toparse, 5));
			}
		}
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append("/");
		result.append(StringUtils.trimToEmpty(getComponent1()));
		result.append("/");
		result.append(StringUtils.trimToEmpty(getComponent2()));
		result.append(StringUtils.trimToEmpty(getComponent3()));
		result.append(StringUtils.trimToEmpty(getComponent4()));
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
	 * Same as getComponent(1)
	 */
	@Deprecated
	public java.lang.String getComponent1AsString() {
		return getComponent(1);
	}

	/**
	 * Get the Code (component1).
	 * @return the Code from component1
	 */
	public String getCode() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field13C setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Code (component1).
	 * @param component1 the Code to set
	 */
	public Field13C setCode(String component1) {
		setComponent(1, component1);
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
		return SwiftFormatUtils.getTime3(getComponent(2));
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
		return SwiftFormatUtils.getTime3(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field13C setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field13C setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getTime3(component2));
		return this;
	}
	
	/**
	 * Set the Time (component2).
	 * @param component2 the Time to set
	 */
	public Field13C setTime(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Time (component2) as Calendar
	 * @param component2 Calendar with the Time content to set
	 */
	public Field13C setTime(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getTime3(component2));
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
	 * Get the Sign (component3).
	 * @return the Sign from component3
	 */
	public String getSign() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field13C setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Sign (component3).
	 * @param component3 the Sign to set
	 */
	public Field13C setSign(String component3) {
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
	 * Get the component4 as Calendar
	 * @return the component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent4AsCalendar() {
		return SwiftFormatUtils.getOffset(getComponent(4));
	}

	/**
	 * Get the Offset (component4).
	 * @return the Offset from component4
	 */
	public String getOffset() {
		return getComponent(4);
	}
	
	/**
	 * Get the Offset (component4) as Calendar
	 * @return the Offset from component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getOffsetAsCalendar() {
		return SwiftFormatUtils.getOffset(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field13C setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Calendar with the component4 content to set
	 */
	public Field13C setComponent4(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getOffset(component4));
		return this;
	}
	
	/**
	 * Set the Offset (component4).
	 * @param component4 the Offset to set
	 */
	public Field13C setOffset(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Offset (component4) as Calendar
	 * @param component4 Calendar with the Offset content to set
	 */
	public Field13C setOffset(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getOffset(component4));
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
	* @deprecated use constant Field13C	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field13C get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field13C) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field13C in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field13C get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field13C in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field13C> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field13C from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field13C> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field13C> result = new java.util.ArrayList<Field13C>(arr.length);
			for (final Field f : arr) {
				result.add((Field13C) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
