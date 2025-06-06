package main.java.com.ecomerce.channel;

import main.java.com.ecomerce.enums.SalesChannelType;
import main.java.com.ecomerce.factory.OrderProcessFactory;
import main.java.com.ecomerce.models.Order;

public interface SalesChannel {
	void processOrder(Order order);

	OrderProcessFactory createOrderProcessFactory();

	SalesChannelType getChannelType();
}
