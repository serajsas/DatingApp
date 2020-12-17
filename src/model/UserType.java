package model;

import java.util.Objects;
import java.util.Observable;

public abstract class UserType extends Observable {
    private UserInformation userInformation;

    public UserType(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        UserType userType = (UserType) o;
        return Objects.equals(userInformation, userType.userInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInformation);
    }
}
