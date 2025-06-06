package main.java.com.ecomerce.payment;

import main.java.com.ecomerce.enums.PaymentMethod;
import main.java.com.ecomerce.models.Order;

public class CashOnDeliveryPayment implements PaymentProcessor {
	@Override
	public boolean processPayment(Order order) {
		System.out.println("Chuẩn bị COD cho đơn hàng: " + order.getOrderId());

		System.out.println("Số tiền: " + (order.getTotalAmount() + order.getShippingFee() + "VND"));

		order.setPaymentMethod(PaymentMethod.CASH);

		return true;
	}

}
