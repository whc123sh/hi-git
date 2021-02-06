package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Andy
 * @time: 2020/9/23 11:01
 */
@Api(tags = "测试")
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/test")
    @ApiModelProperty("测试")
    public String login() {
        User user = userService.selectUserById();
        return user.toString();
    }

}
