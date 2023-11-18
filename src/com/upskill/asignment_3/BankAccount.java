package com.upskill.asignment_3;

class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double initialAmount) {
        this.accountName = accountName;
        this.balance = initialAmount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayAccountInfo() {
        System.out.println("Account name: " + accountName);
        System.out.println("Initial amount: " + balance);
    }

    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount("Savings", 10000);
        BankAccount checkingAccount = new BankAccount("Checking", 20000);

        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(5000);
        savingsAccount.displayAccountInfo();

        checkingAccount.displayAccountInfo();
        checkingAccount.deposit(6000);
        checkingAccount.displayAccountInfo();
    }
}

