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
package com.prowidesoftware.swift.model.mt.mt3xx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 362<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT362 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "362";
// begin qualifiers constants	
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT362.class.getName());

	/**
	 * Creates an MT362 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT362 content
	 */
	public MT362(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT362 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT362 content
	 */
	public MT362(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT362 initialized with a new SwiftMessage
	 */
	/*
	public MT362() {
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
		return "362";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15A at MT362 is expected to be the only one.
	 * 
	 * @return a Field15A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15A getField15A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("15A");
			if (t == null) {
				log.fine("field 15A not found");
				return null;
			} else {
				return new Field15A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20 at MT362 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 21, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21 at MT362 is expected to be the only one.
	 * 
	 * @return a Field21 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21 getField21() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("21");
			if (t == null) {
				log.fine("field 21 not found");
				return null;
			} else {
				return new Field21(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22A at MT362 is expected to be the only one.
	 * 
	 * @return a Field22A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22A getField22A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22A");
			if (t == null) {
				log.fine("field 22A not found");
				return null;
			} else {
				return new Field22A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 94A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 94A at MT362 is expected to be the only one.
	 * 
	 * @return a Field94A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field94A getField94A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("94A");
			if (t == null) {
				log.fine("field 94A not found");
				return null;
			} else {
				return new Field94A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22C at MT362 is expected to be the only one.
	 * 
	 * @return a Field22C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22C getField22C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22C");
			if (t == null) {
				log.fine("field 22C not found");
				return null;
			} else {
				return new Field22C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23A at MT362 is expected to be the only one.
	 * 
	 * @return a Field23A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23A getField23A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("23A");
			if (t == null) {
				log.fine("field 23A not found");
				return null;
			} else {
				return new Field23A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21N, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21N at MT362 is expected to be the only one.
	 * 
	 * @return a Field21N object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21N getField21N() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("21N");
			if (t == null) {
				log.fine("field 21N not found");
				return null;
			} else {
				return new Field21N(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21B at MT362 is expected to be the only one.
	 * 
	 * @return a Field21B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21B getField21B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("21B");
			if (t == null) {
				log.fine("field 21B not found");
				return null;
			} else {
				return new Field21B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30V, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30V at MT362 is expected to be the only one.
	 * 
	 * @return a Field30V object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30V getField30V() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("30V");
			if (t == null) {
				log.fine("field 30V not found");
				return null;
			} else {
				return new Field30V(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30P, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30P at MT362 is expected to be the only one.
	 * 
	 * @return a Field30P object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30P getField30P() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("30P");
			if (t == null) {
				log.fine("field 30P not found");
				return null;
			} else {
				return new Field30P(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 82A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 82A at MT362 is expected to be the only one.
	 * 
	 * @return a Field82A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field82A getField82A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("82A");
			if (t == null) {
				log.fine("field 82A not found");
				return null;
			} else {
				return new Field82A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 82D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 82D at MT362 is expected to be the only one.
	 * 
	 * @return a Field82D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field82D getField82D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("82D");
			if (t == null) {
				log.fine("field 82D not found");
				return null;
			} else {
				return new Field82D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 87A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 87A at MT362 is expected to be the only one.
	 * 
	 * @return a Field87A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field87A getField87A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("87A");
			if (t == null) {
				log.fine("field 87A not found");
				return null;
			} else {
				return new Field87A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 87D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 87D at MT362 is expected to be the only one.
	 * 
	 * @return a Field87D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field87D getField87D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("87D");
			if (t == null) {
				log.fine("field 87D not found");
				return null;
			} else {
				return new Field87D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 83A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 83A at MT362 is expected to be the only one.
	 * 
	 * @return a Field83A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field83A getField83A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("83A");
			if (t == null) {
				log.fine("field 83A not found");
				return null;
			} else {
				return new Field83A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 83D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 83D at MT362 is expected to be the only one.
	 * 
	 * @return a Field83D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field83D getField83D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("83D");
			if (t == null) {
				log.fine("field 83D not found");
				return null;
			} else {
				return new Field83D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 83J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 83J at MT362 is expected to be the only one.
	 * 
	 * @return a Field83J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field83J getField83J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("83J");
			if (t == null) {
				log.fine("field 83J not found");
				return null;
			} else {
				return new Field83J(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 29A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 29A at MT362 is expected to be the only one.
	 * 
	 * @return a Field29A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field29A getField29A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("29A");
			if (t == null) {
				log.fine("field 29A not found");
				return null;
			} else {
				return new Field29A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 72, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 72 at MT362 is expected to be the only one.
	 * 
	 * @return a Field72 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field72 getField72() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("72");
			if (t == null) {
				log.fine("field 72 not found");
				return null;
			} else {
				return new Field72(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15B at MT362 is expected to be the only one.
	 * 
	 * @return a Field15B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15B getField15B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("15B");
			if (t == null) {
				log.fine("field 15B not found");
				return null;
			} else {
				return new Field15B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15C at MT362 is expected to be the only one.
	 * 
	 * @return a Field15C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15C getField15C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("15C");
			if (t == null) {
				log.fine("field 15C not found");
				return null;
			} else {
				return new Field15C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15D at MT362 is expected to be the only one.
	 * 
	 * @return a Field15D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15D getField15D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("15D");
			if (t == null) {
				log.fine("field 15D not found");
				return null;
			} else {
				return new Field15D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15E at MT362 is expected to be the only one.
	 * 
	 * @return a Field15E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15E getField15E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("15E");
			if (t == null) {
				log.fine("field 15E not found");
				return null;
			} else {
				return new Field15E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 30F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 30F at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field30F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field30F> getField30F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("30F");
			final List<Field30F> result = new ArrayList<Field30F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field30F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 32M, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 32M at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field32M objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field32M> getField32M() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("32M");
			final List<Field32M> result = new ArrayList<Field32M>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field32M(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 53A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 53A at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field53A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field53A> getField53A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("53A");
			final List<Field53A> result = new ArrayList<Field53A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field53A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 53D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 53D at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field53D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field53D> getField53D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("53D");
			final List<Field53D> result = new ArrayList<Field53D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field53D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 56A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 56A at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field56A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field56A> getField56A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("56A");
			final List<Field56A> result = new ArrayList<Field56A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field56A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 56D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 56D at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field56D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field56D> getField56D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("56D");
			final List<Field56D> result = new ArrayList<Field56D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field56D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 86A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 86A at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field86A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field86A> getField86A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("86A");
			final List<Field86A> result = new ArrayList<Field86A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field86A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 86D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 86D at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field86D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field86D> getField86D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("86D");
			final List<Field86D> result = new ArrayList<Field86D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field86D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 57A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 57A at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field57A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field57A> getField57A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("57A");
			final List<Field57A> result = new ArrayList<Field57A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field57A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 57D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 57D at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field57D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field57D> getField57D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("57D");
			final List<Field57D> result = new ArrayList<Field57D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field57D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 33F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 33F at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field33F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field33F> getField33F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("33F");
			final List<Field33F> result = new ArrayList<Field33F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field33F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 30X, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 30X at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field30X objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field30X> getField30X() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("30X");
			final List<Field30X> result = new ArrayList<Field30X>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field30X(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 30Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 30Q at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field30Q objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field30Q> getField30Q() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("30Q");
			final List<Field30Q> result = new ArrayList<Field30Q>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field30Q(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 37G, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 37G at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field37G objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field37G> getField37G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("37G");
			final List<Field37G> result = new ArrayList<Field37G>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field37G(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 37J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 37J at MT362 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 37L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 37L at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field37L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field37L> getField37L() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("37L");
			final List<Field37L> result = new ArrayList<Field37L>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field37L(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 37R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 37R at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field37R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field37R> getField37R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("37R");
			final List<Field37R> result = new ArrayList<Field37R>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field37R(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 37M, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 37M at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field37M objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field37M> getField37M() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("37M");
			final List<Field37M> result = new ArrayList<Field37M>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field37M(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 32H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 32H at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field32H objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field32H> getField32H() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("32H");
			final List<Field32H> result = new ArrayList<Field32H>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field32H(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 33E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 33E at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field33E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field33E> getField33E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("33E");
			final List<Field33E> result = new ArrayList<Field33E>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field33E(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 37N, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 37N at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field37N objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field37N> getField37N() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("37N");
			final List<Field37N> result = new ArrayList<Field37N>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field37N(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 18A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 18A at MT362 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field18A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field18A> getField18A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("18A");
			final List<Field18A> result = new ArrayList<Field18A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field18A(tags[i].getValue()));
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
		* First mandatory tagname of the sequence: <em>"15A"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "15A"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"87A", "87D"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "87A", "87D"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "83A", "83D", "83J", "29A", "72"   };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceA newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceA newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceA result = new SequenceA();

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
	* Get the single occurrence of SequenceA delimited by {@value SequenceA#START} and {@value SequenceA#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceA getSequenceA() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceA.START, SequenceA.END, SequenceA.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceA: is null");
				} else {
					log.fine("content for sequence SequenceA: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceA();
			} else {
				return new SequenceA(content);
			}
		}
		return null;
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
		* First mandatory tagname of the sequence: <em>"15B"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "15B"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"30F"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "30F"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "32H", "33E", "37N"   };

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
	* Get the single occurrence of SequenceB delimited by {@value SequenceB#START} and {@value SequenceB#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceB getSequenceB() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceB.START, SequenceB.END, SequenceB.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceB: is null");
				} else {
					log.fine("content for sequence SequenceB: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceB();
			} else {
				return new SequenceB(content);
			}
		}
		return null;
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
		* First mandatory tagname of the sequence: <em>"15C"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "15C"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"18A"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "18A"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceC newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceC newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceC result = new SequenceC();

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
	* Get the single occurrence of SequenceC delimited by {@value SequenceC#START} and {@value SequenceC#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceC getSequenceC() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceC.START, SequenceC.END, SequenceC.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceC: is null");
				} else {
					log.fine("content for sequence SequenceC: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceC();
			} else {
				return new SequenceC(content);
			}
		}
		return null;
	}
 


	public static class Sequence_0 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private Sequence_0() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private Sequence_0(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"30F"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "30F"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"57A", "57D"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "57A", "57D"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static Sequence_0 newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static Sequence_0 newInstance(final int start, final int end, final Tag ... tags) {
			final Sequence_0 result = new Sequence_0();

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
	* Get the list of Sequence_0 delimited by  {@value Sequence_0#START} and {@value Sequence_0#END} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* 
	*/
	public List<Sequence_0> getSequence_0List() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final List<Sequence_0> result = new ArrayList<Sequence_0>();
			final List<SwiftTagListBlock> bs = b4.getSubBlocksDelimitedWithOptionalTail(Sequence_0.START, Sequence_0.END, Sequence_0.TAIL); 
			if (bs != null && !bs.isEmpty()) {
				for (final SwiftTagListBlock s : bs) {
					result.add(new Sequence_0(s));
				}
			}
			return result;
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceD extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"15D"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "15D"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"30F"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "30F"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "32H", "33E", "37N"   };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceD newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceD newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceD result = new SequenceD();

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
	* Get the single occurrence of SequenceD delimited by {@value SequenceD#START} and {@value SequenceD#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceD getSequenceD() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceD.START, SequenceD.END, SequenceD.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceD: is null");
				} else {
					log.fine("content for sequence SequenceD: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceD();
			} else {
				return new SequenceD(content);
			}
		}
		return null;
	}
 


	public static class SequenceE extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceE() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceE(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"15E"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "15E"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"18A"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "18A"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceE newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceE newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceE result = new SequenceE();

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
	* Get the single occurrence of SequenceE delimited by {@value SequenceE#START} and {@value SequenceE#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceE getSequenceE() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceE.START, SequenceE.END, SequenceE.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceE: is null");
				} else {
					log.fine("content for sequence SequenceE: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceE();
			} else {
				return new SequenceE(content);
			}
		}
		return null;
	}
 


	public static class Sequence_1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private Sequence_1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private Sequence_1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"30F"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "30F"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"57A", "57D"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "57A", "57D"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static Sequence_1 newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static Sequence_1 newInstance(final int start, final int end, final Tag ... tags) {
			final Sequence_1 result = new Sequence_1();

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
	* Get the list of Sequence_1 delimited by  {@value Sequence_1#START} and {@value Sequence_1#END} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* 
	*/
	public List<Sequence_1> getSequence_1List() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final List<Sequence_1> result = new ArrayList<Sequence_1>();
			final List<SwiftTagListBlock> bs = b4.getSubBlocksDelimitedWithOptionalTail(Sequence_1.START, Sequence_1.END, Sequence_1.TAIL); 
			if (bs != null && !bs.isEmpty()) {
				for (final SwiftTagListBlock s : bs) {
					result.add(new Sequence_1(s));
				}
			}
			return result;
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 





}
