package com.tnsif.assignmentsix;

//MainBanking.java
import java.util.Scanner;

public class MainBanking {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   // Instantiate BankAccount
   BankAccount account = new BankAccount(101, 1000.0);

   try {
       // Deposit
       System.out.print("Enter amount to deposit: ");
       double depositAmount = sc.nextDouble();
       account.deposit(depositAmount);

       // Withdraw
       System.out.print("Enter amount to withdraw: ");
       double withdrawAmount = sc.nextDouble();
       account.withdraw(withdrawAmount);

   } catch (InvalidAmountException | InsufficientFundsException e) {
       System.out.println("Error: " + e.getMessage());
   } finally {
       System.out.println("Final account status:");
       account.displayBalance();
       sc.close();
   }
}
}