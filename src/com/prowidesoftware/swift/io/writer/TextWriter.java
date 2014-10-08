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
 * Created on Sep 6, 2005
 *
 */
package com.prowidesoftware.swift.io.writer;


/**
 * @deprecated user {@link SwiftWriter}
 * 
 * @author www.prowidesoftware.com
 * @version $Id: TextWriter.java,v 1.1 2013/12/06 10:38:40 mgriffa Exp $ 
 */
public class TextWriter 
{
    //private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger( TextWriter.class );

    /**
     * Creates a string with  a swift message for the given object.
     * The message type is selected in the template, which must point to a resource found in classapath.
     * 
     * @param template a valid path to the resource 
     * @param env the object to use to render the message
     * @return the string containing the encoded message
     * @throws IllegalArgumentException if template is <code>null</code> or the the template resource is not found in classpath
     */
    public String buildMessage( String template, Object env )
    {
    	throw new UnsupportedOperationException("Use SwiftWriter");
    }
}
