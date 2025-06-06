package main.java.com.ecomerce.processor;

import main.java.com.ecomerce.models.Order;
import main.java.com.ecomerce.models.Product;

public class MobileOrderProcessor implements OrderProcessor{
	@Override
	public void processOrder(Order order) {
		System.out.println("Đang xử lý đơn hàng mobile: " + order.getOrderId());
		updateInventory(order);
		notifyCustomer(order);
	}

	@Override
	public void updateInventory(Order order) {
		System.out.println("Cập nhật kho hàng cho đơn hàng mobile");

		for (Product product : order.getProducts()) {
			System.out.println(
					"Cập nhật kho hàng cho sản phẩm" + product.getName() + "\nSố lượng" + product.getQuantity());
		}
	}

	@Override
	public void notifyCustomer(Order order) {
		System.out.println("Gửi xác nhận đến khách hàng" + order.getCustomerName());
	}
}
