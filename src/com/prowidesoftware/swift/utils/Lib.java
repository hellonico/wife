package com.prowidesoftware.swift.utils;

import java.io.*;

/**
 * Misc library functions
 */
public class Lib {
    private Lib(){}

    /**
     * Read the content of the given file into a string.
     * @param file the file to be read
     * @return the file contents or null if file is null or does not exist, or cant be read, or is not a file
     * @throws IOException if an error occurs during read
     */
    public static String readFile(final File file) throws IOException {
        if (file == null || !file.exists() || !file.canRead() || !file.isFile()) {
            return null;
        }
        final FileInputStream fis = new FileInputStream(file);
        final StringBuilder sb = new StringBuilder((int) file.length());
        try {
            int c = 0;
            while ((c = fis.read()) != -1) {
                sb.append((char)c);
            }
        } finally {
            fis.close();
        }
        return sb.toString();
    }
}
