package com.p5.adoptions.model;

/**
 * An interfaces defines behavior
 * If there are fields they are public static
 * pluses:
 * Generic method implementation
 * defines a contract beetween classes
 * Minuses:
 * only public static fields
 * public methods
 */

public interface AnimalInterface {

    String hello = "Hello from animal kingdom";
    public String howManyLegs();

    /**
     * Generic implementation, does not depend on details at class level
     * nu permite constructori
     */
    default String defaultMethod(){
        return "This is a default Method";
    }
}
