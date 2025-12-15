// Name: Denis Kyalo
// Admission Number: J77-10566-2024
// Question 2.2 — 2D Array: Print marks table and average of Student 3

public class StudentMarksTable2 {
    public static void main(String[] args) {
        int[][] marks = {
            {75, 80, 90},  // Student 1
            {65, 70, 85},  // Student 2
            {88, 92, 81}   // Student 3
        };

        // 1. Print marks in table form
        System.out.println("Marks Table:");
        for (int[] student : marks) {
            for (int mark : student) {
                System.out.print(mark + "\t");
            }
            System.out.println();
        }

        // 2. Average of Student 3
        int sum = 0;
        for (int mark : marks[2]) {
            sum += mark;
        }
        double average = sum / (double) marks[2].length;
        System.out.println("Average marks of Student 3: " + average);
    }
}