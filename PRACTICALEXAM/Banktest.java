package PRACTICALEXAM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banktest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input initial balance and interest rate
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();

            System.out.print("Enter annual interest rate: ");
            double interestRate = scanner.nextDouble();

            // Create an instance of the Bank class
            Bank myBank = new Bank(initialBalance, interestRate);

            // Calculate and display the monthly interest
            double monthlyInterest = myBank.calculateInterest();
            System.out.printf("Monthly interest: $%.2f%n", monthlyInterest);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}