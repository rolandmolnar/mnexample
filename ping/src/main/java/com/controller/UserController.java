package com.controller;

import com.repository.UserRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/user")
public class UserController {

    @Inject
    private UserRepository userRepository;

    @Get("/")
    public String ping() {
        return userRepository.getUser(1).getName();
    }
}