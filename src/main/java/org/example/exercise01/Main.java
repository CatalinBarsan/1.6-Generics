package org.example.exercise01;

public class Main {
    // Main method to test
    public static void main(String[] args) {
        // Creating an object with specific types
        NoGenericMethods obj = new NoGenericMethods("String1", "String2", "String3");

        // Printing out the argumentss
        System.out.println("Object: " + obj.getArg1() + ", " + obj.getArg2() + ", " + obj.getArg3());
    }
}
