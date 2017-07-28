package com.xulj.controller;

import com.xulj.common.MyRequest;
import com.xulj.model.User;
import com.xulj.service.UserService;
import com.xulj.utils.BeanHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(MyRequest request) throws Exception {
        User userParam = BeanHelper.parseJson(request.getContent() , User.class);
        User user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getUsername():"+user.getUsername());
            logger.info("user.getMobile():"+user.getMobile());
        }
        return user;
    }
}
