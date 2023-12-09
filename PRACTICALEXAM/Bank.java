package PRACTICALEXAM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    private double balance;
    private double annualInterestRate;

    // Constructor to initialize balance and rate
    public Bank(double initialBalance, double rate) {
        balance = initialBalance;
        annualInterestRate = rate;
    }

    // Function to calculate monthly interest
    public double calculateInterest() {
        return balance * (annualInterestRate / 1200);
    }
}