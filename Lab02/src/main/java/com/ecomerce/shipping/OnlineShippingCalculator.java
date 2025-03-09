package main.java.com.ecomerce.shipping;

import main.java.com.ecomerce.enums.ShippingType;
import main.java.com.ecomerce.models.Order;

public class OnlineShippingCalculator implements ShippingCalculator {
	@Override
	public double calculateShippingFee(Order order) {
		double baseFee = ShippingType.ONLINE.getBaseFee();
		double weightFee = order.getProducts().size() * 5000;

		System.out.println("Phí vận chuyển cho đơn: " + order.getOrderId());
		return baseFee + weightFee;
	}
}
