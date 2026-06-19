package com.kmedtech.my_springboot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringbootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringbootAppApplication.class, args);
        System.out.println("Hello Mani! ");
        System.out.println("Welcome to Spring Boot Application");
    }

}
