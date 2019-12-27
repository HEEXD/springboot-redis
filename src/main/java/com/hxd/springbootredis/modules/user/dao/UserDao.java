package com.hxd.springbootredis.modules.user.dao;

import com.hxd.springbootredis.modules.user.entity.User;

import java.util.List;

/**
 * Created by hee on 2019/12/26 14:00
 */
public interface UserDao {

    List<User> findAll();
}
