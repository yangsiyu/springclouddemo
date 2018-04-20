package com.hystrixexample.hystrixdemo;

import com.hystrixexample.hystrixdemo.entity.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-service",fallback = HystrixImp.class)
public interface HystrixClient {
    @GetMapping(value = "/city")
    City getCity();
}
