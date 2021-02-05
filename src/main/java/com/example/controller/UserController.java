package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Andy
 * @time: 2020/9/23 11:01
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/test")
    public String login() {
        return "hi";
    }

}
