
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
 * Field 90A<br /><br />
 *
 * validation pattern: :4!c//4!c/&lt;AMOUNT&gt;15<br />
 * parser pattern: :S//S/N<br />
 * components pattern: SSN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field90A extends Field implements Serializable , AmountContainer, GenericField {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 90A
	 */
    public static final String NAME = "90A";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_90A = "90A";
	public static final String PARSER_PATTERN =":S//S/N";
	public static final String COMPONENTS_PATTERN = "SSN";

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
	public Field90A() {
		super(3);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field90A(String value) {
		this();

		setComponent1(SwiftParseUtils.getTokenFirst(value, ":", "//"));
		String toparse = SwiftParseUtils.getTokenSecondLast(value, "//");
		setComponent2(SwiftParseUtils.getTokenFirst(toparse, "/"));
		setComponent3(SwiftParseUtils.getTokenSecondLast(toparse, "/"));
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
	public Field90A setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Qualifier (component1).
	 * @param component1 the Qualifier to set
	 */
	public Field90A setQualifier(String component1) {
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
	 * Get the Percentage Type Code (component2).
	 * @return the Percentage Type Code from component2
	 */
	public String getPercentageTypeCode() {
		return getComponent(2);
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field90A setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Percentage Type Code (component2).
	 * @param component2 the Percentage Type Code to set
	 */
	public Field90A setPercentageTypeCode(String component2) {
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
	 * Get the component3 as Number
	 * @return the component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent3AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Get the Price (component3).
	 * @return the Price from component3
	 */
	public String getPrice() {
		return getComponent(3);
	}
	
	/**
	 * Get the Price (component3) as Number
	 * @return the Price from component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getPriceAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field90A setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Number with the component3 content to set
	 */
	public Field90A setComponent3(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
		return this;
	}
	
	/**
	 * Set the Price (component3).
	 * @param component3 the Price to set
	 */
	public Field90A setPrice(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Price (component3) as Number
	 * @param component3 Number with the Price content to set
	 */
	public Field90A setPrice(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
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
	* @deprecated use constant Field90A	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field90A get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field90A) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field90A in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field90A get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field90A in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field90A> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field90A from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field90A> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field90A> result = new java.util.ArrayList<Field90A>(arr.length);
			for (final Field f : arr) {
				result.add((Field90A) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
