package com;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class UserControllerTest {
    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testUser() {
        HttpRequest<?> request = HttpRequest.GET("/user");
        String body = client.toBlocking().retrieve(request);
        assertNotNull(body);
        assertEquals("John Doe", body);
    }
}
