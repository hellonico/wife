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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * Base class for common attributes of MT and MX SWIFT messages.
 * <br />
 * Most of the attributes are derived from the raw message, so
 * it is an application responsibility to grant consistency
 * of the redundant information.
 * 
 * @author www.prowidesoftware.com
 * @since 7.0
 */
public abstract class AbstractSwiftMessage implements Serializable {
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(AbstractSwiftMessage.class.getName());
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier (used for ORM)
	 */
	private Long id;
	/**
	 * Raw message content
	 */
	private String message;
	/**
	 * Message type identification as specify by SWIFT.
	 * This may contain an MT number or an XML name.
	 */
	private String identifier;
	/**
	 * Senders BIC code
	 */
	private String sender;
	/**
	 * Receivers BIC code
	 */
	private String receiver;
	/**
	 * Direction from application perspective;
	 * message is sent to SWIFT are outgoing and
	 * messages received from SWIFT are incoming.
	 */
	private MessageIOType direction;
	/**
	 * Proprietary checksum calculated with the raw message for integrity checks
	 */
	private String checksum;
	/**
	 * Last modification date and time
	 */
	private Calendar lastModified = Calendar.getInstance();
	/**
	 * Creation date and time
	 */
	private Calendar creationDate = Calendar.getInstance();
	/**
	 * Status history for this message.
	 * current status is the last one in the list
	 */
	private List<SwiftMessageStatusInfo> statusTrail;
	/**
	 * Current status name
	 */
	private String status;
	/**
	 * User notes history attached to this message.
	 */
	private List<SwiftMessageNote> notes;
	/**
	 * Flexible property container to extend message metadata
	 */
	private Map<String, String> properties = new HashMap<String, String>();
	/**
	 * Original filename if applicable
	 */
	private String filename;

