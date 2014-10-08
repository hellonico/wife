
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
 * Field 68C<br /><br />
 *
 * validation pattern: 4a/4a/1a[&lt;DATE2&gt;]3!a&lt;AMOUNT&gt;15$&lt;CUR&gt;&lt;AMOUNT&gt;15&lt;CUR&gt;&lt;AMOUNT&gt;15&lt;CUR&gt;&lt;AMOUNT&gt;15<br />
 * parser pattern: S/S/c[&lt;DATE2&gt;]SN$SNSNSN<br />
 * components pattern: SScESNCNCNCN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>Character</code></li> 
 * 		<li>component4: <code>Calendar</code></li> 
 * 		<li>component5: <code>String</code></li> 
 * 		<li>component6: <code>Number</code></li> 
 * 		<li>component7: <code>Currency</code></li> 
 * 		<li>component8: <code>Number</code></li> 
 * 		<li>component9: <code>Currency</code></li> 
 * 		<li>component10: <code>Number</code></li> 
 * 		<li>component11: <code>Currency</code></li> 
 * 		<li>component12: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field68C extends Field implements Serializable , CurrencyContainer, DateContainer, AmountContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 68C
	 */
    public static final String NAME = "68C";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_68C = "68C";
	public static final String PARSER_PATTERN ="S/S/c[<DATE2>]SN$SNSNSN";
	public static final String COMPONENTS_PATTERN = "SScESNCNCNCN";

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
	public Field68C() {
		super(12);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field68C(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		if (lines.size() > 0) {
			if (lines.get(0) != null) {
				setComponent1(SwiftParseUtils.getTokenFirst(lines.get(0), "/"));
				setComponent2(SwiftParseUtils.getTokenSecond(lines.get(0), "/"));
				String toparse = SwiftParseUtils.getTokenThirdLast(lines.get(0), "/");
				if (toparse != null && toparse.length() >= 1) {
					StringBuilder parsed = new StringBuilder();
					setComponent3(org.apache.commons.lang.StringUtils.substring(toparse, 0, 1));
					if (getComponent3() != null) {
						parsed.append(getComponent3());
					}
					String toparse2 = org.apache.commons.lang.StringUtils.substringAfter(toparse, parsed.toString());
					setComponent4(SwiftParseUtils.getNumericPrefix(toparse2));
					if (getComponent4() != null) {
						parsed.append(getComponent4());
					}
					toparse2 = org.apache.commons.lang.StringUtils.substringAfter(toparse, parsed.toString());
					setComponent5(SwiftParseUtils.getAlphaPrefix(toparse2));
					setComponent6(SwiftParseUtils.getNumericSuffix(toparse2));
				}
			}
		}
		if (lines.size() > 1) {
			if (lines.get(1) != null) {
				StringBuilder parsed = new StringBuilder();
				String l = lines.get(1);

				setComponent7(SwiftParseUtils.getAlphaPrefix(l));
				if (getComponent7() != null) {
					parsed.append(getComponent7());
				}
				
				String toparse = org.apache.commons.lang.StringUtils.substringAfter(l, parsed.toString());
				setComponent8(SwiftParseUtils.getNumericPrefix(toparse));
				if (getComponent8() != null) {
					parsed.append(getComponent8());
				}

				toparse = org.apache.commons.lang.StringUtils.substringAfter(l, parsed.toString());
				setComponent9(SwiftParseUtils.getAlphaPrefix(toparse));
				if (getComponent9() != null) {
					parsed.append(getComponent9());
				}
				
				toparse = org.apache.commons.lang.StringUtils.substringAfter(l, parsed.toString());
				setComponent10(SwiftParseUtils.getNumericPrefix(toparse));
				if (getComponent10() != null) {
					parsed.append(getComponent10());
				}

				toparse = org.apache.commons.lang.StringUtils.substringAfter(l, parsed.toString());
				setComponent11(SwiftParseUtils.getAlphaPrefix(toparse));
				if (getComponent11() != null) {
					parsed.append(getComponent11());
				}

				toparse = org.apache.commons.lang.StringUtils.substringAfter(l, parsed.toString());
				setComponent12(SwiftParseUtils.getNumericPrefix(toparse));
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
	 * Same as getComponent(1)
	 */
	@Deprecated
	public java.lang.String getComponent1AsString() {
		return getComponent(1);
	}

	/**
	 * Get the Buy/Sell Indicator (component1).
	 * @return the Buy/Sell Indicator from component1
	 */
	public String getBuySellIndicator() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field68C setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Buy/Sell Indicator (component1).
	 * @param component1 the Buy/Sell Indicator to set
	 */
	public Field68C setBuySellIndicator(String component1) {
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
	 * Get the Call/Put Indicator (component2).
	 * @return the Call/Put Indicator from component2
	 */
	public String getCallPutIndicator() {
		return getComponent(2);
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field68C setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Call/Put Indicator (component2).
	 * @param component2 the Call/Put Indicator to set
	 */
	public Field68C setCallPutIndicator(String component2) {
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
	 * Get the Style Indicator (component3).
	 * @return the Style Indicator from component3
	 */
	public String getStyleIndicator() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field68C setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Style Indicator (component3).
	 * @param component3 the Style Indicator to set
	 */
	public Field68C setStyleIndicator(String component3) {
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
	 * Get the component4 as Calendar
	 * @return the component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent4AsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(4));
	}

	/**
	 * Get the Date Contract Agreed (component4).
	 * @return the Date Contract Agreed from component4
	 */
	public String getDateContractAgreed() {
		return getComponent(4);
	}
	
	/**
	 * Get the Date Contract Agreed (component4) as Calendar
	 * @return the Date Contract Agreed from component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getDateContractAgreedAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field68C setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Calendar with the component4 content to set
	 */
	public Field68C setComponent4(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getDate2(component4));
		return this;
	}
	
	/**
	 * Set the Date Contract Agreed (component4).
	 * @param component4 the Date Contract Agreed to set
	 */
	public Field68C setDateContractAgreed(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Date Contract Agreed (component4) as Calendar
	 * @param component4 Calendar with the Date Contract Agreed content to set
	 */
	public Field68C setDateContractAgreed(java.util.Calendar component4) {
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
	public Field68C setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Unit (component5).
	 * @param component5 the Unit to set
	 */
	public Field68C setUnit(String component5) {
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
	 * Get the Amount Of The Underlying Commodity (component6).
	 * @return the Amount Of The Underlying Commodity from component6
	 */
	public String getAmountOfTheUnderlyingCommodity() {
		return getComponent(6);
	}
	
	/**
	 * Get the Amount Of The Underlying Commodity (component6) as Number
	 * @return the Amount Of The Underlying Commodity from component6 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getAmountOfTheUnderlyingCommodityAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(6));
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field68C setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the component6.
	 * @param component6 the Number with the component6 content to set
	 */
	public Field68C setComponent6(java.lang.Number component6) {
		setComponent(6, SwiftFormatUtils.getNumber(component6));
		return this;
	}
	
	/**
	 * Set the Amount Of The Underlying Commodity (component6).
	 * @param component6 the Amount Of The Underlying Commodity to set
	 */
	public Field68C setAmountOfTheUnderlyingCommodity(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the Amount Of The Underlying Commodity (component6) as Number
	 * @param component6 Number with the Amount Of The Underlying Commodity content to set
	 */
	public Field68C setAmountOfTheUnderlyingCommodity(java.lang.Number component6) {
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
	 * Get the Strike Price Per Unit Currency (component7).
	 * @return the Strike Price Per Unit Currency from component7
	 */
	public String getStrikePricePerUnitCurrency() {
		return getComponent(7);
	}
	
	/**
	 * Get the Strike Price Per Unit Currency (component7) as Currency
	 * @return the Strike Price Per Unit Currency from component7 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getStrikePricePerUnitCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(7));
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field68C setComponent7(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the component7.
	 * @param component7 the Currency with the component7 content to set
	 */
	public Field68C setComponent7(java.util.Currency component7) {
		setComponent(7, SwiftFormatUtils.getCurrency(component7));
		return this;
	}
	
	/**
	 * Set the Strike Price Per Unit Currency (component7).
	 * @param component7 the Strike Price Per Unit Currency to set
	 */
	public Field68C setStrikePricePerUnitCurrency(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the Strike Price Per Unit Currency (component7) as Currency
	 * @param component7 Currency with the Strike Price Per Unit Currency content to set
	 */
	public Field68C setStrikePricePerUnitCurrency(java.util.Currency component7) {
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
	 * Get the Strike Price Per Unit (component8).
	 * @return the Strike Price Per Unit from component8
	 */
	public String getStrikePricePerUnit() {
		return getComponent(8);
	}
	
	/**
	 * Get the Strike Price Per Unit (component8) as Number
	 * @return the Strike Price Per Unit from component8 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getStrikePricePerUnitAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(8));
	}

	/**
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field68C setComponent8(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the component8.
	 * @param component8 the Number with the component8 content to set
	 */
	public Field68C setComponent8(java.lang.Number component8) {
		setComponent(8, SwiftFormatUtils.getNumber(component8));
		return this;
	}
	
	/**
	 * Set the Strike Price Per Unit (component8).
	 * @param component8 the Strike Price Per Unit to set
	 */
	public Field68C setStrikePricePerUnit(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the Strike Price Per Unit (component8) as Number
	 * @param component8 Number with the Strike Price Per Unit content to set
	 */
	public Field68C setStrikePricePerUnit(java.lang.Number component8) {
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
	 * Get the component9 as Currency
	 * @return the component9 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent9AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(9));
	}

	/**
	 * Get the Premium Price Per Unit Currency (component9).
	 * @return the Premium Price Per Unit Currency from component9
	 */
	public String getPremiumPricePerUnitCurrency() {
		return getComponent(9);
	}
	
	/**
	 * Get the Premium Price Per Unit Currency (component9) as Currency
	 * @return the Premium Price Per Unit Currency from component9 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getPremiumPricePerUnitCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(9));
	}

	/**
	 * Set the component9.
	 * @param component9 the component9 to set
	 */
	public Field68C setComponent9(String component9) {
		setComponent(9, component9);
		return this;
	}
	
	/**
	 * Set the component9.
	 * @param component9 the Currency with the component9 content to set
	 */
	public Field68C setComponent9(java.util.Currency component9) {
		setComponent(9, SwiftFormatUtils.getCurrency(component9));
		return this;
	}
	
	/**
	 * Set the Premium Price Per Unit Currency (component9).
	 * @param component9 the Premium Price Per Unit Currency to set
	 */
	public Field68C setPremiumPricePerUnitCurrency(String component9) {
		setComponent(9, component9);
		return this;
	}
	
	/**
	 * Set the Premium Price Per Unit Currency (component9) as Currency
	 * @param component9 Currency with the Premium Price Per Unit Currency content to set
	 */
	public Field68C setPremiumPricePerUnitCurrency(java.util.Currency component9) {
		setComponent(9, SwiftFormatUtils.getCurrency(component9));
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
	 * Get the component10 as Number
	 * @return the component10 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent10AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(10));
	}

	/**
	 * Get the Premium Price Per Unit (component10).
	 * @return the Premium Price Per Unit from component10
	 */
	public String getPremiumPricePerUnit() {
		return getComponent(10);
	}
	
	/**
	 * Get the Premium Price Per Unit (component10) as Number
	 * @return the Premium Price Per Unit from component10 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getPremiumPricePerUnitAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(10));
	}

	/**
	 * Set the component10.
	 * @param component10 the component10 to set
	 */
	public Field68C setComponent10(String component10) {
		setComponent(10, component10);
		return this;
	}
	
	/**
	 * Set the component10.
	 * @param component10 the Number with the component10 content to set
	 */
	public Field68C setComponent10(java.lang.Number component10) {
		setComponent(10, SwiftFormatUtils.getNumber(component10));
		return this;
	}
	
	/**
	 * Set the Premium Price Per Unit (component10).
	 * @param component10 the Premium Price Per Unit to set
	 */
	public Field68C setPremiumPricePerUnit(String component10) {
		setComponent(10, component10);
		return this;
	}
	
	/**
	 * Set the Premium Price Per Unit (component10) as Number
	 * @param component10 Number with the Premium Price Per Unit content to set
	 */
	public Field68C setPremiumPricePerUnit(java.lang.Number component10) {
		setComponent(10, SwiftFormatUtils.getNumber(component10));
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
	 * Get the component11 as Currency
	 * @return the component11 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent11AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(11));
	}

	/**
	 * Get the Premium Payment Currency (component11).
	 * @return the Premium Payment Currency from component11
	 */
	public String getPremiumPaymentCurrency() {
		return getComponent(11);
	}
	
	/**
	 * Get the Premium Payment Currency (component11) as Currency
	 * @return the Premium Payment Currency from component11 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getPremiumPaymentCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(11));
	}

	/**
	 * Set the component11.
	 * @param component11 the component11 to set
	 */
	public Field68C setComponent11(String component11) {
		setComponent(11, component11);
		return this;
	}
	
	/**
	 * Set the component11.
	 * @param component11 the Currency with the component11 content to set
	 */
	public Field68C setComponent11(java.util.Currency component11) {
		setComponent(11, SwiftFormatUtils.getCurrency(component11));
		return this;
	}
	
	/**
	 * Set the Premium Payment Currency (component11).
	 * @param component11 the Premium Payment Currency to set
	 */
	public Field68C setPremiumPaymentCurrency(String component11) {
		setComponent(11, component11);
		return this;
	}
	
	/**
	 * Set the Premium Payment Currency (component11) as Currency
	 * @param component11 Currency with the Premium Payment Currency content to set
	 */
	public Field68C setPremiumPaymentCurrency(java.util.Currency component11) {
		setComponent(11, SwiftFormatUtils.getCurrency(component11));
		return this;
	}

	/**
	 * Get the component12
	 * @return the component12
	 */
	public String getComponent12() {
		return getComponent(12);
	}

	/**
	 * Get the component12 as Number
	 * @return the component12 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent12AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(12));
	}

	/**
	 * Get the Premium Payment (component12).
	 * @return the Premium Payment from component12
	 */
	public String getPremiumPayment() {
		return getComponent(12);
	}
	
	/**
	 * Get the Premium Payment (component12) as Number
	 * @return the Premium Payment from component12 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getPremiumPaymentAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(12));
	}

	/**
	 * Set the component12.
	 * @param component12 the component12 to set
	 */
	public Field68C setComponent12(String component12) {
		setComponent(12, component12);
		return this;
	}
	
	/**
	 * Set the component12.
	 * @param component12 the Number with the component12 content to set
	 */
	public Field68C setComponent12(java.lang.Number component12) {
		setComponent(12, SwiftFormatUtils.getNumber(component12));
		return this;
	}
	
	/**
	 * Set the Premium Payment (component12).
	 * @param component12 the Premium Payment to set
	 */
	public Field68C setPremiumPayment(String component12) {
		setComponent(12, component12);
		return this;
	}
	
	/**
	 * Set the Premium Payment (component12) as Number
	 * @param component12 Number with the Premium Payment content to set
	 */
	public Field68C setPremiumPayment(java.lang.Number component12) {
		setComponent(12, SwiftFormatUtils.getNumber(component12));
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
		result.add(SwiftFormatUtils.getDate2(getComponent(4)));
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
	* @deprecated use constant Field68C	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field68C get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field68C) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field68C in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field68C get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field68C in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field68C> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field68C from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field68C> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field68C> result = new java.util.ArrayList<Field68C>(arr.length);
			for (final Field f : arr) {
				result.add((Field68C) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
