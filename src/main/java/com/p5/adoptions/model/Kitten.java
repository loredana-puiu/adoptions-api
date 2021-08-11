package com.p5.adoptions.model;

//Multimple inheritance

public class Kitten extends Cat{

    public Kitten(String name, String photo) {
        super(name, photo);
        secondSound();
    }
}
