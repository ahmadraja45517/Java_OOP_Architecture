package com.ahmad.inheritance;

public class Student extends User {
    double cgpa;
    int rollno;

    Student() {
        super(); // Calls the User default constructor
        this.cgpa = 8.13;
        this.rollno = 679;
    }

    Student(Student other) {
        super(other); // Passes the object up to copy name & email
        this.cgpa = other.cgpa;
        this.rollno = other.rollno;
    }

    public Student(String name, String email, double cgpa, int rollno) {
        super(name, email); // Let the parent handle name and email
        this.cgpa = cgpa;
        this.rollno = rollno;
    }
}