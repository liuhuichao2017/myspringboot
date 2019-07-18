package com.css.dao;

import com.css.model.User;
import org.apache.ibatis.annotations.Mapper;


public interface UserDao {
    int insert(User record);

    int insertSelective(User record);

    User login(User user);
}