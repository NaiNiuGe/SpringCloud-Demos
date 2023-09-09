package com.example.consumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class testController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{num}")
    public String testGet(@PathVariable Integer num){
        String body = restTemplate.getForEntity("http://test/student/test/" + num, String.class).getBody();
        return body;
    }
}
