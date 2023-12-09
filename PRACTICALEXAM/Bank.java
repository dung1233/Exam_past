package PRACTICALEXAM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    private double balance;
    private double annualInterestRate;

    
    public Bank(double initialBalance, double rate) {
        balance = initialBalance;
        annualInterestRate = rate;
    }

   
    public double calculateInterest() {
        return balance * (annualInterestRate / 1200);
    }
}
