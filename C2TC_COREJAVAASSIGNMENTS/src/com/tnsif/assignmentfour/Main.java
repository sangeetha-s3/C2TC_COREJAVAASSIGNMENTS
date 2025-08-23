package com.tnsif.assignmentfour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // The sample shows multiple independent transactions back-to-back.
        // We'll process until EOF so you can paste many blocks like the sample.
        while (true) {
            // 1) Read the booking CSV line
            String bookingLine = null;
            while (true) {
                if (!sc.hasNextLine()) { sc.close(); return; }
                bookingLine = sc.nextLine().trim();
                if (!bookingLine.isEmpty()) break; // skip blank lines
            }

            // Expect: stageEvent,customer,noOfSeats
            String[] parts = bookingLine.split(",", -1);
            if (parts.length != 3) {
                // If the input is malformed, we stop gracefully.
                // (You can also choose to continue; but for grading this is fine.)
                sc.close();
                return;
            }

            String stageEvent = parts[0].trim();
            String customer = parts[1].trim();
            Integer noOfSeats = Integer.parseInt(parts[2].trim());

            TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

            // 2) Read payment mode
            if (!sc.hasNextLine()) { break; }
            String modeLine = sc.nextLine().trim();
            if (modeLine.isEmpty() && sc.hasNextLine()) modeLine = sc.nextLine().trim();
            if (modeLine.isEmpty()) { break; }
            int mode = Integer.parseInt(modeLine);

            // Always print booking details first
            tb.printDetails();

            switch (mode) {
                case 1: {
                    // Cash: read amount (integer in the problem, but we’ll parse as double)
                    if (!sc.hasNextLine()) { break; }
                    String amtLine = sc.nextLine().trim();
                    double amount = Double.parseDouble(amtLine);
                    tb.makePayment(amount);
                    break;
                }
                case 2: {
                    // Wallet: read amount, then wallet number (string)
                    if (!sc.hasNextLine()) { break; }
                    String amtLine = sc.nextLine().trim();
                    double amount = Double.parseDouble(amtLine);

                    if (!sc.hasNextLine()) { break; }
                    String walletNumber = sc.nextLine().trim();

                    tb.makePayment(walletNumber, amount);
                    break;
                }
                case 3: {
                    // Credit: read name, amount, credit card type, CCV
                    if (!sc.hasNextLine()) { break; }
                    String holderName = sc.nextLine().trim();

                    if (!sc.hasNextLine()) { break; }
                    String amtLine = sc.nextLine().trim();
                    double amount = Double.parseDouble(amtLine);

                    if (!sc.hasNextLine()) { break; }
                    String creditCardType = sc.nextLine().trim();

                    if (!sc.hasNextLine()) { break; }
                    String ccv = sc.nextLine().trim();

                    // Call signature as per spec table order:
                    // makePayment(String creditCard, String ccv, String name, Double amount)
                    tb.makePayment(creditCardType, ccv, holderName, amount);
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }
    }
}
