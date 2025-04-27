package payment;

public class BankTransferPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Authenticating bank account...");
        double fee = 5.0; 
        double total = amount + fee;
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}
