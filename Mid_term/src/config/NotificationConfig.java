package config;

import enums.ChannelType;

//Singleton
public class NotificationConfig {
	private static NotificationConfig instance;
	private ChannelType defaultChannel = ChannelType.EMAIL;

	private NotificationConfig() {
	}

	public static NotificationConfig getInstance() {
		if (instance == null) {
			instance = new NotificationConfig();
		}
		return instance;
	}

	public ChannelType getDefaultChannel() {
		return defaultChannel;
	}

	public void setDefaultChannel(ChannelType defaultChannel) {
		this.defaultChannel = defaultChannel;
	}
}
