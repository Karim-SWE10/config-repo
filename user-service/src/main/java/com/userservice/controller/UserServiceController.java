package com.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserServiceController {

    @Value("${serer.port}")
    private String port;
    @GetMapping("/port")
    String getPort() {
        return this.port;
    }
    @Value("${message}")
    private String message;

    @GetMapping("/message")
    String getMessage() {
        return this.message;
    }

}
