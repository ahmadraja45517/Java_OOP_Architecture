package com.ahmad.polymorphism;

public class Student extends User {
    private double cgpa;
    private int rollno;

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

    @Override
    void searchCompany(){
        System.out.println("Searching all available companies in India  ...");
    }

    void searchCompany(String role){
        System.out.println("Searching for " + role + " roles...");
    }

    void searchCompany(String role, double minPackage){
        System.out.println("Searching for " + role + " roles with minimum package of " + minPackage);
    }

    public double getCgpa(){
        this.cgpa = 8.13;
        return cgpa;
    }

    public void setCgpa(double newCgpa){
        if(newCgpa >= 0 && newCgpa <= 10){
            this.cgpa = newCgpa;
        }else{
            System.out.println("Invalid CGPA detected!");
        }
    }

    public void accessDashboard(){
        System.out.println("Opening Admin HR Dashboard...");
    }
}