package com.ahmad.polymorphism;

public class Main {
    public static void main(String[] args) {

//        System.out.println("=== TEST 1: The Base User ===");
//        User baseUser = new User("Rahul", "rahul@gmail.com");
//        System.out.println("User created: " + baseUser.name);
        // baseUser has NO access to cgpa, rollno, or department.


//        System.out.println("\n=== TEST 2: The Multilevel Child (PlacedStudent) ===");
        // Watch how it takes 6 arguments, but processes them across 3 different classes!
//        PlacedStudent ahmad = new PlacedStudent(
//                "Ahmad Raza Qadri",        // Handled by User class
//                "ahmadraza45517@gmail.com", // Handled by User class
//                8.0,                       // Handled by Student class
//                2330679,                   // Handled by Student class
//                "Google",                  // Handled by PlacedStudent class
//                25.5                       // Handled by PlacedStudent class
//        );

        // THE PROOF: Can this object access variables from all three levels?
//        System.out.println("Name: " + ahmad.name);               // Inherited from Level 1
//        System.out.println("Email: " + ahmad.email);             // Inherited from Level 1
//        System.out.println("Roll No: " + ahmad.rollno);          // Inherited from Level 2
//        System.out.println("CGPA: " + ahmad.cgpa);               // Inherited from Level 2
//        System.out.println("Company: " + ahmad.companyName);     // Native to Level 3
//        System.out.println("Package: " + ahmad.packageLPA + " LPA"); // Native to Level 3
//
//        System.out.println("\n=== TEST 3: The Default Constructor (PlacedStudent) ===");
//        PlacedStudent Ahmad = new PlacedStudent();
//        PlacedStudent amit = new PlacedStudent(Ahmad);
//        System.out.println("Company: "+amit.companyName+"\nPackage: "+amit.packageLPA);
//
//        System.out.println("\n=== TEST 4: The Hierarchical Level (Admin) ===");
//        Admin a1 = new Admin("Harshit", "harshit@gmail.com", "CSE APEX");
//        System.out.println("Name: " + a1.name + "\nEmail: "+ a1.email + "\nDepartment: "+ a1.department);
//        User s1 = new Student();
//        s1.displayProfile();

        User myUser = new User("Ahmad", "ahmad@gmail.com");
        myUser.displayProfile();
    }
}