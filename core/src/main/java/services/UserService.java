package services;

import enums.UserType;
import model.User;

public interface UserService {
    User createUser(String email, String password, UserType userType);
}
