package org.example;

public class BankAccount {
    private double balance;
    private String firstName;
    private String lastName;

    public BankAccount(double balance, String firstName, String lastName) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //derived getter
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;

        if(this.balance < 0){
            applyOverdraft();
        }
    }

    private void applyOverdraft(){
        this.balance -= 35;
    }
}
