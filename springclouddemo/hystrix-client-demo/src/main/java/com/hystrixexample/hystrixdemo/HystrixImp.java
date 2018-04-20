package com.hystrixexample.hystrixdemo;

import com.hystrixexample.hystrixdemo.entity.City;
import org.springframework.stereotype.Component;

@Component
public class HystrixImp implements HystrixClient {
    @Override
    public City getCity(){
        return new City("shijiazhuang","710000");
    }
}
