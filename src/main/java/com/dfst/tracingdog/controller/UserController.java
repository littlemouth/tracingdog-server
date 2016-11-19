package com.dfst.tracingdog.controller;

import com.dfst.tracingdog.pojo.User;
import com.dfst.tracingdog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by yanfei on 2016-11-17.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Resource(name="UserService")
    private UserService userService;

    @RequestMapping(value="/getUserById/{id:\\d+}")
    @ResponseBody
    public User getUserById(@PathVariable("id") Integer id){
        System.out.println("===========================>>>>++++++++");
        User u = userService.findOne(id);
        return u;

    }
}
