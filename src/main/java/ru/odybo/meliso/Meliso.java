/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

/**
 *
 * @author vragos
 */


public class Meliso {

    public static void main(String args[]) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 3;
        System.out.println("There are " + weekends.length + "  weekends in a week");
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

        String s = "Ы";
        byte [] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(((int)b[i] ^ -1 << 8)+" ");
        }
        System.out.print
        for (int i = 0; i < b.length; i++) {
            System.out.print(( (int) b[i] ^ (-1 << 8)) + " ");
        }

    }
}
