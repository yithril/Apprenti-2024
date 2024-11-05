package org.example;

public class BankAccount {
    //instance members
    private String name;
    private double balance;
    private String accountNumber;
    public static double interestRate = .02;

    public BankAccount(String name, double balance, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static String getSwiftCode(){
        return "DBS23411";
    }

    public static double getInterestedRate(){
        return BankAccount.interestRate;
    }
}
