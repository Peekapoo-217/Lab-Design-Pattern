package main.java.com.example.documenmanager.storage;

public class GoogleDriveStorage implements Storage{
	@Override
	public void upload(String filename, String content) {
		System.out.println("Uploading to Google Drive: " + filename);
	}
	
	@Override
	public String download(String filename) {
		return "Downloaded content from Google Drive: " + filename;
	}
}
