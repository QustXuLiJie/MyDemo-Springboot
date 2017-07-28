package com.xulj.service;

import com.xulj.mapper.UserMapper;
import com.xulj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo() {
        User user = userMapper.findUserInfo();
        //User user=null;
        return user;
    }

}
