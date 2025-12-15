// Name: Denis Kyalo
// Admission Number: J77-10566-2024
// Question 3.1 — 3D Array: Shop sales data, print all elements, and total sales for Branch 1

public class ShopSalesData {
    public static void main(String[] args) {
        // (a) Declare and initialize 3D array
        int[][][] sales = {
            { {10, 20, 30}, {15, 25, 35} },  // Branch 1
            { {5, 10, 15}, {8, 16, 24} }     // Branch 2
        };

        // (b) Print all elements using 3 nested loops
        System.out.println("Sales Data:");
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

        // (c) Calculate total sales for Branch 1
        int totalBranch1 = 0;
        for (int[][] month : sales[0]) {
            for (int product : month) {
                totalBranch1 += product;
            }
        }
        System.out.println("Total sales for Branch 1: " + totalBranch1);
    }
}
