package strategy;

import entities.User;

//Strategy Pattern
public interface NotificationStrategy {
    String customMessage(String message, User user);
}
