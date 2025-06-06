package models;

import memento.Memento;
import state.EditingState;
import state.State;

public class Document {
    private String content = "";
    private State state = new EditingState();

    public void setState(State state) {
        this.state = state;
    }

    public void editContent(String newContent) {
        this.content = newContent;
    }

    public void edit() {
        state.edit(this);
    }

    public void save() {
        state.save(this);
    }

    public String getContent() {
        return content;
    }

    public Memento saveToMemento() {
        return new Memento(content, state);
    }

    public void restoreFromMemento(Memento memento) {
        this.content = memento.getContent();
        this.state = memento.getState();
    }

}
