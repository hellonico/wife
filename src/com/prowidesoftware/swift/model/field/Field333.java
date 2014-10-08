
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
 * Field 333<br /><br />
 *
 * validation pattern: &lt;DATE2&gt;&lt;HHMM&gt;4!n&lt;DATE2&gt;&lt;HHMM&gt;3!n6!n6!n<br />
 * parser pattern: &lt;DATE2&gt;&lt;HHMM&gt;4!N&lt;DATE2&gt;&lt;HHMM&gt;3!N6!N6!N<br />
 * components pattern: EHNEHNNN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Calendar</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * 		<li>component3: <code>Number</code></li> 
 * 		<li>component4: <code>Calendar</code></li> 
 * 		<li>component5: <code>Calendar</code></li> 
 * 		<li>component6: <code>Number</code></li> 
 * 		<li>component7: <code>Number</code></li> 
 * 		<li>component8: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field333 extends Field implements Serializable , DateContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 333
	 */
    public static final String NAME = "333";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_333 = "333";
	public static final String PARSER_PATTERN ="<DATE2><HHMM>4!N<DATE2><HHMM>3!N6!N6!N";
	public static final String COMPONENTS_PATTERN = "EHNEHNNN";

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
	public Field333() {
		super(8);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field333(String value) {
		this();

		if (value != null) {
        	if (value.length() >= 6) {
				setComponent1(org.apache.commons.lang.StringUtils.substring(value, 0, 6));
			}
        	if (value.length() >= 10) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(value, 6, 10));
			}
        	if (value.length() >= 14) {
				setComponent3(org.apache.commons.lang.StringUtils.substring(value, 10, 14));
			}
			if (value.length() >= 20) {
				setComponent4(org.apache.commons.lang.StringUtils.substring(value, 14, 20));
			}
			if (value.length() >= 24) {
				setComponent5(org.apache.commons.lang.StringUtils.substring(value, 20, 24));
			}
			if (value.length() >= 27) {
				setComponent6(org.apache.commons.lang.StringUtils.substring(value, 24, 27));
			}
			if (value.length() >= 33) {
				setComponent7(org.apache.commons.lang.StringUtils.substring(value, 27, 33));
			}
			if (value.length() > 33) {
				setComponent8(org.apache.commons.lang.StringUtils.substring(value, 33));
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
		return SwiftFormatUtils.getDate2(getComponent(1));
	}

	/**
	 * Get the Date Last Session Opened (component1).
	 * @return the Date Last Session Opened from component1
	 */
	public String getDateLastSessionOpened() {
		return getComponent(1);
	}
	
	/**
	 * Get the Date Last Session Opened (component1) as Calendar
	 * @return the Date Last Session Opened from component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getDateLastSessionOpenedAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field333 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Calendar with the component1 content to set
	 */
	public Field333 setComponent1(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getDate2(component1));
		return this;
	}
	
	/**
	 * Set the Date Last Session Opened (component1).
	 * @param component1 the Date Last Session Opened to set
	 */
	public Field333 setDateLastSessionOpened(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Date Last Session Opened (component1) as Calendar
	 * @param component1 Calendar with the Date Last Session Opened content to set
	 */
	public Field333 setDateLastSessionOpened(java.util.Calendar component1) {
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
		return SwiftFormatUtils.getTime3(getComponent(2));
	}

	/**
	 * Get the Time Last Session Opened (component2).
	 * @return the Time Last Session Opened from component2
	 */
	public String getTimeLastSessionOpened() {
		return getComponent(2);
	}
	
	/**
	 * Get the Time Last Session Opened (component2) as Calendar
	 * @return the Time Last Session Opened from component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getTimeLastSessionOpenedAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field333 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field333 setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getTime3(component2));
		return this;
	}
	
	/**
	 * Set the Time Last Session Opened (component2).
	 * @param component2 the Time Last Session Opened to set
	 */
	public Field333 setTimeLastSessionOpened(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Time Last Session Opened (component2) as Calendar
	 * @param component2 Calendar with the Time Last Session Opened content to set
	 */
	public Field333 setTimeLastSessionOpened(java.util.Calendar component2) {
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
	 * Get the component3 as Number
	 * @return the component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent3AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Get the Session Number (component3).
	 * @return the Session Number from component3
	 */
	public String getSessionNumber() {
		return getComponent(3);
	}
	
	/**
	 * Get the Session Number (component3) as Number
	 * @return the Session Number from component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getSessionNumberAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field333 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Number with the component3 content to set
	 */
	public Field333 setComponent3(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
		return this;
	}
	
	/**
	 * Set the Session Number (component3).
	 * @param component3 the Session Number to set
	 */
	public Field333 setSessionNumber(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Session Number (component3) as Number
	 * @param component3 Number with the Session Number content to set
	 */
	public Field333 setSessionNumber(java.lang.Number component3) {
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
	 * Get the component4 as Calendar
	 * @return the component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent4AsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(4));
	}

	/**
	 * Get the Date Last Session Closed (component4).
	 * @return the Date Last Session Closed from component4
	 */
	public String getDateLastSessionClosed() {
		return getComponent(4);
	}
	
	/**
	 * Get the Date Last Session Closed (component4) as Calendar
	 * @return the Date Last Session Closed from component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getDateLastSessionClosedAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field333 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Calendar with the component4 content to set
	 */
	public Field333 setComponent4(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getDate2(component4));
		return this;
	}
	
	/**
	 * Set the Date Last Session Closed (component4).
	 * @param component4 the Date Last Session Closed to set
	 */
	public Field333 setDateLastSessionClosed(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Date Last Session Closed (component4) as Calendar
	 * @param component4 Calendar with the Date Last Session Closed content to set
	 */
	public Field333 setDateLastSessionClosed(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getDate2(component4));
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
	 * Get the Time Last Session Closed (component5).
	 * @return the Time Last Session Closed from component5
	 */
	public String getTimeLastSessionClosed() {
		return getComponent(5);
	}
	
	/**
	 * Get the Time Last Session Closed (component5) as Calendar
	 * @return the Time Last Session Closed from component5 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getTimeLastSessionClosedAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field333 setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Calendar with the component5 content to set
	 */
	public Field333 setComponent5(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime3(component5));
		return this;
	}
	
	/**
	 * Set the Time Last Session Closed (component5).
	 * @param component5 the Time Last Session Closed to set
	 */
	public Field333 setTimeLastSessionClosed(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Time Last Session Closed (component5) as Calendar
	 * @param component5 Calendar with the Time Last Session Closed content to set
	 */
	public Field333 setTimeLastSessionClosed(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime3(component5));
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
	 * Get the Reason For Closure (component6).
	 * @return the Reason For Closure from component6
	 */
	public String getReasonForClosure() {
		return getComponent(6);
	}
	
	/**
	 * Get the Reason For Closure (component6) as Number
	 * @return the Reason For Closure from component6 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getReasonForClosureAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(6));
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field333 setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the component6.
	 * @param component6 the Number with the component6 content to set
	 */
	public Field333 setComponent6(java.lang.Number component6) {
		setComponent(6, SwiftFormatUtils.getNumber(component6));
		return this;
	}
	
	/**
	 * Set the Reason For Closure (component6).
	 * @param component6 the Reason For Closure to set
	 */
	public Field333 setReasonForClosure(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the Reason For Closure (component6) as Number
	 * @param component6 Number with the Reason For Closure content to set
	 */
	public Field333 setReasonForClosure(java.lang.Number component6) {
		setComponent(6, SwiftFormatUtils.getNumber(component6));
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
	 * Get the component7 as Number
	 * @return the component7 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent7AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(7));
	}

	/**
	 * Get the Last Input Sequence Number Received (component7).
	 * @return the Last Input Sequence Number Received from component7
	 */
	public String getLastInputSequenceNumberReceived() {
		return getComponent(7);
	}
	
	/**
	 * Get the Last Input Sequence Number Received (component7) as Number
	 * @return the Last Input Sequence Number Received from component7 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getLastInputSequenceNumberReceivedAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(7));
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field333 setComponent7(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the component7.
	 * @param component7 the Number with the component7 content to set
	 */
	public Field333 setComponent7(java.lang.Number component7) {
		setComponent(7, SwiftFormatUtils.getNumber(component7));
		return this;
	}
	
	/**
	 * Set the Last Input Sequence Number Received (component7).
	 * @param component7 the Last Input Sequence Number Received to set
	 */
	public Field333 setLastInputSequenceNumberReceived(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the Last Input Sequence Number Received (component7) as Number
	 * @param component7 Number with the Last Input Sequence Number Received content to set
	 */
	public Field333 setLastInputSequenceNumberReceived(java.lang.Number component7) {
		setComponent(7, SwiftFormatUtils.getNumber(component7));
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
	 * Get the component8 as Number
	 * @return the component8 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent8AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(8));
	}

	/**
	 * Get the Last Output Sequence Number Sent (component8).
	 * @return the Last Output Sequence Number Sent from component8
	 */
	public String getLastOutputSequenceNumberSent() {
		return getComponent(8);
	}
	
	/**
	 * Get the Last Output Sequence Number Sent (component8) as Number
	 * @return the Last Output Sequence Number Sent from component8 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getLastOutputSequenceNumberSentAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(8));
	}

	/**
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field333 setComponent8(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the component8.
	 * @param component8 the Number with the component8 content to set
	 */
	public Field333 setComponent8(java.lang.Number component8) {
		setComponent(8, SwiftFormatUtils.getNumber(component8));
		return this;
	}
	
	/**
	 * Set the Last Output Sequence Number Sent (component8).
	 * @param component8 the Last Output Sequence Number Sent to set
	 */
	public Field333 setLastOutputSequenceNumberSent(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the Last Output Sequence Number Sent (component8) as Number
	 * @param component8 Number with the Last Output Sequence Number Sent content to set
	 */
	public Field333 setLastOutputSequenceNumberSent(java.lang.Number component8) {
		setComponent(8, SwiftFormatUtils.getNumber(component8));
		return this;
	}
    
    public List<Calendar> dates() {
		List<Calendar> result = new java.util.ArrayList<Calendar>();
		result.add(SwiftFormatUtils.getDate2(getComponent(1)));
		result.add(SwiftFormatUtils.getTime3(getComponent(2)));
		result.add(SwiftFormatUtils.getDate2(getComponent(4)));
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
	* @deprecated use constant Field333	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field333 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field333) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field333 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field333 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field333 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field333> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field333 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field333> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field333> result = new java.util.ArrayList<Field333>(arr.length);
			for (final Field f : arr) {
				result.add((Field333) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
