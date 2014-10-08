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
package com.prowidesoftware.swift.model.mt.mt2xx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 256<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT256 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "256";
// begin qualifiers constants	
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT256.class.getName());

	/**
	 * Creates an MT256 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT256 content
	 */
	public MT256(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT256 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT256 content
	 */
	public MT256(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT256 initialized with a new SwiftMessage
	 */
	/*
	public MT256() {
		super();
	}
	*/
	
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "256";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20 at MT256 is expected to be the only one.
	 * 
	 * @return a Field20 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field20 getField20() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("20");
			if (t == null) {
				log.fine("field 20 not found");
				return null;
			} else {
				return new Field20(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 32A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 32A at MT256 is expected to be the only one.
	 * 
	 * @return a Field32A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field32A getField32A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("32A");
			if (t == null) {
				log.fine("field 32A not found");
				return null;
			} else {
				return new Field32A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30 at MT256 is expected to be the only one.
	 * 
	 * @return a Field30 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30 getField30() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("30");
			if (t == null) {
				log.fine("field 30 not found");
				return null;
			} else {
				return new Field30(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 19, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 19 at MT256 is expected to be the only one.
	 * 
	 * @return a Field19 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field19 getField19() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("19");
			if (t == null) {
				log.fine("field 19 not found");
				return null;
			} else {
				return new Field19(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 71J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 71J at MT256 is expected to be the only one.
	 * 
	 * @return a Field71J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field71J getField71J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("71J");
			if (t == null) {
				log.fine("field 71J not found");
				return null;
			} else {
				return new Field71J(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 71L, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 71L at MT256 is expected to be the only one.
	 * 
	 * @return a Field71L object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field71L getField71L() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("71L");
			if (t == null) {
				log.fine("field 71L not found");
				return null;
			} else {
				return new Field71L(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 71K, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 71K at MT256 is expected to be the only one.
	 * 
	 * @return a Field71K object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field71K getField71K() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("71K");
			if (t == null) {
				log.fine("field 71K not found");
				return null;
			} else {
				return new Field71K(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57A at MT256 is expected to be the only one.
	 * 
	 * @return a Field57A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57A getField57A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("57A");
			if (t == null) {
				log.fine("field 57A not found");
				return null;
			} else {
				return new Field57A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57C at MT256 is expected to be the only one.
	 * 
	 * @return a Field57C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57C getField57C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("57C");
			if (t == null) {
				log.fine("field 57C not found");
				return null;
			} else {
				return new Field57C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57D at MT256 is expected to be the only one.
	 * 
	 * @return a Field57D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57D getField57D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("57D");
			if (t == null) {
				log.fine("field 57D not found");
				return null;
			} else {
				return new Field57D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 58B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 58B at MT256 is expected to be the only one.
	 * 
	 * @return a Field58B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field58B getField58B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("58B");
			if (t == null) {
				log.fine("field 58B not found");
				return null;
			} else {
				return new Field58B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 44A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 44A at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field44A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field44A> getField44A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("44A");
			final List<Field44A> result = new ArrayList<Field44A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field44A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 21, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 21 at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field21 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field21> getField21() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("21");
			final List<Field21> result = new ArrayList<Field21>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field21(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 21D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 21D at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field21D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field21D> getField21D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("21D");
			final List<Field21D> result = new ArrayList<Field21D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field21D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 21E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 21E at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field21E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field21E> getField21E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("21E");
			final List<Field21E> result = new ArrayList<Field21E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field21E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 23E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 23E at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field23E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field23E> getField23E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("23E");
			final List<Field23E> result = new ArrayList<Field23E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field23E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 32J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 32J at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field32J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field32J> getField32J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("32J");
			final List<Field32J> result = new ArrayList<Field32J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field32J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 37J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 37J at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field37J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field37J> getField37J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("37J");
			final List<Field37J> result = new ArrayList<Field37J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field37J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 71G, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 71G at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field71G objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field71G> getField71G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("71G");
			final List<Field71G> result = new ArrayList<Field71G>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field71G(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 71F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 71F at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field71F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field71F> getField71F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("71F");
			final List<Field71F> result = new ArrayList<Field71F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field71F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 71H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 71H at MT256 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field71H objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field71H> getField71H() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("71H");
			final List<Field71H> result = new ArrayList<Field71H>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field71H(tags[i].getValue()));
			}
			return result;
		}
	}
	

/*
 * sequences code
 *
 */ 


	public static class SequenceA extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* tagname of the first tag in the sequence which must be mandatory.
		* may be null if we cannot determine this safely
		*/
		public static final String START_NAME =  "20"  ;
	}




	public static class SequenceB extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"44A"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "44A"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"32J"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "32J"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "37J", "71G", "71F", "71H"   };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceB newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceB newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceB result = new SequenceB();

			result.addTag(new Tag(START[start], ""));

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(new Tag(END[end], ""));

			return result;
		}

			}

	/**
	* Get the list of SequenceB delimited by  {@value SequenceB#START} and {@value SequenceB#END} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* 
	*/
	public List<SequenceB> getSequenceBList() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final List<SequenceB> result = new ArrayList<SequenceB>();
			final List<SwiftTagListBlock> bs = b4.getSubBlocksDelimitedWithOptionalTail(SequenceB.START, SequenceB.END, SequenceB.TAIL); 
			if (bs != null && !bs.isEmpty()) {
				for (final SwiftTagListBlock s : bs) {
					result.add(new SequenceB(s));
				}
			}
			return result;
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceC extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* tagname of the first tag in the sequence which must be mandatory.
		* may be null if we cannot determine this safely
		*/
		public static final String START_NAME =  "32A"  ;
	}







}
