package entities;

import enums.UserType;

public class Teacher extends User {
	public Teacher(String name) {
		super(name);
	}

	@Override
	public UserType getUserType() {
		return UserType.TEACHER;
	}
}
