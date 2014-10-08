
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
 * Field 30G<br /><br />
 *
 * validation pattern: &lt;DATE4&gt;/&lt;DATE4&gt;<br />
 * parser pattern: S/S<br />
 * components pattern: DD<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Calendar</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field30G extends Field implements Serializable , DateContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 30G
	 */
    public static final String NAME = "30G";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_30G = "30G";
	public static final String PARSER_PATTERN ="S/S";
	public static final String COMPONENTS_PATTERN = "DD";

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
	public Field30G() {
		super(2);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field30G(String value) {
		this();

		setComponent1(SwiftParseUtils.getTokenFirst(value, "/"));
		setComponent2(SwiftParseUtils.getTokenSecond(value, "/"));
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(StringUtils.trimToEmpty(getComponent1()));
        result.append("/");
        result.append(StringUtils.trimToEmpty(getComponent2()));
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
	 * Get the Start Date (component1).
	 * @return the Start Date from component1
	 */
	public String getStartDate() {
		return getComponent(1);
	}
	
	/**
	 * Get the Start Date (component1) as Calendar
	 * @return the Start Date from component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getStartDateAsCalendar() {
		return SwiftFormatUtils.getDate4(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field30G setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Calendar with the component1 content to set
	 */
	public Field30G setComponent1(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getDate4(component1));
		return this;
	}
	
	/**
	 * Set the Start Date (component1).
	 * @param component1 the Start Date to set
	 */
	public Field30G setStartDate(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Start Date (component1) as Calendar
	 * @param component1 Calendar with the Start Date content to set
	 */
	public Field30G setStartDate(java.util.Calendar component1) {
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
		return SwiftFormatUtils.getDate4(getComponent(2));
	}

	/**
	 * Get the End Date (component2).
	 * @return the End Date from component2
	 */
	public String getEndDate() {
		return getComponent(2);
	}
	
	/**
	 * Get the End Date (component2) as Calendar
	 * @return the End Date from component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getEndDateAsCalendar() {
		return SwiftFormatUtils.getDate4(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field30G setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field30G setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate4(component2));
		return this;
	}
	
	/**
	 * Set the End Date (component2).
	 * @param component2 the End Date to set
	 */
	public Field30G setEndDate(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the End Date (component2) as Calendar
	 * @param component2 Calendar with the End Date content to set
	 */
	public Field30G setEndDate(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate4(component2));
		return this;
	}
    
    public List<Calendar> dates() {
		List<Calendar> result = new java.util.ArrayList<Calendar>();
		result.add(SwiftFormatUtils.getDate4(getComponent(1)));
		result.add(SwiftFormatUtils.getDate4(getComponent(2)));
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
	* @deprecated use constant Field30G	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field30G get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field30G) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field30G in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field30G get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field30G in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field30G> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field30G from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field30G> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field30G> result = new java.util.ArrayList<Field30G>(arr.length);
			for (final Field f : arr) {
				result.add((Field30G) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
