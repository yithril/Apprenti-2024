package org.example;

public class Main {
    public static void main(String[] args) {
        //instantiate a bank account
        BankAccount bobsAccount = new BankAccount(100, "Bob", "Jones");

        bobsAccount.deposit(500);
        bobsAccount.withdraw(100);

        System.out.println("Bob's balance is: " + bobsAccount.getBalance());
    }
}