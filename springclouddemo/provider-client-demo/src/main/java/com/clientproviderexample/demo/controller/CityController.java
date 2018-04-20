package com.clientproviderexample.demo.controller;

import com.clientproviderexample.demo.entity.City;
import com.clientproviderexample.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public City getCity(){
        return this.cityService.findCity();
    }
}
