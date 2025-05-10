package main;

import config.NotificationConfig;
import entities.Admin;
import entities.Student;
import entities.Teacher;
import entities.User;
import enums.ChannelType;
import observer.EventManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        NotificationConfig.getInstance().setDefaultChannel(ChannelType.EMAIL);

        User user1 = new Student("Alice");
        User user2 = new Teacher("Bob");
        User user3 = new Admin("Charlie");

        EventManager eventManager = new EventManager();
        eventManager.subscribe("deadline", user1);
        eventManager.subscribe("system_alert", user2);
        eventManager.subscribe("course_update", user3);

        eventManager.notifyAll("deadline", "Hạn nộp bài là ngày 15/5!");
        eventManager.notifyAll("system_alert", "Hệ thống sẽ bảo trì lúc 23:00.");
        eventManager.notifyAll("course_update", "Khóa học Java đã được cập nhật!");
	}

}
