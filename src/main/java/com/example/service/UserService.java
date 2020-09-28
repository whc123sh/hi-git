package com.example.service;

import com.example.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Andy
 * @time: 2020/9/23 18:26
 */

public interface UserService {
    public  User selectUserById();
}
