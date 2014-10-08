
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
import com.prowidesoftware.swift.model.BIC;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 335<br /><br />
 *
 * validation pattern: &lt;HHMM&gt;&lt;MIR&gt;&lt;MT&gt;&lt;SWIFTBIC&gt;|&lt;NON-SWIFTBIC&gt;[&lt;HHMM&gt;]<br />
 * parser pattern: &lt;HHMM&gt;&lt;MIR&gt;N12!S[N]<br />
 * components pattern: HRMBH<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Calendar</code></li> 
 * 		<li>component2: <code>MIR</code></li> 
 * 		<li>component3: <code>Number</code></li> 
 * 		<li>component4: <code>BIC</code></li> 
 * 		<li>component5: <code>Calendar</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field335 extends Field implements Serializable , BICContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 335
	 */
    public static final String NAME = "335";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_335 = "335";
	public static final String PARSER_PATTERN ="<HHMM><MIR>N12!S[N]";
	public static final String COMPONENTS_PATTERN = "HRMBH";

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
	public Field335() {
		super(5);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field335(String value) {
		this();

		if (value != null) {
			if (value.length() >= 4) {
				setComponent1(org.apache.commons.lang.StringUtils.substring(value, 0, 4));
			}
			if (value.length() >= 32) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(value, 4, 32));
			}
			String toparse = org.apache.commons.lang.StringUtils.substring(value, 32);
			setComponent3(SwiftParseUtils.getNumericPrefix(toparse));
			String toparse2 = SwiftParseUtils.getAlphaSuffix(toparse);
			if (toparse2.length() >= 12) {
				setComponent4(org.apache.commons.lang.StringUtils.substring(toparse2, 0, 12));
			}
			if (toparse2.length() > 12) {
				setComponent5(org.apache.commons.lang.StringUtils.substring(toparse2, 12));
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
		return SwiftFormatUtils.getTime3(getComponent(1));
	}

	/**
	 * Get the Time Message Entered (component1).
	 * @return the Time Message Entered from component1
	 */
	public String getTimeMessageEntered() {
		return getComponent(1);
	}
	
	/**
	 * Get the Time Message Entered (component1) as Calendar
	 * @return the Time Message Entered from component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getTimeMessageEnteredAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field335 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Calendar with the component1 content to set
	 */
	public Field335 setComponent1(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getTime3(component1));
		return this;
	}
	
	/**
	 * Set the Time Message Entered (component1).
	 * @param component1 the Time Message Entered to set
	 */
	public Field335 setTimeMessageEntered(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Time Message Entered (component1) as Calendar
	 * @param component1 Calendar with the Time Message Entered content to set
	 */
	public Field335 setTimeMessageEntered(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getTime3(component1));
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
	 * Get the MIR (component2).
	 * @return the MIR from component2
	 */
	public String getMIR() {
		return getComponent(2);
	}
	
	/**
	 * Get the MIR (component2) as MIR
	 * @return the MIR from component2 converted to MIR or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.MIR getMIRAsMIR() {
		return SwiftFormatUtils.getMIR(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field335 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the MIR with the component2 content to set
	 */
	public Field335 setComponent2(com.prowidesoftware.swift.model.MIR component2) {
		setComponent(2, SwiftFormatUtils.getMIR(component2));
		return this;
	}
	
	/**
	 * Set the MIR (component2).
	 * @param component2 the MIR to set
	 */
	public Field335 setMIR(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the MIR (component2) as MIR
	 * @param component2 MIR with the MIR content to set
	 */
	public Field335 setMIR(com.prowidesoftware.swift.model.MIR component2) {
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
	 * Get the MT (component3).
	 * @return the MT from component3
	 */
	public String getMT() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field335 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the MT (component3).
	 * @param component3 the MT to set
	 */
	public Field335 setMT(String component3) {
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
	 * Get the component4 as BIC
	 * @return the component4 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getComponent4AsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(4));
	}

	/**
	 * Get the Receiver (component4).
	 * @return the Receiver from component4
	 */
	public String getReceiver() {
		return getComponent(4);
	}
	
	/**
	 * Get the Receiver (component4) as BIC
	 * @return the Receiver from component4 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getReceiverAsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field335 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the BIC with the component4 content to set
	 */
	public Field335 setComponent4(com.prowidesoftware.swift.model.BIC component4) {
		setComponent(4, SwiftFormatUtils.getBIC(component4));
		return this;
	}
	
	/**
	 * Set the Receiver (component4).
	 * @param component4 the Receiver to set
	 */
	public Field335 setReceiver(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Receiver (component4) as BIC
	 * @param component4 BIC with the Receiver content to set
	 */
	public Field335 setReceiver(com.prowidesoftware.swift.model.BIC component4) {
		setComponent(4, SwiftFormatUtils.getBIC(component4));
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
	 * Get the Time Last Delivery Attempt (component5).
	 * @return the Time Last Delivery Attempt from component5
	 */
	public String getTimeLastDeliveryAttempt() {
		return getComponent(5);
	}
	
	/**
	 * Get the Time Last Delivery Attempt (component5) as Calendar
	 * @return the Time Last Delivery Attempt from component5 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getTimeLastDeliveryAttemptAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field335 setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Calendar with the component5 content to set
	 */
	public Field335 setComponent5(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime3(component5));
		return this;
	}
	
	/**
	 * Set the Time Last Delivery Attempt (component5).
	 * @param component5 the Time Last Delivery Attempt to set
	 */
	public Field335 setTimeLastDeliveryAttempt(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Time Last Delivery Attempt (component5) as Calendar
	 * @param component5 Calendar with the Time Last Delivery Attempt content to set
	 */
	public Field335 setTimeLastDeliveryAttempt(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime3(component5));
		return this;
	}

	public List<BIC> bics () {
		final List<BIC> result = new ArrayList<BIC>();
		result.add(SwiftFormatUtils.getBIC(getComponent(4)));
		return result;
	}
	public List<String> bicStrings () {
		final List<String> result = new ArrayList<String>();
		result.add(getComponent(4));
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
	* @deprecated use constant Field335	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field335 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field335) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field335 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field335 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field335 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field335> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field335 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field335> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field335> result = new java.util.ArrayList<Field335>(arr.length);
			for (final Field f : arr) {
				result.add((Field335) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
