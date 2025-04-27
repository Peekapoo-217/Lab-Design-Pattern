package examle.java.com.hung.commands;

public interface Command {
	void execute();
	void undo();
	void redo();
}
