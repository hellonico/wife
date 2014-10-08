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

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.time.DateFormatUtils;

import com.prowidesoftware.swift.io.writer.FINWriterVisitor;
import com.prowidesoftware.swift.model.BIC;
import com.prowidesoftware.swift.model.Tag;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Base class implemented by classes that provide a general access to field components.
 *
 * @author www.prowidesoftware.com
 * @since 6.0
 */
public abstract class Field implements PatternContainer {
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(Field.class.getName());

	/**
	 * Zero based list of field components in String format.<br />
	 * For example: for field content ":FOO//EUR1234 will be components[0]=FOO, components[1]=EUR and components[1]=1234
	 */
	protected List<String> components;

	/**
	 * @deprecated usar {@link #Field(int)}
	 */
	@Deprecated
	protected Field() {}

	/**
	 * Initialize a field with the given number of components. 
	 * Initialization is performed by setting the component to <code>null</code>
	 * 
	 * @param components the number of components to initialize
	 */
	protected Field (final int components) {
		this.components = new ArrayList<String>(components);
		for (int i=0;i<components;i++) {
			this.components.add(null);
		}
	}

	/**
	 * Implementation of toString using ToStringBuilder from commons-lang
	 */
	@Override
	public String toString() {
		try {
			return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this);
		} catch (final Exception e) {
			return super.toString();
		}
	}

	/**
	 * Implementation of equals using EqualsBuilder from commons-lang
	 */
	@Override
	public boolean equals(final Object obj) {
		return org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(this, obj);
	}

	/**
	 * Implementation of hashCode using HashCodeBuilder from commons-lang
	 */
	@Override
	public int hashCode() {
		return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
	}

	/**
	 * Format the given object as a money number without currency information in format
	 * @param aValue
	 * @return the formatted amount as String
	 */
	protected static String formatNumber(final Object aValue) {
		//create formatter for financial amounts
		final DecimalFormat fmt = new DecimalFormat("#,###.00");

		final NumberFormat f = NumberFormat.getInstance(Locale.getDefault());
		if (f instanceof DecimalFormat) {
			((DecimalFormat) f).setDecimalSeparatorAlwaysShown(true);
	        fmt.setDecimalFormatSymbols(((DecimalFormat) f).getDecimalFormatSymbols());
		}
		final String formatted = fmt.format(aValue);
		return formatted;
	}


	/**
	 * @param d Date object to format
	 * @return the formatted date as dd/MM/yyyy
	 */
	protected static String format(final Calendar d) {
		String valueDate = "";
		try {
			valueDate = DateFormatUtils.format(d.getTime(), "dd/MM/yyyy");
		} catch (final Exception ignored) {
		}
		return valueDate;
	}

	/**
	 * A formatted amount with a fixed format nnnn-nnnnn-nnn-n
	 * @param a string with an account number or <code>null</code>
	 * @return the formatted account or an empty String if param is <code>null</code>
	 */
	// TODO support user formatting masks from property file
	protected static String formatAccount(final String a) {
		if (a==null) {
			//be gentle with null
			return StringUtils.EMPTY;
		}
		final StringBuilder result = new StringBuilder(a);
		try {
			result.insert(4, '-');
			result.insert(9, '-');
			result.insert(12, '-');
		} catch (final Exception ignored) {}
		return result.toString();
	}

	/**
	 * Append each lines in a new lines, empty lines are ignored
	 * @param sb must not be null, target buffer
	 * @param lines may be null or empty, nothing is done in this case
	 */
	protected void appendInLines(final StringBuilder sb, final String... lines) {
		Validate.notNull(sb);
		if (lines==null) {
			log.finest("lines is null");
		} else {
			for (int i=0;i<lines.length;i++) {
				if (StringUtils.isNotBlank(lines[i])) {
					if ((i!=0) || ((i==0) && StringUtils.isNotBlank(sb.toString()))) {
						sb.append(FINWriterVisitor.SWIFT_EOL);
					}
					sb.append(lines[i]);
				}
			}
		}
	}

	/**
	 * Append each component between componentStart and componentEnd in a new lines, empty components are ignored
	 * @param sb must not be null, target buffer
	 * @param componentStart starting component number to add
	 * @param componentEnd ending component number to add
	 */
	protected void appendInLines(final StringBuilder sb, final int componentStart, final int componentEnd) {
		Validate.notNull(sb);
		boolean first = true;
		for (int i=componentStart; i<=componentEnd; i++) {
			final String c = getComponent(i);
			if (StringUtils.isNotBlank(c)) {
				if ((!first) || ((first) && StringUtils.isNotBlank(sb.toString()))) {
					sb.append(FINWriterVisitor.SWIFT_EOL);
				}
				sb.append(c);
				first = false;
			}
		}
	}

	/**
	 * @return comopnents list
	 */
	public List<String> getComponents() {
		return components;
	}

	/**
	 * @param components list to set
	 */
	public void setComponents(final List<String> components) {
		this.components = components;
	}

	/**
	 * Inserts a component String value into the list of components, using the component number to position the value into the List.
	 * @param number component number, first component of a field should be number one
	 * @param value String value of the parsed component (without component separators ':', '/', '//')
	 */
	public void setComponent(final int number, final String value) {
		Validate.isTrue(number>0, "component number is 1-based");

		//internal position index is zero based
		final int position = number - 1;

		if (this.components == null) {
			this.components = new ArrayList<String>();
		}
		if (position >= 0) {
			if (position >= this.components.size()) {
				//TODO deal with this error
			} else {
				this.components.set(position, value);
			}
		} else {
			log.severe("components are named starting at 1, cannot insert a component with number "+number);
		}
	}

	/**
	 * Gets a specific component from the components list.
	 * @param number number component number, first component of a field should be number one
	 * @return found component or <code>null</code>
	 */
	public String getComponent(final int number) {
		//internal position index is zero based
		final int position = number - 1;

		if (this.components != null) {
			if ((position >= 0) && (position < this.components.size())) {
				return this.components.get(position);
			}
		}
		return null;
	}

	/**
	 * Get a localized, suitable for showing to humans string of the field values
	 * @return s
	 */
	public String getValueDisplay() {
		// FIXME esta clase debe ser abstracta, ahora es asi porque se implementan solo un par por falta de tiempo
		return null;
	}

	/**
	 * Get the given component as the given object type.
	 * If the class is not recognized, it returns null, as well as if conversion fails.
	 * @throws IllegalArgumentException if c is not any of: String, BIC, Currency, Number, BigDecimal Character or Integer
	 */
	public Object getComponentAs(final int component, @SuppressWarnings("rawtypes") final Class c) {
		try {
			final String s = getComponent(component);
			log.finest("converting string value: "+s);

			if (c.equals(String.class)) {
				return s;

			} else if (c.equals(Number.class) || c.equals(BigDecimal.class) ) {
				return SwiftFormatUtils.getNumber(s);

			} else if (c.equals(BIC.class)) {
				return new BIC(s);

			} else if (c.equals(Currency.class)) {
				return Currency.getInstance(s);

			} else if (c.equals(Character.class)) {
				return SwiftFormatUtils.getSign(s);

			} else if (c.equals(Integer.class)) {
				return Integer.valueOf(s);

			} else {
				throw new IllegalAccessException("Can't handle "+c.getName());
			}
		} catch (final Exception e) {
			log.severe("Error converting component content: "+e);
		}
		return null;
	}

	/**
	 * Returns a string with joined components values.
	 *
	 * @param start starting index of components to join (zero based)
	 * @param skipLast if true the last component will not be included in the join, and where
	 * the "last" component is understood as the last not empty component (this is not necessary
	 * the last component of the field's component list.
	 *
	 * @return s
	 */
	public String joinComponents(final int start, final boolean skipLast) {
		final StringBuffer result = new StringBuffer();
		if (start >= 0) {
			String toAdd = "";
			int i=start;
			while ((i<components.size()) && StringUtils.isNotEmpty(components.get(i))) {
				//add previous component to result
				result.append(toAdd);
				//setup variables
				toAdd = components.get(i);
				i++;
			}
			if (!skipLast) {
				result.append(toAdd);
			}
		}
		return result.toString();
	}

	/**
	 * Returns a string with all field's components joined.
	 * @param skipLast
	 * @return s
	 * @see #joinComponents(int, boolean)
	 */
	public String joinComponents(final boolean skipLast) {
		return joinComponents(0, skipLast);
	}

	/**
	 * Returns a string with all field's components joined
	 * @param start
	 * @return s
	 * @see #joinComponents(int, boolean)
	 */
	public String joinComponents(final int start) {
		return joinComponents(start, false);
	}

	/**
	 * Returns a string with all field's components joined.
	 * @return s
	 * @see #joinComponents(int, boolean)
	 */
	public String joinComponents() {
		return joinComponents(0, false);
	}

	/**
	 * Gets a BigDecimal from a generic Number argument
	 * @param number
	 * @return BigDecimal value of number parameter
	 */
	static public BigDecimal getAsBigDecimal(final Number number) {
		if (number instanceof BigDecimal) {
			return (BigDecimal)number;
		} else if (number instanceof Long) {
			return new BigDecimal(((Long)number).longValue());
		} else if (number instanceof Integer) {
			return new BigDecimal(((Integer)number).intValue());
		} else if (number instanceof Short) {
			return new BigDecimal(((Short)number).intValue());
		} else if (number instanceof Double) {
			return new BigDecimal(number.toString());
		} else {
			throw new IllegalArgumentException("class "+number.getClass().getName()+" is not supported");
		}
	}

	/**
	 * Returns the first component starting with the given prefix value or <code>null</code> if not found.
	 * @param prefix
	 * @return s
	 */
	public String findComponentStartingWith(final String prefix) {
		for (int i=0; i<this.components.size(); i++) {
			final String c = this.components.get(i);
			if (StringUtils.startsWith(c, prefix)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * Finds the first component starting with the given codeword between slashes, and returns the component subvalue.
	 * For example, for the following field value<br />
	 * /ACC/BLABLABLA CrLf<br />
	 * //BLABLABLA CrLf<br />
	 * /INS/CITIUS33MIA CrLf<br />
	 * //BLABLABLA CrLf<br />
	 * A call to this method with parameter "INS" will return "CITIUS33MIA"
	 *
	 * @param codeword
	 * @see #findComponentStartingWith(String)
	 * @return the found value or <code>null</code> if not found
	 */
	public String getValueByCodeword(final String codeword) {
		final String key = "/"+codeword+"/";
		final String c = findComponentStartingWith(key);
		if (c != null) {
			return StringUtils.substringAfter(c, key);
		}
		return null;
	}

	/**
	 * Serializes the fields' components into the single string value (SWIFT format).
	 * Must be overwritten by by subclasses.
	 * @return SWIFT formatted value
	 */
	public String getValue() {
		return joinComponents();
	}

	/**
	 * Returns true if all field's components are blank or null
	 * @return true if all field's components are blank or null
	 */
	public boolean isEmpty() {
		for (final String c : getComponents()) {
			if ((c != null) && StringUtils.isNotBlank(c)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Creates a Field instance for the given Tag object, using reflection.
	 * The created object is populated with parsed components data from the Tag.
	 * @param t a tag with proper name and value content
	 * @return a specific field object, ex: Field32A. Or <code>null</code> if exceptions occur during object creation.
	 */
    static public Field getField(final Tag t) {
		Object r = null;
		try {
			final Class<?> c = Class.forName("com.prowidesoftware.swift.model.field.Field"+ t.getName());
		    final Class[] argsClass = new Class[] { String.class };
	        final Constructor ct = c.getConstructor(argsClass);
	        final Object arglist[] = new Object[] { t.getValue() };
			r = ct.newInstance(arglist);
		} catch (final Exception e) {
			log.warning("Error creating an instance of Field"+ t.getName() + " MISSING FIELD CLASS: "+e);
		}
		return (Field) r;
    }

    /**
	 * Returns the field business description using the default locale for the resource bundle.
	 * @see #getLabel(Locale)
	 */
	public String getLabel() {
		return getLabel(Locale.getDefault());
	}

	/**
	 * Returns the field business description name, using resource bundle from pw_swift_labels property files.
	 * @param locale the locale for which a resource bundle is desired
	 * @return a resource bundle based label for the given locale or the tag name, or the resource key if not found
	 */
	public String getLabel(final Locale locale) {
		return getLabel(getName(), locale);
	}

	/**
	 * @see #getLabel(String, String, String, Locale)
	 */
	static public String getLabel(final String fieldName, final Locale locale) {
		return getLabel(fieldName, null, null, locale);
	}

	/**
	 * Returns the field business description name, using resource bundle from pw_swift_labels property files.
	 * Field names may be generic for all usages, or may differ for particular letter option, message type
	 * or even sequence of a message type. The property supports all this kind of definitions with generic
	 * labels and specific ones. The following example illustrate the precedence of bundle keys that are checked for
	 * field 50:<br />
	 * <ul>
	 * <li>50K[103][B]</li>
	 * <li>50a[103][B]</li>
	 * <li>50K[103]</li>
	 * <li>50a[103]</li>
	 * <li>50K</li>
	 * <li>50a</li>
	 * <li>50</li>
	 * </ul>
	 *
	 * @param fieldName field name of the field to retrieve its label, if the combination of number and letter option
	 * is provided then a specific label is returned; is the letter option is omitted then a more generic label is returned.
	 * @param mt optional indication of message type or <code>null</code>.
	 * @param sequence optional indication of sequence or <code>null</code>.
	 * @param locale the locale for which a resource bundle is desired
	 *
	 * @return a resource bundle based label for the given locale or the tag name, or the resource key if not found
	 */
	static public String getLabel(final String fieldName, final String mt, final String sequence, final Locale locale) {
		final String bundle = "pw_swift_labels";
		String key = null;
		String result = null;
		//try {
			final ResourceBundle labels = ResourceBundle.getBundle(bundle, locale);
			if (labels != null) {
				if ((sequence != null) && (mt != null)) {
					key = "field" + fieldName + "["+mt+"]["+sequence+"].name";
					result = getString(labels, key);
					if (result == null) {
						key = "field" + getNumber(fieldName) + "a["+mt+"]["+sequence+"].name";
						result = getString(labels, key);
					}
				}
				if ((result == null) && (mt != null)) {
					key = "field" + fieldName + "["+mt+"]["+sequence+"].name";
					result = getString(labels, key);
					if (result == null) {
						key = "field" + getNumber(fieldName) + "a["+mt+"].name";
						result = getString(labels, key);
					}
				}
				if (result == null) {
					key = "field" + fieldName + ".name";
					result = getString(labels, key);
					if (result == null) {
						key = "field" + getNumber(fieldName) + "a.name";
						result = getString(labels, key);
					}
				}
				if (result == null) {
					key = "field" + getNumber(fieldName) + ".name";
					result = getString(labels, key);
				}
			}
		//} catch (MissingResourceException e) {
		//	e.printStackTrace();
		//}
		if (result != null) {
			return result;
		}
		return key;
	}

	/**
	 * Helper implementation of getString from bundle without throwing exception
	 * @param labels
	 * @param key
	 * @return the found resource or <code>null</code> if not found for the given key
	 */
	private static String getString(final ResourceBundle labels, final String key) {
		try {
			return labels.getString(key);
		} catch (final MissingResourceException e) {
			return null;
		}
	}

	private static String getNumber(final String fieldName) {
		if (fieldName != null) {
			final StringBuffer sb = new StringBuffer();
			for (int i=0; i<fieldName.length(); i++) {
				final char c = fieldName.charAt(i);
				if (Character.isDigit(c)) {
					sb.append(c);
				}
			}
			if (sb.length() > 0) {
				return sb.toString();
			}
		}
		return null;
	}

	/**
	 * Returns the field's name composed by the field number and the letter option (if any)
	 * @returns the static value of FieldNN.NAME  
	 */
	public abstract String getName();

	abstract public boolean isOptional(int component);
	abstract public boolean isGeneric();

	/**
	 * Moved to GenericField Interface
	 */
	@Deprecated
	public String getDSS() {
		return null;
	}

	/**
	 * Moved to GenericField Interface
	 */
	@Deprecated
	public boolean isDSSPresent() {
		return false;
	}

	/**
	 * Moved to GenericField Interface
	 */
	@Deprecated
	public String getConditionalQualifier() {
		return null;
	}

	// FIXME debido a esto: el nombre del field deberia ser validado y eliminado como atributo dinamico
	/**
	 * Return the letter option of this field as given by it classname or <code>null</code> if this field has no letter option
	 */
	public Character letterOption() {
		final String cn = getClass().getName();
		final char c = cn.charAt(cn.length()-1);
		if (Character.isLetter(c)) {
			return c;
		}
		return null;
	}

	/**
	 * Tell if this field is of a given letter option.
	 * letter is case sensitive
	 */
	public boolean isLetterOption(final char c) {
		final Character l = letterOption();
		if (l!=null) {
			return l.charValue() == c;
		}
		return false;
	}

	/**
	 * 
	 * @param names must not be null nor empty
	 * @return <code>true</code> if this field names equals one in the list of names and <code>false</code>
	 *  in other case
	 * @throws IllegalArgumentException if names is null or empty
	 * @deprecated confusing name, use {@link #isNameAnyOf(String...)} instead
	 * @see #isNameAnyOf(String...)
	 */
	public boolean isAnyOf(String ... names) {
		Validate.isTrue(names != null && names.length>0, "name list must have at least one element");
		for (final String n:names) {
			if (StringUtils.equals(getName(), n)) 
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param names must not be null nor empty
	 * @return <code>true</code> if this field names equals one in the list of names and <code>false</code>
	 *  in other case
	 * @throws IllegalArgumentException if names is null or empty
	 * 
	 */
	public boolean isNameAnyOf(String ... names) {
		Validate.isTrue(names != null && names.length>0, "name list must have at least one element");
		for (final String n:names) {
			if (StringUtils.equals(getName(), n)) 
				return true;
		}
		return false;
	}

	/**
	 * Compare the value of the component1 of this field with <code>compare</code>
	 */
	public boolean is(String compare) {
		return StringUtils.equals(compare, getComponent(1));
	}
	
	/**
	 * Compare the value of the component1 of this field with <code>compare1</code> and the value of component2 with <code>compare2</code> 
	 */
	public boolean is(final String compare1, final String compare2) {
		return StringUtils.equals(compare1, getComponent(1)) && StringUtils.equals(compare2, getComponent(2));
	}
	
	/**
	 * Get the generic tag object of this field.
	 */
	public Tag asTag() {
		return new Tag(getName(), getValue());
	}
}
