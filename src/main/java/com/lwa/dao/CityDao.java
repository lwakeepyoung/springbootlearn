package com.lwa.dao;

import com.lwa.domain.City;
import org.apache.ibatis.annotations.Param;


/**
 * Created by lwa on 2017/5/3.
 */
public interface CityDao {
    City findCityByName(@Param("cityName") String cityName);

    City findCityById(@Param("id") Long id);
}
