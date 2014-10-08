
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
 * Field 92B<br /><br />
 *
 * validation pattern: :4!c//&lt;CUR&gt;/&lt;CUR&gt;/&lt;AMOUNT&gt;15<br />
 * parser pattern: :S//S/S/N<br />
 * components pattern: SCCN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Currency</code></li> 
 * 		<li>component3: <code>Currency</code></li> 
 * 		<li>component4: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field92B extends Field implements Serializable , CurrencyContainer, AmountContainer, GenericField {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 92B
	 */
    public static final String NAME = "92B";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_92B = "92B";
	public static final String PARSER_PATTERN =":S//S/S/N";
	public static final String COMPONENTS_PATTERN = "SCCN";

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
	public Field92B() {
		super(4);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field92B(String value) {
		this();

		setComponent1(SwiftParseUtils.getTokenFirst(value, ":", "//"));
		String toparse = SwiftParseUtils.getTokenSecondLast(value, "//");
		setComponent2(SwiftParseUtils.getTokenFirst(toparse, "/"));
		setComponent3(SwiftParseUtils.getTokenSecond(toparse, "/"));
		setComponent4(SwiftParseUtils.getTokenThirdLast(toparse, "/"));
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(":");
		result.append(StringUtils.trimToEmpty(getComponent1()));
		result.append("//");
		result.append(StringUtils.trimToEmpty(getComponent2()));
		result.append("/");
		result.append(StringUtils.trimToEmpty(getComponent3()));
		result.append("/");
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
	 * Get the Qualifier (component1).
	 * @return the Qualifier from component1
	 */
	public String getQualifier() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field92B setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Qualifier (component1).
	 * @param component1 the Qualifier to set
	 */
	public Field92B setQualifier(String component1) {
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
	 * Get the component2 as Currency
	 * @return the component2 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent2AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(2));
	}

	/**
	 * Get the First Currency Code (component2).
	 * @return the First Currency Code from component2
	 */
	public String getFirstCurrencyCode() {
		return getComponent(2);
	}
	
	/**
	 * Get the First Currency Code (component2) as Currency
	 * @return the First Currency Code from component2 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getFirstCurrencyCodeAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field92B setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Currency with the component2 content to set
	 */
	public Field92B setComponent2(java.util.Currency component2) {
		setComponent(2, SwiftFormatUtils.getCurrency(component2));
		return this;
	}
	
	/**
	 * Set the First Currency Code (component2).
	 * @param component2 the First Currency Code to set
	 */
	public Field92B setFirstCurrencyCode(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the First Currency Code (component2) as Currency
	 * @param component2 Currency with the First Currency Code content to set
	 */
	public Field92B setFirstCurrencyCode(java.util.Currency component2) {
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
	 * Get the component3 as Currency
	 * @return the component3 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent3AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(3));
	}

	/**
	 * Get the Second Currency Code (component3).
	 * @return the Second Currency Code from component3
	 */
	public String getSecondCurrencyCode() {
		return getComponent(3);
	}
	
	/**
	 * Get the Second Currency Code (component3) as Currency
	 * @return the Second Currency Code from component3 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getSecondCurrencyCodeAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field92B setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Currency with the component3 content to set
	 */
	public Field92B setComponent3(java.util.Currency component3) {
		setComponent(3, SwiftFormatUtils.getCurrency(component3));
		return this;
	}
	
	/**
	 * Set the Second Currency Code (component3).
	 * @param component3 the Second Currency Code to set
	 */
	public Field92B setSecondCurrencyCode(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Second Currency Code (component3) as Currency
	 * @param component3 Currency with the Second Currency Code content to set
	 */
	public Field92B setSecondCurrencyCode(java.util.Currency component3) {
		setComponent(3, SwiftFormatUtils.getCurrency(component3));
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
	 * Get the component4 as Number
	 * @return the component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent4AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Get the Rate (component4).
	 * @return the Rate from component4
	 */
	public String getRate() {
		return getComponent(4);
	}
	
	/**
	 * Get the Rate (component4) as Number
	 * @return the Rate from component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getRateAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field92B setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Number with the component4 content to set
	 */
	public Field92B setComponent4(java.lang.Number component4) {
		setComponent(4, SwiftFormatUtils.getNumber(component4));
		return this;
	}
	
	/**
	 * Set the Rate (component4).
	 * @param component4 the Rate to set
	 */
	public Field92B setRate(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Rate (component4) as Number
	 * @param component4 Number with the Rate content to set
	 */
	public Field92B setRate(java.lang.Number component4) {
		setComponent(4, SwiftFormatUtils.getNumber(component4));
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
       return true;
   }

   /**
    * Returns the issuer code (or Data Source Scheme or DSS).
    * The DSS is only present in some generic fields, when present, is equals to component two.
    *
    * @return DSS component value or <code>null</code> if the DSS is not set or not available for this field.
    */
   public String getDSS() {
       return null;
   }

   /**
    * Checks if the issuer code (or Data Source Scheme or DSS) is present.
    *
    * @see #getDSS()
    * @return true if DSS is present, false otherwise.
    */
   public boolean isDSSPresent() {
       return getDSS() != null;
   }
   
   /**
    * Gets the conditional qualifier.<br />
    * The conditional qualifier is the the component following the DSS of generic fields, being component 2 or 3 depending on the field structure definition.
    *
    * @return for generic fields returns the value of the conditional qualifier or <code>null</code> if not set or not applicable for this kind of field.
    */
   public String getConditionalQualifier() {
       return getComponent(2);
   }
   
   public String componentsPattern() {
           return COMPONENTS_PATTERN;
   }

   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	* @deprecated use constant Field92B	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field92B get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field92B) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field92B in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field92B get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field92B in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field92B> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field92B from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field92B> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field92B> result = new java.util.ArrayList<Field92B>(arr.length);
			for (final Field f : arr) {
				result.add((Field92B) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
