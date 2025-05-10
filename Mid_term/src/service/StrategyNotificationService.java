package service;

import strategy.NotificationStrategy;

public class StrategyNotificationService extends NotificationService {
	private final NotificationStrategy strategy;

	public StrategyNotificationService(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	@Override
	protected NotificationStrategy getStrategy() {
		return strategy;
	}
}
