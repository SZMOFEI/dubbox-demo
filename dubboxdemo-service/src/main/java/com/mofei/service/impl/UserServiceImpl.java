package com.mofei.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mofei.service.UserService;

/**
 * @author mofei
 * @date 2018/8/31 22:50
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName() {
        return "hello dubbox";
    }
}
