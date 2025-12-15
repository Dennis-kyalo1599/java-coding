/*
Name: Dennis Kyalo
Admission Number: J77-10566-2024

QUESTION 2
A bank needs a program to manage different types of accounts.
Create a superclass BankAccount with an attribute balance and a method deposit().
Then create a subclass SavingsAccount that inherits from BankAccount and adds a method addInterest() 
that increases the balance by 5%.

Write a Java program that:
1. Creates a SavingsAccount object,
2. Deposits an amount entered by the user,
3. Applies interest,
4. Displays the final balance.
*/

import java.util.Scanner;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        balance = balance * 1.05;
    }
}

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount();

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        sa.deposit(amount);
        sa.addInterest();

        System.out.println("Final Balance: " + sa.balance);
    }
}