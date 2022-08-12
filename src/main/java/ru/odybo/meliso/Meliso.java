/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author vragos
 */


public class Meliso {

    public int sumOfStream(InputStream inputStream) throws IOException {
        int mySummOfStream = 0;
        int nRead = 0;
        byte[] myData = new byte[8];
        try (inputStream) {
            while (( nRead = inputStream.read(myData, 0, myData.length)) != -1 ) {
                for (int i = 0; i < myData.length; i++ ) {
                    mySummOfStream += myData[i];
                    myData[i] = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new IOException();
        }
        return mySummOfStream;
    }


    public static void main(String args[]) {



    }
}
