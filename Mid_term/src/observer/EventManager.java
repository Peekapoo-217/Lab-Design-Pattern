
package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.User;
import service.NotificationService;
import service.StrategyNotificationService;
import strategy.AdminStrategy;
import strategy.NotificationStrategy;
import strategy.StudentStrategy;
import strategy.TeacherStrategy;

//Observer
public class EventManager {
	private Map<String, List<User>> subscriptions = new HashMap<>();

	public void subscribe(String eventType, User user) {
		if (!subscriptions.containsKey(eventType)) {
			subscriptions.put(eventType, new ArrayList<>());
		}
		subscriptions.get(eventType).add(user);
	}

	public void notifyAll(String eventType, String message) {
		List<User> users = subscriptions.get(eventType);

		if (users == null) {
			return;
		}

		for (User u : users) {
			NotificationStrategy strategy;

			switch (u.getUserType()) {
			case STUDENT:
				strategy = new StudentStrategy();
				break;

			case TEACHER:
				strategy = new TeacherStrategy();
				break;

			case ADMIN:
				strategy = new AdminStrategy();
				break;

			default:
				throw new IllegalArgumentException("Unknown user type");
			}

			NotificationService service = new StrategyNotificationService(strategy);
			service.notifyUser(u, message);
		}
	}
}
