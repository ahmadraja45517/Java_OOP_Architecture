package com.ahmad.oopsintro;

public class BankAccount {
    int accNumber;
    String accountHolderName;
    double balance;

    public BankAccount(){
        this(0, "Unknown", 0.0);
        System.out.println("New account created with 0 balance.");
    }

    public BankAccount(int accNumber, String accountHolderName, double balance){
        this.accNumber = accNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BankAccount (int accNumber, String accountHolderName){
        this(accNumber, accountHolderName, 0.0);
    }

    public void display(){
        System.out.println("Account Number: "+accNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: $"+balance);
        System.out.println("--------------------------");
    }
}
