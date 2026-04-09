package com.ahmad.oopsintro;

public class Student {
    String fullname;
    int rollno;
    double cgpa;
    String techStack;

    // The Constructor
    Student(String fullname, int rollno, double cgpa, String techStack) {
        this.fullname = fullname;
        this.rollno = rollno;
        this.cgpa = cgpa;
        this.techStack = techStack;
    }

    public void displayResume() {
        System.out.println("The student name is " + fullname + ", CGPA- " + cgpa + " and student is a " + techStack);
    }
}