package strategy;

import entities.User;

public class AdminStrategy implements NotificationStrategy {
    public String customMessage(String message, User user) {
        return "[Admin] " + user.getName() + ": " + message;
    }
}
