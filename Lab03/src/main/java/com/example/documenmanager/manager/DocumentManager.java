package main.java.com.example.documenmanager.manager;

import main.java.com.example.documenmanager.document.Document;
import main.java.com.example.documenmanager.storage.Storage;

public class DocumentManager {
	private Storage storage;
	
	public DocumentManager(Storage storage) {
		this.storage = storage;
	}
	
	public void saveDocument(String filename, Document doc) {
		storage.upload(filename, doc.getContent());
	}
	
	
}
