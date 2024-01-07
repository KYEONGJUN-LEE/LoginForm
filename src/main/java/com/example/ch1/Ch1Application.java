package com.example.ch1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Ch1Application {
    public static void main(String[] args) {
        SpringApplication.run(Ch1Application.class, args);
    }

}