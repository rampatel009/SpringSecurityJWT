package com.devglan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

/**
 * http://localhost:8082/signup
 * {"username": "ram","password":"password","age":10,"salary":12345}
 *
 * http://localhost:8082/token/generate-token
 * {"username": "ram","password":"password"}
 *
 * http://localhost:8082/users/1
 *
 **/