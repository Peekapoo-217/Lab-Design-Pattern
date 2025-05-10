package entities;

import enums.UserType;

public class Admin extends User{
    public Admin(String name) {
        super(name);
    }

    @Override
    public UserType getUserType() {
        return UserType.ADMIN;
    }
}
