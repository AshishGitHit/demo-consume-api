package com.example.consume.api.demo.controller;

import com.example.consume.api.demo.entity.User;
import com.example.consume.api.demo.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ServiceLayer serviceLayer;

    @Autowired
    public HomeController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @GetMapping("/")
    public User getData() {
        return serviceLayer.consumeAPI();
    }

}
