package org.example.exercise02;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);

        GenericMethods gm = new GenericMethods();

        gm.print(person, "Hello", 42);
        gm.print(3.14, true, "Generic Example");
    }

}
