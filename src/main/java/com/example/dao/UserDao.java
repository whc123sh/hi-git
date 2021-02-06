package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserDao {

    /**
     * 查找
     * @return
     */
    @Select("select id,name as username from user where id=1")
    User selectUserById();
}
