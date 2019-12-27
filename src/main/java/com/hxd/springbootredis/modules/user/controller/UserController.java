package com.hxd.springbootredis.modules.user.controller;

import com.hxd.springbootredis.common.utils.RedisUtil;
import com.hxd.springbootredis.modules.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by hee on 2019/12/26 14:00
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        model.addAttribute("list", userService.findAll());
        return "userList";
    }

    @RequestMapping("findAllRedis")
    public String findAllRedis(Model model) {
        try {
            Set<String> keys = redisUtil.keys();
            List<Map<String, Object>> list = new ArrayList<>();
            Iterator<String> it = keys.iterator();
            if(keys.size()!=0) {
                while (it.hasNext()) {
                    Map<String, Object> map = new HashMap<>();
                    String key = it.next();
                    map.put("key",key);
                    Object obj = redisUtil.get(key);
                    map.put("value", obj);
                    list.add(map);
                }
            }
            model.addAttribute("list", list);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "redisList";
    }
}
