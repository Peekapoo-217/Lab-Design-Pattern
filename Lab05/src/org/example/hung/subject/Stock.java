package org.example.hung.subject;

import java.util.ArrayList;
import java.util.List;

import org.example.hung.observer.Observer;

public class Stock implements Subject {
	private final String name;

	private double price;

	private final List<Observer> observers = new ArrayList<>();

	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
	    notifyObservers();
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(name, price);
		}
	}
}
