package com.lwa.controller;

import com.lwa.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwa on 2017/5/25.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value="/api/user", method = RequestMethod.GET)
    public void findOneCity(@PathVariable("cityName") String cityName){
        System.out.println("11111111111111");
    }
}
