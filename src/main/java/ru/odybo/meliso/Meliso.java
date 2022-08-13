/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vragos
 */


public class Meliso {

    public static void main(String... args) throws IOException {
        double result = 0.0D;
        Scanner scanner
        if (args.length == 1) {
            // input data from file in first param
            System.out.printf(Locale.ENGLISH, "Use file %s as input stream", args[0]);
            scanner = new Scanner(new File( args[0]));
        } else {
            // input data from user input Ctrl-D end of input
            scanner = new Scanner(System.in).useDelimiter("\n||\\s");
        }
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                continue;
            }
        }
        System.out.printf(Locale.ENGLISH, "%.6D", result);
    }

}

