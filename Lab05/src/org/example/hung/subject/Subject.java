package org.example.hung.subject;

import org.example.hung.observer.Observer;

public interface Subject {
	void attach(Observer o);

	void detach(Observer o);

	void notifyObservers();
}
