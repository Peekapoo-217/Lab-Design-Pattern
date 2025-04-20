package org.example.hung.observer;

import java.util.HashMap;
import java.util.Map;

import org.example.hung.subject.Stock;

public class StockExchange {
	private final Map<String, Stock> stocks = new HashMap<>();

	public void addStock(Stock stock) {
		stocks.put(stock.getName(), stock);
	}

	public Stock getStock(String name) {
		return stocks.get(name);
	}
}
