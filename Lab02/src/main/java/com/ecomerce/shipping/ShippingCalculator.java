package main.java.com.ecomerce.shipping;

import main.java.com.ecomerce.models.Order;

public interface ShippingCalculator {
	double calculateShippingFee(Order order);
}
