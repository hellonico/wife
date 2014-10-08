
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
 * Field 92E<br /><br />
 *
 * validation pattern: :4!c/[8c]/4!c/[N]&lt;AMOUNT&gt;15[/4!c]<br />
 * parser pattern: :S/[S]/S/[c]N[/S]<br />
 * components pattern: SSSSNS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>String</code></li> 
 * 		<li>component5: <code>Number</code></li> 
 * 		<li>component6: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@Deprecated
@SuppressWarnings("unused") 
public class Field92E extends Field implements Serializable , AmountContainer, GenericField {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 92E
	 */
    public static final String NAME = "92E";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_92E = "92E";
	public static final String PARSER_PATTERN =":S/[S]/S/[c]N[/S]";
	public static final String COMPONENTS_PATTERN = "SSSSNS";

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
	public Field92E() {
		super(6);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field92E(String value) {
		this();

		setComponent1(SwiftParseUtils.getTokenFirst(value, ":", "/"));
		setComponent2(SwiftParseUtils.getTokenSecond(value, "/"));
		String toparse = SwiftParseUtils.getTokenThirdLast(value, "/");
		setComponent3(SwiftParseUtils.getTokenFirst(toparse, null, "/"));		
		String toparse2 = SwiftParseUtils.getTokenSecond(toparse, "/");
		setComponent4(SwiftParseUtils.getAlphaPrefix(toparse2));
		setComponent5(SwiftParseUtils.getNumericSuffix(toparse2));
		setComponent6(SwiftParseUtils.getTokenSecond(toparse2, "/"));
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
	public Field92E setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Qualifier (component1).
	 * @param component1 the Qualifier to set
	 */
	public Field92E setQualifier(String component1) {
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
	 * Get the Data Source Scheme (component2).
	 * @return the Data Source Scheme from component2
	 */
	public String getDataSourceScheme() {
		return getComponent(2);
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field92E setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Data Source Scheme (component2).
	 * @param component2 the Data Source Scheme to set
	 */
	public Field92E setDataSourceScheme(String component2) {
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
	 * Get the Code (component3).
	 * @return the Code from component3
	 */
	public String getCode() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field92E setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Code (component3).
	 * @param component3 the Code to set
	 */
	public Field92E setCode(String component3) {
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
	 * Same as getComponent(4)
	 */
	@Deprecated
	public java.lang.String getComponent4AsString() {
		return getComponent(4);
	}

	/**
	 * Get the Sign (component4).
	 * @return the Sign from component4
	 */
	public String getSign() {
		return getComponent(4);
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field92E setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Sign (component4).
	 * @param component4 the Sign to set
	 */
	public Field92E setSign(String component4) {
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
	public Field92E setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Number with the component5 content to set
	 */
	public Field92E setComponent5(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
		return this;
	}
	
	/**
	 * Set the Amount (component5).
	 * @param component5 the Amount to set
	 */
	public Field92E setAmount(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Amount (component5) as Number
	 * @param component5 Number with the Amount content to set
	 */
	public Field92E setAmount(java.lang.Number component5) {
		setComponent(5, SwiftFormatUtils.getNumber(component5));
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
	 * Same as getComponent(6)
	 */
	@Deprecated
	public java.lang.String getComponent6AsString() {
		return getComponent(6);
	}

	/**
	 * Get the Narrative (component6).
	 * @return the Narrative from component6
	 */
	public String getNarrative() {
		return getComponent(6);
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field92E setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the Narrative (component6).
	 * @param component6 the Narrative to set
	 */
	public Field92E setNarrative(String component6) {
		setComponent(6, component6);
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
       if (component == 2) {
           return true;
       }
       if (component == 4) {
           return true;
       }
       if (component == 6) {
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
       return true;
   }

   /**
    * Returns the issuer code (or Data Source Scheme or DSS).
    * The DSS is only present in some generic fields, when present, is equals to component two.
    *
    * @return DSS component value or <code>null</code> if the DSS is not set or not available for this field.
    */
   public String getDSS() {
       return getComponent(2);
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
       return getComponent(3);
   }
   
   public String componentsPattern() {
           return COMPONENTS_PATTERN;
   }

   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	* @deprecated use constant Field92E	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field92E get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field92E) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field92E in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field92E get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field92E in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field92E> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field92E from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field92E> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field92E> result = new java.util.ArrayList<Field92E>(arr.length);
			for (final Field f : arr) {
				result.add((Field92E) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
