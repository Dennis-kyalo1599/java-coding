class ShoppingCart  {
	// Name: Denis Kyalo
// Admission Number: J77-10566-2024
// Question 1.2 — 1D Array: Shopping cart prices and total amount


    public static void main(String[] args) {
        int[] prices = {120, 80, 150, 60, 200, 90};

        // 1. Print item prices
        System.out.println("Item Prices:");
        for (int price : prices) {
            System.out.println("Ksh " + price);
        }

        // 2. Calculate total amount
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        System.out.println("Total Amount: Ksh " + total);
    }

}
