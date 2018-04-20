package com.consumerclientexample.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CityController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "cityback")
    @RequestMapping("/consumercity")
    public String getCity(){
        return restTemplate.getForEntity("http://provider-service/city",String.class).getBody();
    }

    public String cityback(){
        return "shijiazhuang";
    }
}
