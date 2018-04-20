package com.hystrixexample.hystrixdemo.controller;

import com.hystrixexample.hystrixdemo.HystrixClient;
import com.hystrixexample.hystrixdemo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hystrixController {

    @Autowired
    private HystrixClient hystrixClient;

    @GetMapping(value="cityinfo")
    public City getCity(){
        return hystrixClient.getCity();
    }
}
