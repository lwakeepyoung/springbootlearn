package com.lwa.controller;

import com.lwa.domain.City;
import com.lwa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwa on 2017/5/3.
 */
@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value="/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName") String cityName){
        return cityService.findCityByName(cityName);
    }

}
