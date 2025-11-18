/* 
   Name: Denis Kyalo
   Reg No: J77-10566-2024

   Question 2:
   Create a Product class with:
     - Private name (String) and price (double)
     - Constructor to set both
     - Method applyDiscount(double percentage) to reduce price
     - Method getPrice() to return updated price
   In main():
     - Create Product object
     - Ask user for discount
     - Apply discount and display new price
*/

import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Apply discount
    void applyDiscount(double percentage) {
        price = price - (price * (percentage / 100));
    }

    // Return updated price
    double getPrice() {
        return price;
    }
}

public class StoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a product
        Product p = new Product("Shoes", 2000);

        // Ask user for discount
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        // Apply discount
        p.applyDiscount(discount);

        // Display new price
        System.out.println("New price after discount: " + p.getPrice());
    }
}