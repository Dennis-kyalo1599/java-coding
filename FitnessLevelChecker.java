// Name: Denis Kyalo
// Reg No: J77-10566-2024
// Question 2: Determine fitness level based on number of steps

import java.util.Scanner;

public class FitnessLevelChecker {
 
    // Method to determine fitness level
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for steps
        System.out.print("Enter your steps for today: ");
        int steps = input.nextInt();

        // Get fitness level
        String level = getFitnessLevel(steps);

        // Display result
        System.out.println("Your fitness level: " + level);
    }




}
