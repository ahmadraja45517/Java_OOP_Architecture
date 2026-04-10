package com.ahmad.polymorphism;

public class User {
    String name;
    String email;

    // Default Constructor
    User() {
        this.name = "Ahmad Raza Qadri";
        this.email = "ahmadraza45517@gmail.com";
    }

    // Copy Constructor (Interview Gold)
    User(User other) {
        this.name = other.name;
        this.email = other.email;
    }

    // Parameterized Constructor
    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void searchCompany(){
        System.out.println("Searching all available companies...");
    }

    void displayProfile(){
        System.out.println("Name: " + this.name + "\nEmail: " + this.email);
    }
}