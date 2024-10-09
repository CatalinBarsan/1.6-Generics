package org.example.exercise02;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // toString method to display person details
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age + " years old";
    }
}

