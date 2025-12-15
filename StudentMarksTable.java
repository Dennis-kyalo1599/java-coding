/*
Admission Number: J77-10566-2024
Name: Dennis Kyalo

Question 2 — 2D Arrays
(2D Array — Student Marks Table)
A teacher records marks for 3 students across 3 subjects using a 2D array:
    { {75, 80, 90},  // Student 1
      {65, 70, 85},  // Student 2
      {88, 92, 81}   // Student 3 }

Write a Java program to:
1. Print the marks in table (matrix) form
2. Calculate and print the average marks of Student 3
*/

public class StudentMarksTable {
    public static void main(String[] args) {
        // Student marks table
        int[][] studentMarks = {
            {75, 80, 90},  // Student 1
            {65, 70, 85},  // Student 2
            {88, 92, 81}   // Student 3
        };

        // Print matrix form
        System.out.println("Student Marks Table:");
        for (int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + "\t");
            }
            System.out.println();
        }

        // Average of Student 3
        int sumStudent3 = 0;
        for (int mark : studentMarks[2]) {
            sumStudent3 += mark;
        }
        double avgStudent3 = (double) sumStudent3 / studentMarks[2].length;
        System.out.println("Average of Student 3 = " + avgStudent3);
    }
}