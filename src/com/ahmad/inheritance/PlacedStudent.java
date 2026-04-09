package com.ahmad.inheritance;

public class PlacedStudent extends Student {
    String companyName;
    double packageLPA;

    PlacedStudent() {
        super(); // Calls the Student default constructor
        this.companyName = "Flipkart";
        this.packageLPA = 12;
    }

    PlacedStudent(PlacedStudent other) {
        super(other);
        this.companyName = other.companyName;
        this.packageLPA = other.packageLPA;
    }

    public PlacedStudent(String name, String email, double cgpa, int rollno, String companyName, double packageLPA) {
        super(name, email, cgpa, rollno); // Sends 4 variables up to Student
        this.companyName = companyName;
        this.packageLPA = packageLPA;
    }
}