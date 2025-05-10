package strategy;

import entities.User;

public class StudentStrategy implements NotificationStrategy {
    public String customMessage(String message, User user) {
        return "[Student] " + user.getName() + ": " + message;
    }
}
