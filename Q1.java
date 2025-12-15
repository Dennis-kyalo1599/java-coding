/* 
Name: Dennis Kyalo
Admission Number: J77-10566-2024

QUESTION 1
A car rental company wants to keep track of different types of vehicles.
Create a parent class Vehicle with attributes brand and year.
Then create a child class Car that inherits from Vehicle and adds an attribute seats.

Write a Java program that:
1. Creates a Car object,
2. Assigns values to all attributes,
3. Prints all the details.
*/

class Vehicle {
    String brand;
    int year;
}

class Car extends Vehicle {
    int seats;
}

public class Q1 {
    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "Toyota";
        c.year = 2020;
        c.seats = 5;

        System.out.println("Car Brand: " + c.brand);
        System.out.println("Year: " + c.year);
        System.out.println("Seats: " + c.seats);
    }
}