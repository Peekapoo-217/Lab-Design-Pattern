package factory;

import channel.EmailChannel;
import channel.NotificationChannel;
import channel.PushChannel;
import channel.SMSChannel;
import config.NotificationConfig;
import enums.ChannelType;

//Factory
public class NotificationChannelFactory {
	public static NotificationChannel createChannel() {
		ChannelType channel = NotificationConfig.getInstance().getDefaultChannel();

		return switch (channel) {
			case EMAIL -> new EmailChannel();
			case SMS -> new SMSChannel();
			case PUSH -> new PushChannel();
		};
	}
}
