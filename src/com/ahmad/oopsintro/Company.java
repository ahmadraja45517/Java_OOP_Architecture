package com.ahmad.oopsintro;

public class Company {
    String companyName;
    String hrEmail;
    String industryType;

    public Company(String companyName, String hrEmail, String industryType) {
        this.companyName = companyName;
        this.hrEmail = hrEmail;
        this.industryType = industryType;
    }

    public void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("HR Email: " + hrEmail);
        System.out.println("Industry: " + industryType);
        System.out.println("--------------------------");
    }
}