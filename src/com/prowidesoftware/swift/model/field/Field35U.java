
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
 * Field 35U<br /><br />
 *
 * validation pattern: 3!a&lt;AMOUNT&gt;15[1a]<br />
 * parser pattern: SN[S]<br />
 * components pattern: SNS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Number</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field35U extends Field implements Serializable , AmountContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 35U
	 */
    public static final String NAME = "35U";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_35U = "35U";
	public static final String PARSER_PATTERN ="SN[S]";
	public static final String COMPONENTS_PATTERN = "SNS";

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
	public Field35U() {
		super(3);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field35U(String value) {
		this();

		setComponent1(SwiftParseUtils.getAlphaPrefix(value));
		String toparse = getComponent1() == null? value : org.apache.commons.lang.StringUtils.substringAfter(value, getComponent1());
		setComponent2(SwiftParseUtils.getNumericPrefix(toparse));
		setComponent3(SwiftParseUtils.getAlphaSuffix(toparse));
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
	public Field35U setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Currency (component1).
	 * @param component1 the Currency to set
	 */
	public Field35U setCurrency(String component1) {
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
	public Field35U setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Number with the component2 content to set
	 */
	public Field35U setComponent2(java.lang.Number component2) {
		setComponent(2, SwiftFormatUtils.getNumber(component2));
		return this;
	}
	
	/**
	 * Set the Amount (component2).
	 * @param component2 the Amount to set
	 */
	public Field35U setAmount(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Amount (component2) as Number
	 * @param component2 Number with the Amount content to set
	 */
	public Field35U setAmount(java.lang.Number component2) {
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
	 * Same as getComponent(3)
	 */
	@Deprecated
	public java.lang.String getComponent3AsString() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field35U setComponent3(String component3) {
		setComponent(3, component3);
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
       if (component == 3) {
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
	* @deprecated use constant Field35U	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field35U get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field35U) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field35U in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field35U get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field35U in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field35U> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field35U from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field35U> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field35U> result = new java.util.ArrayList<Field35U>(arr.length);
			for (final Field f : arr) {
				result.add((Field35U) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
