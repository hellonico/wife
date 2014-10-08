
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
 * Field 23<br /><br />
 *
 * validation pattern: CUSTOM<br />
 * parser pattern: S[/S/S[/S]]<br />
 * components pattern: SSSC<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>Currency</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field23 extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 23
	 */
    public static final String NAME = "23";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_23 = "23";
	public static final String PARSER_PATTERN ="S[/S/S[/S]]";
	public static final String COMPONENTS_PATTERN = "SSSC";

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
	public Field23() {
		super(4);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field23(String value) {
		this();

		setComponent1(SwiftParseUtils.getTokenFirst(value, null, "/"));
		String toparse = SwiftParseUtils.getTokenSecondLast(value, "/");
		if (org.apache.commons.lang.StringUtils.isNotBlank(toparse)) {
			setComponent2(SwiftParseUtils.getTokenFirst(toparse, null, "/"));
			String toparse2 = SwiftParseUtils.getTokenSecondLast(toparse, "/");
			if (org.apache.commons.lang.StringUtils.isNotBlank(toparse2)) {
				setComponent3(SwiftParseUtils.getTokenFirst(toparse2, null, "/"));
				setComponent4(SwiftParseUtils.getTokenSecondLast(toparse2, "/"));
			}
		}
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(StringUtils.trimToEmpty(getComponent1()));
		if (StringUtils.isNotEmpty(getComponent2())) {
			result.append("/");
			result.append(getComponent2());
		}
		if (StringUtils.isNotEmpty(getComponent3())) {
			result.append("/");
			result.append(getComponent3());
		}
		if (StringUtils.isNotEmpty(getComponent4())) {
			result.append("/");
			result.append(getComponent4());
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
	 * Same as getComponent(1)
	 */
	@Deprecated
	public java.lang.String getComponent1AsString() {
		return getComponent(1);
	}

	/**
	 * Get the Code 1 (component1).
	 * @return the Code 1 from component1
	 */
	public String getCode1() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field23 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Code 1 (component1).
	 * @param component1 the Code 1 to set
	 */
	public Field23 setCode1(String component1) {
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
	 * Same as getComponent(2)
	 */
	@Deprecated
	public java.lang.String getComponent2AsString() {
		return getComponent(2);
	}

	/**
	 * Get the Code 2 (component2).
	 * @return the Code 2 from component2
	 */
	public String getCode2() {
		return getComponent(2);
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field23 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Code 2 (component2).
	 * @param component2 the Code 2 to set
	 */
	public Field23 setCode2(String component2) {
		setComponent(2, component2);
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
	 * Get the Code 3 (component3).
	 * @return the Code 3 from component3
	 */
	public String getCode3() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field23 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Code 3 (component3).
	 * @param component3 the Code 3 to set
	 */
	public Field23 setCode3(String component3) {
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
	 * Get the component4 as Currency
	 * @return the component4 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent4AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(4));
	}

	/**
	 * Get the Currency (component4).
	 * @return the Currency from component4
	 */
	public String getCurrency() {
		return getComponent(4);
	}
	
	/**
	 * Get the Currency (component4) as Currency
	 * @return the Currency from component4 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field23 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Currency with the component4 content to set
	 */
	public Field23 setComponent4(java.util.Currency component4) {
		setComponent(4, SwiftFormatUtils.getCurrency(component4));
		return this;
	}
	
	/**
	 * Set the Currency (component4).
	 * @param component4 the Currency to set
	 */
	public Field23 setCurrency(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Currency (component4) as Currency
	 * @param component4 Currency with the Currency content to set
	 */
	public Field23 setCurrency(java.util.Currency component4) {
		setComponent(4, SwiftFormatUtils.getCurrency(component4));
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
       if (component == 2) {
           return true;
       }
       if (component == 3) {
           return true;
       }
       if (component == 4) {
           return true;
       }
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
	* @deprecated use constant Field23	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field23 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field23) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field23 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field23 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field23 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field23> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field23 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field23> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field23> result = new java.util.ArrayList<Field23>(arr.length);
			for (final Field f : arr) {
				result.add((Field23) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
