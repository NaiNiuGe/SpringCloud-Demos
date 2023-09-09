package com.example.demoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoEureka7003Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEureka7003Application.class, args);
    }

}
