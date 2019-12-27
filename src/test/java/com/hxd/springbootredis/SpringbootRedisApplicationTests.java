package com.hxd.springbootredis;

import com.hxd.springbootredis.common.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void testRedis() {
        redisUtil.set("hxd", "123");
        //redisUtil.set("user", JSONObject.toJSONString(User.builder().id("4").username("hxd").age("12").build()));

    }
}
