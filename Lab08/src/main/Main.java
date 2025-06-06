package main;

import memento.CareTaker;
import models.Document;

public class Main {
	public static void main(String[] args) {
		  Document doc = new Document();
	        CareTaker caretaker = new CareTaker();

	        doc.editContent("Version 1 - draft");
	        caretaker.save(doc);

	        doc.editContent("Version 2 - improved");
	        caretaker.save(doc);

	        doc.save(); // chuyển sang trạng thái đã lưu

	        System.out.println("Current content: " + doc.getContent());

	        caretaker.undo(doc); // quay về version 2
	        System.out.println("After undo 1: " + doc.getContent());

	        caretaker.undo(doc); // quay về version 1
	        System.out.println("After undo 2: " + doc.getContent());
	}
}
