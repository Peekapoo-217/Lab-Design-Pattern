package main.java.com.ecomerce.factory;

import main.java.com.ecomerce.enums.PaymentMethod;
import main.java.com.ecomerce.payment.CashOnDeliveryPayment;
import main.java.com.ecomerce.payment.CreditCardPayment;
import main.java.com.ecomerce.payment.EWalletPayment;
import main.java.com.ecomerce.payment.PaymentProcessor;
import main.java.com.ecomerce.processor.OnlineOrderProcessor;
import main.java.com.ecomerce.processor.OrderProcessor;
import main.java.com.ecomerce.shipping.OnlineShippingCalculator;
import main.java.com.ecomerce.shipping.ShippingCalculator;

public class OnlineOrderProcessFactory implements OrderProcessFactory {
	@Override
	public OrderProcessor createOrderProcessor() {
		return new OnlineOrderProcessor();
	}

	@Override
	public ShippingCalculator createShippingCalculator() {
		return new OnlineShippingCalculator();
	}

	@Override
	public PaymentProcessor createPaymentProcessor(PaymentMethod paymentMethod) {
		switch (paymentMethod) {
		case CREDIT_CARD:
			return new CreditCardPayment();

		case CASH:
			return new CashOnDeliveryPayment();

		case EWALLET:
			return new EWalletPayment();

		default:
			return new CreditCardPayment();
		}

	}

}
