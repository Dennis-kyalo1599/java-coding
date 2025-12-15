/*
Admission Number: J77-10566-2024
Name: Dennis Kyalo

Question 3 — 3D Arrays

1.
A shop stores sales data for 2 branches, 2 months, and 3 products using a 3D array.
(a) Declare and initialize the following 3D array:
    {
      {{10, 20, 30}, {15, 25, 35}},
      {{5, 10, 15}, {8, 16, 24}}
    }
(b) Write a program that prints all elements using 3 nested loops.
(c) Calculate and display the total sales for branch 1 (the first outer array).

2.
(3D Array — Warehouse Stock Tracking)
A company stores inventory for 2 warehouses, each with 2 sections, each section storing 3 products. Data is stored in a 3D array:
    {
      {{50, 30, 20}, {40, 25, 15}},  // Warehouse 1
      {{60, 35, 25}, {55, 28, 18}}  // Warehouse 2
    }
Write a Java program to:
1. Print all stock values using 3 nested loops
2. Calculate and display the total stock in Warehouse 2
*/

public class ThreeDArrayTasks {
    public static void main(String[] args) {
        // Task 1: Shop Sales Data
        int[][][] sales = {
            {
                {10, 20, 30}, // Branch 1, Month 1
                {15, 25, 35}  // Branch 1, Month 2
            },
            {
                {5, 10, 15},  // Branch 2, Month 1
                {8, 16, 24}   // Branch 2, Month 2
            }
        };

        System.out.println("Task 1: Shop Sales Data");
        for (int branch = 0; branch < sales.length; branch++) {
            System.out.println("Branch " + (branch + 1) + ":");
            for (int month = 0; month < sales[branch].length; month++) {
                System.out.print("Month " + (month + 1) + ": ");
                for (int product = 0; product < sales[branch][month].length; product++) {
                    System.out.print(sales[branch][month][product] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Total sales for Branch 1
        int totalBranch1 = 0;
        for (int month = 0; month < sales[0].length; month++) {
            for (int product = 0; product < sales[0][month].length; product++) {
                totalBranch1 += sales[0][month][product];
            }
        }
        System.out.println("Total Sales for Branch 1 = " + totalBranch1);

        // Task 2: Warehouse Stock Tracking
        int[][][] stock = {
            {
                {50, 30, 20}, {40, 25, 15}  // Warehouse 1
            },
            {
                {60, 35, 25}, {55, 28, 18}  // Warehouse 2
            }
        };

        System.out.println("\nTask 2: Warehouse Stock Tracking");
        for (int warehouse = 0; warehouse < stock.length; warehouse++) {
            System.out.println("Warehouse " + (warehouse + 1) + ":");
            for (int section = 0; section < stock[warehouse].length; section++) {
                System.out.print("Section " + (section + 1) + ": ");
                for (int product = 0; product < stock[warehouse][section].length; product++) {
                    System.out.print(stock[warehouse][section][product] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Total stock in Warehouse 2
        int totalWarehouse2 = 0;
        for (int section = 0; section < stock[1].length; section++) {
            for (int product = 0; product < stock[1][section].length; product++) {
                totalWarehouse2 += stock[1][section][product];
            }
        }
        System.out.println("Total Stock in Warehouse 2 = " + totalWarehouse2);
    }
}
