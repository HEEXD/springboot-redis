package com.hxd.springbootredis;

import com.alibaba.fastjson.JSONObject;
import com.hxd.springbootredis.common.utils.RedisUtil;
import com.hxd.springbootredis.modules.user.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void testRedis() {
        //redisUtil.set("hxd", "123");
        //redisUtil.set("user", JSONObject.toJSONString(User.builder().id("4").username("hxd").age("12").build()));
        //System.out.println(redisUtil.get("hxd"));

        /*Map<String, Object> map = new HashMap<>();
        map.put("username","hxd");
        map.put("age","25");
        map.put("sex","male");
        redisUtil.hmset("user", map);*/
        //System.out.println(redisUtil.hmget("user"));
        //System.out.println(redisUtil.hashGet("user","username"));
        //System.out.println(redisUtil.hset("myjob","job","java"));
        //redisUtil.del("myjob");
        //System.out.println(redisUtil.hHasKey("user", "username"));

        //System.out.println(redisUtil.sSet("myset", "string", JSONObject.toJSONString(User.builder().id("4").username("hxd").age("12").build())));
        //System.out.println(redisUtil.sGet("myset"));
        //System.out.println(redisUtil.sHasKey("myset",JSONObject.toJSONString(User.builder().id("4").username("hxd").age("12").build())));
        //System.out.println(redisUtil.sGetSetSize("myset"));
        //System.out.println(redisUtil.setRemove("myset","string"));

        //System.out.println(redisUtil.lSet("mylist", "string"));
        //System.out.println(redisUtil.lSet("mylist", JSONObject.toJSONString(User.builder().username("hee").age("12").build())));
        /*List<Object> list = new ArrayList<>();
        list.add("str");
        list.add(JSONObject.toJSONString(User.builder().username("hxd").age("19").build()));
        System.out.println(redisUtil.lSet("mylist2",list));*/
        System.out.println(redisUtil.lGet("mylist",0,1));
    }
}
