package org.example.hung;

import org.example.hung.observer.Investor;
import org.example.hung.observer.StockExchange;
import org.example.hung.subject.Stock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StockExchange exchange = new StockExchange();

		Stock apple = new Stock("AAPL", 150.0);
		Stock google = new Stock("GOOGL", 2800.0);

		exchange.addStock(apple);
		exchange.addStock(google);

		Investor investor1 = new Investor("Nguyen Van A");
		Investor investor2 = new Investor("Tran Thi B");

		apple.attach(investor1);
		google.attach(investor1);
		google.attach(investor2);

		apple.setPrice(155.5);
		google.setPrice(2850.0);

	}

}
