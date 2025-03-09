package main.java.com.ecomerce.shipping;

import main.java.com.ecomerce.enums.ShippingType;
import main.java.com.ecomerce.models.Order;

public class PhysicalShippingCalculator implements ShippingCalculator {
	@Override
	public double calculateShippingFee(Order order) {
		System.out.println("Phí vận chuyển cho đơn hàng : " + order.getShippingFee());
		if (order.getTotalAmount() > 50000) {
			return 0;
		}

		return ShippingType.PHYSICAL.getBaseFee();
	}
}
