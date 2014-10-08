
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
 * Field 134<br /><br />
 *
 * validation pattern: &lt;SWIFTBIC&gt;|&lt;NON-SWIFTBIC&gt;$65x$65x<br />
 * parser pattern: S$S$S<br />
 * components pattern: BSS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>BIC</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field134 extends Field implements Serializable , BICContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 134
	 */
    public static final String NAME = "134";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_134 = "134";
	public static final String PARSER_PATTERN ="S$S$S";
	public static final String COMPONENTS_PATTERN = "BSS";

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
	public Field134() {
		super(3);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field134(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		if (lines.size() > 0) {
			setComponent1(lines.get(0));
		} 
		if (lines.size() > 1) {
			setComponent2(lines.get(1));
		}
		if (lines.size() > 2) {
			setComponent3(lines.get(2));
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
	 * Get the component1 as BIC
	 * @return the component1 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getComponent1AsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(1));
	}

	/**
	 * Get the Broadcast Requester BIC (component1).
	 * @return the Broadcast Requester BIC from component1
	 */
	public String getBroadcastRequesterBIC() {
		return getComponent(1);
	}
	
	/**
	 * Get the Broadcast Requester BIC (component1) as BIC
	 * @return the Broadcast Requester BIC from component1 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getBroadcastRequesterBICAsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field134 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the BIC with the component1 content to set
	 */
	public Field134 setComponent1(com.prowidesoftware.swift.model.BIC component1) {
		setComponent(1, SwiftFormatUtils.getBIC(component1));
		return this;
	}
	
	/**
	 * Set the Broadcast Requester BIC (component1).
	 * @param component1 the Broadcast Requester BIC to set
	 */
	public Field134 setBroadcastRequesterBIC(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Broadcast Requester BIC (component1) as BIC
	 * @param component1 BIC with the Broadcast Requester BIC content to set
	 */
	public Field134 setBroadcastRequesterBIC(com.prowidesoftware.swift.model.BIC component1) {
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
	 * Get the Broadcast Requester Name (component2).
	 * @return the Broadcast Requester Name from component2
	 */
	public String getBroadcastRequesterName() {
		return getComponent(2);
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field134 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Broadcast Requester Name (component2).
	 * @param component2 the Broadcast Requester Name to set
	 */
	public Field134 setBroadcastRequesterName(String component2) {
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
	 * Get the Broadcast Requester City (component3).
	 * @return the Broadcast Requester City from component3
	 */
	public String getBroadcastRequesterCity() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field134 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Broadcast Requester City (component3).
	 * @param component3 the Broadcast Requester City to set
	 */
	public Field134 setBroadcastRequesterCity(String component3) {
		setComponent(3, component3);
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
	* @deprecated use constant Field134	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field134 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field134) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field134 in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field134 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field134 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field134> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field134 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field134> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field134> result = new java.util.ArrayList<Field134>(arr.length);
			for (final Field f : arr) {
				result.add((Field134) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
