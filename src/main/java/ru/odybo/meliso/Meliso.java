/*
 * No licence.
 */
package ru.odybo.meliso;

import java.io.*;

/**
 *
 * @author vragos
 */


public class Meliso {

    public static void myPrint(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] inData = new byte[16];
        int nRead;
        try (inputStream; outputStream) {
            while (( nRead = inputStream.read(inData, 0, inData.length)) != -1 ) {
                for (int i = 0; i < nRead; i++ ) {
                    if ( (inData[i] % 2) == 0 ) {
                        // System.out.print(inData[i] + ":");
                        outputStream.write(inData[i]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new IOException();
        }
    }

    public static void main(String args[]) throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7 });
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        myPrint(is, buffer);
    }
}
