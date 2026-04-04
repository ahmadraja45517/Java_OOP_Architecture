package ahmad;

// 1. Import your classes so Main knows where to find them

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        System.out.println("--- TESTING STUDENTS ---");
//
//        Student ahmad = new Student("Ahmad Raja", 2330679, 8.13, "Backend Developer");
//        Student harshit = new Student("Harshit Khanna", 2330680, 9.75, "Frontend Developer");
//
//        ahmad.displayResume();
//        harshit.displayResume();


//        System.out.println("\n--- TESTING COMPANIES ---");
//
//         Company google = new Company("Google Inc.", "googlehr@gmail.com", "Technology");
//         Company amazon = new Company("Amazon", "amazonhr@gmail.com", "E-commerce & Cloud");
//         Company startup = new Company("Local Startup", "startup@gmail.com", "AI & Data Science");
//
//         google.display();
//         amazon.display();
//         startup.display();

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount(5962, "Ahmad Raza Qadri", 96540.25);
        BankAccount acc3 = new BankAccount(8569, "Amit Verma");

        acc1.display();
        acc2.display();
        acc3.display();

        BankAccount p1 = new BankAccount(101, "Amit", 500.0);
        BankAccount p2 = p1;
        p2.accountHolderName = "Rahul";
        System.out.println(p1.accountHolderName);

//        cannot change the reference of a final object
//        final BankAccount acc = new BankAccount(999, "Secure", 1000.0);
//        acc.balance = 2000.0;
//        BankAccount acc = new BankAccount(888, "Hacked", 0.0);
    }
}