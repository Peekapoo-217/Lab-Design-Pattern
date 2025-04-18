package main.java.com.ecomerce.payment;

import main.java.com.ecomerce.enums.PaymentMethod;
import main.java.com.ecomerce.models.Order;

public class CreditCardPayment implements PaymentProcessor{
	@Override
	public boolean processPayment(Order order) {
		System.out.println("Thanh toán qua Creadit Card cho đơn hàng: " + order.getOrderId());

		System.out.println("Số tiền: " + (order.getTotalAmount() + order.getShippingFee() + "VND"));

		order.setPaymentMethod(PaymentMethod.CREDIT_CARD);
		return true;
	}
}
