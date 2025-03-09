package com.example.provider;

import java.util.HashMap;
import java.util.Map;

public class DatabaseConfigProvider implements ConfigProvider {
	@Override
	public Map<String, String> loadConfigurations() {
		Map<String, String> configs = new HashMap<>();
		configs.put("database_url", "jdbc:mysql://localhost:5432/mydb");
		configs.put("server_port", "9090");
		return configs;
	}
}
