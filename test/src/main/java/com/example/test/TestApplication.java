package com.example.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan({"com.example.test.Infrastructure.mapper"})
public class TestApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(TestApplication.class, args);
	}



}
