package com;

import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.ApplicationShutdownEvent;
import io.micronaut.runtime.event.ApplicationStartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        LOGGER.info("Application started");
        System.out.println("Application started");
        Micronaut.run(Application.class, args);
        LOGGER.info("Micronaut running");
    }

    @EventListener
    void onStartup(final ApplicationStartupEvent event) {
        LOGGER.info("LOGGER: Startup Event");
    }

    @EventListener
    void onShutdown(final ApplicationShutdownEvent event) {
        LOGGER.info("LOGGER: Shutdown Event");
    }
}