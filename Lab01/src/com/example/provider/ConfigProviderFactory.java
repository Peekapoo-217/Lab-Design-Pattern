package com.example.provider;

public class ConfigProviderFactory {
	public static ConfigProvider getProvider(String type) {
		if (type.equalsIgnoreCase("database")) {
			return new DatabaseConfigProvider();
		} 
		throw new IllegalArgumentException("Unknown provider type");
	}
}
