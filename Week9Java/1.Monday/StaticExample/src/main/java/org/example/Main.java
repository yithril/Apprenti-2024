package org.example;

public class Main {
    public static void main(String[] args) {
        //instantiate
        //Lines 7 and 8 are instances of a BankAccount
        BankAccount firstAccount = new BankAccount("Bob Jones", 100, "ABC123");
        BankAccount secondAccount = new BankAccount("Joe Smith", 1000, "E732A");

        System.out.println("The interest rate is: " + BankAccount.interestRate);
        System.out.println("Our bank's swift code is: " + BankAccount.getSwiftCode());
    }
}