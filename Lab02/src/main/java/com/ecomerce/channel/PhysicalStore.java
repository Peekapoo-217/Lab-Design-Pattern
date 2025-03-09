package main.java.com.ecomerce.channel;

import main.java.com.ecomerce.enums.PaymentMethod;
import main.java.com.ecomerce.enums.SalesChannelType;
import main.java.com.ecomerce.factory.OrderProcessFactory;
import main.java.com.ecomerce.factory.PhysicalOrderProcessorFactory;
import main.java.com.ecomerce.models.Order;
import main.java.com.ecomerce.processor.OrderProcessor;

public class PhysicalStore implements SalesChannel {
	@Override
	public void processOrder(Order order) {
		System.out.println("Xử lý đơn hàng từ cửa hàng vật lý: " + order.getOrderId());
		OrderProcessFactory factory = createOrderProcessFactory();
		OrderProcessor processor = factory.createOrderProcessor();
		processor.processOrder(order);

		// Tính phí vận chuyển
		double shippingFee = factory.createShippingCalculator().calculateShippingFee(order);
		order.setShippingFee(shippingFee);

		// Xử lý thanh toán
		PaymentMethod paymentMethod = order.getPaymentMethod();
		factory.createPaymentProcessor(paymentMethod).processPayment(order);

		System.out.println("Đơn hàng từ cửa hàng vật lý đã được xử lý thành công.");
	}

	@Override
	public OrderProcessFactory createOrderProcessFactory() {
		return new PhysicalOrderProcessorFactory();
	}

	@Override
	public SalesChannelType getChannelType() {
		return SalesChannelType.PHYSICAL;
	}
}
