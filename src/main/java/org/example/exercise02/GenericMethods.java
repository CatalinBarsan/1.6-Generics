package org.example.exercise02;

public class GenericMethods {
    public <T, U, V> void print(T arg1, U arg2, V arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);

        GenericMethods gm = new GenericMethods();

        gm.print(person, "Hello", 42);
        gm.print(3.14, true, "Generic Example");
    }
}

