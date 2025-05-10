package service;

import channel.NotificationChannel;
import entities.User;
import factory.NotificationChannelFactory;
import strategy.NotificationStrategy;

//Template Method
public abstract class NotificationService {
	public final void notifyUser(User user, String message) {
		String customized = getStrategy().customMessage(message, user);
		NotificationChannel channel = NotificationChannelFactory.createChannel();
		channel.sendMessage(customized);
	}

	protected abstract NotificationStrategy getStrategy();
}
