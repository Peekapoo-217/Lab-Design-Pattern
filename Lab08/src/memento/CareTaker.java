package memento;

import java.util.Stack;

import models.Document;

/**
 * Caretaker – Quản lý các bản lưu (memento), cho phép "undo" nội dung tài liệu.
 */

public class CareTaker {
	 private Stack<Memento> history = new Stack<>();

	    public void save(Document doc) {
	        history.push(doc.saveToMemento()); // Lưu bản hiện tại vào stack
	        System.out.println("Saved current version.");
	    }

	    public void undo(Document doc) {
	        if (!history.isEmpty()) {
	            Memento memento = history.pop();// Lấy bản trước đó
	            doc.restoreFromMemento(memento);
	            System.out.println("Restored previous version.");
	        } else {
	            System.out.println("No version to restore.");
	        }
	    }
}
