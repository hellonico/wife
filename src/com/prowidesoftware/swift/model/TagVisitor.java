package com.prowidesoftware.swift.model;

public interface TagVisitor {

	/**
	 * Visit the current tag
	 * @param tag the current tag
	 * @return <code>true</code> if the visitor should continue with further tags if any or <code>false</code> to abort the visiting process
	 */
	boolean onTag (Tag tag);
}
