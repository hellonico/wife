
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
 * Field 29G<br /><br />
 *
 * validation pattern: 1n/33z[$1n/33z]0-8<br />
 * parser pattern: S/S[$S/S]0-8<br />
 * components pattern: NSNSNSNSNSNSNSNSNS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Number</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>Number</code></li> 
 * 		<li>component4: <code>String</code></li> 
 * 		<li>component5: <code>Number</code></li> 
 * 		<li>component6: <code>String</code></li> 
 * 		<li>component7: <code>Number</code></li> 
 * 		<li>component8: <code>String</code></li> 
 * 		<li>component9: <code>Number</code></li> 
 * 		<li>component10: <code>String</code></li> 
 * 		<li>component11: <code>Number</code></li> 
 * 		<li>component12: <code>String</code></li> 
 * 		<li>component13: <code>Number</code></li> 
 * 		<li>component14: <code>String</code></li> 
 * 		<li>component15: <code>Number</code></li> 
 * 		<li>component16: <code>String</code></li> 
 * 		<li>component17: <code>Number</code></li> 
 * 		<li>component18: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field29G extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 29G
	 */
    public static final String NAME = "29G";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_29G = "29G";
	public static final String PARSER_PATTERN ="S/S[$S/S]0-8";
	public static final String COMPONENTS_PATTERN = "NSNSNSNSNSNSNSNSNS";

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
	public Field29G() {
		super(18);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field29G(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		int componentCount = 1;
		for (String val : lines) {
		    setComponent(componentCount, SwiftParseUtils.getTokenFirst(val, "/"));
		    setComponent(componentCount+1, SwiftParseUtils.getTokenSecond(val, "/"));
		    componentCount = componentCount + 2;
		}
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(StringUtils.trimToEmpty(getComponent1()));
		result.append("/");
		result.append(StringUtils.trimToEmpty(getComponent2()));
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent3()) || org.apache.commons.lang.StringUtils.isNotEmpty(getComponent4())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent3()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent4()));
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent5()) || org.apache.commons.lang.StringUtils.isNotEmpty(getComponent6())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent5()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent6()));
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent7()) || org.apache.commons.lang.StringUtils.isNotEmpty(getComponent8())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent7()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent8()));
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent9()) || org.apache.commons.lang.StringUtils.isNotEmpty(getComponent10())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent9()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent10()));
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent11()) || org.apache.commons.lang.StringUtils.isNotEmpty(getComponent12())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent11()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent12()));
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent13()) || org.apache.commons.lang.StringUtils.isNotEmpty(getComponent14())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent13()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent14()));
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent15()) || org.apache.commons.lang.StringUtils.isNotEmpty(getComponent16())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent15()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent16()));
		}
		if (org.apache.commons.lang.StringUtils.isNotEmpty(getComponent17()) || org.apache.commons.lang.StringUtils.isNotEmpty(getComponent18())) {
			result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
			result.append(StringUtils.trimToEmpty(getComponent17()));
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent18()));
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
	 * Get the component1 as Number
	 * @return the component1 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent1AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field29G setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1.
	 * @param component1 the Number with the component1 content to set
	 */
	public Field29G setComponent1(java.lang.Number component1) {
		setComponent(1, SwiftFormatUtils.getNumber(component1));
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
	public Field29G setComponent2(String component2) {
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
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field29G setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Number with the component3 content to set
	 */
	public Field29G setComponent3(java.lang.Number component3) {
		setComponent(3, SwiftFormatUtils.getNumber(component3));
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
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field29G setComponent4(String component4) {
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
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field29G setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Number with the component5 content to set
	 */
	public Field29G setComponent5(java.lang.Number component5) {
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
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field29G setComponent6(String component6) {
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
	 * Get the component7 as Number
	 * @return the component7 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent7AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(7));
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field29G setComponent7(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the component7.
	 * @param component7 the Number with the component7 content to set
	 */
	public Field29G setComponent7(java.lang.Number component7) {
		setComponent(7, SwiftFormatUtils.getNumber(component7));
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
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field29G setComponent8(String component8) {
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
	 * Get the component9 as Number
	 * @return the component9 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent9AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(9));
	}

	/**
	 * Set the component9.
	 * @param component9 the component9 to set
	 */
	public Field29G setComponent9(String component9) {
		setComponent(9, component9);
		return this;
	}
	
	/**
	 * Set the component9.
	 * @param component9 the Number with the component9 content to set
	 */
	public Field29G setComponent9(java.lang.Number component9) {
		setComponent(9, SwiftFormatUtils.getNumber(component9));
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
	 * Set the component10.
	 * @param component10 the component10 to set
	 */
	public Field29G setComponent10(String component10) {
		setComponent(10, component10);
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
	 * Get the component11 as Number
	 * @return the component11 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent11AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(11));
	}

	/**
	 * Set the component11.
	 * @param component11 the component11 to set
	 */
	public Field29G setComponent11(String component11) {
		setComponent(11, component11);
		return this;
	}
	
	/**
	 * Set the component11.
	 * @param component11 the Number with the component11 content to set
	 */
	public Field29G setComponent11(java.lang.Number component11) {
		setComponent(11, SwiftFormatUtils.getNumber(component11));
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
	 * Same as getComponent(12)
	 */
	@Deprecated
	public java.lang.String getComponent12AsString() {
		return getComponent(12);
	}

	/**
	 * Set the component12.
	 * @param component12 the component12 to set
	 */
	public Field29G setComponent12(String component12) {
		setComponent(12, component12);
		return this;
	}

	/**
	 * Get the component13
	 * @return the component13
	 */
	public String getComponent13() {
		return getComponent(13);
	}

	/**
	 * Get the component13 as Number
	 * @return the component13 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent13AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(13));
	}

	/**
	 * Set the component13.
	 * @param component13 the component13 to set
	 */
	public Field29G setComponent13(String component13) {
		setComponent(13, component13);
		return this;
	}
	
	/**
	 * Set the component13.
	 * @param component13 the Number with the component13 content to set
	 */
	public Field29G setComponent13(java.lang.Number component13) {
		setComponent(13, SwiftFormatUtils.getNumber(component13));
		return this;
	}

	/**
	 * Get the component14
	 * @return the component14
	 */
	public String getComponent14() {
		return getComponent(14);
	}

	/**
	 * Same as getComponent(14)
	 */
	@Deprecated
	public java.lang.String getComponent14AsString() {
		return getComponent(14);
	}

	/**
	 * Set the component14.
	 * @param component14 the component14 to set
	 */
	public Field29G setComponent14(String component14) {
		setComponent(14, component14);
		return this;
	}

	/**
	 * Get the component15
	 * @return the component15
	 */
	public String getComponent15() {
		return getComponent(15);
	}

	/**
	 * Get the component15 as Number
	 * @return the component15 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent15AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(15));
	}

	/**
	 * Set the component15.
	 * @param component15 the component15 to set
	 */
	public Field29G setComponent15(String component15) {
		setComponent(15, component15);
		return this;
	}
	
	/**
	 * Set the component15.
	 * @param component15 the Number with the component15 content to set
	 */
	public Field29G setComponent15(java.lang.Number component15) {
		setComponent(15, SwiftFormatUtils.getNumber(component15));
		return this;
	}

	/**
	 * Get the component16
	 * @return the component16
	 */
	public String getComponent16() {
		return getComponent(16);
	}

	/**
	 * Same as getComponent(16)
	 */
	@Deprecated
	public java.lang.String getComponent16AsString() {
		return getComponent(16);
	}

	/**
	 * Set the component16.
	 * @param component16 the component16 to set
	 */
	public Field29G setComponent16(String component16) {
		setComponent(16, component16);
		return this;
	}

	/**
	 * Get the component17
	 * @return the component17
	 */
	public String getComponent17() {
		return getComponent(17);
	}

	/**
	 * Get the component17 as Number
	 * @return the component17 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent17AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(17));
	}

	/**
	 * Set the component17.
	 * @param component17 the component17 to set
	 */
	public Field29G setComponent17(String component17) {
		setComponent(17, component17);
		return this;
	}
	
	/**
	 * Set the component17.
	 * @param component17 the Number with the component17 content to set
	 */
	public Field29G setComponent17(java.lang.Number component17) {
		setComponent(17, SwiftFormatUtils.getNumber(component17));
		return this;
	}

	/**
	 * Get the component18
	 * @return the component18
	 */
	public String getComponent18() {
		return getComponent(18);
	}

	/**
	 * Same as getComponent(18)
	 */
	@Deprecated
	public java.lang.String getComponent18AsString() {
		return getComponent(18);
	}

	/**
	 * Set the component18.
	 * @param component18 the component18 to set
	 */
	public Field29G setComponent18(String component18) {
		setComponent(18, component18);
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
       if (component == 3) {
           return true;
       }
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
       if (component == 10) {
           return true;
       }
       if (component == 11) {
           return true;
       }
       if (component == 12) {
           return true;
       }
       if (component == 13) {
           return true;
       }
       if (component == 14) {
           return true;
       }
       if (component == 15) {
           return true;
       }
       if (component == 16) {
           return true;
       }
       if (component == 17) {
           return true;
       }
       if (component == 18) {
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
	* @deprecated use constant Field29G	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @returns null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field29G get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field29G) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field29G in the given message.
	 * @param msg may be empty or null
	 * @returns null if not found or msg is empty or null
	 * @see 	 */
	public static Field29G get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field29G in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see 	 */ 
	public static java.util.List<Field29G> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field29G from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field29G> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field29G> result = new java.util.ArrayList<Field29G>(arr.length);
			for (final Field f : arr) {
				result.add((Field29G) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
