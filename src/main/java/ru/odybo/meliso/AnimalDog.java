/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.odybo.meliso;

/**
 *
 * @author vragos
 */

class Animal {
    public String name;
    
    public Animal () {
        int i = 10;
        int j = 30;
        while(i++ < --j);
        System.out.println("Result: " + i + ":" + j);
    }
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void showName() {       
        System.out.println( this.name + " getName result= " + getName() );           
    }
    
}


class Dog extends Animal {
    // public String name; 
    public String tailColor;
    public Dog(String name) {
        this.name = name;
    }  
    
    public void showName() {       
        System.out.println( "Dog:" + this.name + " getName() result= " + getName() );           
    }
}




public class AnimalDog {

    public static void main(String args[]) {
        Dog dog = new Dog("sobakaname");
        System.out.println(dog);
        dog.showName();
        System.out.println("Dog is: " + dog.getName());
        System.out.println("Dog showName()is: " + dog.getName());
        Animal animal = new Animal("skotina");
        System.out.println("Animal is: " + animal.getName());
    }
    
}
