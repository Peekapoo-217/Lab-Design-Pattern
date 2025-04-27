package payment;

public class MomoPayment implements PaymentStrategy {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Momo payment of $" + amount);
	}
}
