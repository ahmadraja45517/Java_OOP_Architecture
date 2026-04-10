package com.ahmad.polymorphism;

public class Admin extends User {
    String department;

    Admin() {
        super();
        this.department = "General Administration";
    }

    Admin(Admin other) {
        super(other);
        this.department = other.department;
    }

    public Admin(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }
}