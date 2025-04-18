package main.java.com.ecomerce.enums;

public enum ShippingType {
	ONLINE(30000), PHYSICAL(15000), MOBILE(25000);

	private final double baseFee;

	ShippingType(double baseFee) {
		this.baseFee = baseFee;
	}

	public double getBaseFee() {
		return baseFee;
	}

}
