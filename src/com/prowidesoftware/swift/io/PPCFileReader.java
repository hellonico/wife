package com.prowidesoftware.swift.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.logging.Logger;

public class PPCFileReader implements Iterator<String>, Iterable<String> {
	private static int BEGIN = 0x01;
	private static int END = 0x03;
	private final FileReader reader;
	private static final Logger log = Logger.getLogger(PPCFileReader.class.getName());
	private int curChar = 0;

	public PPCFileReader(final File file) throws FileNotFoundException {
		this.reader = new FileReader(file);
	}

	public boolean hasNext() {
		final Reader r = getReader();
		while (curChar != -1 && curChar != BEGIN) {
			try {
				curChar = r.read();
			} catch (final IOException e) {
				log.severe("IOException while reading: " + e);
				return false;
			}
		}
		return curChar == BEGIN;
	}

	private Reader getReader() {
		if (this.reader == null) {
			throw new IllegalStateException("reader is null");
		}
		return this.reader;
	}

	public String next() {
		if (curChar == BEGIN) {
			final StringBuilder sb = new StringBuilder();

			boolean done = false;
			do {
				try {
					curChar = this.reader.read();
				} catch (final IOException e) {
					log.severe("error reading: " + e);
					throw new RuntimeException(e);
				}
				if (curChar == -1 || curChar == END) {
					done = true;
				} else {
					sb.append((char) curChar);
				}
			} while (!done);
			return sb.toString();
		} else {
			throw new IllegalStateException("hasNext did not return true but this method was called");
		}
	}

	public void remove() {
		throw new RuntimeException("remove not avaiable in this implementation");
	}

	public Iterator<String> iterator() {
		return this;
	}

}
