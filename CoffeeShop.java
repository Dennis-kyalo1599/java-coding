/* 
   Name: Denis Kyalo
   Reg No: J77-10566-2024
   Question 1: 
   Create a CoffeeOrder class with size (String) and price (double),
   a constructor to set both attributes,
   and in main() create two CoffeeOrder objects and display their details.
*/

class CoffeeOrder {
    String size;
    double price;

    // Constructor
    CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee order - Size: " + size + ", Price: KSh " + price;
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        // Create two coffee orders
        CoffeeOrder order1 = new CoffeeOrder("Small", 150.0);
        CoffeeOrder order2 = new CoffeeOrder("Large", 300.0);

        // Display details of each order
        System.out.println(order1);
        System.out.println(order2);
    }
}