
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
 * Field 252<br /><br />
 *
 * validation pattern: &lt;MIR&gt;&lt;MIR&gt;[&lt;HHMM&gt;&lt;HHMM&gt;]<br />
 * parser pattern: &lt;MIR&gt;&lt;MIR&gt;[&lt;HHMM&gt;&lt;HHMM&gt;]<br />
 * components pattern: RRHH<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>MIR</code></li> 
 * 		<li>component2: <code>MIR</code></li> 
 * 		<li>component3: <code>Calendar</code></li> 
 * 		<li>component4: <code>Calendar</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field252 extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 252
	 */
    public static final String NAME = "252";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_252 = "252";
	public static final String PARSER_PATTERN ="<MIR><MIR>[<HHMM><HHMM>]";
	public static final String COMPONENTS_PATTERN = "RRHH";

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
	public Field252() {
		super(4);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field252(String value) {
		this();

		if (value != null) {
			if (value.length() >= 28) {
				setComponent1(org.apache.commons.lang.StringUtils.substring(value, 0, 28));
			}
			if (value.length() >= 56) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(value, 28, 56));
			}
			if (value.length() >= 60) {
				setComponent3(org.apache.commons.lang.StringUtils.substring(value, 56, 60));
			}
			if (value.length() > 60) {
				setComponent4(org.apache.commons.lang.StringUtils.substring(value, 60));
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
	 * Get the component1 as MIR
	 * @return the component1 converted to MIR or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.MIR getComponent1AsMIR() {
		return SwiftFormatUtils.getMIR(getComponent(1));
	}

	/**
	 * Get the Start MIR (component1).
	 * @return the Start MIR from component1
	 */
	public String getStartMIR() {
		return getComponent(1);
	}
	
	/**
	 * Get the Start MIR (component1) as MIR
	 * @return the Start MIR from component1 converted to MIR or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.MIR getStartMIRAsMIR() {
		return SwiftFormatUtils.getMIR(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field252 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the MIR with the component1 content to set
	 */
	public Field252 setComponent1(com.prowidesoftware.swift.model.MIR component1) {
		setComponent(1, SwiftFormatUtils.getMIR(component1));
		return this;
	}
	
	/**
	 * Set the Start MIR (component1).
	 * @param component1 the Start MIR to set
	 */
	public Field252 setStartMIR(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Start MIR (component1) as MIR
	 * @param component1 MIR with the Start MIR content to set
	 */
	public Field252 setStartMIR(com.prowidesoftware.swift.model.MIR component1) {
		setComponent(1, SwiftFormatUtils.getMIR(component1));
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
	 * Get the component2 as MIR
	 * @return the component2 converted to MIR or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.MIR getComponent2AsMIR() {
		return SwiftFormatUtils.getMIR(getComponent(2));
	}

	/**
	 * Get the End MIR (component2).
	 * @return the End MIR from component2
	 */
	public String getEndMIR() {
		return getComponent(2);
	}
	
	/**
	 * Get the End MIR (component2) as MIR
	 * @return the End MIR from component2 converted to MIR or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.MIR getEndMIRAsMIR() {
		return SwiftFormatUtils.getMIR(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field252 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the MIR with the component2 content to set
	 */
	public Field252 setComponent2(com.prowidesoftware.swift.model.MIR component2) {
		setComponent(2, SwiftFormatUtils.getMIR(component2));
		return this;
	}
	
	/**
	 * Set the End MIR (component2).
	 * @param component2 the End MIR to set
	 */
	public Field252 setEndMIR(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the End MIR (component2) as MIR
	 * @param component2 MIR with the End MIR content to set
	 */
	public Field252 setEndMIR(com.prowidesoftware.swift.model.MIR component2) {
		setComponent(2, SwiftFormatUtils.getMIR(component2));
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
	public Field252 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Calendar with the component3 content to set
	 */
	public Field252 setComponent3(java.util.Calendar component3) {
		setComponent(3, SwiftFormatUtils.getTime3(component3));
		return this;
	}
	
	/**
	 * Set the Start Time (component3).
	 * @param component3 the Start Time to set
	 */
	public Field252 setStartTime(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Start Time (component3) as Calendar
	 * @param component3 Calendar with the Start Time content to set
	 */
	public Field252 setStartTime(java.util.Calendar component3) {
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
	public Field252 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Calendar with the component4 content to set
	 */
	public Field252 setComponent4(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getTime3(component4));
		return this;
	}
	
	/**
	 * Set the End Time (component4).
	 * @param component4 the End Time to set
	 */
	public Field252 setEndTime(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the End Time (component4) as Calendar
	 * @param component4 Calendar with the End Time content to set
	 */
	public Field252 setEndTime(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getTime3(component4));
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
	* @deprecated use constant Field252	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field252 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field252) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field252 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field252 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field252 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field252> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field252 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field252> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field252> result = new java.util.ArrayList<Field252>(arr.length);
			for (final Field f : arr) {
				result.add((Field252) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
