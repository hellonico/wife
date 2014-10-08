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
 * MT 340<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT340 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "340";
// begin qualifiers constants	
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT340.class.getName());

	/**
	 * Creates an MT340 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT340 content
	 */
	public MT340(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT340 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT340 content
	 */
	public MT340(MtSwiftMessage m) {
		super(m);
	}
	
	/**
	 * Creates an MT340 initialized with a new SwiftMessage
	 */
	/*
	public MT340() {
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
		return "340";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15A at MT340 is expected to be the only one.
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
	 * The first occurrence of field 20 at MT340 is expected to be the only one.
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
	 * The first occurrence of field 21 at MT340 is expected to be the only one.
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
	 * The first occurrence of field 22A at MT340 is expected to be the only one.
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
	 * The first occurrence of field 94A at MT340 is expected to be the only one.
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
	 * The first occurrence of field 22C at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 23D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23D at MT340 is expected to be the only one.
	 * 
	 * @return a Field23D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23D getField23D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("23D");
			if (t == null) {
				log.fine("field 23D not found");
				return null;
			} else {
				return new Field23D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21N, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21N at MT340 is expected to be the only one.
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
	 * The first occurrence of field 21B at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 82A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 82A at MT340 is expected to be the only one.
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
	 * The first occurrence of field 82D at MT340 is expected to be the only one.
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
	 * The first occurrence of field 87A at MT340 is expected to be the only one.
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
	 * The first occurrence of field 87D at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 77H, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 77H at MT340 is expected to be the only one.
	 * 
	 * @return a Field77H object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field77H getField77H() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("77H");
			if (t == null) {
				log.fine("field 77H not found");
				return null;
			} else {
				return new Field77H(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 14C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 14C at MT340 is expected to be the only one.
	 * 
	 * @return a Field14C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field14C getField14C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("14C");
			if (t == null) {
				log.fine("field 14C not found");
				return null;
			} else {
				return new Field14C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15B at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 30T, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30T at MT340 is expected to be the only one.
	 * 
	 * @return a Field30T object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30T getField30T() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("30T");
			if (t == null) {
				log.fine("field 30T not found");
				return null;
			} else {
				return new Field30T(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 32B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 32B at MT340 is expected to be the only one.
	 * 
	 * @return a Field32B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field32B getField32B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("32B");
			if (t == null) {
				log.fine("field 32B not found");
				return null;
			} else {
				return new Field32B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30P, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30P at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 37M, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 37M at MT340 is expected to be the only one.
	 * 
	 * @return a Field37M object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field37M getField37M() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("37M");
			if (t == null) {
				log.fine("field 37M not found");
				return null;
			} else {
				return new Field37M(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 14F, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 14F at MT340 is expected to be the only one.
	 * 
	 * @return a Field14F object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field14F getField14F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("14F");
			if (t == null) {
				log.fine("field 14F not found");
				return null;
			} else {
				return new Field14F(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30V, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30V at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 38D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 38D at MT340 is expected to be the only one.
	 * 
	 * @return a Field38D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field38D getField38D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("38D");
			if (t == null) {
				log.fine("field 38D not found");
				return null;
			} else {
				return new Field38D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 38G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 38G at MT340 is expected to be the only one.
	 * 
	 * @return a Field38G object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field38G getField38G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("38G");
			if (t == null) {
				log.fine("field 38G not found");
				return null;
			} else {
				return new Field38G(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 14D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 14D at MT340 is expected to be the only one.
	 * 
	 * @return a Field14D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field14D getField14D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("14D");
			if (t == null) {
				log.fine("field 14D not found");
				return null;
			} else {
				return new Field14D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17F, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17F at MT340 is expected to be the only one.
	 * 
	 * @return a Field17F object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17F getField17F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("17F");
			if (t == null) {
				log.fine("field 17F not found");
				return null;
			} else {
				return new Field17F(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15C at MT340 is expected to be the only one.
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
	 * The first occurrence of field 15D at MT340 is expected to be the only one.
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
	 * The first occurrence of field 15E at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 29A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 29A at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 24D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 24D at MT340 is expected to be the only one.
	 * 
	 * @return a Field24D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field24D getField24D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("24D");
			if (t == null) {
				log.fine("field 24D not found");
				return null;
			} else {
				return new Field24D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 88A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 88A at MT340 is expected to be the only one.
	 * 
	 * @return a Field88A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field88A getField88A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("88A");
			if (t == null) {
				log.fine("field 88A not found");
				return null;
			} else {
				return new Field88A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 88D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 88D at MT340 is expected to be the only one.
	 * 
	 * @return a Field88D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field88D getField88D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("88D");
			if (t == null) {
				log.fine("field 88D not found");
				return null;
			} else {
				return new Field88D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 71F, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 71F at MT340 is expected to be the only one.
	 * 
	 * @return a Field71F object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field71F getField71F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("71F");
			if (t == null) {
				log.fine("field 71F not found");
				return null;
			} else {
				return new Field71F(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21G at MT340 is expected to be the only one.
	 * 
	 * @return a Field21G object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21G getField21G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("21G");
			if (t == null) {
				log.fine("field 21G not found");
				return null;
			} else {
				return new Field21G(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 72, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 72 at MT340 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 15F, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15F at MT340 is expected to be the only one.
	 * 
	 * @return a Field15F object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15F getField15F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("15F");
			if (t == null) {
				log.fine("field 15F not found");
				return null;
			} else {
				return new Field15F(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15G at MT340 is expected to be the only one.
	 * 
	 * @return a Field15G object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15G getField15G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("15G");
			if (t == null) {
				log.fine("field 15G not found");
				return null;
			} else {
				return new Field15G(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 96A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 96A at MT340 is expected to be the only one.
	 * 
	 * @return a Field96A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field96A getField96A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("96A");
			if (t == null) {
				log.fine("field 96A not found");
				return null;
			} else {
				return new Field96A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 96D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 96D at MT340 is expected to be the only one.
	 * 
	 * @return a Field96D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field96D getField96D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("96D");
			if (t == null) {
				log.fine("field 96D not found");
				return null;
			} else {
				return new Field96D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 96J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 96J at MT340 is expected to be the only one.
	 * 
	 * @return a Field96J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field96J getField96J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("96J");
			if (t == null) {
				log.fine("field 96J not found");
				return null;
			} else {
				return new Field96J(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22T, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22T at MT340 is expected to be the only one.
	 * 
	 * @return a Field22T object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22T getField22T() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22T");
			if (t == null) {
				log.fine("field 22T not found");
				return null;
			} else {
				return new Field22T(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17E at MT340 is expected to be the only one.
	 * 
	 * @return a Field17E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17E getField17E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("17E");
			if (t == null) {
				log.fine("field 17E not found");
				return null;
			} else {
				return new Field17E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22U, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22U at MT340 is expected to be the only one.
	 * 
	 * @return a Field22U object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22U getField22U() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22U");
			if (t == null) {
				log.fine("field 22U not found");
				return null;
			} else {
				return new Field22U(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17H, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17H at MT340 is expected to be the only one.
	 * 
	 * @return a Field17H object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17H getField17H() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("17H");
			if (t == null) {
				log.fine("field 17H not found");
				return null;
			} else {
				return new Field17H(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17P, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17P at MT340 is expected to be the only one.
	 * 
	 * @return a Field17P object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17P getField17P() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("17P");
			if (t == null) {
				log.fine("field 17P not found");
				return null;
			} else {
				return new Field17P(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22V, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22V at MT340 is expected to be the only one.
	 * 
	 * @return a Field22V object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22V getField22V() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("22V");
			if (t == null) {
				log.fine("field 22V not found");
				return null;
			} else {
				return new Field22V(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 98D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 98D at MT340 is expected to be the only one.
	 * 
	 * @return a Field98D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98D getField98D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("98D");
			if (t == null) {
				log.fine("field 98D not found");
				return null;
			} else {
				return new Field98D(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17W, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17W at MT340 is expected to be the only one.
	 * 
	 * @return a Field17W object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17W getField17W() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("17W");
			if (t == null) {
				log.fine("field 17W not found");
				return null;
			} else {
				return new Field17W(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 77A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 77A at MT340 is expected to be the only one.
	 * 
	 * @return a Field77A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field77A getField77A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("77A");
			if (t == null) {
				log.fine("field 77A not found");
				return null;
			} else {
				return new Field77A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22B at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22B> getField22B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22B");
			final List<Field22B> result = new ArrayList<Field22B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 53A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 53A at MT340 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 53D at MT340 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 53J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 53J at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field53J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field53J> getField53J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("53J");
			final List<Field53J> result = new ArrayList<Field53J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field53J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 86A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 86A at MT340 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 86D at MT340 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 86J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 86J at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field86J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field86J> getField86J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("86J");
			final List<Field86J> result = new ArrayList<Field86J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field86J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 56A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 56A at MT340 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 56D at MT340 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 56J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 56J at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field56J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field56J> getField56J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("56J");
			final List<Field56J> result = new ArrayList<Field56J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field56J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 57A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 57A at MT340 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 57D at MT340 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 57J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 57J at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field57J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field57J> getField57J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("57J");
			final List<Field57J> result = new ArrayList<Field57J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field57J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 58A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 58A at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field58A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field58A> getField58A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("58A");
			final List<Field58A> result = new ArrayList<Field58A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field58A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 58D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 58D at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field58D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field58D> getField58D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("58D");
			final List<Field58D> result = new ArrayList<Field58D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field58D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 58J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 58J at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field58J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field58J> getField58J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("58J");
			final List<Field58J> result = new ArrayList<Field58J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field58J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 18A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 18A at MT340 are expected at one sequence or across several sequences.
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
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 30F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 30F at MT340 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 32H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 32H at MT340 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22L at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22L> getField22L() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22L");
			final List<Field22L> result = new ArrayList<Field22L>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22L(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 91A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 91A at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field91A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field91A> getField91A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("91A");
			final List<Field91A> result = new ArrayList<Field91A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field91A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 91D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 91D at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field91D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field91D> getField91D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("91D");
			final List<Field91D> result = new ArrayList<Field91D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field91D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 91J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 91J at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field91J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field91J> getField91J() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("91J");
			final List<Field91J> result = new ArrayList<Field91J>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field91J(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22M, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22M at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22M objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22M> getField22M() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22M");
			final List<Field22M> result = new ArrayList<Field22M>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22M(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22N, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22N at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22N objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22N> getField22N() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22N");
			final List<Field22N> result = new ArrayList<Field22N>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22N(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22P at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22P objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22P> getField22P() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22P");
			final List<Field22P> result = new ArrayList<Field22P>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22P(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22R at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22R> getField22R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22R");
			final List<Field22R> result = new ArrayList<Field22R>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22R(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22S at MT340 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22S> getField22S() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22S");
			final List<Field22S> result = new ArrayList<Field22S>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22S(tags[i].getValue()));
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
		* Last mandatory tagname of the sequence: <em>"77H"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "77H"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "14C"   };

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
		* Last mandatory tagname of the sequence: <em>"14F"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "14F"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

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
 


	public static class SequenceB1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"30V"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "30V"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"38D"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "38D"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceB1 newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceB1 newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceB1 result = new SequenceB1();

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
	* Get the single occurrence of SequenceB1 delimited by {@value SequenceB1#START} and {@value SequenceB1#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceB1 getSequenceB1() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceB1.START, SequenceB1.END, SequenceB1.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceB1: is null");
				} else {
					log.fine("content for sequence SequenceB1: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceB1();
			} else {
				return new SequenceB1(content);
			}
		}
		return null;
	}
 


	public static class SequenceB2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB2() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB2(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"38G"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "38G"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"22B"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "22B"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceB2 newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceB2 newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceB2 result = new SequenceB2();

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
	* Get the single occurrence of SequenceB2 delimited by {@value SequenceB2#START} and {@value SequenceB2#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceB2 getSequenceB2() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceB2.START, SequenceB2.END, SequenceB2.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceB2: is null");
				} else {
					log.fine("content for sequence SequenceB2: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceB2();
			} else {
				return new SequenceB2(content);
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
		* Last mandatory tagname of the sequence: <em>"57A", "57D", "57J"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "57A", "57D", "57J"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "58A", "58D", "58J"   };

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
		* Last mandatory tagname of the sequence: <em>"57A", "57D", "57J"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "57A", "57D", "57J"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{ "58A", "58D", "58J"   };

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
		* tagname of the first tag in the sequence which must be mandatory.
		* may be null if we cannot determine this safely
		*/
		public static final String START_NAME =  "15E"  ;
	}




	public static class SequenceF extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceF() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceF(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"15F"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "15F"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"57A", "57D", "57J"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "57A", "57D", "57J"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceF newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceF newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceF result = new SequenceF();

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
	* Get the single occurrence of SequenceF delimited by {@value SequenceF#START} and {@value SequenceF#END} .
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* If block 4 is empty this method returns <code>null</code>.
	*/ 
	public SequenceF getSequenceF() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final SwiftTagListBlock content = b4.getSubBlockDelimitedWithOptionalTail(SequenceF.START, SequenceF.END, SequenceF.TAIL);
			if (log.isLoggable(java.util.logging.Level.FINE)) {
				if (content == null) {
					log.fine("content for sequence SequenceF: is null");
				} else {
					log.fine("content for sequence SequenceF: "+content.tagNamesList());
				}
			}
			if (content == null) {
				return new SequenceF();
			} else {
				return new SequenceF(content);
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
		* Last mandatory tagname of the sequence: <em>"32H"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "32H"   };
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
 


	public static class SequenceG extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceG() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceG(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* tagname of the first tag in the sequence which must be mandatory.
		* may be null if we cannot determine this safely
		*/
		public static final String START_NAME =  "15G"  ;
	}




	public static class SequenceG1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceG1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceG1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* tagname of the first tag in the sequence which must be mandatory.
		* may be null if we cannot determine this safely
		*/
		public static final String START_NAME =  "22L"  ;
	}




	public static class SequenceG1a extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceG1a() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceG1a(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"22M"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "22M"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"22N"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "22N"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceG1a newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceG1a newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceG1a result = new SequenceG1a();

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
	* Get the list of SequenceG1a delimited by  {@value SequenceG1a#START} and {@value SequenceG1a#END} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* 
	*/
	public List<SequenceG1a> getSequenceG1aList() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final List<SequenceG1a> result = new ArrayList<SequenceG1a>();
			final List<SwiftTagListBlock> bs = b4.getSubBlocksDelimitedWithOptionalTail(SequenceG1a.START, SequenceG1a.END, SequenceG1a.TAIL); 
			if (bs != null && !bs.isEmpty()) {
				for (final SwiftTagListBlock s : bs) {
					result.add(new SequenceG1a(s));
				}
			}
			return result;
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 


	public static class SequenceG1a1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceG1a1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceG1a1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"22P"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "22P"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"22R"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] END = { "22R"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		public static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		public static SequenceG1a1 newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		public static SequenceG1a1 newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceG1a1 result = new SequenceG1a1();

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
	* Get the list of SequenceG1a1 delimited by  {@value SequenceG1a1#START} and {@value SequenceG1a1#END} 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* 
	*/
	public List<SequenceG1a1> getSequenceG1a1List() {
		if (getSwiftMessage() == null) {
			throw new RuntimeException("SwiftMessage is null");
		}
		final SwiftBlock4 b4 = getSwiftMessage().getBlock4();
		if (b4 != null && !b4.isEmpty()) {
			final List<SequenceG1a1> result = new ArrayList<SequenceG1a1>();
			final List<SwiftTagListBlock> bs = b4.getSubBlocksDelimitedWithOptionalTail(SequenceG1a1.START, SequenceG1a1.END, SequenceG1a1.TAIL); 
			if (bs != null && !bs.isEmpty()) {
				for (final SwiftTagListBlock s : bs) {
					result.add(new SequenceG1a1(s));
				}
			}
			return result;
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 





}
