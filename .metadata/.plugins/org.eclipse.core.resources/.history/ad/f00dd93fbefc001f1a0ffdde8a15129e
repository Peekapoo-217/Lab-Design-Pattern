package main.java.com.ecomerce.factory;

import main.java.com.ecomerce.enums.PaymentMethod;
import main.java.com.ecomerce.payment.PaymentProcessor;
import main.java.com.ecomerce.processor.OrderProcessor;
import main.java.com.ecomerce.shipping.ShippingCalculator;

public interface OrderProcessFactory {
	OrderProcessor createOrderProcessor();
	ShippingCalculator createShippingCalculator();
	PaymentProcessor createPaymentProcessor(PaymentMethod paymentMethod);
}
