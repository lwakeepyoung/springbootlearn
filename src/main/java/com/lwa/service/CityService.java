package com.lwa.service;

import com.lwa.domain.City;

/**
 * Created by lwa on 2017/5/3.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}