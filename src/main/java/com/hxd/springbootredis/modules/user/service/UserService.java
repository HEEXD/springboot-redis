package com.hxd.springbootredis.modules.user.service;

import com.hxd.springbootredis.modules.user.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
