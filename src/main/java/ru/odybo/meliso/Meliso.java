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

    public static void main(String args[]) throws IOException {
        /*
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 2;
        String outText = "There are " + weekends.length + "  weekends in a week";
        int[] myData = {1, 2, 3, 4};
        for (int i = 0; i < myData.length; i++ ) {
            System.out.println(":" + myData[i]);
            myData[i] = 0;
        }
        System.out.println("***");
        for (int item: myData) {
            System.out.println(":" + item);
            item = 0;
        }
        */
        String outText = args[0];
        System.out.println(outText);
        fileOutputStreamByteSubSequence("tmp.file", (String) outText);
    }
}
