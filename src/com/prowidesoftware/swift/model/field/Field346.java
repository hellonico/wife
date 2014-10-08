
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
 * Field 346<br /><br />
 *
 * validation pattern: 3!c*10<br />
 * parser pattern: 3!S*10<br />
 * components pattern: SSSSSSSSSS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>String</code></li> 
 * 		<li>component5: <code>String</code></li> 
 * 		<li>component6: <code>String</code></li> 
 * 		<li>component7: <code>String</code></li> 
 * 		<li>component8: <code>String</code></li> 
 * 		<li>component9: <code>String</code></li> 
 * 		<li>component10: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field346 extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 346
	 */
    public static final String NAME = "346";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_346 = "346";
	public static final String PARSER_PATTERN ="3!S*10";
	public static final String COMPONENTS_PATTERN = "SSSSSSSSSS";

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
	public Field346() {
		super(10);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field346(String value) {
		this();

		if (value != null) {
			SwiftParseUtils.setComponentsFromTokens(this, 1, 10, 3, value);
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
	 * Get the Branch1 (component1).
	 * @return the Branch1 from component1
	 */
	public String getBranch1() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field346 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Branch1 (component1).
	 * @param component1 the Branch1 to set
	 */
	public Field346 setBranch1(String component1) {
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
	 * Get the Branch2 (component2).
	 * @return the Branch2 from component2
	 */
	public String getBranch2() {
		return getComponent(2);
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field346 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Branch2 (component2).
	 * @param component2 the Branch2 to set
	 */
	public Field346 setBranch2(String component2) {
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
	 * Get the Branch3 (component3).
	 * @return the Branch3 from component3
	 */
	public String getBranch3() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field346 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Branch3 (component3).
	 * @param component3 the Branch3 to set
	 */
	public Field346 setBranch3(String component3) {
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
	 * Get the Branch4 (component4).
	 * @return the Branch4 from component4
	 */
	public String getBranch4() {
		return getComponent(4);
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field346 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Branch4 (component4).
	 * @param component4 the Branch4 to set
	 */
	public Field346 setBranch4(String component4) {
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
	 * Get the Branch5 (component5).
	 * @return the Branch5 from component5
	 */
	public String getBranch5() {
		return getComponent(5);
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field346 setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Branch5 (component5).
	 * @param component5 the Branch5 to set
	 */
	public Field346 setBranch5(String component5) {
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
	 * Same as getComponent(6)
	 */
	@Deprecated
	public java.lang.String getComponent6AsString() {
		return getComponent(6);
	}

	/**
	 * Get the Branch6 (component6).
	 * @return the Branch6 from component6
	 */
	public String getBranch6() {
		return getComponent(6);
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field346 setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the Branch6 (component6).
	 * @param component6 the Branch6 to set
	 */
	public Field346 setBranch6(String component6) {
		setComponent(6, component6);
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
	 * Same as getComponent(7)
	 */
	@Deprecated
	public java.lang.String getComponent7AsString() {
		return getComponent(7);
	}

	/**
	 * Get the Branch7 (component7).
	 * @return the Branch7 from component7
	 */
	public String getBranch7() {
		return getComponent(7);
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field346 setComponent7(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the Branch7 (component7).
	 * @param component7 the Branch7 to set
	 */
	public Field346 setBranch7(String component7) {
		setComponent(7, component7);
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
	 * Same as getComponent(8)
	 */
	@Deprecated
	public java.lang.String getComponent8AsString() {
		return getComponent(8);
	}

	/**
	 * Get the Branch8 (component8).
	 * @return the Branch8 from component8
	 */
	public String getBranch8() {
		return getComponent(8);
	}

	/**
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field346 setComponent8(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the Branch8 (component8).
	 * @param component8 the Branch8 to set
	 */
	public Field346 setBranch8(String component8) {
		setComponent(8, component8);
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
	 * Same as getComponent(9)
	 */
	@Deprecated
	public java.lang.String getComponent9AsString() {
		return getComponent(9);
	}

	/**
	 * Get the Branch9 (component9).
	 * @return the Branch9 from component9
	 */
	public String getBranch9() {
		return getComponent(9);
	}

	/**
	 * Set the component9.
	 * @param component9 the component9 to set
	 */
	public Field346 setComponent9(String component9) {
		setComponent(9, component9);
		return this;
	}
	
	/**
	 * Set the Branch9 (component9).
	 * @param component9 the Branch9 to set
	 */
	public Field346 setBranch9(String component9) {
		setComponent(9, component9);
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
	 * Same as getComponent(10)
	 */
	@Deprecated
	public java.lang.String getComponent10AsString() {
		return getComponent(10);
	}

	/**
	 * Get the Branch10 (component10).
	 * @return the Branch10 from component10
	 */
	public String getBranch10() {
		return getComponent(10);
	}

	/**
	 * Set the component10.
	 * @param component10 the component10 to set
	 */
	public Field346 setComponent10(String component10) {
		setComponent(10, component10);
		return this;
	}
	
	/**
	 * Set the Branch10 (component10).
	 * @param component10 the Branch10 to set
	 */
	public Field346 setBranch10(String component10) {
		setComponent(10, component10);
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
	* @deprecated use constant Field346	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field346 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field346) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field346 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field346 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field346 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field346> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field346 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field346> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field346> result = new java.util.ArrayList<Field346>(arr.length);
			for (final Field f : arr) {
				result.add((Field346) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