	public AbstractSwiftMessage() {
		super();
	}
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}

    /**
     * Set the raw content of the message.
     * @param message raw content of the message
     */
    public void setMessage(String message) {
		this.message = message;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getChecksum() {
		return checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	public Calendar getLastModified() {
		return lastModified;
	}
	public void setLastModified(Calendar lastModified) {
		this.lastModified = lastModified;
	}
	public Calendar getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
	public List<SwiftMessageNote> getNotes() {
		return notes;
	}
	public void setNotes(List<SwiftMessageNote> notes) {
		this.notes = notes;
	}
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	public List<SwiftMessageStatusInfo> getStatusTrail() {
		return statusTrail;
	}
	public void setStatusTrail(List<SwiftMessageStatusInfo> statusTrail) {
		this.statusTrail = statusTrail;
	}
	
	/**
	 * Get the name of the last status set to this message, or <code>null</code> if none is found.
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Sets the status attribute. Notice that this method does not update the status trail.
	 * @see #addStatus(SwiftMessageStatusInfo)
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public MessageIOType getDirection() {
		return direction;
	}

	public void setDirection(MessageIOType direction) {
		this.direction = direction;
	}
	
	public String PROPERTY_NAME = "name";
	/**
	 * Get the value of the property under the {@link #PROPERTY_NAME} key or <code>null</code> if not found
	 */
	public String getMessageName() {
		Map<String, String> p = getProperties();
		if (p!=null && p.containsKey(PROPERTY_NAME) && StringUtils.isNotBlank(p.get(PROPERTY_NAME))) {
			return p.get(PROPERTY_NAME);
		}
		return null;
	}
	
	/**
	 * Adds a status to the message's status trail and current status attribute, initializing the statuses trail list if necessary.
	 * @param status the status to add
	 */
	public void addStatus(SwiftMessageStatusInfo status) {
		if (status != null) {
			if (this.statusTrail==null) {
				this.statusTrail= new ArrayList<SwiftMessageStatusInfo>();
			}
			this.statusTrail.add(status);
			setStatus(status.getName());
		}
	}
		
	/**
	 * @return true if the message is outgoing (sent to SWIFT), false other case; using the direction attribute.
	 */
	public boolean isOutgoing() {
		return this.direction == MessageIOType.outgoing;
	}
	
	/**
	 * @see #isOutgoing()
	 */
	public boolean isInput() {
		return isOutgoing();
	}

	/**
	 * @return true if the message is incoming (received from SWIFT), false other case; using the direction attribute.
	 */
	public Boolean isIncoming() {
		return this.direction == MessageIOType.incoming;
	}

	/**
	 * @see #isIncoming()
	 */
	public Boolean isOutput() {
		return isIncoming();
	}
	
	/**
	 * @see #addStatus(SwiftMessageStatusInfo)
	 */
	public void setStatus(SwiftMessageStatusInfo status) {
		addStatus(status);
	}
		
	/**
	 * Returns true if the current status is equals to the parameter status
	 * @param status
	 */
	public boolean isStatus(String status) {
		return StringUtils.equals(status, getStatus());
	}

	/**
	 * Returns true if the current status is equals to the parameter status
	 * @param status
	 */
	@SuppressWarnings("rawtypes")
	public boolean isStatus(Enum status) {
		if (status != null) {
			return isStatus(status.name());
		} else {
			return false;
		}
	}

	/**
	 * Retrieves from the status trail, the current status info; or <code>null</code> if none is found.
	 */
	public SwiftMessageStatusInfo getStatusInfo() {
		List<SwiftMessageStatusInfo> l = getStatusTrail();
		if ((l!=null) && !l.isEmpty()) {
			return l.get(l.size()-1);
		}
		return null;
	}

	/**
	 * Retrieves from the status trail, the status info before the current one; or <code>null</code> if none is found.
	 */
	public SwiftMessageStatusInfo getPreviousStatusInfo() {
		List<SwiftMessageStatusInfo> l = getStatusTrail();
		if ((l!=null) && !l.isEmpty()) {
			return l.get(l.size() -2);
		}
		return null;
	}
	
	/**
	 * Tell if this message has any of the given statuses in his status <b>trail</b>
	 * @param statuses a list of statuses to check in the status trail
	 */
	@SuppressWarnings("rawtypes")
	public boolean contains(Enum ... statuses) {
		boolean result = false;
		List<SwiftMessageStatusInfo> l = getStatusTrail();
		if (l != null && !l.isEmpty()) {
			for (SwiftMessageStatusInfo s : getStatusTrail()) {
				for (Enum e : statuses) {
					if (e != null && StringUtils.equals(s.getName(), e.name())) {
						result = true;
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Tell if this message has any of the given statuses in his status <b>trail</b>
	 * @param statuses a list of statuses to check in the status trail
	 */
	public boolean contains(String ... statuses) {
		boolean result = false;
		List<SwiftMessageStatusInfo> l = getStatusTrail();
		if (l != null && !l.isEmpty()) {
			for (SwiftMessageStatusInfo s : getStatusTrail()) {
				for (String e : statuses) {
					if (e != null && StringUtils.equals(s.getName(), e)) {
						result = true;
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Tell if this message has any of the given statuses as <b>current</b> status
	 * @param statuses
	 */
	public boolean isStatus(String ... statuses) {
		for (String s : statuses) {
			if (isStatus(s)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Tell if this message has any of the given statuses as <b>current</b> status
	 * @param statuses
	 */
	@SuppressWarnings("rawtypes")
	public boolean isStatus(Enum ... statuses) {
		for (Enum e : statuses) {
			if (e != null && isStatus(e.name())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Get the last saved status data of this message or empty string if not found
	 * @param statuses an array of statuses to check data into, if <code>null</code> all message statuses are checked for data
	 * @return the most recent (last) status data found
	 */
	public String getLastData(String ...statuses) {
		List<SwiftMessageStatusInfo> l = getStatusTrail();
		if (l != null && !l.isEmpty()) {
			for (int i=l.size()-1; i>=0 ;i--) {
				String d = l.get(i).getData();
				if (d != null && (statuses == null || ArrayUtils.contains(statuses, l.get(i).getName()))) {
					return d;
				}
			}
		}
		return "";
	}
	
	public String getLastData() {
		return getLastData((String[])null);
	}
	
	/**
	 * Finds the first status info from the status trail, with the given name or returns <code>null</code> if not found
	 */
	public SwiftMessageStatusInfo findStatusInfo(String statusName) {
		List<SwiftMessageStatusInfo> l = getStatusTrail();
		if (l != null && !l.isEmpty()) {
			for (SwiftMessageStatusInfo sms : l) {
				if (StringUtils.equals(statusName, sms.getName()))
					return sms;
			}
		}
		return null;
	}
	
	/**
	 * Adds a new note to the messages, initializing the notes list if necessary.
	 * @param n note to add
	 */
	public void addNote(SwiftMessageNote n) {
	    if (notes==null) {
	    	notes = new ArrayList<SwiftMessageNote>();
	    }
	    notes.add(n);
	}
	
	/**
	 * Iterate message properties and truncate all needed values issuing a log entry for each truncated one
	 */
	public void sanityCheckProperties() {
		try {
			final Map<String, String> p = getProperties();
			for (String k : p.keySet()) {
				String v = p.get(k);
				if (v!=null && v.length()>500) {
					log.severe("Value for key="+k+" too long, will be truncated. value="+v);
					v = v.substring(0, 500);
					p.put(k, v);
				}
				if (k.length()>200) {
					log.severe("Key too long: "+k+" will be truncated");
					p.remove(k);
					p.put(k.substring(0, 200), v);
				}
			}
		} catch (Exception e) {
			log.log(java.util.logging.Level.WARNING, "Error cheking properties", e);
		}
	}
		
	/**
	 * Get the value of the property under the given key or <code>null</code> if the key is not found or its value is empty
	 */
	public String getProperty(String key) {
		Map<String, String> p = getProperties();
		if (p!=null && p.containsKey(key) && StringUtils.isNotBlank(p.get(key))) {
			return p.get(key);
		}
		return null;
	}
	
	/**
	 * @see #getProperty(String)
	 */
	@SuppressWarnings("rawtypes")
	public String getProperty(Enum key) {
		return getProperty(key.name());
	}

	/**
	 * Sets a property using the given key and value, if the key exists the value is overwritten.
	 */
	public void setProperty(String key, String value) {
		if (getProperties() == null) {
			setProperties(new HashMap<String, String>());
		}
		if (StringUtils.isNotBlank(value)) {
			getProperties().put(key, value);
		}
	}

	/**
	 * @see #setProperty(String, String)
	 */
	@SuppressWarnings("rawtypes")
	public void setProperty(Enum key, String value) {
		setProperty(key.name(), value);
	}
	
	/**
	 * Returns true if the message has a property with the given key name and value "true"
	 */
	public boolean getPropertyBoolean(final String key) {
		return StringUtils.equals("true", getProperty(key));
	}
	
	/**
	 * @see #getPropertyBoolean(String)
	 */
	@SuppressWarnings("rawtypes")
	public boolean getPropertyBoolean(final Enum key) {
		return getPropertyBoolean(key.name());
	}
	
	/**
	 * Returns the internal unique id as fixed length string, padded with zeros.
	 * @return string with 10 characters with this message identifier
	 */
	public String getPaddedId() {
		String id = this.id != null? this.id.toString() : "0";
		return StringUtils.leftPad(id, 10, "0");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((checksum == null) ? 0 : checksum.hashCode());
		result = prime * result
				+ ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result
				+ ((direction == null) ? 0 : direction.hashCode());
		result = prime * result
				+ ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result
				+ ((lastModified == null) ? 0 : lastModified.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result
				+ ((receiver == null) ? 0 : receiver.hashCode());
		result = prime * result + ((sender == null) ? 0 : sender.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		AbstractSwiftMessage other = (AbstractSwiftMessage) obj;
		if (checksum == null) {
			if (other.checksum != null)
				return false;
		} else if (!checksum.equals(other.checksum))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (direction != other.direction)
			return false;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		if (lastModified == null) {
			if (other.lastModified != null)
				return false;
		} else if (!lastModified.equals(other.lastModified))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (receiver == null) {
			if (other.receiver != null)
				return false;
		} else if (!receiver.equals(other.receiver))
			return false;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

    public abstract AbstractSwiftMessage readFile(File file) throws IOException;

}
