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
package com.prowidesoftware.swift.model;

/**
 * Helper class to validate a BIC
 * 
 * @author www.prowidesoftware.com
 * @since 3.3
 * @version $Id: BIC.java,v 1.2 2014/03/05 22:03:04 sebastian Exp $
 */
public class BIC {
	private String invalidCause = null;
	private String bic;
	private String subtype = null;
	
	/**
	 * Constructor with bic code
	 * @param bic the bic code to use in this bic
	 */
	public BIC(String bic) {
		this.bic = bic;
	}
	/**
	 * Default constructor
	 */
	public BIC() {
	}
	/**
	 * Get the bic code of this bic.
	 * This method does not guarantee that the bic is valid. use {@link #isValid()}
	 * 
	 * @return a string with the code
	 */
	public String getBic() {
		return bic;
	}
	/**
	 * Set the bic code for this bic
	 * @param bic the bic code
	 */
	public void setBic(String bic) {
		this.bic = bic;
	}
	/**
	 * Get a human readable (english) string that gives information about why the bic was found invalid.
	 * @return a string or <code>null</code> if there's no invalid cause set
	 */
	public String getInvalidCause() {
		return invalidCause;
	}
	
	/**
	 * Validate a bic.
	 * Currently only checks that lenght is 8 or 11 and the country code is valid
	 * 
	 * @return <code>true</code> if the bic is found to be valid and <code>false</code> in other case
	 * @throws IllegalStateException if bic is <code>null</code>
	 */
	public boolean isValid() {
		if (this.bic==null)
			throw new IllegalStateException("bic is null");
		this.invalidCause = null;
		if ( !( this.bic.length() == 8 || this.bic.length() == 11)) {
			this.invalidCause = "BIC must be 8 or 11 chars, got "+this.bic.length();
			return false;
		}
		final String country = this.bic.substring(4,6);
		if (!ISOCountries.getInstance().isValidCode(country.toUpperCase())) {
			this.invalidCause = "Invalid country code: "+country;
			return false;
		}
		return true;
	}
	
	/**
	 * If the BIC has 11 characters it returns the last three that conform the branch,
	 * else it returns "XXX".
	 * 
	 * @since 7.4
	 * @return the BIC's branch part or a default branch value.
	 */
	String getBranch() {
		if (this.bic != null && this.bic.length() == 11) {
			return this.bic.substring(8,11);
		} else {
			return "XXX";
		}
	}
	
	/**
 	 * @since 7.4
	 */
	public String getSubtype() {
		return subtype;
	}
	
	/**
 	 * @since 7.4
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bic == null) ? 0 : bic.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BIC other = (BIC) obj;
		if (bic == null) {
			if (other.bic != null)
				return false;
		} else if (!bic.equals(other.bic))
			return false;
		return true;
	}

}
