package com.css.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.css.dao.UserDao;
import com.css.model.MyResult;
import com.css.model.User;
import com.css.service.UserService;

/**
 * @author ：zhoukaishun
 * @date ：Created in 2019/5/9 9:42
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public MyResult login(User user) {
        User u = null;
        List<User> list = new ArrayList<User>();
        u = userDao.login(user);
        MyResult result = new MyResult();
        if(u!=null){
            result.setCode(0);
            result.setMsg("登陆成功！");
            list.add(u);
            result.setList(list);
        }else{
            result.setCode(1);
            result.setMsg("登陆失败！");
        }
        return result;

    }
}
