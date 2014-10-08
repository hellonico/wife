
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
import com.prowidesoftware.swift.model.BIC;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 59A<br /><br />
 *
 * validation pattern: [/34x$]&lt;SWIFTBIC&gt;|&lt;NON-SWIFTBIC&gt;<br />
 * parser pattern: [/S$]S<br />
 * components pattern: SB<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>BIC</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field59A extends Field implements Serializable , BICContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 59A
	 */
    public static final String NAME = "59A";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_59A = "59A";
	public static final String PARSER_PATTERN ="[/S$]S";
	public static final String COMPONENTS_PATTERN = "SB";

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
	public Field59A() {
		super(2);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field59A(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		if (lines.size() > 0) {
		 if (lines.get(0).startsWith("/")) {
		  setComponent1(org.apache.commons.lang.StringUtils.substring(lines.get(0), 1));
		  SwiftParseUtils.setComponentsFromLines(this, 2, 4, 1, lines);
		 } else {
		  SwiftParseUtils.setComponentsFromLines(this, 2, 4, 0, lines);
		 }
		}
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		if (StringUtils.isNotEmpty(getComponent(1))) {
			result.append("/");
			result.append(getComponent(1));
		}
		appendInLines(result, getComponent2());
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
	 * Get the Account (component1) removing its starting slashes if any.
	 * @return the Account from component1
	 */
	public String getAccount() {
		String c = getComponent(1);
		if (c != null) {
			for (int i=0; i<c.length(); i++) {
				if (c.charAt(i) != '/') {
					return c.substring(i);
				}
			}
			return "";
		}
		return null;
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field59A setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Account (component1).
	 * @param component1 the Account to set
	 */
	public Field59A setAccount(String component1) {
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
	 * Get the component2 as BIC
	 * @return the component2 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getComponent2AsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(2));
	}

	/**
	 * Get the BIC (component2).
	 * @return the BIC from component2
	 */
	public String getBIC() {
		return getComponent(2);
	}
	
	/**
	 * Get the BIC (component2) as BIC
	 * @return the BIC from component2 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getBICAsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field59A setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the BIC with the component2 content to set
	 */
	public Field59A setComponent2(com.prowidesoftware.swift.model.BIC component2) {
		setComponent(2, SwiftFormatUtils.getBIC(component2));
		return this;
	}
	
	/**
	 * Set the BIC (component2).
	 * @param component2 the BIC to set
	 */
	public Field59A setBIC(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the BIC (component2) as BIC
	 * @param component2 BIC with the BIC content to set
	 */
	public Field59A setBIC(com.prowidesoftware.swift.model.BIC component2) {
		setComponent(2, SwiftFormatUtils.getBIC(component2));
		return this;
	}

	public List<BIC> bics () {
		final List<BIC> result = new ArrayList<BIC>();
		result.add(SwiftFormatUtils.getBIC(getComponent(2)));
		return result;
	}
	public List<String> bicStrings () {
		final List<String> result = new ArrayList<String>();
		result.add(getComponent(2));
		return result;
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
       if (component == 1) {
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
	* @deprecated use constant Field59A	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field59A get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field59A) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field59A in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field59A get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field59A in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field59A> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field59A from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field59A> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field59A> result = new java.util.ArrayList<Field59A>(arr.length);
			for (final Field f : arr) {
				result.add((Field59A) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
