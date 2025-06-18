package com.controller;

import com.repository.IUserRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/user")
public class UserController {

    @Inject
    private IUserRepository userRepository;

    @Get("/")
    public String ping() {
        return userRepository.getUser(1).getName();
    }
}