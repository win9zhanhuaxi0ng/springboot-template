package com.demofactory.template.controller.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.demofactory.template")
public class TemplateAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateAdminApplication.class, args);
    }

}
