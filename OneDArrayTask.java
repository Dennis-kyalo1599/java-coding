/*
Admission Number: J77-10566-2024
Name: Dennis Kyalo

Question 1 — 1D Arrays
1. (a) Declare and initialize a 1D array of integers with the following values: 5, 10, 15, 20, 25
   (b) Using a for loop, print all the elements.
   (c) Calculate and display the sum of all elements in the array.
*/

public class OneDArrayTask {
    public static void main(String[] args) {
        // Declare and initialize array
        int[] numbers = {5, 10, 15, 20, 25};

        // Print all elements
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Calculate and display sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of Elements = " + sum);
    }
}
