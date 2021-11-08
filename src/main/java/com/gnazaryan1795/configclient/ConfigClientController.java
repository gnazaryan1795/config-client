package com.gnazaryan1795.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${test.username}")
    private String user;

    @Value("${test.password}")
    private String pass;

    @GetMapping(value = "/testConfigServer", produces = MediaType.TEXT_PLAIN_VALUE)
    public String testConfigServer() {
        return "username is: " + user + ", password is: " + pass;
    }
}