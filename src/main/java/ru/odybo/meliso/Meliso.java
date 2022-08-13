/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author vragos
 */


public class Meliso {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String retval;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter r = new StringWriter();
        int b;
        while ((b = reader.read()) != -1) {
            r.write(b);
        }
        retval = r.toString();
        return retval;

    /*
    // этот код по непонятным причинам не проходит тест
    String currentLine;
    StringBuilder myResult = new StringBuilder();
    try (inputStream) {
        BufferedReader bufferReader = new BufferedReader(
                new InputStreamReader(inputStream, charset));
        while ( (currentLine = bufferReader.readLine()) != null ) {
            myResult.append(currentLine);
            myResult.append(System.lineSeparator());
        }
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
    }
    // myResult.deleteCharAt(myResult.length() - 1);
    return myResult.toString();
    */
    }


    public static void main(String args[]) throws IOException {
        /*
        OutputStream outputStream       = new FileOutputStream("output_stream.txt");
        Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);
        // writer.append("QQЙ");
        writer.write('ф');
        writer.close();
         */
    }
}
