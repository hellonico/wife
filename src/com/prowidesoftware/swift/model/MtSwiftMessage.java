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

import com.prowidesoftware.swift.utils.Lib;
import org.apache.commons.lang.Validate;

import static com.prowidesoftware.swift.utils.Lib.readFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

import com.prowidesoftware.swift.io.parser.SwiftParser;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;

import com.prowidesoftware.swift.io.ConversionService;


/**
 * Object that contains both raw and model representations of an MT SWIFT message.
 * ISO 15022.
 * 
 * @author www.prowidesoftware.com
 * @since 7.0
 */
public class MtSwiftMessage extends AbstractSwiftMessage {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MtSwiftMessage.class.getName());

	private SwiftMessage modelMessage;
	
	/**
	 * Possible Duplicate Emission.
	 */
	private String pde;
	
	/**
	 * Possible Duplicate Message.
	 */
	private String pdm;

	/**
	 * Message Input Reference
	 */
	private String mir;
	
	/**
	 * The MUR is a free-format field in which users may specify their own reference 
	 * of up to 16 characters of the permitted character set, and it is contained 
	 * in a 108 field at the message user header (block 3).
	 */
	private String mur;
	
	/**
	 * User Unique Message Identifier 
	 */
	private String uuid;
	
	public MtSwiftMessage() {
		super();
	}

	/**
	 * @see #updateFromFIN(String)
	 */
	public MtSwiftMessage(final String fin) {
		super();
		updateFromFIN(fin);
	}
	
	/**
	 * @see #updateFromModel(SwiftMessage)
	 */
	public MtSwiftMessage(final SwiftMessage model) {
		super();
		updateFromModel(model);
	}
	
	/**
	 * Sets the raw message and updates the derived attributes and the model message.
	 * @param fin the message to update, cannot be null
	 */
	public void updateFromFIN(final String fin) {
		Validate.notNull(fin, "the raw message parameter cannot be null");
		setMessage(fin);
		updateFromFIN();
	}

	/**
	 * Updates the derived attributes and the model message from the current raw (FIN) message attribute.
	 * @param fin the message to update
	 */
	public void updateFromFIN() {
		Validate.notNull(getMessage(), "the raw message attribute cannot be null");
		SwiftMessage model = (new ConversionService()).getMessageFromFIN(getMessage());
		Validate.notNull(model, "the raw message parameter could not be parsed into a SwiftMessage");
		this.modelMessage = model;
		updateAttributesFromModel();
	}

	/**
	 * Sets the model message and updates the derived attributes and the raw message.
	 * @param model the message to update, cannot be null
	 */
	public void updateFromModel(SwiftMessage model) {
		Validate.notNull(model, "the model message cannot be null");
		setModelMessage(model);
		updateFromModel();
	}
	
	/**
	 * Updates the derived attributes and the raw message from the current model message attribute.
	 */
	public void updateFromModel() {
		Validate.notNull(this.modelMessage, "the model message cannot be null");
		String fin = (new ConversionService()).getFIN(this.modelMessage);
		Validate.notNull(fin, "the raw message could not be created from the SwiftMessage parameter");
		setMessage(fin);
		updateAttributesFromModel();
	}
	
	/**
	 * Updates the derived attributes from the model attribute.
	 * This method does not set the model nor the raw message.
	 */
	private void updateAttributesFromModel() {
		setIdentifier(getModelMessage().getType());
		setSender(getModelMessage().getSender());
		setReceiver(getModelMessage().getReceiver());
		setDirection(getModelMessage().getDirection());
		setChecksum(SwiftMessageUtils.calculateChecksum(getModelMessage()));
		setPde(getModelMessage().getPDE());
		setPdm(getModelMessage().getPDM());
		setMir(getModelMessage().getMIR());
		setMur(getModelMessage().getMUR());
		setUuid(getModelMessage().getUUID());
		setLastModified(Calendar.getInstance());
	}
	
	/**
	 * If the modelMessage attribute is set, its value is returned.
	 * If the attribute is not set and the raw message is set, 
	 * the raw message is parsed into a SwiftMessage object, set to the attribute and returned.
	 * 
	 * @return the model message or null if the model and the raw messages are null.
	 */
	public SwiftMessage getModelMessage() {
		if (this.modelMessage == null && getMessage() != null) {
			ConversionService cs = new ConversionService();
			this.modelMessage = cs.getMessageFromFIN(getMessage());
		}
		return modelMessage;
	}

	public void setModelMessage(final SwiftMessage modelMessage) {
		this.modelMessage = modelMessage;
	}

	/**
	 * Get the message type set in the identifier attribute.
	 * @see #getIdentifier()
	 */
	public String getMessageType() {
		return getIdentifier();
	}

	/**
	 * Get the integer value of the {@link #getMessageType()} 
	 * or null if the identifier attribute is not set or not a number
	 */
	public Integer getMessageTypeInt() {
		if (getIdentifier() != null && StringUtils.isNumeric(getIdentifier())) {
			return Integer.parseInt(getMessageType());
		} else {
			return null;
		}
	}	
	
	/**
	 * Get the value of the property under the {@link #PROPERTY_NAME} key or the result of {@link #getMessageType()}
	 * @return
	 */
	@Override
	public String getMessageName() {
		String name = getMessageName();
		if (name != null) {
			return name;
		} else {
			return getMessageType();
		}
	}
	
	/**
	 * Tell if this message is any of the given types.
	 * 
	 * @param type a variable list of integers for testing to match as the current message type 
	 * @return <code>true</code> if the current message type is any of the integers given as parameters, and <code>false</code> in any other case
	 */
	public boolean isType(Integer ... type) {
		for (Integer integer : type) {
			if (isType(integer.intValue())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Test if this message is a given specific type.
	 * 
	 * @param type the message type given as int, to test
	 * @return <code>true</code> if this message type is the <code>type</code> given, or <code>false</code> in any other case
	 */
	public boolean isType(int type) {
		String compare;
		if (type<10) {
			compare = "00"+type;
		} else if (type<100) {
			compare = "0"+type;
		} else {
			compare = StringUtils.EMPTY+type;
		}
		return StringUtils.equals(compare, getMessageType());
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("MtSwiftMessage id=").append(getId()).append(" parsedMessage=").append(getMessage());
		return sb.toString();
	}
		
	public String getPde() {
		return pde;
	}

	public void setPde(String pde) {
		this.pde = pde;
	}

	public String getPdm() {
		return pdm;
	}

	public void setPdm(String pdm) {
		this.pde = pdm;
	}

	public String getMir() {
		return mir;
	}

	public void setMir(String mir) {
		this.mir = mir;
	}

	public String getMur() {
		return mur;
	}

	public void setMur(String mur) {
		this.mur = mur;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mir == null) ? 0 : mir.hashCode());
		result = prime * result + ((mur == null) ? 0 : mur.hashCode());
		result = prime * result + ((pde == null) ? 0 : pde.hashCode());
		result = prime * result + ((pdm == null) ? 0 : pdm.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MtSwiftMessage other = (MtSwiftMessage) obj;
		if (mir == null) {
			if (other.mir != null)
				return false;
		} else if (!mir.equals(other.mir))
			return false;
		if (mur == null) {
			if (other.mur != null)
				return false;
		} else if (!mur.equals(other.mur))
			return false;
		if (pde == null) {
			if (other.pde != null)
				return false;
		} else if (!pde.equals(other.pde))
			return false;
		if (pdm == null) {
			if (other.pdm != null)
				return false;
		} else if (!pdm.equals(other.pdm))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

    @Override
    public MtSwiftMessage readFile(File file) throws IOException {
        final MtSwiftMessage result = new MtSwiftMessage();
        result.setModelMessage(new SwiftParser(new FileInputStream(file)).message());
        result.setMessage(Lib.readFile(file));
        return result;
    }

}
