package com.prowidesoftware.swift.model;

/**
 * SWIFT business process classification for MX messages.
 * 
 * @author www.prowidesoftware.com
 * @since 7.0
 */
public enum MxBusinessProcess {
	acmt("Account Management"),
	admi("Administration"),
	camt("Cash Management"),
	defp("Derivatives"),
	pacs("Payments Clearing and Settlement"),
	pain("Payments Initiation"),
	reda("Reference Data"),
	seev("Securities Events"),
	semt("Securities Management"),
	sese("Securities Settlement"),
	setr("Securities Trade"),
	trea("Treasury"),
	tsmt("Trade Services Management");
	
	private String description = null;
	
	private MxBusinessProcess(final String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
