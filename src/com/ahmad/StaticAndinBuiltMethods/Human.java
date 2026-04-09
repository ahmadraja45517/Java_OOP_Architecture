package com.ahmad.StaticAndinBuiltMethods;

public class Human {
    int age;
    String name;
    double salary;
    static int population;

    Human(int age, String name, double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
}
