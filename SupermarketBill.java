import java.util.Scanner;

public class SupermarketBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input Customer Details
        System.out.println("--- Welcome to MegaMart Supermarket ---");
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        
        System.out.println("\nSelect Item Category:");
        System.out.println("1. Electronics (10% Discount)");
        System.out.println("2. Clothing    (20% Discount)");
        System.out.println("3. Groceries   (5% Discount)");
        System.out.print("Enter Category Code (1-3): ");
        int categoryCode = sc.nextInt();
        
        System.out.print("Enter Total Bill Amount (before discount): ₹");
        double originalAmount = sc.nextDouble();
        
        double discountPercent = 0;
        String categoryName = "";
        
        // Decision Making using Switch-Case
        switch(categoryCode) {
            case 1:
                discountPercent = 10.0;
                categoryName = "Electronics";
                break;
            case 2:
                discountPercent = 20.0;
                categoryName = "Clothing";
                break;
            case 3:
                discountPercent = 5.0;
                categoryName = "Groceries";
                break;
            default:
                System.out.println("Invalid Category Code entered! No discount applied.");
                discountPercent = 0.0;
                categoryName = "Unknown / Others";
        }
        
        // Final Calculations
        double discountAmount = originalAmount * (discountPercent / 100.0);
        double finalAmount = originalAmount - discountAmount;
        
        // Printing the Invoice/Receipt cleanly
        System.out.println("\n==================================");
        System.out.println("       SUPERMARKET CASH MEMO      ");
        System.out.println("==================================");
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Category Bought : " + categoryName);
        System.out.println("Original Amount : ₹" + originalAmount);
        System.out.println("Discount Rate   : " + discountPercent + "%");
        System.out.println("----------------------------------");
        System.out.println("You Saved       : ₹" + discountAmount);
        System.out.println("----------------------------------");
        System.out.println("FINAL AMOUNT    : ₹" + finalAmount);
        System.out.println("==================================");
        System.out.println("    Thank you for shopping!       ");
        System.out.println("==================================");
        
        sc.close();
    }
}
