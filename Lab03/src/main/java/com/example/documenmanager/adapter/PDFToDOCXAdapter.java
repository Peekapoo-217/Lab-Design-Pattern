package main.java.com.example.documenmanager.adapter;

import main.java.com.example.documenmanager.document.Document;
import main.java.com.example.documenmanager.document.PDFDocument;

public class PDFToDOCXAdapter implements Document{
	private PDFDocument pdf;
	
	public PDFToDOCXAdapter(PDFDocument pdf) {
		this.pdf = pdf;
	}
	
	@Override
	public void readContent() {
		pdf.readContent();
	}
	
	@Override
	public void writeContent(String content) {
		pdf.writeContent(content);
	}
	
	@Override
    public String getContent() {
        return pdf.getContent();
    }
	
}
