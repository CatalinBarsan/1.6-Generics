package org.example.exercise01;

public class Main {
    // Main method to test
    public static void main(String[] args) {
        // Creating an object with specific types
        NoGenericMethods obj = new NoGenericMethods(1, "Hello", 3.14);

        // Printing out the arguments
        System.out.println("Object: " + obj.getArg1() + ", " + obj.getArg2() + ", " + obj.getArg3());
    }
}
