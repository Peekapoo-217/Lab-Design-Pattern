package main.java.com.ecomerce.payment;

import main.java.com.ecomerce.models.Order;

public interface PaymentProcessor {
	boolean processPayment(Order order);
}
