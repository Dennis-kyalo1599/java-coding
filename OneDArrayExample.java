// Name: Denis Kyalo
// Admission Number: J77-10566-2024
// Question 1.1 — 1D Array: Declare, print elements, and calculate sum

public class OneDArrayExample {
    public static void main(String[] args) {
        // (a) Declare and initialize
        int[] numbers = {5, 10, 15, 20, 25};

        // (b) Print all elements
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // (c) Calculate and display sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
