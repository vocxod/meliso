/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

import java.io.*;
import java.nio.*;
import java.util.*;

/**
 *
 * @author vragos
 */


public class Meliso {

    public static void main(String... args) {
        double result = 0.0;
        double d;
        Scanner scanner;
        // scanner = new Scanner(System.in).useDelimiter("\n||\\s");
        scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                d = scanner.nextDouble();
                result += d;
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", result);
    }
}

