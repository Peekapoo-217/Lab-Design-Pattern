package entities;

import enums.UserType;

public abstract class User {
	protected String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract UserType getUserType();
}
