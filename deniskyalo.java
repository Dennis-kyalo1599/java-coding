/*program to calculate fine rate
Denis kyalo mutie*/
J77-10566-2024
import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter Book ID: ");
        String bookID = sc.nextLine();

        System.out.print("Enter due date (day as number): ");
        int dueDate = sc.nextInt();

        System.out.print("Enter return date (day as number): ");
        int returnDate = sc.nextInt();

        // Calculate days overdue
        int daysOverdue = returnDate - dueDate;

        //  Determine fine rate and total fine
        int fineRate;
        int totalFine;

        if (daysOverdue <= 0) {
            fineRate = 0;
            totalFine = 0;
        } else if (daysOverdue <= 7) {
            fineRate = 20;
            totalFine = daysOverdue * fineRate;
        } else if (daysOverdue <= 14) {
            fineRate = 50;
            totalFine = daysOverdue * fineRate;
        } else {
            fineRate = 100;
            totalFine = daysOverdue * fineRate;
        }

        //  Display results
        System.out.println("\n--- Library Fine Details ---");
        System.out.println("Book ID     : " + bookID);
        System.out.println("Due Date    : " + dueDate);
        System.out.println("Return Date : " + returnDate);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine Rate   : Ksh. " + fineRate);
        System.out.println("Total Fine  : Ksh. " + totalFine);

        sc.close();
    }
}