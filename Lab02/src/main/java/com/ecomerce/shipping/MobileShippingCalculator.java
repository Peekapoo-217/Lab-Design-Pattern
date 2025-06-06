package main.java.com.ecomerce.shipping;

import main.java.com.ecomerce.enums.ShippingType;
import main.java.com.ecomerce.models.Order;

public class MobileShippingCalculator implements ShippingCalculator {
	@Override
	public double calculateShippingFee(Order order) {
		double baseFee = ShippingType.MOBILE.getBaseFee();
		double weightFee = order.getProducts().size() * 4000;
		System.out.println("Tính phí vận chuyển cho đơn hàng từ ứng dụng di động: " + order.getOrderId());

		if (order.getTotalAmount() > 300000) {
			return baseFee + weightFee * 0.8;
		}
		return baseFee + weightFee;
	}
}
