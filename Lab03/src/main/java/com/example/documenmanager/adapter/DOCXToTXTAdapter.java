package main.java.com.example.documenmanager.adapter;

import main.java.com.example.documenmanager.document.DOCXDocument;
import main.java.com.example.documenmanager.document.Document;

public class DOCXToTXTAdapter implements Document{
	 private DOCXDocument docx;

	    public DOCXToTXTAdapter(DOCXDocument docx) {
	        this.docx = docx;
	    }

	    @Override
	    public void readContent() {
	        System.out.println("[Adapter DOCX->TXT]");
	        docx.readContent();
	    }

	    @Override
	    public void writeContent(String content) {
	        System.out.println("[Adapter DOCX->TXT] Writing as TXT format");
	        docx.writeContent(content); // giả lập việc ghi như TXT
	    }

	    @Override
	    public String getContent() {
	        return docx.getContent();
	    }
}
