package examle.java.com.hung.remotes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import examle.java.com.hung.commands.Command;
import examle.java.com.hung.utils.HistoryLogger;

public class RemoteControl {
	private List<Command> commands = new ArrayList<>();
	private Stack<Command> undoStack = new Stack<>();
	private Stack<Command> redoStack = new Stack<>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void executeCommand() {
		for (Command command : commands) {
			command.execute();
			undoStack.push(command);
			redoStack.clear();
			
			HistoryLogger.log(command.getClass().getSimpleName());
		}
		commands.clear();
	}

	public void undoLastCommand() {
		if (!undoStack.isEmpty()) {
			Command lastCommand = undoStack.pop();
			lastCommand.undo();
			redoStack.push(lastCommand);
		} else {
			System.out.println("No commands to undo");
		}
	}

	public void redoLastCommand() {
		if (!redoStack.isEmpty()) {
			Command lastCommand = redoStack.pop();
			lastCommand.execute();
			undoStack.push(lastCommand);
		} else {
			System.out.println("No commands to redo!");
		}
	}

}
