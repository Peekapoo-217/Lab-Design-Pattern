package main.java.com.ecomerce.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import main.java.com.ecomerce.enums.PaymentMethod;

public class Order {
	private String orderId;
	private List<Product> products;
	private String customerName;
	private String customerAddress;
	private double totalAmount;
	private double shippingFee;
	private PaymentMethod paymentMethod;
	private String channelType;

	public Order(String customerName, String customerAddress, String channelType) {
		this.orderId = UUID.randomUUID().toString();
		this.products = new ArrayList<>();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.channelType = channelType;
		this.paymentMethod = PaymentMethod.CREDIT_CARD;
	}

	public void addProduct(Product product) {
		products.add(product);
		calculateTotalAmount();
	}

	private void calculateTotalAmount() {
		totalAmount = 0;
		for (Product product : products) {
			totalAmount += product.getPrice() * product.getQuantity();
		}
	}

	// Getters và Setters
	public String getOrderId() {
		return orderId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public double getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(double shippingFee) {
		this.shippingFee = shippingFee;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getChannelType() {
		return channelType;
	}

	@Override
	public String toString() {
		return "Order{" + "orderId='" + orderId + '\'' + ", products=" + products + ", customerName='" + customerName
				+ '\'' + ", customerAddress='" + customerAddress + '\'' + ", totalAmount=" + totalAmount
				+ ", shippingFee=" + shippingFee + ", paymentMethod='" + paymentMethod + '\'' + ", channelType='"
				+ channelType + '\'' + '}';
	}
}
