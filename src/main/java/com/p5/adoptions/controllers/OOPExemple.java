package com.p5.adoptions.controllers;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.Cat;
import com.p5.adoptions.model.Dog;

/**
 * OOP Principles:
 * 1. Abstraction, Model real life scenarios/objects intro java classes and objects
 * 2. Encapsulation, Hide info about classes, allow acces through getter and setter
 * 3. Inheritance, Define a parent class to be extend later
 * 4. Polymorphism, Something that can have multiple foms
 */

public class OOPExemple {
    public static void main(String[] args){

        // Polymorphism example
        Animal animal = new Dog("Roger", "www.google.com");
        System.out.println(animal.makeSound());

        Cat machi = new Cat("Machi", "www.google.com");

        animal = new Cat("Roger", "www.google.com");
        System.out.println(animal.makeSound());

        // make sure that we have a cat  //downcasting
        if (animal instanceof Cat){
            Cat thisIsaCat = (Cat) animal;
            System.out.println(thisIsaCat.customMethodToCats());
        }

        //Static exemple
        Cat cat = new Cat("Capucino", "adasd" , 2);

        int purrIntensity = cat.purrIntensity;
        String staticField = Cat.staticField;



    }
}
