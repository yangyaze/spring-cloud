package com.example.users1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Users1Application {

    public static void main(String[] args) {
        SpringApplication.run(Users1Application.class, args);
    }

}
