package com.fugitivalamadrid.weatherapi.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class WeatherApiServiceApplicationTests {

    @Test
    void contextLoads() {
        assertDoesNotThrow(() -> {
            // Test that application context loads successfully
        });
    }

}

