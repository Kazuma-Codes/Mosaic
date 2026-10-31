package com.mosaic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    // Mapped to root, /health, and /api/v1/health so uptime monitors and Render health checks succeed.
    @GetMapping({"/", "/health", "/api/v1/health"})
    public Map<String, String> health() {
        return Map.of("status", "ok");
    }
}
