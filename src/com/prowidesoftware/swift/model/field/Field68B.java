
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
 * Field 68B<br /><br />
 *
 * validation pattern: &lt;DATE2&gt;&lt;DATE2&gt;16x/1a$3!a&lt;AMOUNT&gt;15$&lt;CUR&gt;&lt;AMOUNT&gt;15/&lt;DATE2&gt;&lt;CUR&gt;&lt;AMOUNT&gt;15<br />
 * parser pattern: &lt;DATE2&gt;&lt;DATE2&gt;S/cSN$SN/&lt;DATE2&gt;SN<br />
 * components pattern: EEScSNCNECN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Calendar</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>Character</code></li> 
 * 		<li>component5: <code>String</code></li> 
 * 		<li>component6: <code>Number</code></li> 
 * 		<li>component7: <code>Currency</code></li> 
 * 		<li>component8: <code>Number</code></li> 
 * 		<li>component9: <code>Calendar</code></li> 
 * 		<li>component10: <code>Currency</code></li> 
 * 		<li>component11: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field68B extends Field implements Serializable , CurrencyContainer, DateContainer, AmountContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 68B
	 */
    public static final String NAME = "68B";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_68B = "68B";
	public static final String PARSER_PATTERN ="<DATE2><DATE2>S/cSN$SN/<DATE2>SN";
	public static final String COMPONENTS_PATTERN = "EEScSNCNECN";

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
	public Field68B() {
		super(11);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field68B(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		if (lines.size() > 0) {
			if (lines.get(0) != null) {
				String toparse = SwiftParseUtils.getTokenFirst(lines.get(0), "/");
				if (toparse != null && toparse.length() >= 6) {
					setComponent1(org.apache.commons.lang.StringUtils.substring(toparse, 0, 6));
				}
				if (toparse != null && toparse.length() >= 12) {
					setComponent2(org.apache.commons.lang.StringUtils.substring(toparse, 6, 12));
				}
				if (toparse != null && toparse.length() > 12) {
					setComponent3(org.apache.commons.lang.StringUtils.substring(toparse, 12));
				}
				
				toparse = SwiftParseUtils.getAlphaPrefix(SwiftParseUtils.getTokenSecond(lines.get(0), "/"));
				if (toparse != null && toparse.length() >= 1) {
					setComponent4(org.apache.commons.lang.StringUtils.substring(toparse, 0, 1));
				}
				if (toparse != null && toparse.length() > 1) {
					setComponent5(org.apache.commons.lang.StringUtils.substring(toparse, 1));
				}
				setComponent6(SwiftParseUtils.getNumericSuffix(SwiftParseUtils.getTokenSecond(lines.get(0), "/")));
			}
		}
		if (lines.size() > 1) {
			if (lines.get(1) != null) {
				String toparse = SwiftParseUtils.getTokenFirst(lines.get(1), "/");
				setComponent7(SwiftParseUtils.getAlphaPrefix(toparse));
				setComponent8(SwiftParseUtils.getNumericSuffix(toparse));
				toparse = SwiftParseUtils.getTokenSecondLast(lines.get(1), "/");
				if (toparse != null && toparse.length() >= 6) {
					setComponent9(org.apache.commons.lang.StringUtils.substring(toparse, 0, 6));
					String toparse2 = org.apache.commons.lang.StringUtils.substring(toparse, 6);
					setComponent10(SwiftParseUtils.getAlphaPrefix(toparse2));
					setComponent11(SwiftParseUtils.getNumericSuffix(toparse2));
				}
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
	 * Get the Trade Date (component1).
	 * @return the Trade Date from component1
	 */
	public String getTradeDate() {
		return getComponent(1);
	}
	
	/**
	 * Get the Trade Date (component1) as Calendar
	 * @return the Trade Date from component1 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getTradeDateAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field68B setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Calendar with the component1 content to set
	 */
	public Field68B setComponent1(java.util.Calendar component1) {
		setComponent(1, SwiftFormatUtils.getDate2(component1));
		return this;
	}
	
	/**
	 * Set the Trade Date (component1).
	 * @param component1 the Trade Date to set
	 */
	public Field68B setTradeDate(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Trade Date (component1) as Calendar
	 * @param component1 Calendar with the Trade Date content to set
	 */
	public Field68B setTradeDate(java.util.Calendar component1) {
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
		return SwiftFormatUtils.getDate2(getComponent(2));
	}

	/**
	 * Get the Maturity Date (component2).
	 * @return the Maturity Date from component2
	 */
	public String getMaturityDate() {
		return getComponent(2);
	}
	
	/**
	 * Get the Maturity Date (component2) as Calendar
	 * @return the Maturity Date from component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getMaturityDateAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field68B setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field68B setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate2(component2));
		return this;
	}
	
	/**
	 * Set the Maturity Date (component2).
	 * @param component2 the Maturity Date to set
	 */
	public Field68B setMaturityDate(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Maturity Date (component2) as Calendar
	 * @param component2 Calendar with the Maturity Date content to set
	 */
	public Field68B setMaturityDate(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate2(component2));
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
	 * Get the Contract Number (component3).
	 * @return the Contract Number from component3
	 */
	public String getContractNumber() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field68B setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Contract Number (component3).
	 * @param component3 the Contract Number to set
	 */
	public Field68B setContractNumber(String component3) {
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
	 * Get the Indicator (component4).
	 * @return the Indicator from component4
	 */
	public String getIndicator() {
		return getComponent(4);
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field68B setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Indicator (component4).
	 * @param component4 the Indicator to set
	 */
	public Field68B setIndicator(String component4) {
		setComponent(4, component4);
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
	 * Same as getComponent(5)
	 */
	@Deprecated
	public java.lang.String getComponent5AsString() {
		return getComponent(5);
	}

	/**
	 * Get the Unit (component5).
	 * @return the Unit from component5
	 */
	public String getUnit() {
		return getComponent(5);
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field68B setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Unit (component5).
	 * @param component5 the Unit to set
	 */
	public Field68B setUnit(String component5) {
		setComponent(5, component5);
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
	 * Get the Quantity Of The Commodity (component6).
	 * @return the Quantity Of The Commodity from component6
	 */
	public String getQuantityOfTheCommodity() {
		return getComponent(6);
	}
	
	/**
	 * Get the Quantity Of The Commodity (component6) as Number
	 * @return the Quantity Of The Commodity from component6 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getQuantityOfTheCommodityAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(6));
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field68B setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the component6.
	 * @param component6 the Number with the component6 content to set
	 */
	public Field68B setComponent6(java.lang.Number component6) {
		setComponent(6, SwiftFormatUtils.getNumber(component6));
		return this;
	}
	
	/**
	 * Set the Quantity Of The Commodity (component6).
	 * @param component6 the Quantity Of The Commodity to set
	 */
	public Field68B setQuantityOfTheCommodity(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the Quantity Of The Commodity (component6) as Number
	 * @param component6 Number with the Quantity Of The Commodity content to set
	 */
	public Field68B setQuantityOfTheCommodity(java.lang.Number component6) {
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
	 * Get the component7 as Currency
	 * @return the component7 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent7AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(7));
	}

	/**
	 * Get the Price Per Unit Currency (component7).
	 * @return the Price Per Unit Currency from component7
	 */
	public String getPricePerUnitCurrency() {
		return getComponent(7);
	}
	
	/**
	 * Get the Price Per Unit Currency (component7) as Currency
	 * @return the Price Per Unit Currency from component7 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getPricePerUnitCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(7));
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field68B setComponent7(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the component7.
	 * @param component7 the Currency with the component7 content to set
	 */
	public Field68B setComponent7(java.util.Currency component7) {
		setComponent(7, SwiftFormatUtils.getCurrency(component7));
		return this;
	}
	
	/**
	 * Set the Price Per Unit Currency (component7).
	 * @param component7 the Price Per Unit Currency to set
	 */
	public Field68B setPricePerUnitCurrency(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the Price Per Unit Currency (component7) as Currency
	 * @param component7 Currency with the Price Per Unit Currency content to set
	 */
	public Field68B setPricePerUnitCurrency(java.util.Currency component7) {
		setComponent(7, SwiftFormatUtils.getCurrency(component7));
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
	 * Get the Price Per Unit (component8).
	 * @return the Price Per Unit from component8
	 */
	public String getPricePerUnit() {
		return getComponent(8);
	}
	
	/**
	 * Get the Price Per Unit (component8) as Number
	 * @return the Price Per Unit from component8 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getPricePerUnitAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(8));
	}

	/**
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field68B setComponent8(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the component8.
	 * @param component8 the Number with the component8 content to set
	 */
	public Field68B setComponent8(java.lang.Number component8) {
		setComponent(8, SwiftFormatUtils.getNumber(component8));
		return this;
	}
	
	/**
	 * Set the Price Per Unit (component8).
	 * @param component8 the Price Per Unit to set
	 */
	public Field68B setPricePerUnit(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the Price Per Unit (component8) as Number
	 * @param component8 Number with the Price Per Unit content to set
	 */
	public Field68B setPricePerUnit(java.lang.Number component8) {
		setComponent(8, SwiftFormatUtils.getNumber(component8));
		return this;
	}

	/**
	 * Get the component9
	 * @return the component9
	 */
	public String getComponent9() {
		return getComponent(9);
	}

	/**
	 * Get the component9 as Calendar
	 * @return the component9 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent9AsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(9));
	}

	/**
	 * Get the Value Date Of The Consideration (component9).
	 * @return the Value Date Of The Consideration from component9
	 */
	public String getValueDateOfTheConsideration() {
		return getComponent(9);
	}
	
	/**
	 * Get the Value Date Of The Consideration (component9) as Calendar
	 * @return the Value Date Of The Consideration from component9 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getValueDateOfTheConsiderationAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(9));
	}

	/**
	 * Set the component9.
	 * @param component9 the component9 to set
	 */
	public Field68B setComponent9(String component9) {
		setComponent(9, component9);
		return this;
	}
	
	/**
	 * Set the component9.
	 * @param component9 the Calendar with the component9 content to set
	 */
	public Field68B setComponent9(java.util.Calendar component9) {
		setComponent(9, SwiftFormatUtils.getDate2(component9));
		return this;
	}
	
	/**
	 * Set the Value Date Of The Consideration (component9).
	 * @param component9 the Value Date Of The Consideration to set
	 */
	public Field68B setValueDateOfTheConsideration(String component9) {
		setComponent(9, component9);
		return this;
	}
	
	/**
	 * Set the Value Date Of The Consideration (component9) as Calendar
	 * @param component9 Calendar with the Value Date Of The Consideration content to set
	 */
	public Field68B setValueDateOfTheConsideration(java.util.Calendar component9) {
		setComponent(9, SwiftFormatUtils.getDate2(component9));
		return this;
	}

	/**
	 * Get the component10
	 * @return the component10
	 */
	public String getComponent10() {
		return getComponent(10);
	}

	/**
	 * Get the component10 as Currency
	 * @return the component10 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent10AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(10));
	}

	/**
	 * Get the Consideration Currency (component10).
	 * @return the Consideration Currency from component10
	 */
	public String getConsiderationCurrency() {
		return getComponent(10);
	}
	
	/**
	 * Get the Consideration Currency (component10) as Currency
	 * @return the Consideration Currency from component10 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getConsiderationCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(10));
	}

	/**
	 * Set the component10.
	 * @param component10 the component10 to set
	 */
	public Field68B setComponent10(String component10) {
		setComponent(10, component10);
		return this;
	}
	
	/**
	 * Set the component10.
	 * @param component10 the Currency with the component10 content to set
	 */
	public Field68B setComponent10(java.util.Currency component10) {
		setComponent(10, SwiftFormatUtils.getCurrency(component10));
		return this;
	}
	
	/**
	 * Set the Consideration Currency (component10).
	 * @param component10 the Consideration Currency to set
	 */
	public Field68B setConsiderationCurrency(String component10) {
		setComponent(10, component10);
		return this;
	}
	
	/**
	 * Set the Consideration Currency (component10) as Currency
	 * @param component10 Currency with the Consideration Currency content to set
	 */
	public Field68B setConsiderationCurrency(java.util.Currency component10) {
		setComponent(10, SwiftFormatUtils.getCurrency(component10));
		return this;
	}

	/**
	 * Get the component11
	 * @return the component11
	 */
	public String getComponent11() {
		return getComponent(11);
	}

	/**
	 * Get the component11 as Number
	 * @return the component11 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent11AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(11));
	}

	/**
	 * Get the Consideration (component11).
	 * @return the Consideration from component11
	 */
	public String getConsideration() {
		return getComponent(11);
	}
	
	/**
	 * Get the Consideration (component11) as Number
	 * @return the Consideration from component11 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getConsiderationAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(11));
	}

	/**
	 * Set the component11.
	 * @param component11 the component11 to set
	 */
	public Field68B setComponent11(String component11) {
		setComponent(11, component11);
		return this;
	}
	
	/**
	 * Set the component11.
	 * @param component11 the Number with the component11 content to set
	 */
	public Field68B setComponent11(java.lang.Number component11) {
		setComponent(11, SwiftFormatUtils.getNumber(component11));
		return this;
	}
	
	/**
	 * Set the Consideration (component11).
	 * @param component11 the Consideration to set
	 */
	public Field68B setConsideration(String component11) {
		setComponent(11, component11);
		return this;
	}
	
	/**
	 * Set the Consideration (component11) as Number
	 * @param component11 Number with the Consideration content to set
	 */
	public Field68B setConsideration(java.lang.Number component11) {
		setComponent(11, SwiftFormatUtils.getNumber(component11));
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
		result.add(SwiftFormatUtils.getDate2(getComponent(2)));
		result.add(SwiftFormatUtils.getDate2(getComponent(9)));
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
	* @deprecated use constant Field68B	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field68B get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field68B) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field68B in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field68B get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field68B in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field68B> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field68B from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field68B> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field68B> result = new java.util.ArrayList<Field68B>(arr.length);
			for (final Field f : arr) {
				result.add((Field68B) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
