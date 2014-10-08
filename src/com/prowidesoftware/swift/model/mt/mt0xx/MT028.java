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
package com.prowidesoftware.swift.model.mt.mt0xx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 028<br /><br />
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT028 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT028.class.getName());

	/**
	 * Creates an MT028 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT028 content
	 */
	public MT028(SwiftMessage m) {
		super(m);
	}

	/**
	 * Creates an MT028 initialized with a new SwiftMessage
	 */
	public MT028() {
		super();
	}
	
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "028";
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 103, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 103 at MT028 is expected to be the only one.
	 * 
	 * @return a Field103 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field103 getField103() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("103");
			if (t == null) {
				log.fine("field 103 not found");
				return null;
			} else {
				return new Field103(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 243, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 243 at MT028 is expected to be the only one.
	 * 
	 * @return a Field243 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field243 getField243() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("243");
			if (t == null) {
				log.fine("field 243 not found");
				return null;
			} else {
				return new Field243(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 177, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 177 at MT028 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field177 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field177> getField177() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("177");
			final List<Field177> result = new ArrayList<Field177>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field177(tags[i].getValue()));
			}
			return result;
		}
	}
	

/*
 * sequences code
 * $$ssh.getSequences() : $ssh.getSequences()
*/



}
