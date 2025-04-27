package payment;

import java.util.Scanner;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
    	 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your PayPal password: ");
         String password = scanner.nextLine();
         
         if (authenticate(password)) {
             double fee = amount * 0.03;
             double total = amount + fee;
             System.out.println("Authentication successful!");
             System.out.println("Processing PayPal payment of $" + total + " (including $" + fee + " fee)");
         } else {
             System.out.println("Authentication failed! Payment cancelled.");
         }
    }
    
    private boolean authenticate(String password) {
        // Giả lập mật khẩu đúng là "paypal123"
        return "paypal123".equals(password);
    }
}
