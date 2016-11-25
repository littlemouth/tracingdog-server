package com.dfst.tracingdog.controller;

import com.dfst.tracingdog.pojo.User;
import com.dfst.tracingdog.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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

        /*String head = null;
        try {
            InputStream in = new FileInputStream("E:\\github\\files\\head.jpg");
            byte[] data = new byte[in.available()];
            in.read(data);
            BASE64Encoder encoder = new BASE64Encoder();
            head = encoder.encode(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        u.setHead(head);*/
        return u;

    }

    @RequestMapping(value="/new")
    @ResponseBody
    public String add(@ModelAttribute("user") User user) {
        userService.add(user);
        return "success";
    }
}
