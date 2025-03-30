package main.java.com.example.documenmanager.storage;

public interface Storage {
	void upload(String filename, String content);
	String download(String filename);
}
