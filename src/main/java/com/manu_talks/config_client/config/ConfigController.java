package com.manu_talks.config_client.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${server.url}")
    private String serverUrl;

    @Value("${app.username}")
    private String username;

    @Value("${app.password}")
    private String password;

    @GetMapping("/config")
    public String getConfig() {
        return "Server URL: " + serverUrl + ", Username: " + username + ", Password: " + password;
    }
}