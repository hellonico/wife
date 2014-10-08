
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
import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 33S<br /><br />
 *
 * validation pattern: 3!a&lt;AMOUNT&gt;15<br />
 * parser pattern: SN<br />
 * components pattern: SN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field33S extends Field implements Serializable , AmountContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 33S
	 */
    public static final String NAME = "33S";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_33S = "33S";
	public static final String PARSER_PATTERN ="SN";
	public static final String COMPONENTS_PATTERN = "SN";

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
	public Field33S() {
		super(2);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field33S(String value) {
		this();

		setComponent1(SwiftParseUtils.getAlphaPrefix(value));
		setComponent2(SwiftParseUtils.getNumericSuffix(value));
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(joinComponents());
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
	 * Get the Currency (component1).
	 * @return the Currency from component1
	 */
	public String getCurrency() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field33S setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Currency (component1).
	 * @param component1 the Currency to set
	 */
	public Field33S setCurrency(String component1) {
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
	 * Get the component2 as Number
	 * @return the component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent2AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Get the Amount (component2).
	 * @return the Amount from component2
	 */
	public String getAmount() {
		return getComponent(2);
	}
	
	/**
	 * Get the Amount (component2) as Number
	 * @return the Amount from component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getAmountAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field33S setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Number with the component2 content to set
	 */
	public Field33S setComponent2(java.lang.Number component2) {
		setComponent(2, SwiftFormatUtils.getNumber(component2));
		return this;
	}
	
	/**
	 * Set the Amount (component2).
	 * @param component2 the Amount to set
	 */
	public Field33S setAmount(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Amount (component2) as Number
	 * @param component2 Number with the Amount content to set
	 */
	public Field33S setAmount(java.lang.Number component2) {
		setComponent(2, SwiftFormatUtils.getNumber(component2));
		return this;
	}
    
	public List<BigDecimal> amounts() {
		return AmountResolver.amounts(this);
	}
	public BigDecimal amount() {
		return AmountResolver.amount(this);
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
	* @deprecated use constant Field33S	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field33S get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field33S) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field33S in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field33S get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field33S in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field33S> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field33S from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field33S> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field33S> result = new java.util.ArrayList<Field33S>(arr.length);
			for (final Field f : arr) {
				result.add((Field33S) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
