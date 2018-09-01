package com.mofei.dubboxdemoweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mofei.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mofei
 * @date 2018/8/31 23:15
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName () {
        return userService.getName();
    }

}
