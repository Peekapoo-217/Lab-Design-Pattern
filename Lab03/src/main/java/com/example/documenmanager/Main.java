package main.java.com.example.documenmanager;

import main.java.com.example.documenmanager.document.Document;
import main.java.com.example.documenmanager.document.ODTDocument;
import main.java.com.example.documenmanager.document.TXTDocument;
import main.java.com.example.documenmanager.manager.DocumentManager;
import main.java.com.example.documenmanager.storage.CachingStorage;
import main.java.com.example.documenmanager.storage.DropboxStorage;
import main.java.com.example.documenmanager.storage.EncryptedStorage;
import main.java.com.example.documenmanager.storage.Storage;

public class Main {
	public static void main(String[] args) {
		Storage storage = new CachingStorage(new EncryptedStorage(new DropboxStorage()));

		Document odtDoc = new ODTDocument();
		odtDoc.writeContent("Nội dung tài liệu ODT bảo mật và có cache");

		DocumentManager manager = new DocumentManager(storage);
		manager.saveDocument("file.odt", odtDoc);

		Document loadedDoc = new ODTDocument();
		String content = storage.download("file.odt");
		loadedDoc.writeContent(content);
		loadedDoc.readContent();

		Document secondRead = new ODTDocument();
		String content2 = storage.download("file.odt");
		secondRead.writeContent(content2);
		secondRead.readContent();

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			Document doc = new TXTDocument();
			doc.writeContent("File #" + i);
			manager.saveDocument("file_" + i + ".txt", doc);
		}
		long end = System.currentTimeMillis();
		System.out.println("Thời gian lưu 1000 file: " + (end - start) + "ms");

	}
}
