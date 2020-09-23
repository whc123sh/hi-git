package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Andy
 * @time: 2020/9/23 11:01
 */
@RequestMapping("/")
@RestController
public class UserController {
    @RequestMapping("/")
    public String login() {

        return "欢迎蔡老板";
    }

}
