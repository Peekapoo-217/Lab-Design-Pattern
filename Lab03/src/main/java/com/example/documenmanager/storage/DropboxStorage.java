package main.java.com.example.documenmanager.storage;

public class DropboxStorage implements Storage{
	@Override
	public void upload(String filename, String content) {
		System.out.println("Uploading to Dropbox: " + filename);
	}

	@Override
	public String download(String filename) {
		System.out.println("Downloading from Dropbox: " + filename);
		return "[Dropbox] Content of " + filename;
	}
}
