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
package com.prowidesoftware.swift.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;

/**
 * Helper class to read a file from a classpath resource and split its content by the '$' symbol.
 * 
 * @author www.prowidesoftware.com
 */
public class ReaderIterator implements Iterable<String>, Iterator<String> {

	private final Reader reader;
	
	public ReaderIterator(Reader r) {
		this.reader = r;
	}
	
	public Iterator<String> iterator() {
		return this;
	}

	public static ReaderIterator fromResource(String string) {
		//InputStream s = Thread.currentThread().getContextClassLoader().getResourceAsStream(string);
		InputStream s = ReaderIterator.class.getClassLoader().getResourceAsStream(string);
		if (s!=null) {
			return new ReaderIterator(new InputStreamReader(s));
		}
		return null;
	}

	public boolean hasNext() {
		try {
			return reader.ready();
		} catch (IOException unused) {
		}
		return false;
	}

	public String next() {
		if (reader!=null) {
			int c;
			StringBuilder sb = new StringBuilder();
			try {
				while ((c=reader.read())!=-1 && (c!='$')) {
					sb.append((char)c);
				}
				if (c==-1)
					reader.close();
			} catch (IOException e) {
				return null;
			}
			return sb.toString();
		}
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
