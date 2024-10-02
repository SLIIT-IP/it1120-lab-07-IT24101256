import java.util.Scanner;

public class IT24101256Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05;
        
        // Process 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            
            // Input total bill amount
            System.out.print("Enter total bill amount: ");
            double totalBill = input.nextDouble();
            
            // Input mode of payment
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = input.next().charAt(0);
            
            // Calculate discount and amount to be paid
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalBill * DISCOUNT_RATE;
                double amountToBePaid = totalBill - discount;
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                // No discount for other modes
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);
            } else {
                // Invalid payment mode
                System.out.println("Payment Mode is Not Valid");
            }
            
            System.out.println();  // Blank line for readability
        }
        
        
    }
}
