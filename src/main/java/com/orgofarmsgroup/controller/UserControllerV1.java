package com.orgofarmsgroup.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("/api/v1/users")
public class UserControllerV1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserControllerV1.class);

    @GetMapping
    public ResponseEntity<Object> status() {
        LOGGER.info("status check received.");
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();
        JSONObject jsonString = new JSONObject()
                .put("api", "v1/users/*")
                .put("status", "up and running.")
                .put("version", "v1.0.0")
                .put("timestamp", timestamp)
                .put("message", "Users api is up and healthy.");
        System.out.println(jsonString);
        return ResponseEntity.ok(jsonString.toString());
    }
}
