package com.example.main;

import com.example.config.ConfigurationManager;
import com.example.provider.ConfigProvider;
import com.example.provider.ConfigProviderFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigProvider provider = ConfigProviderFactory.getProvider("database");
		
		ConfigurationManager configManager = ConfigurationManager.getInstance(provider);

		System.out.println("Database URL: " + configManager.getConfigByName("database_url"));
		System.out.println("Server Port: " + configManager.getConfigByName("server_port"));

		Runnable task = () -> {
			ConfigurationManager instance = ConfigurationManager.getInstance(provider);
			System.out.println(
					Thread.currentThread().getName() + " - Database URL: " + instance.getConfigByName("database_url"));
		};

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");
		Thread t3 = new Thread(task, "Thread-3");

		t1.start();
		t2.start();
		t3.start();
	}

}
