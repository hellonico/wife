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
*/
/*
 * Created on Sep 23, 2005 
 */
package com.prowidesoftware.swift.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.logging.Level;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;

import com.prowidesoftware.swift.model.field.Field;

/**
 * Base class for SWIFT blocks that contain and arbitrary <b>set of fields</b> (3, 4, 5 and user blocks).<br>
 * Specific block classes for each block should be instantiated.
 *
 * @author www.prowidesoftware.com
 * @since 4.0
 */
public class SwiftTagListBlock extends SwiftBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SwiftTagListBlock.class.getName());

	/**
	 * Contains instances of Tag in this block, used to store the block's fields.
	 * @see Tag
	 */
	protected List<Tag> tags = new ArrayList<Tag>();

	/**
	 * Default constructor, shouldn't be used normally.
	 * present only for subclasses
	 */
	public SwiftTagListBlock() {

	}
	/**
	 * Intended to be used by search results in this class
	 */
	public SwiftTagListBlock(List<Tag> tags) {
		this();
		this.tags = tags;
	}

	/**
	 * Empty iterator to be used when an API that returns an Iterator does not return <code>null</code>.
	 */
	private static final class EmptyItr implements Iterator<Tag> {
		public boolean hasNext() {
			return false;
		}

		public Tag next() {
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException("Can't remove on an empty iterator");
		}
	}

	/**
	 * Tells if this block contains a tag with the given name.
	 * <p><em>exact tagname match only</em></p>
	 * <p>This method iterates throw tags and checks the name to be matched against the given tagname.
	 * Thus, it will not distinguish between tags that appear only one time and tags that appear 
	 * in multiple instances.</p>
	 * 
	 * 
	 * @param tagName fieldname to search, like "32A" or "58"
	 * @return <code>true</code> if the given field has been set on this block
	 *         or <code>false</code> in other case
	 * @throws IllegalArgumentException if parameter tagName is <code>null</code>
	 */
	public boolean containsTag(final String tagName) {
		// sanity check
		Validate.notNull(tagName, "parameter 'tagName' cannot not be null");

		for (final Iterator<Tag> it = tags.iterator(); it.hasNext();) {
			final Tag t = (Tag)it.next();
			if (t.getName() != null && t.getName().equals(tagName)) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * Gets the value of the given tag or <code>null</code> if that tagname is not found.<br>
	 * NOTE: if the tag is present more than once, then this method retrieves the value of the first occurrence
	 * 
	 * @param key name of the tag, example: 13C (case sensitive)
	 * @return a String containing the value <code>null</code> if the tag is not set
	 * @throws IllegalArgumentException if parameter key is <code>null</code>
	 */
	public String getTagValue(final String key) {
		// sanity check
		Validate.notNull(key, "parameter 'key' cannot not be null");

		// just try to get the tag (containsTag => getTagByName runs the list twice)
		final Tag tag = this.getTagByName(key);
		return (tag != null ? tag.getValue() : null);
	}

	/**
	 * Iterate through tags in this block and return the first tag whose name matches key, 
	 * or <code>null</code> if none is found.
	 * 
	 * @param key name of the tag to search
	 * @return the tag containing the given key or <code>null</code> if it is not found
	 * @throws IllegalArgumentException if parameter key is <code>null</code>
	 */
	public Tag getTagByName(final String key) {
		// sanity check
		Validate.notNull(key, "parameter 'key' cannot not be null");

		// scan the list
		for (final Iterator<Tag> it = tags.iterator(); it.hasNext();) {
			final Tag f = (Tag) it.next();
			if ((f.getName()!=null) && f.getName().equals(key)) {
				return f;
			}
		}
		return null;
	}

	/**
	 * Similar to #getFieldByName(String, String) except that it also adds the check of matching component2
	 * @see #getFieldByName(String, String)
	 * @since 7.5
	 */
	public Field getFieldByName(final String fieldname, final String being, String component2) {
		Validate.notNull(fieldname, "parameter 'key' cannot not be null");

		// scan the list
		for (final Iterator<Tag> it = tags.iterator(); it.hasNext();) {
			final Tag t = (Tag) it.next();
			if ((t.getName()!=null) && t.getName().equals(fieldname)) {
				final Field f = t.getField();
				if (f.is(being) && StringUtils.equals(f.getComponent(2), component2)) {
					return f;
				}
			}
		}		
		return null;
	}
	/**
	 * Get the first field with the given name whose component 1 matched 'being' 
	 * 
	 * @param fieldname <em>EXACT name only</em>. 'a' notation <em>NOT SUPPORTED</em>
	 * @param being the string to match, may be <code>null</code>. 
	 * @return the first field found or <code>null</code> if none found
	 * 
	 * @since 7.5
	 * @see Field#is(String)
	 * @throw {@link IllegalArgumentException} if key is <code>null</code>
	 */
	public Field getFieldByName(final String fieldname, final String being) {
		Validate.notNull(fieldname, "parameter 'key' cannot not be null");

		// scan the list
		for (final Iterator<Tag> it = tags.iterator(); it.hasNext();) {
			final Tag t = (Tag) it.next();
			if ((t.getName()!=null) && t.getName().equals(fieldname)) {
				final Field f = t.getField();
				if (f.is(being)) {
					return f;
				}
			}
		}		
		return null;
	}
	/**
	 * Shortcut to {@link #getTagByName(String)}.getField()
	 * @param key
	 */
	public Field getFieldByName(final String key) {
		final Tag r = getTagByName(key);
		if (r!=null)
			return r.getField();
		return null;
	}
	/**
	 * Gets the internal List of tags in block.
	 * @return a List of Tag
	 * @see Tag
	 */
	public List<Tag> getTags() {
		return (this.tags);
	}

	/**
	 * Adds a tag to this block.
	 * 
	 * @param t the tag to add
	 * @throws IllegalArgumentException if parameter t is <code>null</code>
	 */
	public void addTag(final Tag t) {
		// sanity check
		Validate.notNull(t, "parameter 't' cannot not be null");

		if (log.isLoggable(Level.FINE)) {
			log.fine("Adding Tag [" + t + "]");
		}
		if (this.tags == null) {
			this.tags = new ArrayList<Tag>();
		}
		this.tags.add(t);
	}
	
	public void add(Field f) {
		addTag(new Tag(f.getName(), f.getValue()));
	}

	/**
	 * @deprecated renamed to {@link #countByName(String)}
	 * @see #countByName(String)
	 */
	public int getTagCount(final String key) {
		return countByName(key);
	}
	
	/**
	 * Counts how many tags with the given name are present in the block.
	 * 
	 * @param tagname the name of the tag
	 * @return the amount of tags with the given name in the block
	 * @throws IllegalArgumentException if tagname key is <code>null</code>
	 */
	public int countByName(final String tagname) {
		// sanity check
		Validate.notNull(tagname, "parameter 'key' cannot not be null");

		// count the matches
		int count = 0;
		if (this.tags != null) {
			for (final Iterator<Tag> it = tags.iterator(); it.hasNext();) {
				final Tag f = (Tag) it.next();
				if (f.getName().equals(tagname)) {
					count++;
				}
			}
		}
		return count;
	}
	
	/**
	 * Gets all values for a given tagname. The tag list is searched in order, all tag 
	 * values matching the name of the given key are added to the resulting array.
	 * <em>NOTE:</em> the resulting array may be empty if no tagname is matched. 
	 * 
	 * @param key name of the tag to be searched, case sensitive
	 * @return and array containing the values of all the instances of the tag
	 * @throws IllegalArgumentException if parameter key is <code>null</code>
	 */
	public String[] getTagValues(final String key) {
		// sanity check
		Validate.notNull(key, "parameter 'key' cannot not be null");

		final ArrayList<String> ret = new ArrayList<String>();
		if (this.tags != null) {
			for (final Iterator<Tag> it = tags.iterator(); it.hasNext();) {
				final Tag f = it.next();
				if (f.getName().equals(key)) {
					ret.add(f.getValue());
				}
			}
		}

		return ((String[]) ret.toArray(new String[ret.size()]));
	}

	/**
	 * convert this to string
	 */
	public String toString() {
		return new StringBuilder()
			.append(getClass().getName()).append("[")
		.append(tags == null ? "tags=null" : tags.toString())
		.append("]")
		.toString();
	}

	/**
	 * Gets a Map that contains the the fields names as keys and the values as map value.
	 * If a field is present more than once, then the first instance is processed and the rest is ignored.
	 * 
	 * @return a Map with tagname as key and values or <code>null</code> if there are not tags in the block
	 */
	public Map<String, String> getTagMap() {
		if (this.tags != null) {
			final Map<String, String> m = new HashMap<String, String>(tags.size());
			for (final Iterator<Tag> it = tags.iterator(); it.hasNext();) {
				final Tag f = (Tag) it.next();
				if (!m.containsKey(f.getName())) {
					m.put(f.getName(), f.getValue());
				}
			}
			return m;
		}
		return null;
	}

	/**
	 * Remove the tag with the given name in the block.
	 * If more than one instance of the given name is 
	 * found the first instance is removed while the 
	 * rest remains untouched.
	 * 
	 * @param tag name of the tag to remove must not be null 
	 * @return the value of the removed tag
	 * @throws IllegalArgumentException if parameter tag is <code>null</code>
	 * @see #removeAll(String)
	 */
	public String removeTag(final String tag) {
		// sanity check
		Validate.notNull(tag, "parameter 'tag' cannot not be null");

		if (this.tags != null) {
			int i = 0;
			for (final Iterator<Tag> it = tags.iterator(); it.hasNext();) {
				final Tag t = (Tag) it.next();
				if (t.getName() != null && t.getName().equals(tag)) {
					final Tag r = tags.remove(i);
					return r.getValue();
				}
				i++;
			}
		}
		return null;
	}

	/**
	 * Remove all tags in the current block that match the given name.
	 * If name is an invalid tag no error is thrown. There is no difference by using this method
	 * to tell if a tag was present or not. for quering the block for existing tags 
	 * {@link #containsTag(String)} must be used. 
	 * 
	 * @param name the name of the tag to remove. may be <code>null</code> in which case the tags containing 'block data' will be removed
	 * @return the amount of tags removed
	 * @throws IllegalArgumentException if parameter name is <code>null</code>
	 * @see #removeTag(String)
	 */
	public int removeAll(final String name) {
		// sanity check
		Validate.notNull(name, "parameter 'name' cannot not be null");

		int removed = 0;
		final Tag[] matching = getTagsByName(name);
		for (int i = 0; i < matching.length; i++) {
			this.tags.remove(matching[i]);
			removed++;
		}
		return removed;
	}

	/**
	 * Get a reference to tags in the block that match the given tag name.
	 * If name is <code>null</code> all tags that contain block data will be returned.
	 * If no tag is found an empty array is returned.
	 * 
	 * @param name the name of the tag to search in this block
	 * @return an array of tags or an empty array if no tags are found
	 * @throws IllegalArgumentException if parameter name is <code>null</code>
	 */
	public Tag[] getTagsByName(final String name) {
		// sanity check
		Validate.notNull(name, "parameter 'name' cannot not be null");

		final List<Tag> l = new ArrayList<Tag>();
		for (final Iterator<Tag> it = this.tags.iterator(); it.hasNext();) {
			final Tag t = (Tag) it.next();
			if (t.getName() == null && name == null) {
				l.add(t);
			}
			if (t.getName() != null && name != null && t.getName().equals(name)) {
				l.add(t);
			}
		}
		return (Tag[]) l.toArray(new Tag[l.size()]);
	}

	/**
	 * Similar to {@link #getTagsByName(String)}
	 * <em>NOTE: supports 'a' wildcard. If 95a is given, all 95, 95K, 95J fields will be returned.</em>.
	 * This is case sensitive.
	 * @throws IllegalArgumentException if name is null
	 * @return an array of matched fields or an empty array if none found
	 */
	public Field[] getFieldsByName(final String name) {
		// sanity check
		Validate.notNull(name, "parameter 'name' cannot not be null");

		final boolean wildcard;
		final String search;
		if (name.endsWith("a")) {
			wildcard = true;
			search = name.substring(0, name.length()-1);
		} else {
			wildcard = false;
			search = name;
		}
		final List<Field> l = new ArrayList<Field>();
		for (final Iterator<Tag> it = this.tags.iterator(); it.hasNext();) {
			final Tag t = (Tag) it.next();
			if ((wildcard && StringUtils.startsWith(t.getName(), search))
					|| StringUtils.equals(t.getName(), name)) {
				final Field field = t.getField();
				if (field == null) {
					log.warning("Could not create field instance of "+t);
				} else {
					l.add(field);
				}
			}
		}
		// FIXME returns correcly empty array?
		return (Field[]) l.toArray(new Field[l.size()]);
	}

	/**
	 * Gets a Iterator for the tags in this block or <code>null</code> if no tags are present on the block an empty iterator is returned.
	 * 
	 * @return an Iterator that may or may not contain objects of type Tag
	 * @see Tag
	 */
	public Iterator<Tag> tagIterator() {
		if (this.tags == null || this.tags.isEmpty()) {
			if (log.isLoggable(Level.FINE)) {
				log.fine("No tags in block, returning empty iterator");
			}
			return new EmptyItr();
		}
		return this.tags.iterator();
	}

	/**
	 * Gets the Tag of the given index in this block, the position is zero-based.
	 * 
	 * @param i the index position of the tag to retrieve
	 * @return the Tag at the given index
	 * @throws IndexOutOfBoundsException if the index is invalid
	 * @see List#get(int)
	 */
	public Tag getTag(final int i) {
		return (Tag) this.tags.get(i);
	}

	/**
	 * shortcut to {@link #getTag(int)}.getField()
	 * @param i
	 * @throws NullPointerException if the tag with the given index does not exist
	 */
	public Field getField(final int i) {
		return this.tags.get(i).getField();
	}
	
	/**
	 * Add all tags in the List argument to the current blocks. Current tags will not be removed.
	 * @param tags the list of tags to add
	 * @throws IllegalArgumentException if parameter name is <code>null</code>
	 */
	public void addTags(final List<Tag> tags) {
		// sanity check
		Validate.notNull(tags, "parameter 'tags' cannot not be null");
		Validate.allElementsOfType(tags, Tag.class, "parameter 'tags' may only have Tag elements");
		
		thisTagsNotNull().addAll(tags);
	}

	/**
	 * returns this.tags checking before if it is null, and then creating a new arraylist for it
	 */
	private List<Tag> thisTagsNotNull() {
		if (this.tags == null) {
			this.tags = new ArrayList<Tag>();
		}
		return this.tags;
	}
	/**
	 * @deprecated use {@link #countAll()} instead
	 * @return
	 */
	public int getTagCount() {
		return countAll();
	}
	/**
	 * Gets the amount of tags in this taglist
	 * @return zero or the amount of tags contained in the block
	 */	public int countAll() {
		return (this.tags == null ? 0 : tags.size());
	}

	/**
	 * Set the list of tags of this block.
	 * NOTE that the order of the tags in the list is the order that really matters.
	 * 
	 * @param tags the tags of the block, may be <code>null</code> to remove all the tags of the block
	 * @throws IllegalArgumentException if parameter tags is not <code>null</code> and contains elements of class other than Tag
	 */
	public void setTags(final List<Tag> tags) {
		// sanity check
		if (tags != null) {
			Validate.allElementsOfType(tags, Tag.class, "parameter 'tags' may only have Tag elements");
		}
		this.tags = tags;
	}
	
	/**
	 * @param tags tags to set
	 * @see #setTags(List)
	 */
	public void setTags(final Tag[] tags) {
		setTags(Arrays.asList(tags));
	}

	/**
	 * Tells if the block contains at least one Tag.
	 * 
	 * @return <code>true</code> if the block contains at least one Tag and <code>false</code> in other case
	 */
	public boolean isEmpty() {
		return (this.tags == null || this.tags.isEmpty());
	}

	/**
	 * Tells the amount of fields contained in the block, may be zero.
	 * @return zero if tags is null or empty or the amount of tags in this object
	 */
	public int size() {
		return (this.tags == null ? 0 : this.tags.size());
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		return result;
	}

	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final SwiftTagListBlock other = (SwiftTagListBlock) obj;
		if (tags == null) {
			if (other.tags != null) {
				return false;
			}
		} else if (!tags.equals(other.tags)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Iterates the internal list of tags and returns true if there is at least one tag with the given number <code>i</code>
	 * This method is useful to search any variant of a tag
	 * <code>containsTag(58)</code> will return <code>true</code> if there is any variant of 58A, 58D, or so.
	 * 
	 * @param i the tag number to search in tags
	 * @return <code>true</code> if there is a tag with the given number, no matter if the tag is or not a letter option (letter option may be any or empty)
	 */
	public boolean containsTag(int i) {
		if (this.tags == null || this.tags.isEmpty())
			return false;
		for (Iterator<Tag> it = tags.iterator() ; it.hasNext() ; ) {
			Tag t = (Tag) it.next();
			if (t.isNumber(i)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Search and retrieve the first tag with the given number.
	 * <em>NOTE: requesting tag 58 will return either 58, 58A or 58D if present</em>
	 * 
	 * @param i the tagname to search
	 * @return the first tag with the given number or <code>null</code> if no tag is found.
	 * @see #containsTag(int)
	 */
	public Tag getTagByNumber(int i) {
		if (this.tags != null && !this.tags.isEmpty()) {
			for (Iterator<Tag> it = tags.iterator() ; it.hasNext() ; ) {
				Tag t = (Tag) it.next();
				if (t.isNumber(i)) {
					return t;
				}
			}
		}
		return null;
	}
	
	/**
	 * Search and retrieve the first Field with the given number.
     * <em>NOTE: requesting tag 58 will return either 58, 58A or 58D if present</em>
	 * @param num the field number to search
	 * @return the first instance of the given field in the message or null if none is found
	 * @see #getTagByNumber(int)
	 */
	public Field getFieldByNumber(int num) {
		final Tag t = getTagByNumber(num);
		if (t != null)
			return t.getField();
		return null;
	}
	
	/**
	 * get all tags of a given number.
	 * Useful to deal with 95a type or requests.
	 * 
	 * @return the tags matching the given number or an <em>empty list</em> if none found.
	 *  
	 * @see #getTagByNumber(int)
	 * @see Tag#getNumber()
	 */
	public List<Tag> getTagsByNumber(int i) {
		if (this.tags == null || this.tags.isEmpty()) 
			return Collections.emptyList();
		
		final List<Tag> result = new ArrayList<Tag>();
		for (final Iterator<Tag> it = tags.iterator() ; it.hasNext() ; ) {
			final Tag t = (Tag) it.next();
			if (t.isNumber(i)) {
				result.add(t);
			}
		}
		return result;
	}
	

	/**
	 * get all Fields of a given number.
	 * Useful to deal with 95a type or requests.
	 * 
	 * @return the fields matching the given number or an <em>empty list</em> if none found.
	 *  
	 * @see #getTagByNumber(int)
	 * @see Tag#getNumber()
	 * @see Tag#isNumber(int)
	 */
	public List<? extends Field> getFieldsByNumber(int i) {
		if (this.tags == null || this.tags.isEmpty()) 
			return Collections.emptyList();
		
		final List<Field> result = new ArrayList<Field>();
		for (final Iterator<Tag> it = tags.iterator() ; it.hasNext() ; ) {
			final Tag t = (Tag) it.next();
			if (t.isNumber(i)) {
				final Field f = t.getField();
				if (f == null) {
					throw new RuntimeException("Unable to create field for tagname "+t.getName());
				} else {
					result.add(f);
				}
			}
		}
		return result;
	}
	
	/**
	 * Get the first field with the given number and that {@link Field#is(String)} the value in <em>being</em>.
	 * This is intended to match calling 
	 * <code>getFieldByNumber(95, "FOO")</code> will match all these:
	 * <ul>
	 * 	<li>95:FOO</li>
	 * 	<li>95A:FOO</li>
	 * 	<li>95K:FOO</li>
	 * </ul>
	 * 
	 * @return the first matching field
	 */
	public Field getFieldByNumber(int number, String being) {
		if (this.tags == null || this.tags.isEmpty()) 
			return null;
		
		for (final Iterator<Tag> it = tags.iterator() ; it.hasNext() ; ) {
			final Tag t = (Tag) it.next();
			if (t.isNumber(number)) {
				final Field f = t.getField();
				if (f == null) {
					throw new RuntimeException("Unable to create field for tagname "+t.getName());
				} else {
					if (f.is(being)) {
						return f;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Returns the tags having the exact specified content as value.<br />
	 * For example the field :98A::XDTE//20090818 will be included for parameter :XDTE//20090818
	 * 
	 * @param value value of tags to find
	 * @return an list of tags or an empty list if no tags are found
	 * 
	 * @since 6.0
	 */
	public List<Tag> getTagsByValue(final String value) {
		List<Tag> result = new ArrayList<Tag>();
		for (int i=0;i<this.tags.size();i++) {
			Tag t = (Tag)this.tags.get(i);
			if (StringUtils.equals(value, t.getValue())) {
				result.add(t);
			}
		}
		return result;
	}
	
	/**
	 * Returns the tags having the specified content as part of its value.<br />
	 * For example the field :98A::XDTE//20090818 will be included for parameter XDTE
	 * 
	 * @param value value of tags to find
	 * @return an list of tags or an empty list if no tags are found
	 * 
	 * @since 6.0
	 */
	public List<Tag> getTagsByContent(final String value) {
		List<Tag> result = new ArrayList<Tag>();
		for (int i=0;i<this.tags.size();i++) {
			Tag t = (Tag)this.tags.get(i);
			if (StringUtils.contains(t.getValue(), value)) {
				result.add(t);
			}
		}
		return result;
	}
	
	/**
	 * Get all sub blocks using the starting and ending Tags as block boundaries.
	 * The starting and end tags are included in the resulting sub blocks.
	 * 
	 * @param start starting tag
	 * @param end ending tag
	 * @return a list of <code>SwiftTagListBlock</code> new blocks containing the found tags (the list can be empty if no tags are found)
	 * 
	 * @since 6.0
	 */
	public List<SwiftTagListBlock> getSubBlocks(final Tag start, final Tag end) {
		final List<SwiftTagListBlock> result = new ArrayList<SwiftTagListBlock>();

		SwiftTagListBlock toAdd = null;
		boolean blockFound = false;
		for (int i=0;i<this.tags.size();i++) {
			final Tag t = (Tag)this.tags.get(i);
			if (blockFound) {
				toAdd.addTag(t);
				if (end != null && end.equals(t)) {
					 result.add(toAdd);
					 blockFound = false;
					 toAdd = null;
				} 
			} else {
				if (start.equals(t)) {
					 toAdd = new SwiftTagListBlock();
					 toAdd.addTag(t);
					 blockFound = true;
				} 
			}
		}
		//if necessary, we add the last found sub block
		if (toAdd != null) {
			result.add(toAdd);
		}
		
		return result;
	}
	
	/**
	 * Get all tags between the first occurrence of the starting Tag and the first occurrence of an optional ending Tag.
	 * If the ending Tag is <code>null</code> or not found after the starting Tag, it returns all tags until end of block.
	 * The starting and end tags are included in the resulting block.
	 * 
	 * @param start starting tag
	 * @param end ending tag or <code>null</code>
	 * @return a new block containing the found tags (the block can be empty if no tags are found)
	 * 
	 * @since 6.0
	 */
	public SwiftTagListBlock getSubBlock(final Tag start, final Tag end) {
		List<SwiftTagListBlock> l = getSubBlocks(start, end);
		if (l.isEmpty()) {
			return new SwiftTagListBlock();
		} else {
			return l.get(0);
		}
	}
	
	/**
	 * Get all sub blocks using the starting and ending Tag names as block boundaries (Tag values are ignored).
	 * The starting and end tags are included in the resulting sub blocks.<br />
	 * This method is particularly useful to get sub blocks that are not bounded by 16R and 16S fields.
	 * 
	 * @param startTagName starting tag name
	 * @param endTagName ending tag name
	 * @return a list of <code>SwiftTagListBlock</code> new blocks containing the found tags (the list can be empty if no tags are found)
	 * 
	 * @since 6.0
	 */
	public List<SwiftTagListBlock> getSubBlocks(final String startTagName, final String endTagName) {	
		Tag start = new Tag(startTagName, "");
		Tag end = new Tag(endTagName, "");
		return _getSubBlocks(start.getNumber(), start.getLetterOption(), end.getNumber(), end.getLetterOption());
	}
	
	/**
	 * Get all sub blocks using the starting and ending Tag numbers as block boundaries (Tag values are ignored).
	 * The starting and end tags are included in the resulting sub blocks.<br />
	 * This method is particularly useful to get sub blocks that are not bounded by 16R and 16S fields.
	 * 
	 * @param startTagNumber starting tag number regardless of the letter option
	 * @param endTagNumber ending tag number regardless of the letter option
	 * @return a list of <code>SwiftTagListBlock</code> new blocks containing the found tags (the list can be empty if no tags are found)
	 * 
	 * @since 6.2
	 */
	public List<SwiftTagListBlock> getSubBlocks(final int startTagNumber, final int endTagNumber) {	
		return _getSubBlocks(startTagNumber, null, endTagNumber, null);
	}
	
	/**
	 * Get all sub blocks using the starting Tag name and ending Tag number as block boundaries (Tag values are ignored).
	 * The starting and end tags are included in the resulting sub blocks.<br />
	 * 
	 * @param startTagName starting tag name
	 * @param endTagNumber ending tag number regardless of the letter option
	 * @return a list of <code>SwiftTagListBlock</code> new blocks containing the found tags (the list can be empty if no tags are found)
	 * 
	 * @since 6.2
	 */
	public List<SwiftTagListBlock> getSubBlocks(final String startTagName, int endTagNumber) {
		Tag start = new Tag(startTagName, "");
		return _getSubBlocks(start.getNumber(), start.getLetterOption(), endTagNumber, null);
	}
	
	/**
	 * Get all sub blocks using the starting Tag number and ending Tag name as block boundaries (Tag values are ignored).
	 * The starting and end tags are included in the resulting sub blocks.<br />
	 * 
	 * @param startTagNumber starting tag name number regardless of the letter option
	 * @param endTagName ending tag name
	 * @return a list of <code>SwiftTagListBlock</code> new blocks containing the found tags (the list can be empty if no tags are found)
	 * 
	 * @since 6.2
	 */
	public List<SwiftTagListBlock> getSubBlocks(final int startTagNumber, final String endTagName) {
		Tag end = new Tag(endTagName, "");
		return _getSubBlocks(startTagNumber, null, end.getNumber(), end.getLetterOption());
	}
	
	/**
	 * Helper method to get subblocks on different boundaries combinations
	 * @param startTagNumber mandatory starting tag number paramenter
	 * @param startTagLetter optional starting tag letter option
	 * @param endTagNumber mandatory ending tag number paramenter
	 * @param endTagLetter optional ending tag letter option
	 * @return the found subblocks
	 */
	private List<SwiftTagListBlock> _getSubBlocks(final int startTagNumber, final String startTagLetter, final int endTagNumber, final String endTagLetter) {	
		List<SwiftTagListBlock> result = new ArrayList<SwiftTagListBlock>();

		SwiftTagListBlock toAdd = null;
		boolean blockFound = false;
		for (int i=0;i<this.tags.size();i++) {
			Tag t = (Tag)this.tags.get(i);
			if (blockFound) {
				toAdd.addTag(t);
				if ((endTagLetter != null && StringUtils.equals(t.getName(), endTagNumber+endTagLetter)) ||
					(endTagLetter == null && t.isNumber(endTagNumber))) {
					result.add(toAdd);
					blockFound = false;
					toAdd = null;
				} 
			} else {
				if ((startTagLetter != null && StringUtils.equals(t.getName(), startTagNumber+startTagLetter)) ||
					(startTagLetter == null && t.isNumber(startTagNumber))) {
					toAdd = new SwiftTagListBlock();
					toAdd.addTag(t);
					blockFound = true;
				} 
			}
		}
		//if necessary, we add the last found sub block
		if (toAdd != null) {
			result.add(toAdd);
		}
		
		return result;
	}
	
	/**
	 * Get the block containing the list of tags between the given indexes.<br />
	 * The implementation uses subList so the resulting List of tags will containing elements from
	 * the original List startIndex to endIndex - 1.
	 * 
	 * @param startIndex
	 * @param endIndex
	 * @since 6.5
	 * @see #getTagIndex(String, String[])
	 */
	public SwiftTagListBlock getSubBlockByIndex(Integer startIndex, Integer endIndex) {
		return new SwiftTagListBlock(this.tags.subList(startIndex==null?0:startIndex, endIndex==null?this.tags.size():endIndex));
	}
	
	/**
	 * Get the index of the given tag in the list.
	 * 
	 * @param startTagNumber the number of the tag, without any letter option
	 * @param letterOptions list of letter options to search, an empty string is accepted to search no letter option
	 * @return the index inside the internal list of the given tag, <code>null</code> if the tag is not  found
	 * @since 6.5
	 */
	public Integer getTagIndex(final String startTagNumber, final String [] letterOptions) {	

		for (int i=0;i<this.tags.size();i++) {
			Tag t = (Tag)this.tags.get(i);
			if (StringUtils.startsWith(t.getName(), startTagNumber)) {
				// check letter options
				if (letterOptions == null || letterOptions.length<1) {
					return i;
				} else {
					for (String l:letterOptions) {
						if (StringUtils.equals(t.getName(), startTagNumber+l))
								return i;
					}
				}
			}
		}
		return null;
	}
	/**
	 * Get all tags between the first occurrence of the starting Tag name and the first occurrence of an optional ending Tag name.
	 * If the ending Tag name is <code>null</code> or not found after the starting Tag name, it returns all tags until end of block.
	 * The starting and end tags are included in the resulting block.
	 * 
	 * @param startTagName starting tag name
	 * @param endTagName ending tag name or <code>null</code>
	 * @return a new block containing the found tags (the block can be empty if no tags are found)
	 * 
	 * @since 6.0
	 */
	public SwiftTagListBlock getSubBlock(final String startTagName, final String endTagName) {	
		List<SwiftTagListBlock> l = getSubBlocks(startTagName, endTagName);
		if (l.isEmpty()) {
			return new SwiftTagListBlock();
		} else {
			return l.get(0);
		}
	}
	
	/**
	 * Gets all sub blocks with a specific name, using ISO 15022 FIN block structure definitions.
	 * It searches for a starting 16R field (with blockName as value) and its correspondent 16S 
	 * field (with blockName as value) as block boundaries.
	 * 
	 * @param blockName block name, used for block 
	 * @return a list containing the found tags (the list can be empty if no tags are found)
	 * @see #getSubBlocks(Tag, Tag)
	 * 
	 * @since 6.0
	 */
	public List<SwiftTagListBlock> getSubBlocks(final String blockName) {
		return getSubBlocks(new Tag("16R", blockName), new Tag("16S", blockName));
	}
	
	/**
	 * Gets all tags of a specific sub block, searching for the first occurrence of the starting 16R field (with blockName as value)
	 * and its correspondent 16S field (with blockName as value).
	 * 
	 * @param blockName block name, used for block 
	 * @return a new block containing the found tags (the block can be empty if no tags are found)
	 * @see #getSubBlock(Tag, Tag)
	 * 
	 * @since 6.0
	 */
	public SwiftTagListBlock getSubBlock(final String blockName) {
		return getSubBlock(new Tag("16R", blockName), new Tag("16S", blockName));
	}
	
	/**
	 * Iterates the internal list of tags and returns true if there is at least one tag equals to the given one.
	 * 
	 * @param t the tag to search in tags
	 * @return <code>true</code> if tag is found
	 * @since 6.0
	 */
	public boolean containsTag(Tag t) {
		if (this.tags == null || this.tags.isEmpty())
			return false;
		for (Iterator<Tag> it = tags.iterator() ; it.hasNext() ; ) {
			if (t.equals((Tag)it.next())) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		//unused
		return null;
	}

	public Integer getNumber() {
		//unused
		return null;
	}

	protected void setBlockName(String blockName) {
		//unused		
	}

	protected void setBlockNumber(Integer blockNumber) {
		//unused
	}
	
	public void visit(TagVisitor visitor) {
		if (visitor != null) {
			if (this.tags != null && !this.tags.isEmpty()) {
				for (Tag t : this.tags) {
					visitor.onTag(t);
				}
			}
		}
	}
	
	/**
	 * Split the given list with the given tagname.
	 * the tag with the given tagname is provided in the start of earch chunk.
	 * if the tagname is not found the entire list is returned.
	 *  
	 * @param tagName
	 */
	public List<SwiftTagListBlock> splitByTagName(String tagName) {
		final List<SwiftTagListBlock> result = new ArrayList<SwiftTagListBlock>();
		if (this.tags.isEmpty() || !containsTag(tagName)) {
			result.add(this);
		} else {
			SwiftTagListBlock b = new SwiftTagListBlock();
			b.addTag(tags.get(0));
			for (int i=1;i<tags.size();i++) {
				final Tag t = tags.get(i);
				if (StringUtils.equals(tagName, t.getName())) {
					result.add(b);
					b = new SwiftTagListBlock();
				}
				b.addTag(t);
			}
			// el ultimo no queda agregado 
			if (!result.contains(b)) {
				result.add(b);
			}
		}
		return result;
	}
	
	/**
	 * Tell if this block contains a field with the given name supporting 'a' notation ie: 56a
	 * @param name field name to search, supporting the 'a' notation
	 * @return true if this field exists at lease once, false in other case
	 * @see #getFieldsByName(String)
	 */
	public boolean containsField(final String name) {
		final Field[] arr = getFieldsByName(name);
		return (arr != null) && arr.length>0;
	}
	
	/**
	 * Get a subblock after the first tag with the given tagname.
	 * The given separator tag is included in the result
	 * 
	 * @param tagname
	 */
	public SwiftTagListBlock getSubBlockAfterFirst(String tagname) {
		SwiftTagListBlock result = new SwiftTagListBlock();
		if (this.tags != null && this.tags.size()>0) {
			boolean toggleAdd = false;
			for (int i=0;i<this.tags.size() ; i++) {
				final Tag t = this.tags.get(i);
				if (StringUtils.equals(tagname, t.getName())) {
					toggleAdd = true;
				}
				if (toggleAdd) {
					result.addTag(t);
				}
			}
		}
		return result;
	}
	/**
	 * get a new list with all the tags found before the first tagname. 
	 * tagname is included if includeSeparator is <code>true</code>
	 */
	public SwiftTagListBlock getSubBlockBeforeFirst(final String tagname, final boolean includeSeparator) {
		SwiftTagListBlock result = new SwiftTagListBlock();
		if (this.tags != null && this.tags.size()>0) {
			Iterator<Tag> it = tags.iterator();
			boolean done = false;
			while (it.hasNext() && !done) {
				Tag t = it.next();
				if (StringUtils.equals(tagname, t.getName())) {
					if (includeSeparator) {
						result.addTag(t);
					}
					done = true;
				} else {
					result.addTag(t);
				}
			}
		}
		return result;
	}
	/**
	 * Get a new list with tags between the last instance of tag with tagname name found or null if the tag was not found
	 */
	public SwiftTagListBlock getSubBlockAfterLast(String tagname, boolean includeDelimiterInResult) {
		int i = indexOfLast(tagname);
		if (i>=0) {
			if (includeDelimiterInResult) {
				return getSubBlock(i, null);
			} else {
				if (i<this.tags.size()) {
					return getSubBlock(i+1, null);
				}
			}
		}
		return null; 
	}
	
	/**
	 * Analog to substring from to.
	 * for getting a 'view' only sublist use {@link List#subList(int, int)}
	 * <em>a larger <code>to</code> value is equivalent to the list size</em>
	 * 
	 * @param from may be null in which case is equivalent to zero
	 * @param to may be null in which case is equivalent to the index of the last item. 
	 * @return a <em>new</em> list with tags compromised between given indexes in the list
	 * @throws IllegalArgumentException if from is equal or bigger than to.
	 * @see List#subList(int, int)
	 */
	public SwiftTagListBlock getSubBlock(final Integer from, final Integer to) {
		final int f = from == null ? 0 : from;
		final int t = to == null || to >this.tags.size()-1 ? this.tags.size() : to;
		if (f>=t) {
			throw new IllegalArgumentException("from ("+f+") is equal or bigger than to ("+t+")");
		}
		final SwiftTagListBlock result = new SwiftTagListBlock();
		result.addTags(this.tags.subList(f, t));
		return result;
	}
	/**
	 * Get the index of the last tagname in the list or -1 if not found or any precondition is not met
	 */
	public int indexOfLast(String tagname) {
		int result = -1;
		if (this.tags != null && !this.tags.isEmpty()) {
			
			for (int i=0;i<this.tags.size();i++) {
				if (StringUtils.equals(tagname, this.tags.get(i).getName())) {
					result = i;
				}
			}
		}
		return result;
	}
	/**
	 * Get the index of the last of any tagnames in the list or -1 if not found or any precondition is not met
	 */
	public int indexOfAnyLast(String ... tagnames) {
		int result = -1;
		if (this.tags != null && !this.tags.isEmpty()) {
			for (int i=0;i<this.tags.size();i++) {
				for (final String tn : tagnames) {
					if (StringUtils.equals(tn, this.tags.get(i).getName())) {
						result = i;
					}
				}
			}
		}
		return result;
	}
	/**
	 * Get the index of the last of any tagnames after the given index in the list or -1 if not found or any precondition is not met
	 */
	public int indexOfAnyLastAfterIndex(int index, String ... tagnames) {
		int result = -1;
		if (this.tags != null && !this.tags.isEmpty()) {
			for (int i=index;i<this.tags.size();i++) {
				for (final String tn : tagnames) {
					if (StringUtils.equals(tn, this.tags.get(i).getName())) {
						result = i;
					}
				}
			}
		}
		return result;
	}
	/**
	 * Get the index of the first tagname in the list or -1 if not found or any precondition is not met
	 */
	public int indexOfFirst(String tagname) {
		if (this.tags != null && !this.tags.isEmpty()) {
			
			for (int i=0;i<this.tags.size();i++) {
				if (StringUtils.equals(tagname, this.tags.get(i).getName())) {
					return i;
				}
			}
		}
		return -1;
	}
	/**
	 * Get the index of the first of any tagnames in the list or -1 if not found or any precondition is not met
	 */
	public int indexOfAnyFirst(String ... tagnames) {
		if (this.tags != null && !this.tags.isEmpty()) {
			for (int i=0;i<this.tags.size();i++) {
				for (final String tn : tagnames) {
					if (StringUtils.equals(tn, this.tags.get(i).getName())) {
						return i;
					}
				}
			}
		}
		return -1;
	}
	
	/**
	 * Get the index of the first of any tagnames after the given index in the list or -1 if not found or any precondition is not met
	 */
	public int indexOfAnyFirstAfterIndex(int index, String ... tagnames) {
		if (this.tags != null && !this.tags.isEmpty()) {
			for (int i=index;i<this.tags.size();i++) {
				for (final String tn : tagnames) {
					if (StringUtils.equals(tn, this.tags.get(i).getName())) {
						return i;
					}
				}
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @param tagname
	 * @param includeDelimiterInResult
	 * @return
	 */
	public SwiftTagListBlock getSubBlockBeforeLast(String tagname, boolean includeDelimiterInResult) {
		int i = indexOfLast(tagname);
		if (includeDelimiterInResult && i>0) {
			return getSubBlock(null, i+1);
		} else if ((!includeDelimiterInResult) && i>0) {
			return getSubBlock(null, i);
		}
		return null;
	}
	
	/**
	 * Get a subblock with all tags in this blocks until the first occurrence of a tag with tagname.
	 * 
	 * @param tagname
	 * @param includeBoundaryInResult
	 */
	public SwiftTagListBlock trimAfterFirst(String tagname, boolean includeBoundaryInResult) {
		final SwiftTagListBlock result = new SwiftTagListBlock();
		boolean boundaryFound = false;
		for (int i=0;i<this.tags.size();i++) {
			final Tag t = this.tags.get(i);
			final boolean currentTagIsBoundary;
			if (StringUtils.equals(tagname, t.getName())) {
				boundaryFound = true;
				currentTagIsBoundary = true;
			} else {
				currentTagIsBoundary = false;
			}
			if ( (!boundaryFound) ||  (currentTagIsBoundary && includeBoundaryInResult)) {
				result.addTag(t);
			}
		}
		return result;
	}
	
	/**
	 * Creates a new {@link SwiftTagListBlock} that contains all tags after the given tagname.
	 * tagname is included or not depending on the value of <code>includeBoundaryInResult</code>
	 * 
	 * @param tagname the tagname to search 
	 * @param includeBoundaryInResult if true, the found boundary tag will be the first item in the returned list
	 * @return a new {@link SwiftTagListBlock} with the tags found
	 * @see #removeAfterFirst(String, boolean)
	 */
	public SwiftTagListBlock removeUntilFirst(String tagname, boolean includeBoundaryInResult) {
		final SwiftTagListBlock result = new SwiftTagListBlock();
		boolean boundaryFound = false;
		for (int i=0;i<this.tags.size();i++) {
			final Tag t = this.tags.get(i);
			if (boundaryFound) {
				result.addTag(t);
			} else {
				if (StringUtils.equals(tagname, t.getName())) {
					boundaryFound = true;
					if (includeBoundaryInResult) {
						result.addTag(t);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Get a sub block with all tags but the ones in the first occurrence of the given sub block.<br />
	 * It searches for a starting 16R field (with blockName as value) and its correspondent 16S 
	 * field (with blockName as value) as block boundaries and removes those fields from the result.
	 * If the searched block is not found (starting field 16R not present) the result will be just 
	 * a copy from this block. If the end boundary is not found (ending field field 16S not present), 
	 * it trims all fields after the start boundary 16R.
	 * 
	 * @param blockName block name, used for block 
	 * 
	 * @since 7.4
	 */
	public SwiftTagListBlock removeSubBlock(String blockName) {
		final SwiftTagListBlock result = new SwiftTagListBlock();
		boolean startBoundaryFound = false;
		boolean endBoundaryFound = false;
		for (int i=0; i<this.tags.size(); i++) {
			boolean isEndBoundaryFound = false;
			final Tag t = this.tags.get(i);
			if (StringUtils.equals(blockName, t.getValue())) {
				if (StringUtils.equals("16R", t.getName())) {
					startBoundaryFound = true;
				} else if (StringUtils.equals("16S", t.getName())) {
					endBoundaryFound = true;
					isEndBoundaryFound = true;
				}
			}
			if ( (!startBoundaryFound) || (startBoundaryFound && endBoundaryFound && !isEndBoundaryFound)) {
				result.addTag(t);
			}
		}
		return result;	
	}
	
	/**
	 * Tell if this block contains any of the given name tags.
	 * this is a shorthand for avoiding repeated calls to {@link #containsTag(String)}.
	 * @param name the list of tags to check, if <code>null</code> or empty this method will return false without further action
	 * @since 7.0
	 * @see #containsTag(String)
	 * @see #containsAllOf(String...)
	 */
	public boolean containsAnyOf(String ... name) {
		if (name != null && name.length>0) {
			for (String s:name) {
				if (containsTag(s))
					return true;
			}
		}
		return false;
	}
	/**
	 * Tell if this block contains all of the given name tags.
	 * this is a shorthand for avoiding repeated calls to {@link #containsTag(String)}.
	 * @param name the list of tags to check, if <code>null</code> or empty this method will return false without further action
	 * @since 7.4
	 * @see #containsTag(String)
	 * @see #containsAnyOf(String...)
	 */
	public boolean containsAllOf(String ... name) {
		if (name != null && name.length>0) {
			for (String s:name) {
				if (!containsTag(s))
					return false;
			}
			return true;
		}
		return false;
	}

	/**
	 * Returns a new block that includes (<code>true</code>) or excludes (<code>false</code>), depending on <code>includeOrExclude</code> flag
	 * all tags with names matching any of the parameter names.<br />
	 * Once a tagname is matched, it is removed from the list of tags to be matched, causing to be only included/excluded the first instance of every tagname.<br />
	 * For example: 1, 2, 3, 4, 5, 6 filter by names 2, 4, 5 will return 1, 3, 6.
	 * 
	 * @param include if <code>true</code> include all tags with given names, if <code>false</code> include all tags with a name <em>not</em> in names
	 * @param names list of tagnames to match
	 * @return a new list, an empty list if empty message, preconditions not met or nothing found
	 * @since 7.2
	 */
	public SwiftTagListBlock filterByName(boolean include, String ... names) {
		final SwiftTagListBlock result = new SwiftTagListBlock();
		if (names.length == 0) {
			if (include) {
				// do nothing, will return empty list later
			} else {
				// return all current tags since none is to be excluded
				result.setTags(getTags());
			}
		} else {
			for (int i=0;i<this.tags.size();i++) {
				final Tag t = this.tags.get(i);
				// see if tag names is matched first
				boolean matched = false;
				for (int j=0;(!matched)&&j<names.length;j++) {
					if (StringUtils.equals(t.getName(), names[j])) {
						matched = true;
						names = (String[]) ArrayUtils.remove(names, j);
					}
				}
				if (matched && include) {
					result.addTag(t);
				} 
				if ((!matched) && !include) {
					result.addTag(t);
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns a new block that includes all tags with names matching any of the parameter names until a non matching tag is found.<br />
	 * Once a tagname is matched, it is removed from the list of tags to be matched, causing to be only included/excluded the first instance of every tagname.<br />
 	 * For example: 1, 2, 3, 9, 4, 5, 6 filter by names 1, 2, 3, 4 will return 1, 2, 3.
	 * 
	 * @param names list of tagnames to match
	 * @return a new list, an empty list if empty message, preconditions not met or nothing found
	 * @since 7.2
	 */
	public SwiftTagListBlock filterByNameOrdered(String ... names) {
		final SwiftTagListBlock result = new SwiftTagListBlock();
		for (Tag t : getTags()) {
			boolean matched = false;
			for (int j=0;(!matched)&&j<names.length;j++) {
				if (StringUtils.equals(t.getName(), names[j])) {
					matched = true;
					names = (String[]) ArrayUtils.remove(names, j);
					result.addTag(t);
				}
			}
			if (!matched) {
				break;
			}
		}
		return result;
	}

	/**
	 * @see #removeUntilFirst(String, boolean)
	 */
	public SwiftTagListBlock removeAfterFirst(String name, boolean includeBoundaryInResult) {
		final SwiftTagListBlock result = new SwiftTagListBlock();
		if (this.tags != null && !this.tags.isEmpty()) {
			for (int i=0;i<tags.size();i++) {
				final Tag tag = this.tags.get(i);
				if (StringUtils.equals(name, tag.getName())) {
					if (includeBoundaryInResult) {
						result.addTag(tag);
					}
					return result;
				} 
				result.addTag(tag);
			}
		}
		return result;
	}
	
	/**
	 * Get all subblocks in message that start with tag with tagname, end with tag named endName and optionally, may be null, have optionalTail tag names at the end of the secuence
	 * 
	 * TODO definir comportamiento si hay cosas de mas en el medio
	 * 
	 * @param startName name of the tag that identifies the begin of the sequence
	 * @param endName name of the tag that identifies the end of the sequence
	 * @param optionalTail names of tags that are optional and belong to the sequence, the must be after endName
	 * @return an empty list if none found or prerequisites not met
	 */
	public List<SwiftTagListBlock> getSubBlocksDelimitedWithOptionalTail(String[] start, String[] end, String[] tail) {
		if (tags != null && !tags.isEmpty()) {
			final List<SwiftTagListBlock> result = new ArrayList<SwiftTagListBlock>();
			int offset = 0;
			boolean done = false;
			while (!done) {
				int s = indexOfAnyFirstAfterIndex(offset, start);
				int e = indexOfAnyFirstAfterIndex(s+1, end);

				offset = e;
				if (s==-1 || e==-1) {
					done = true;
				} else if (e>=s) {
					final SwiftTagListBlock l = sublist(s, e);
					if (tail !=null && tail.length>0) {
						boolean abort = false;
						for (int i=e+1;i<tags.size() && !abort;i++) {
							boolean added = false;
							for (final String tn : tail) {
								final Tag tag = tags.get(i);
								if (StringUtils.equals(tag.getName(), tn)) {
									l.addTag(tag);
									offset++;
									added = true;
								}
							}
							if (!added)
								abort = true;
						}
					}
					result.add(l);
				}
			} 
			
			return result;
		}
		return Collections.emptyList();
	}
	
	/**
	 * Get the 
	 * @param start
	 * @param end
	 * @param tail
	 */
	public SwiftTagListBlock getSubBlockDelimitedWithOptionalTail(String[] start, String[] end, String[] tail) {
		if (tags != null && !tags.isEmpty()) {
			int s = indexOfAnyFirst(start);
			int e = indexOfAnyFirstAfterIndex(s+1, end);
			
			if (s!=-1 && e!=-1 && e>=s) {
				final SwiftTagListBlock result = sublist(s, e);
				if (tail ==null || tail.length==0)
					return result;
				boolean abort = false;
				for (int i=e+1;i<tags.size() && !abort;i++) {
					boolean added = false;
					for (final String tn : tail) {
						if (StringUtils.equals(tags.get(i).getName(), tn)) {
							result.addTag(tags.get(i));
							added = true;
						} 
					}
					if (!added)
						abort = true;
				}
				return result;
			}
		}
		return null;
	}

	/**
	 * Get a new list with the elements contained between start and end, both inclusive.
	 * Both start and end <em>may be <code>null</code></em>. 
	 * 
	 * @param start start index, zero based. if null = zero 
	 * @param end last index, zero based, null means last element
	 */
	public SwiftTagListBlock sublist(final Integer start, final Integer end) {
		if (tags == null || tags.isEmpty()) {
			throw new IllegalStateException("No tags in this list");
		}
		if ((start!=null && start<0) || (end != null && (end+1)>this.tags.size()) || (start!=null && end!=null && start>end)) {
			throw new IllegalArgumentException("start: "+start+", end: "+end+", size="+this.tags.size());
		}
		final SwiftTagListBlock result = new SwiftTagListBlock();
		final int s = start == null ? 0 : start;
		final int e = end == null ? this.tags.size()-1 : end;
		for (int i=s; i<=e ; i++) {
			result.addTag(this.tags.get(i));
		}
		return result;
	}
	/**
	 * Search a secuence of optional tags. inside each row, only one is matched.
	 * stop conditions: a tag is not in the optional row being processed or any future row or there are no more rows
	 * @param optionalTags
	 * @return
	 */
	public SwiftTagListBlock getOptionalList(String[][] optionalTags) {
		return getOptionalList(optionalTags, 0);
	}
	public SwiftTagListBlock getOptionalList(String[][] optionalTags, int startAt) {
		if (this.tags != null && !this.tags.isEmpty()) {
			final SwiftTagListBlock result = new SwiftTagListBlock();
			boolean done = false;
			int t = startAt;
			int rowPointer = 0;
			do {
				final Tag tag = this.tags.get(t++);
				int rowIndex = findTagInRowSince(tag, rowPointer, optionalTags);
				if (rowIndex >= 0) {
					rowPointer = rowIndex + 1;
					result.addTag(tag);
				} else {
					// no se encontro, ni aca ni en lo que queda el tag, 
					done = true;
				}
			} while (!done);
			return result;
		}
		return null;
	}
	
	private int findTagInRowSince(Tag tag, int rowPointer, String[][] optionalTags) {
		for (int r=rowPointer;r<optionalTags.length;r++) {
			final String[] row = optionalTags[r];
			for (int i=0;i<row.length;i++) {
				final String op = row[i];
				if (StringUtils.equals(tag.getName(), op)) {
					return r;
				}
			}
		}
		return -1;
	}
	
	public List<SwiftTagListBlock> getOptionalLists(String[][] optionalTags) {
		final List<SwiftTagListBlock> result = new ArrayList<SwiftTagListBlock>();
		if (this.tags != null && !this.tags.isEmpty()) {
			boolean done = false;
			int offset = 0;
			while (!done) {
				SwiftTagListBlock o = getOptionalList(optionalTags, offset);
				offset += o.size();
			
				if (offset > this.tags.size() || o.isEmpty()) {
					done = true;
				}
				if (!o.isEmpty())
					result.add(o);
			}
		}
		return result;

		
	}
	public List<String> tagNamesList() {
		if (this.tags == null || this.tags.isEmpty())
			return Collections.emptyList();
		final List<String> result = new ArrayList<String>();
		for (final Tag t: this.tags) {
			result.add(t.getName());
		}
		return result;
	}
	/**
	 * Counts tags starting with the given value
	 */
	public int countTagsStarsWith(String name, String value) {
		int result = 0;
		if (this.tags != null && !this.tags.isEmpty()) {
			for (final Tag t : this.tags) {
				if (t.startsWith(value)) {
					result++;
				}
			}
		}
		return result;
	}
	

	/**
	 * Return a new block with all tags until the first tagname with the given name that start with startsWith
	 * @param name
	 * @param startsWith
	 * @return
	 */
	public SwiftTagListBlock removeAfterFirstStartsWith(String name, String startsWith) {
		if (this.tags == null || this.tags.size()==0) 
			return new SwiftTagListBlock();
		
		List<Tag> tags = new ArrayList<Tag>();
		boolean done = false;
		for (int i=0;i<this.tags.size() && !done;i++) {
			Tag t = this.tags.get(i);
			if (StringUtils.equals(t.getName(), name) && t.startsWith(startsWith)) {
				done = true;
			} else {
				tags.add(t);
			}
		}
		return new SwiftTagListBlock(tags);
	}
	
	/**
	 * @since 7.5
	 */
	public String toJson() {
		final StringBuilder sb = new StringBuilder();
		sb.append("[ \n");
		if (this.tags != null && !this.tags.isEmpty()) {
			for (int i=0;i<this.tags.size();i++) {
				final Tag t = this.tags.get(i);
				sb.append("{ \"").append(t.getName()).append("\" : \"").append(escapeJson(t.getValue())).append("\" }");
				if (i+1<this.tags.size()) {
					sb.append(',');
				}
				sb.append('\n');
			}
			
		}
		sb.append("]");
		return sb.toString();
	}
	private String escapeJson(String value) {
		String tmp = StringUtils.replace(value, "\n", "\\n");
		tmp = StringUtils.replace(tmp, "\"", "\\\"");
		tmp = StringUtils.remove(tmp, "\r");
		return tmp;
	}

    /**
     * Appends all tags in block to the contents of this block
     * @param block
     * @return the current instance
     */
    public SwiftTagListBlock append (final SwiftTagListBlock block) {
        if (block!= null && !block.isEmpty()) {
            this.tags.addAll(block.getTags());
        }
        return this;
    }
}
