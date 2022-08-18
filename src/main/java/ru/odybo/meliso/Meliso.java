/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author vragos
 */


public class Meliso {

    public static void fileOutputStreamByteSubSequence(
            String file, String data) throws IOException {
        byte[] bytes = data.getBytes();
        try (OutputStream out = new FileOutputStream(file)) {
            out.write(bytes, 6, 6);
        }
    }

    enum DoW {
            MON, THU, WED, FRY
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Static box is: " + Box.getBox());
    }
}
