
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
 * Field 253<br /><br />
 *
 * validation pattern: &lt;MOR&gt;<br />
 * parser pattern: S<br />
 * components pattern: V<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>MOR</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field253 extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 253
	 */
    public static final String NAME = "253";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_253 = "253";
	public static final String PARSER_PATTERN ="S";
	public static final String COMPONENTS_PATTERN = "V";

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
	public Field253() {
		super(1);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field253(String value) {
		this();

		setComponent1(value);
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(StringUtils.trimToEmpty(getComponent1()));
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
	 * Get the component1 as MOR
	 * @return the component1 converted to MOR or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.MOR getComponent1AsMOR() {
		return SwiftFormatUtils.getMOR(getComponent(1));
	}

	/**
	 * Get the MOR (component1).
	 * @return the MOR from component1
	 */
	public String getMOR() {
		return getComponent(1);
	}
	
	/**
	 * Get the MOR (component1) as MOR
	 * @return the MOR from component1 converted to MOR or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.MOR getMORAsMOR() {
		return SwiftFormatUtils.getMOR(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field253 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the MOR with the component1 content to set
	 */
	public Field253 setComponent1(com.prowidesoftware.swift.model.MOR component1) {
		setComponent(1, SwiftFormatUtils.getMOR(component1));
		return this;
	}
	
	/**
	 * Set the MOR (component1).
	 * @param component1 the MOR to set
	 */
	public Field253 setMOR(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the MOR (component1) as MOR
	 * @param component1 MOR with the MOR content to set
	 */
	public Field253 setMOR(com.prowidesoftware.swift.model.MOR component1) {
		setComponent(1, SwiftFormatUtils.getMOR(component1));
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
	* @deprecated use constant Field253	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field253 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field253) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field253 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field253 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field253 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field253> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field253 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field253> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field253> result = new java.util.ArrayList<Field253>(arr.length);
			for (final Field f : arr) {
				result.add((Field253) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
