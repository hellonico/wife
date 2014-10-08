
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
import java.util.Currency;
import java.util.Calendar;
import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 32A<br /><br />
 *
 * validation pattern: &lt;DATE2&gt;&lt;CUR&gt;&lt;AMOUNT&gt;15<br />
 * parser pattern: &lt;DATE2&gt;SN<br />
 * components pattern: ECN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Calendar</code></li> 
 * 		<li>component2: <code>Currency</code></li> 
 * 		<li>component3: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field32A extends Field implements Serializable , CurrencyContainer, DateContainer, AmountContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 32A
	 */
    public static final String NAME = "32A";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_32A = "32A";
	public static final String PARSER_PATTERN ="<DATE2>SN";
	public static final String COMPONENTS_PATTERN = "ECN";

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
	public Field32A() {
		super(3);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field32A(String value) {
		this();

		if (value != null) {
			if (value.length() >= 6) {
				setComponent1(org.apache.commons.lang.StringUtils.substring(value, 0, 6));
			}
			String toparse = org.apache.commons.lang.StringUtils.substring(value, 6);
			setComponent2(SwiftParseUtils.getAlphaPrefix(toparse));
			setComponent3(SwiftParseUtils.getNumericSuffix(toparse));
		}
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
	 * Get the component1 as Calendar
	 * @return the component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent1AsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(1));
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
		return SwiftFormatUtils.getDate2(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field32A setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Calendar with the component1 content to set
	 */
	public Field32A setComponent1(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getDate2(component1));
		return this;
	}
	
	/**
	 * Set the Date (component1).
	 * @param component1 the Date to set
	 */
	public Field32A setDate(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Date (component1) as Calendar
	 * @param component1 Calendar with the Date content to set
	 */
	public Field32A setDate(java.util.Calendar component1) {
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
	 * Get the component2 as Currency
	 * @return the component2 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent2AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(2));
	}

	/**
	 * Get the Currency (component2).
	 * @return the Currency from component2
	 */
	public String getCurrency() {
		return getComponent(2);
	}
	
	/**
	 * Get the Currency (component2) as Currency
	 * @return the Currency from component2 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field32A setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Currency with the component2 content to set
	 */
	public Field32A setComponent2(java.util.Currency component2) {
		setComponent(2, SwiftFormatUtils.getCurrency(component2));
		return this;
	}
	
	/**
	 * Set the Currency (component2).
	 * @param component2 the Currency to set
	 */
	public Field32A setCurrency(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Currency (component2) as Currency
	 * @param component2 Currency with the Currency content to set
	 */
	public Field32A setCurrency(java.util.Currency component2) {
		setComponent(2, SwiftFormatUtils.getCurrency(component2));
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
	 * Get the Amount (component3).
	 * @return the Amount from component3
	 */
	public String getAmount() {
		return getComponent(3);
	}
	
	/**
	 * Get the Amount (component3) as Number
	 * @return the Amount from component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getAmountAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field32A setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Number with the component3 content to set
	 */
	public Field32A setComponent3(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
		return this;
	}
	
	/**
	 * Set the Amount (component3).
	 * @param component3 the Amount to set
	 */
	public Field32A setAmount(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Amount (component3) as Number
	 * @param component3 Number with the Amount content to set
	 */
	public Field32A setAmount(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
		return this;
	}
    
	public List<String> currencyStrings() {
		List<String> result = new ArrayList<String>();
		result = CurrencyResolver.resolveComponentsPattern(COMPONENTS_PATTERN, components);
		return result;
	}

	public List<Currency> currencies() {
		final List<String> l = currencyStrings();
		if (l.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final ArrayList<Currency> result = new ArrayList<Currency>();
		for (String s: l) {
			result.add(Currency.getInstance(s));
		}
		return result;
	}
    
	public Currency currency() {
		return CurrencyResolver.resolveCurrency(this);
	}

	public String currencyString() {
		return CurrencyResolver.resolveCurrencyString(this);
	}

	public void initializeCurrencies(String cur) {
		CurrencyResolver.resolveSetCurrency(this, cur);
	}

	public void initializeCurrencies(Currency cur) {
		CurrencyResolver.resolveSetCurrency(this, cur);
	}
    
    public List<Calendar> dates() {
		List<Calendar> result = new java.util.ArrayList<Calendar>();
		result.add(SwiftFormatUtils.getDate2(getComponent(1)));
		return result;
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
	* @deprecated use constant Field32A	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field32A get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field32A) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field32A in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field32A get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field32A in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field32A> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field32A from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field32A> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field32A> result = new java.util.ArrayList<Field32A>(arr.length);
			for (final Field f : arr) {
				result.add((Field32A) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	

	/**
	 * Returns the amount converted to a Double or <code>null</code> if amount attribute is not set
	 * @return Double value of amount attribute or <code>null</code>.
	 * @deprecated Do not use, use BigDecimal instead
	 */
	@Deprecated
	public Double getAmountDouble() {
		if (getComponent3AsNumber() == null) {
			return null;
		}
		return new Double(getComponent3AsNumber().doubleValue());
	}
	
	/**
	 * Returns the amount converted to a BigDecimal or <code>null</code> if amount attribute is not set
	 * @return BigDecimal value of amount attribute or <code>null</code>.
	 */
	public java.math.BigDecimal getAmountBigDecimal() {
		if (getComponent3AsNumber() == null) {
			return null;
		}
		return (java.math.BigDecimal) getComponentAs(3, java.math.BigDecimal.class);
	}

	/**
	 * Human readable value of the field
	 */
	@Override
	public String getValueDisplay() {
		final StringBuilder sb = new StringBuilder();
		sb.append(getComponent2());
		sb.append(" ");
		sb.append(formatNumber(getComponent3AsNumber()));
		sb.append(" ");
		String valueDate = format(getComponent1AsCalendar());
		sb.append(valueDate);	
		return sb.toString();
	}
}
