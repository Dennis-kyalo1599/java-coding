/* 
   Name: Denis Kyalo
   Reg No: J77-10566-2024

   Question 3:
   Create three classes:
     1. Student class:
        - name (String), marks (double)
        - constructor
        - displayDetails() method
     2. GradeCalculator class:
        - calculateGrade(double marks) → returns A, B, C or D
     3. MainApp class:
        - Accept user input
        - Create Student object
        - Use GradeCalculator to compute grade
        - Display student details + grade
*/

import java.util.Scanner;

class Student {
    String name;
    double marks;

    // Constructor
    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GradeCalculator {
    // Determine grade
    String calculateGrade(double marks) {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "D";
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get student info
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        // Create objects
        Student s = new Student(name, marks);
        GradeCalculator gc = new GradeCalculator();

        // Calculate grade
        String grade = gc.calculateGrade(marks);

        // Display output
        System.out.println("\n--- Student Details ---");
        s.displayDetails();
        System.out.println("Grade: " + grade);
    }
}