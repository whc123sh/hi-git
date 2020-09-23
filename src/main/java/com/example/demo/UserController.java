package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Andy
 * @time: 2020/9/23 11:01
 */
@RequestMapping("user")
@RestController
public class UserController {
    @RequestMapping("login")
    public String login() {
        User u = new User();
        u.setGco("2");
        u.setGna("sss");
        return u.toString();
    }

}
