package main.java.com.ecomerce.enums;

public enum PaymentMethod {
	CASH("Cash"),

	CREDIT_CARD("Credit Card"),

	EWALLET("E-Wallet");

	private final String methodName;

	PaymentMethod(String methodName) {
		this.methodName = methodName;
	}

	public String getMethodName() {
		return methodName;
	}

	@Override
	public String toString() {
		return methodName;
	}
}
