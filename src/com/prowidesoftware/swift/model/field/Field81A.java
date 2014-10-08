
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
 * Field 81A<br /><br />
 *
 * validation pattern: [[/&lt;DC&gt;][/34x]$]&lt;SWIFTBIC&gt;|&lt;NON-SWIFTBIC&gt;<br />
 * parser pattern: [[/c][/S]$]S<br />
 * components pattern: SSB<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>BIC</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field81A extends Field implements Serializable , BICContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 81A
	 */
    public static final String NAME = "81A";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_81A = "81A";
	public static final String PARSER_PATTERN ="[[/c][/S]$]S";
	public static final String COMPONENTS_PATTERN = "SSB";

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
	public Field81A() {
		super(3);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field81A(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		if (lines.size() > 0) {
			if (lines.get(0).startsWith("/")) {
				if (lines.get(0).startsWith("//")) {
					setComponent1("");
					setComponent2(org.apache.commons.lang.StringUtils.substring(lines.get(0), 2));
				} else {
					String t1 = SwiftParseUtils.getTokenFirst(lines.get(0), "/", "/");
					if (org.apache.commons.lang.StringUtils.isNotEmpty(t1)) {
						if (t1.length() == 1) {
							setComponent1(t1);
							setComponent2(SwiftParseUtils.getTokenSecondLast(org.apache.commons.lang.StringUtils.substring(lines.get(0), 1), "/"));
						} else {
							setComponent2(org.apache.commons.lang.StringUtils.substring(lines.get(0), 1));
						}
					}
				}
				if (lines.size() > 1) {
					setComponent3(lines.get(1));
				}
			} else {
				setComponent3(lines.get(0));
			}
		}
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		boolean wroteSomething = false;
		if (getComponent1() != null) {
			result.append("/" + getComponent1());
			wroteSomething = true;
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent2())) {
			result.append("/" + getComponent2());
			wroteSomething = true;
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent3())) {
			if (wroteSomething) {
				result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			}
			result.append(getComponent3());
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
	 * Same as getComponent(1)
	 */
	@Deprecated
	public java.lang.String getComponent1AsString() {
		return getComponent(1);
	}

	/**
	 * Get the D/C Mark (component1).
	 * @return the D/C Mark from component1
	 */
	public String getDCMark() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field81A setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the D/C Mark (component1).
	 * @param component1 the D/C Mark to set
	 */
	public Field81A setDCMark(String component1) {
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
	 * Get the Account (component2) removing its starting slashes if any.
	 * @return the Account from component2
	 */
	public String getAccount() {
		String c = getComponent(2);
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
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field81A setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Account (component2).
	 * @param component2 the Account to set
	 */
	public Field81A setAccount(String component2) {
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
	 * Get the component3 as BIC
	 * @return the component3 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getComponent3AsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(3));
	}

	/**
	 * Get the BIC (component3).
	 * @return the BIC from component3
	 */
	public String getBIC() {
		return getComponent(3);
	}
	
	/**
	 * Get the BIC (component3) as BIC
	 * @return the BIC from component3 converted to BIC or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.BIC getBICAsBIC() {
		return SwiftFormatUtils.getBIC(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field81A setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the BIC with the component3 content to set
	 */
	public Field81A setComponent3(com.prowidesoftware.swift.model.BIC component3) {
		setComponent(3, SwiftFormatUtils.getBIC(component3));
		return this;
	}
	
	/**
	 * Set the BIC (component3).
	 * @param component3 the BIC to set
	 */
	public Field81A setBIC(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the BIC (component3) as BIC
	 * @param component3 BIC with the BIC content to set
	 */
	public Field81A setBIC(com.prowidesoftware.swift.model.BIC component3) {
		setComponent(3, SwiftFormatUtils.getBIC(component3));
		return this;
	}

	public List<BIC> bics () {
		final List<BIC> result = new ArrayList<BIC>();
		result.add(SwiftFormatUtils.getBIC(getComponent(3)));
		return result;
	}
	public List<String> bicStrings () {
		final List<String> result = new ArrayList<String>();
		result.add(getComponent(3));
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
       if (component == 2) {
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
	* @deprecated use constant Field81A	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field81A get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field81A) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field81A in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field81A get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field81A in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field81A> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field81A from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field81A> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field81A> result = new java.util.ArrayList<Field81A>(arr.length);
			for (final Field f : arr) {
				result.add((Field81A) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
