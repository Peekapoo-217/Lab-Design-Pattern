package org.example.hung.observer;

public class Investor implements Observer{
	private final String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[INVESTOR] " + name + " nhận thông báo: " + stockName + " hiện tại có giá " + price);
    }
}
