package com;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        System.out.println("Application started");
        Micronaut.run(Application.class, args);
        System.out.println("Micronaut running");
    }
}