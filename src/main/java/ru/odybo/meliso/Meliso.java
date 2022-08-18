/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.meliso;

import java.io.*;
import java.util.Objects;

/**
 *
 * @author vragos
 */


class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public String toString() {
        return this.name;
    }
}

public class Meliso {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CL0 = "\u001B[36m";
    public static final String ANSI_CL1 = "\u001B[31m";
    public static final String ANSI_CL2 = "\u001B[32m";
    public static final String ANSI_CL3 = "\u001B[33m";
    public static final String ANSI_CL4 = "\u001B[34m";
    public static final String ANSI_CL5 = "\u001B[35m";


    public static void main(String args[]) throws Exception {
/*
        int max = Integer.parseInt(args[2]);
        int[] otherArray = new int[max];
        for (int k = 0; k < max; k++) {
            otherArray[k] = k * 2;
        }
        for (int k = 0; k < max; k++) {
            System.out.print(k + ":");
        }
        System.out.println(ANSI_CL5 + "Last max=" + max + ANSI_RESET);
*/

        System.out.println("Start check serialize");
        System.out.println("Melising...");
        int animalLength;
        Animal animal;
        if (args.length != 3) {
            throw new Exception("Need 3 args!");
        }
        String filename = args[1];
        switch (args[0]) {
            case "s":
                // serialize
                System.out.println(ANSI_CL3 + "Serialize" + ANSI_RESET);
                try {
                    animalLength = Integer.parseInt(args[2]);
                    FileOutputStream fos = new FileOutputStream(filename);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeInt(animalLength);
                    for (int i = 0; i < animalLength; i++) {
                        // System.out.println(ANSI_CL4 + i + ANSI_RESET);
                        animal = new Animal("skotinka" + i);
                        oos.writeObject(animal);
                    }
                    oos.close();
                } catch (InvalidClassException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                    System.out.println(e.getCause());
                }
                break;
            case "d":
                // deserialize
                Animal[] animalArray = null;
                try {
                    FileInputStream fis = new FileInputStream(filename);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    animalLength = ois.readInt();
                    System.out.println(ANSI_CL0 + "Animal length: " + animalLength + ANSI_RESET);
                    animalArray = new Animal[animalLength];
                    for (int i = 0; i < animalLength; i++) {
                        animalArray[i] = (Animal) ois.readObject();
                        System.out.print(ANSI_CL0 + animalArray[i].toString() + ANSI_RESET + ":");
                    }
                    ois.close();
                } catch (EOFException ee) {
                    System.out.print(ANSI_CL1);
                    ee.printStackTrace();
                    System.out.println(ee.getMessage());
                    System.out.println(ee.getCause() + ANSI_RESET);
                } catch (NegativeArraySizeException ne) {
                    System.out.print(ANSI_CL0);
                    ne.printStackTrace();
                    System.out.println(ne.getMessage());
                    System.out.println(ne.getCause() + ANSI_RESET);
                } catch (ClassNotFoundException cne) {
                    System.out.print(ANSI_CL3);
                    cne.printStackTrace();
                    System.out.println(cne.getMessage());
                    System.out.println(cne.getCause() + ANSI_RESET);
                } catch (InvalidClassException ice) {
                    System.out.print(ANSI_CL2);
                    ice.printStackTrace();
                    System.out.println(ice.getMessage());
                    System.out.println(ice.getCause() + ANSI_RESET);
                } catch (IOException ioe) {
                    System.out.print(ANSI_CL4);
                    ioe.printStackTrace();
                    System.out.println(ioe.getMessage());
                    System.out.println(ioe.getCause() + ANSI_RESET);
                } catch (ClassCastException cce){
                    System.out.print(ANSI_CL5);
                    cce.printStackTrace();
                    System.out.println(cce.getMessage());
                    System.out.println(cce.getCause() + ANSI_RESET);
                } catch (RuntimeException re) {
                    System.out.print(ANSI_CL3);
                    re.printStackTrace();
                    System.out.println(re.getMessage());
                    System.out.println(re.getCause() + ANSI_RESET);
                }  catch (Exception e) {
                    System.out.print(ANSI_CL4);
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                    System.out.println(e.getCause() + ANSI_RESET);
                }
                break;
            default:
                System.out.println("Unrecognized command");
        }
        System.out.println(ANSI_CL2 + "Quit" + ANSI_RESET);

    }
}
