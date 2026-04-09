package com.ahmad.StaticAndinBuiltMethods;

public class Main {
    public static void main(String[] args) {
//        Human ahmad = new Human(22, "Ahmad Raja", 55000);
//        Human amit = new Human(23, "Amit Verma", 65000);
//        Human harshit = new Human(20, "Harshit Khanna", 60000);
//
//        System.out.println(ahmad.name);
//        System.out.println(Human.population);

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("Memory address of db1: " + db1);
        System.out.println("Memory address of db2: " + db2);

        if (db1 == db2) {
            System.out.println("SUCCESS: They are the exact same object!");
        } else {
            System.out.println("FAILED: They are different objects.");
        }
    }
}
