package com.lwa.service.Impl;

import com.lwa.dao.CityDao;
import com.lwa.domain.City;
import com.lwa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lwa on 2017/5/3.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;
    @Override
    public City findCityByName(String cityName) {
        return cityDao.findCityByName(cityName);
    }

    @Override
    public City findCityById(Long id) {
        return cityDao.findCityById(id);
    }

}
