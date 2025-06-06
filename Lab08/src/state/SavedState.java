package state;

import models.Document;

public class SavedState implements State{
	@Override
    public void edit(Document doc) {
        System.out.println("Switching to editing mode...");
        doc.setState(new EditingState());
    }

    @Override
    public void save(Document doc) {
        System.out.println("Document already saved.");
    }
}
