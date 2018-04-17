package com.clientproviderexample.demo.service.serviceimpl;

import com.clientproviderexample.demo.entity.City;
import com.clientproviderexample.demo.service.CityService;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public City findCityList() {
        return new City("tongguan","714300");
    }
}
