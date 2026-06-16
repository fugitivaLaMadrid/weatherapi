package com.fugitivalamadrid.weatherapi.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Weather API Service main application class
 * Handles weather service operations with PostgreSQL backend
 */
@SpringBootApplication
public class WeatherApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApiServiceApplication.class, args);
    }

}

