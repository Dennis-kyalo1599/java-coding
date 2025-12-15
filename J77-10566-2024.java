/*program to compute discount
Denis kyalo mutie
J77-10566-2024*/

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount > 5000) {
            discount = amount * 0.10;
        } else if (amount > 1000 && amount <= 5000) {
            discount = amount * 0.05;
        } else if (amount < 1000) {
            discount = 0;
        }

        double finalAmount = amount - discount;

        System.out.println("Original Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}