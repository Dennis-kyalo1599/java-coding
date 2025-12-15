// Name: Denis Kyalo
// Admission Number: J77-10566-2024
// Question 2.1 — 2D Array: Print student marks and average of first row

public class StudentMarksMatrix {
    public static void main(String[] args) {
        // (a) Declare and initialize
        int[][] marks = {
            {80, 70, 90},
            {60, 85, 75},
            {88, 92, 79}
        };

        // (b) Print matrix
        System.out.println("Student Marks:");
        for (int[] row : marks) {
            for (int mark : row) {
                System.out.print(mark + "\t");
            }
            System.out.println();
        }

        // (c) Average of first row
        int sum = 0;
        for (int mark : marks[0]) {
            sum += mark;
        }
        double average = sum / (double) marks[0].length;
        System.out.println("Average of first row: " + average);
    }
}
