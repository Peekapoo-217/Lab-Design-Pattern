package strategy;

import entities.User;

public class TeacherStrategy implements NotificationStrategy {
	public String customMessage(String message, User user) {
		return "[Teacher] " + user.getName() + ": " + message;
	}
}
