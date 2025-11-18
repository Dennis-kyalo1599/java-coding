// Name: Denis Kyalo
// Reg No: J77-10566-2024
// Question 1: Calculate total vacation cost using a method

public class VacationCostCalculator {

    // Method that calculates total cost of the package
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        // Sample data
        double accommodation = 1000.50;
        double meals = 300.25;
        double activities = 150.00;

        double total = calculateTotalCost(accommodation, meals, activities);

        // Print result
        System.out.printf("Total Vacation Cost: $%.2f%n", total);
    }
}