package com.sample.Learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties("application.properties")
public class GeetringController {

    @Value("${spring.data.demo.name}")
    private String name;

    @GetMapping("greeting")
    public String greeting() {
        return "Greeting message from Yantriks: " + name;
    }

}
