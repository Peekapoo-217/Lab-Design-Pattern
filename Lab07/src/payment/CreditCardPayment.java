package payment;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your credit card PIN: ");
        String pin = scanner.nextLine();

        if (authenticate(pin)) {
            double fee = amount * 0.02;
            double total = amount + fee;
            System.out.println("Authentication successful!");
            System.out.println("Processing credit card payment of $" + total + " (including $" + fee + " fee)");
        } else {
            System.out.println("Authentication failed! Payment cancelled.");
        }
    }
    
    private boolean authenticate(String pin) {
        // Giả lập mã PIN đúng là "1234"
        return "1234".equals(pin);
    }
}
