package main.java.com.ecomerce.models;

public class Product {
	private String id;
	private String name;
	private double price;
	private int quantity;

	public Product(String id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Getters và Setters
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", price=" + price + ", quantity="
				+ quantity + '}';
	}
}
