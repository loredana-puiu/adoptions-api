package com.p5.adoptions.model;

public class Cat extends Animal implements AnimalInterface{

    public Integer purrIntensity;
    public static String staticField = "This is a static field";
    public Cat(String name, String photo) {
        //Super is mandatory if we have a constructor with parameters in base class/ or there are more that 1 constructor
        //MUST BE ON THE FIRST LINE OF THE CHILD'S CONSTRUCTOR
        //invoaca constructorul din clasa de baza si pot sa i dau paramentrii
        super(name, photo);
        System.out.println("Construncting a cat");
        //this (se refera la obiectu curent si ne da acces la toate metodele si fildurile din acel obiect)
         this.purrIntensity = 5;
    }
    public Cat(String name, String photo , Integer purrIntensity) {
        super(name, photo);
        this.purrIntensity = purrIntensity;

    }




    @Override //adnotare
    public  String makeSound(){
        return "Miau";
    }

    @Override
    public String whatDoesItEats() {
        return "Fish";
    }


    @Override
    public String howManyLegs() {
        return "Four";
    }

    // second example of polymorphism OVERLOADING - ometoda poate avea mai multe implementair
    public String customMethodToCats(){
        return "Cats are cool, only cats can do this";
    }

    public String customMethodToCats(String message){
        return message;
    }
}
