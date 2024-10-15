package org.example.exercise01;

public class Main {
    // Main method to test
    public static void main(String[] args) {
        // Creating objects with different types and positions
        NoGenericMethods<Integer, String, Double> obj1 = new NoGenericMethods<>(1, "Hello", 3.14);
        NoGenericMethods<String, Integer, Character> obj2 = new NoGenericMethods<>("World", 42, 'A');

        // Printing out the arguments
        System.out.println("Object 1: " + obj1.getArg1() + ", " + obj1.getArg2() + ", " + obj1.getArg3());
        System.out.println("Object 2: " + obj2.getArg1() + ", " + obj2.getArg2() + ", " + obj2.getArg3());
    }
}
