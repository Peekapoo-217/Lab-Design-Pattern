package memento;

import state.State;

/**
 * Memento lưu trạng thái nội dung và trạng thái của tài liệu
 * Input: content của tài liệu
 * 		  State(trạng thái) của tài liệu.
 */

public class Memento {
    private final String content;
    private final State state;

    public Memento(String content, State state) {
        this.content = content;
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public State getState() {
        return state;
    }
}
