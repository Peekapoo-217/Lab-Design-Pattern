package main.java.com.example.documenmanager.document;

public interface Document {
	void readContent();
	void writeContent(String content);
	String getContent();
}
