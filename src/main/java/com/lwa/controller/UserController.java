package com.lwa.controller;

import com.lwa.domain.User;
import com.lwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by lwa on 2017/5/25.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

        @RequestMapping(value="/v1/api/users", method = RequestMethod.GET)
    public List<User> findUserList(){
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("email","123@qq.com");

        List<User> users = userService.selectByExample(example);
        return users;
    }
}
