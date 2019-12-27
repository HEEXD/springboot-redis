package com.hxd.springbootredis.modules.user.service.impl;

import com.hxd.springbootredis.modules.user.dao.UserDao;
import com.hxd.springbootredis.modules.user.entity.User;
import com.hxd.springbootredis.modules.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hee on 2019/12/26 14:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
