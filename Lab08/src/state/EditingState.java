package state;

import models.Document;

public class EditingState implements State{
	@Override
	public void edit(Document doc) {
		System.out.println("Already in edit mode");
	}
	
	@Override
	public void save(Document doc) {
		System.out.println("Saving document ...");
		doc.setState(new SavedState());
	}
}
