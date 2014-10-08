
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
import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 32K<br /><br />
 *
 * validation pattern: &lt;DM&gt;3!n2!a&lt;CUR&gt;&lt;AMOUNT&gt;15<br />
 * parser pattern: cNS&lt;CUR&gt;N<br />
 * components pattern: SNSCN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Number</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>Currency</code></li> 
 * 		<li>component5: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field32K extends Field implements Serializable , CurrencyContainer, AmountContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 32K
	 */
    public static final String NAME = "32K";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_32K = "32K";
	public static final String PARSER_PATTERN ="cNS<CUR>N";
	public static final String COMPONENTS_PATTERN = "SNSCN";

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
	public Field32K() {
		super(5);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field32K(String value) {
		this();

		setComponent1(SwiftParseUtils.getAlphaPrefix(value));
		String toparse = SwiftParseUtils.getNumericSuffix(value);
		setComponent2(SwiftParseUtils.getNumericPrefix(toparse));
		String toparse2 = SwiftParseUtils.getAlphaSuffix(toparse);
		setComponent5(SwiftParseUtils.getNumericSuffix(toparse2));		
		String toparse3 = SwiftParseUtils.getAlphaPrefix(toparse2);
		if (toparse3 != null && toparse3.length() >= 3) {
				setComponent4(org.apache.commons.lang.StringUtils.substring(toparse3, toparse3.length()-3, toparse3.length()));
		}
		if (toparse3 != null && toparse3.length() >= 4) {
				setComponent3(org.apache.commons.lang.StringUtils.substring(toparse3, 0, toparse3.length()-3));
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
	 * Same as getComponent(1)
	 */
	@Deprecated
	public java.lang.String getComponent1AsString() {
		return getComponent(1);
	}

	/**
	 * Get the D/M Mark (component1).
	 * @return the D/M Mark from component1
	 */
	public String getDMMark() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field32K setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the D/M Mark (component1).
	 * @param component1 the D/M Mark to set
	 */
	public Field32K setDMMark(String component1) {
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
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field32K setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Number with the component2 content to set
	 */
	public Field32K setComponent2(java.lang.Number component2) {
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
	public Field32K setComponent3(String component3) {
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
	public Field32K setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Currency with the component4 content to set
	 */
	public Field32K setComponent4(java.util.Currency component4) {
		setComponent(4, SwiftFormatUtils.getCurrency(component4));
		return this;
	}
	
	/**
	 * Set the Currency (component4).
	 * @param component4 the Currency to set
	 */
	public Field32K setCurrency(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Currency (component4) as Currency
	 * @param component4 Currency with the Currency content to set
	 */
	public Field32K setCurrency(java.util.Currency component4) {
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
	 * Get the component5 as Number
	 * @return the component5 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent5AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(5));
	}

	/**
	 * Get the Amount (component5).
	 * @return the Amount from component5
	 */
	public String getAmount() {
		return getComponent(5);
	}
	
	/**
	 * Get the Amount (component5) as Number
	 * @return the Amount from component5 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getAmountAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field32K setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Number with the component5 content to set
	 */
	public Field32K setComponent5(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
		return this;
	}
	
	/**
	 * Set the Amount (component5).
	 * @param component5 the Amount to set
	 */
	public Field32K setAmount(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Amount (component5) as Number
	 * @param component5 Number with the Amount content to set
	 */
	public Field32K setAmount(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
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
	* @deprecated use constant Field32K	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field32K get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field32K) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field32K in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field32K get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field32K in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field32K> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field32K from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field32K> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field32K> result = new java.util.ArrayList<Field32K>(arr.length);
			for (final Field f : arr) {
				result.add((Field32K) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
