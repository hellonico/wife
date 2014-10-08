
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
 * Field 50F<br /><br />
 *
 * validation pattern: CUSTOM<br />
 * parser pattern: S$S/S[$S/S]0-3<br />
 * components pattern: SNSNSNSNS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Number</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>Number</code></li> 
 * 		<li>component5: <code>String</code></li> 
 * 		<li>component6: <code>Number</code></li> 
 * 		<li>component7: <code>String</code></li> 
 * 		<li>component8: <code>Number</code></li> 
 * 		<li>component9: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field50F extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 50F
	 */
    public static final String NAME = "50F";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_50F = "50F";
	public static final String PARSER_PATTERN ="S$S/S[$S/S]0-3";
	public static final String COMPONENTS_PATTERN = "SNSNSNSNS";

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
	public Field50F() {
		super(9);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field50F(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		if (lines.size() > 0) {
			setComponent1(lines.get(0));
		} 
		if (lines.size() > 1) {
			setComponent2(SwiftParseUtils.getTokenFirst(lines.get(1), "/"));
			setComponent3(SwiftParseUtils.getTokenSecondLast(lines.get(1), "/"));
		}
		if (lines.size() > 2) {
			setComponent4(SwiftParseUtils.getTokenFirst(lines.get(2), "/"));
			setComponent5(SwiftParseUtils.getTokenSecondLast(lines.get(2), "/"));
		} 
		if (lines.size() > 3) {
			setComponent6(SwiftParseUtils.getTokenFirst(lines.get(3), "/"));
			setComponent7(SwiftParseUtils.getTokenSecondLast(lines.get(3), "/"));
		}
		if (lines.size() > 4) {
			setComponent8(SwiftParseUtils.getTokenFirst(lines.get(4), "/"));
			setComponent9(SwiftParseUtils.getTokenSecondLast(lines.get(4), "/"));
		}	
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(StringUtils.trimToEmpty(getComponent1()));
		result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
		result.append(StringUtils.trimToEmpty(getComponent2()));
		result.append("/");
		result.append(StringUtils.trimToEmpty(getComponent3()));
		if (StringUtils.isNotEmpty(getComponent4()) || StringUtils.isNotEmpty(getComponent5())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent4()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent5()));
		}
		if (StringUtils.isNotEmpty(getComponent6()) || StringUtils.isNotEmpty(getComponent7())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent6()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent7()));
		}
		if (StringUtils.isNotEmpty(getComponent8()) || StringUtils.isNotEmpty(getComponent9())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent8()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent9()));
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
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field50F setComponent1(String component1) {
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
	 * Get the component2 as Number
	 * @return the component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent2AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field50F setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Number with the component2 content to set
	 */
	public Field50F setComponent2(java.lang.Number component2) {
		setComponent(2, SwiftFormatUtils.getNumber(component2));
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
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field50F setComponent3(String component3) {
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
	 * Get the component4 as Number
	 * @return the component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent4AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field50F setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Number with the component4 content to set
	 */
	public Field50F setComponent4(java.lang.Number component4) {
		setComponent(4, SwiftFormatUtils.getNumber(component4));
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
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field50F setComponent5(String component5) {
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
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field50F setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the component6.
	 * @param component6 the Number with the component6 content to set
	 */
	public Field50F setComponent6(java.lang.Number component6) {
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
	 * Same as getComponent(7)
	 */
	@Deprecated
	public java.lang.String getComponent7AsString() {
		return getComponent(7);
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field50F setComponent7(String component7) {
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
	 * Get the component8 as Number
	 * @return the component8 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent8AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(8));
	}

	/**
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field50F setComponent8(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the component8.
	 * @param component8 the Number with the component8 content to set
	 */
	public Field50F setComponent8(java.lang.Number component8) {
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
	 * Same as getComponent(9)
	 */
	@Deprecated
	public java.lang.String getComponent9AsString() {
		return getComponent(9);
	}

	/**
	 * Set the component9.
	 * @param component9 the component9 to set
	 */
	public Field50F setComponent9(String component9) {
		setComponent(9, component9);
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
       if (component == 4) {
           return true;
       }
       if (component == 5) {
           return true;
       }
       if (component == 6) {
           return true;
       }
       if (component == 7) {
           return true;
       }
       if (component == 8) {
           return true;
       }
       if (component == 9) {
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
	* @deprecated use constant Field50F	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field50F get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field50F) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field50F in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field50F get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field50F in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field50F> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field50F from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field50F> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field50F> result = new java.util.ArrayList<Field50F>(arr.length);
			for (final Field f : arr) {
				result.add((Field50F) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
