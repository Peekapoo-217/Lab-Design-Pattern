package main.java.com.example.documenmanager.document;

public class PDFDocument implements Document{
	private String content;
	
	@Override
	public void readContent() {
		System.out.println("Reading PDF: " + content);
	}
	
	@Override
	public void writeContent(String content) {
		this.content = content;
	}
	
	@Override
	public String getContent() {
		return content;
	}
}
