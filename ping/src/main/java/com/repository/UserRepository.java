package com.repository;

import com.model.User;
import jakarta.inject.Singleton;

@Singleton
public class UserRepository implements IUserRepository {

    public User getUser(int userId) {
        return new User("John Doe", "john.doe@mnexample.com");
    }
}
