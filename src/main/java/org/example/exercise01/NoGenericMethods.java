package org.example.exercise01;

public class NoGenericMethods {
    private Object arg1;
    private Object arg2;
    private Object arg3;

    // Constructor
    public NoGenericMethods(Object arg1, Object arg2, Object arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    // Getters and Setters
    public Object getArg1() {
        return arg1;
    }

    public void setArg1(Object arg1) {
        this.arg1 = arg1;
    }

    public Object getArg2() {
        return arg2;
    }

    public void setArg2(Object arg2) {
        this.arg2 = arg2;
    }

    public Object getArg3() {
        return arg3;
    }

    public void setArg3(Object arg3) {
        this.arg3 = arg3;
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating objects with different types and positions
        NoGenericMethods obj1 = new NoGenericMethods(1, "Hello", 3.14);
        NoGenericMethods obj2 = new NoGenericMethods("World", 42, 'A');

        // Printing out the arguments
        System.out.println("Object 1: " + obj1.getArg1() + ", " + obj1.getArg2() + ", " + obj1.getArg3());
        System.out.println("Object 2: " + obj2.getArg1() + ", " + obj2.getArg2() + ", " + obj2.getArg3());
    }
}

