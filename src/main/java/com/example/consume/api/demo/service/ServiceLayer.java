package com.example.consume.api.demo.service;

import com.example.consume.api.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer  {

    private final RestTemplate restTemplate;

    @Autowired
    public ServiceLayer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User consumeAPI() {
        return restTemplate.getForObject("https://datausa.io/api/data?drilldowns=Nation&measures=Population", User.class);
    }
}
