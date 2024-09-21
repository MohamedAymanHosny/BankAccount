/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Mohamed Ayman
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numberOfCustomers = scanner.nextInt();

        // Create an ArrayList to store BankAccount objects
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Initialize customer details
        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.println("\nEnter details for customer " + (i));
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter initial balance: $");
            double balance = scanner.nextDouble();

            // Create BankAccount object and add it to the ArrayList
            accounts.add(new BankAccount(accountNumber, customerName, balance));
        }

        // Display menu
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("***********************************");
            System.out.println("1. Display all account details");
            System.out.println("2. Search by account number");
            System.out.println("3. Deposit amount");
            System.out.println("4. Withdraw amount");
            System.out.println("5. Exit");
            System.out.println("***********************************");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 ->
                    displayAllAccountDetails(accounts);
                case 2 ->
                    searchByAccountNumber(accounts);
                case 3 ->
                    depositAmount(accounts);
                case 4 ->
                    withdrawAmount(accounts);
                case 5 ->
                    System.out.println("Exiting the program, Goodbye Sir!");
                default ->
                    System.out.println("Invalid choice, Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void displayAllAccountDetails(ArrayList<BankAccount> accounts) {
        System.out.println("\nAll Account Details:");
        // For each
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }
    }

    private static void searchByAccountNumber(ArrayList<BankAccount> accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number to search: ");
        int searchAccountNumber = scanner.nextInt();
        // For each
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == searchAccountNumber) {
                account.displayAccountDetails();
                return;
            }
        }

        System.out.println("Account not found with the given account number.");
    }

    private static void depositAmount(ArrayList<BankAccount> accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number to deposit into: ");
        int depositAccountNumber = scanner.nextInt();
        // For each
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == depositAccountNumber) {
                System.out.print("Enter the amount to deposit: $");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                return;
            }
        }

        System.out.println("Account not found with the given account number.");
    }

    private static void withdrawAmount(ArrayList<BankAccount> accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number to withdraw from: ");
        int withdrawAccountNumber = scanner.nextInt();
        // For each
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == withdrawAccountNumber) {
                System.out.print("Enter the amount to withdraw: $");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                return;
            }
        }

        System.out.println("Account not found with the given account number.");
    }
}
