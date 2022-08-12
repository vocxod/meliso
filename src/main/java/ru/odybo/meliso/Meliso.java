/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author vragos
 */


public class Meliso {

    public static void main(String args[]) throws IOException {
        OutputStream outputStream       = new FileOutputStream("output_stream.txt");
        Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);
        // writer.append("QQЙ");
        writer.write('ф');
        writer.close();
    }
}
