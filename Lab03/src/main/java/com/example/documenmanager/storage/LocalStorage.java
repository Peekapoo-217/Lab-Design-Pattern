package main.java.com.example.documenmanager.storage;

public class LocalStorage implements Storage{
	@Override
	public void upload(String filename, String content) {
		System.out.println("Saving to Local Storage: " + filename);
	}

	@Override
	public String download(String filename) {
		System.out.println("Reading from Local Storage: " + filename);
		return "[Local] Content of " + filename;
	}
}
