package com.jh.halterocmsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jh")
public class HalterocmsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalterocmsApiApplication.class, args);
    }

}
