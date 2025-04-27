package test;

import context.PaymentContext;
import payment.BankTransferPayment;
import payment.CreditCardPayment;
import payment.MomoPayment;
import payment.PayPalPayment;

public class PaymentTest {
	public static void main(String[] args) {
        PaymentContext context;

        context = new PaymentContext(new CreditCardPayment());
        context.executePayment(100.0);

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(200.0);

        context = new PaymentContext(new BankTransferPayment());
        context.executePayment(300.0);
        
        context = new PaymentContext(new MomoPayment());
        context.executePayment(150.0);


        System.out.println("=== Credit Card Payment ===");
        context = new PaymentContext(new CreditCardPayment());
        context.executePayment(100.0);

        System.out.println("\n=== PayPal Payment ===");
        context = new PaymentContext(new PayPalPayment());
        context.executePayment(200.0);
	}
}
