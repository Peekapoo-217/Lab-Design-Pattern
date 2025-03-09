package main.java.com.ecomerce.main;

import main.java.com.ecomerce.channel.MobileAppStore;
import main.java.com.ecomerce.channel.OnlineStore;
import main.java.com.ecomerce.channel.PhysicalStore;
import main.java.com.ecomerce.channel.SalesChannel;
import main.java.com.ecomerce.enums.PaymentMethod;
import main.java.com.ecomerce.models.Order;
import main.java.com.ecomerce.models.Product;

public class Main {
	public static void main(String[] args) {

		Product laptop = new Product("P001", "Laptop Dell XPS 13", 30000000, 1);
		Product phone = new Product("P002", "Samsung Galaxy S21", 20000000, 2);
		Product headphone = new Product("P003", "Sony WH-1000XM4", 5000000, 1);

		Order onlineOrder = new Order("Nguyễn Văn A", "123 Đường Lê Lợi, TP.HCM", "Online");
		onlineOrder.addProduct(laptop);
		onlineOrder.addProduct(headphone);

		
        onlineOrder.addProduct(laptop);
        onlineOrder.addProduct(headphone);
        onlineOrder.setPaymentMethod(PaymentMethod.CREDIT_CARD);
        
		SalesChannel onlineChannel = new OnlineStore();
		onlineChannel.processOrder(onlineOrder);
		System.out.println("\n" + onlineOrder + "\n");

		Order physicalOrder = new Order("Trần Thị B", "456 Đường Nguyễn Huệ, TP.HCM", "Physical");
		physicalOrder.addProduct(phone);

		SalesChannel physicalChannel = new PhysicalStore();
		physicalChannel.processOrder(physicalOrder);
		System.out.println("\n" + physicalOrder + "\n");

		Order mobileOrder = new Order("Lê Văn C", "789 Đường Cách Mạng Tháng 8, TP.HCM", "Mobile");
		mobileOrder.addProduct(laptop);
		mobileOrder.addProduct(phone);
		mobileOrder.addProduct(headphone);

		SalesChannel mobileChannel = new MobileAppStore();
		mobileChannel.processOrder(mobileOrder);
		System.out.println("\n" + mobileOrder + "\n");

	}
}