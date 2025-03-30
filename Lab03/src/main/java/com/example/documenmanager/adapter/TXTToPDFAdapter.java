package main.java.com.example.documenmanager.adapter;

import main.java.com.example.documenmanager.document.Document;
import main.java.com.example.documenmanager.document.TXTDocument;

public class TXTToPDFAdapter implements Document {
	private TXTDocument txt;

	public TXTToPDFAdapter(TXTDocument txt) {
		this.txt = txt;
	}

	@Override
	public void readContent() {
		System.out.println("[Adapter TXT->PDF]");
		txt.readContent();
	}

	@Override
	public void writeContent(String content) {
		System.out.println("[Adapter TXT->PDF] Writing as PDF format");
		txt.writeContent(content);
	}

	@Override
	public String getContent() {
		return txt.getContent();
	}

}
