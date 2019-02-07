package com.example.springtutorialsmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springtutorialsmvc.*"})
public class SpringTutorialsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTutorialsMvcApplication.class, args);
    }

}

