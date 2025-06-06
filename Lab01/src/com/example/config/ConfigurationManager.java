package com.example.config;

import java.util.Map;

import com.example.provider.ConfigProvider;

public class ConfigurationManager {
	private static volatile ConfigurationManager instance;

	private Map<String, String> configurations;

	private ConfigurationManager(ConfigProvider provider) {
		configurations = provider.loadConfigurations();
	}

	public static ConfigurationManager getInstance(ConfigProvider provider) {
		if (instance == null) {
			synchronized (ConfigurationManager.class) {
				if (instance == null) {
					instance = new ConfigurationManager(provider);
				}
			}
		}
		return instance;
	}

	public synchronized String getConfigByName(String key) {
		return configurations.get(key);
	}

	public synchronized void setConfig(String key, String value) {
		configurations.put(key, value);
	}

	public boolean isConfigAvailable(String key) {
		return configurations.containsKey(key);
	}
}
