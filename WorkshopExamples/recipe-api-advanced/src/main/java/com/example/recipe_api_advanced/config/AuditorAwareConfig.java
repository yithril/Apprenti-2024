package com.example.recipe_api_advanced.config;

//This class is needed to fill out the auditing fields for you

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
public class AuditorAwareConfig {
    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> {
            // Replace this with your logic to fetch the current user
            return Optional.of("system"); // Default to "system" or fetch from SecurityContext
        };
    }
}
