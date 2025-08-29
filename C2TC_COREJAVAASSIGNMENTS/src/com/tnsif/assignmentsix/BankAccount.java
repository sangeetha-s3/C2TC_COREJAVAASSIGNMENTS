package com.tnsif.assignmentsix;

//BankAccount.java
public class BankAccount {
 private int accountNumber;
 private double balance;

 // Parameterized constructor
 public BankAccount(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Method to deposit amount
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be positive!");
     }
     balance += amount;
     System.out.println("Deposited: " + amount);
 }

 // Method to withdraw amount
 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be positive!");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds! Current balance: " + balance);
     }
     balance -= amount;
     System.out.println("Withdrawn: " + amount);
 }

 // Method to display balance
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
 }
}