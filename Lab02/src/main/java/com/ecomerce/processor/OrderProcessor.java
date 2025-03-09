package main.java.com.ecomerce.processor;

import main.java.com.ecomerce.models.Order;

public interface OrderProcessor {
	void processOrder(Order order);

	void updateInventory(Order order);

	void notifyCustomer(Order order);
}
