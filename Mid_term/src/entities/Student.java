package entities;

import enums.UserType;

public class Student extends User {
	public Student(String name) {
		super(name);
	}

	@Override
	public UserType getUserType() {
		return UserType.STUDENT;
	}

}
