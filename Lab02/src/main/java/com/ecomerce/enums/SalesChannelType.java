package main.java.com.ecomerce.enums;

public enum SalesChannelType {
	ONLINE("Online"),

	PHYSICAL("Physical"), MOBILE("Mobile");

	private final String channelName;

	SalesChannelType(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelName() {
		return channelName;
	}

	@Override
	public String toString() {
		return channelName;
	}
}
