/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Optional;

/**
 *
 * @author vragos
 */

class Example<T> {
    T data;
    T[] arrayData[] = null;

    public <T> Example(T data) {
        //this.data = data;
    }
    public void tryNewData(Object obj) {
        T ex = (T) obj;
        
        System.out.println(ex);
        Optional<T> ex2 = Optional.empty();
        System.out.println(ex2);

        if( ex2 instanceof Optional<T>) {
            System.out.println("instanse of");
        } else {
            System.out.println("NOT instanse of");
        }
    }
}

public class Meliso {

    public static void fileOutputStreamByteSubSequence(
            String file, String data) throws IOException {
        byte[] bytes = data.getBytes();
        try (OutputStream out = new FileOutputStream(file)) {
            out.write(bytes, 6, 6);
        }
    }

    public static void main(String args[]) throws IOException {
        Example<String> es = new Example<String>("");
        es.tryNewData(new Object());
    }
}
