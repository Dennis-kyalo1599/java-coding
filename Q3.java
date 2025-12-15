/*
Name: Dennis Kyalo
Admission Number: J77-10566-2024

QUESTION 3
A university system manages employees using inheritance.
Create a superclass Employee with attributes name and salary, and a method displayInfo().
Create a subclass Lecturer that adds an attribute department and overrides displayInfo() 
to include department information.

Write a Java program that:
1. Accepts input from the user for name, salary, and department,
2. Creates a Lecturer object,
3. Displays all information using the overridden method.
*/

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Lecturer extends Employee {
    String department;

    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lecturer lec = new Lecturer();

        System.out.print("Enter name: ");
        lec.name = sc.nextLine();

        System.out.print("Enter salary: ");
        lec.salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter department: ");
        lec.department = sc.nextLine();

        System.out.println("\n--- Lecturer Details ---");
        lec.displayInfo();
    }
}