package com.fugitivalamadrid.weatherapi.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Weather API Service main application class
 * Handles weather service operations with PostgreSQL backend
 */
@SpringBootApplication
@ComponentScan(basePackages = {
    "com.fugitivalamadrid.weatherapi.service",
    "com.fugitivalamadrid.weatherapi.common"
})
public class WeatherApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApiServiceApplication.class, args);
    }

}

