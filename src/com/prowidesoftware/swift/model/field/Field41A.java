
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
 * Field 41A<br /><br />
 *
 * validation pattern: &lt;SWIFTBIC&gt;|&lt;NON-SWIFTBIC&gt;$14x<br />
 * parser pattern: S$S<br />
 * components pattern: BS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>BIC</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field41A extends Field implements Serializable , BICContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 41A
	 */
    public static final String NAME = "41A";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_41A = "41A";
	public static final String PARSER_PATTERN ="S$S";
	public static final String COMPONENTS_PATTERN = "BS";

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
	public Field41A() {
		super(2);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field41A(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		if (lines.size() > 0) {
			setComponent1(lines.get(0));
		} 
		if (lines.size() > 1) {
			setComponent2(lines.get(1));
		}
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(getComponent1());
		if (StringUtils.isNotEmpty(getComponent2())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);
			result.append(getComponent2());
		}
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
	 * Get the component1 as BIC
	 * @return the component1 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getComponent1AsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(1));
	}

	/**
	 * Get the BIC (component1).
	 * @return the BIC from component1
	 */
	public String getBIC() {
		return getComponent(1);
	}
	
	/**
	 * Get the BIC (component1) as BIC
	 * @return the BIC from component1 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getBICAsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field41A setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the BIC with the component1 content to set
	 */
	public Field41A setComponent1(com.prowidesoftware.swift.model.BIC component1) {
		setComponent(1, SwiftFormatUtils.getBIC(component1));
		return this;
	}
	
	/**
	 * Set the BIC (component1).
	 * @param component1 the BIC to set
	 */
	public Field41A setBIC(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the BIC (component1) as BIC
	 * @param component1 BIC with the BIC content to set
	 */
	public Field41A setBIC(com.prowidesoftware.swift.model.BIC component1) {
		setComponent(1, SwiftFormatUtils.getBIC(component1));
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
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field41A setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}

	public List<BIC> bics () {
		final List<BIC> result = new ArrayList<BIC>();
		result.add(SwiftFormatUtils.getBIC(getComponent(1)));
		return result;
	}
	public List<String> bicStrings () {
		final List<String> result = new ArrayList<String>();
		result.add(getComponent(1));
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
	* @deprecated use constant Field41A	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field41A get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field41A) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field41A in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field41A get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field41A in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field41A> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field41A from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field41A> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field41A> result = new java.util.ArrayList<Field41A>(arr.length);
			for (final Field f : arr) {
				result.add((Field41A) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
