package com.p5.adoptions.model;

/** An abstract method allows a method without body
 * An abstract class can not be instantiated
 * Pluses over interface:
 * we can field private static, non-static , protected
 * we can body to function
 * we can abstract methods == interface methods
 * Constructors
 *
 * minuses:
 * limits inheritance, becauase we need to extend this in child, AND WE CAN ONLY EXTENDS ONCE
 */

public  abstract class AbstractAnimal {

    public abstract String whatDoesItEats();
}


