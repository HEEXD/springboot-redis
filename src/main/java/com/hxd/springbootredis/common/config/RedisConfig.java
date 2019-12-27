package com.hxd.springbootredis.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Created by hee on 2019/12/26 13:55
 */
@Configuration
public class RedisConfig {

    /**
     * 序列化方式
     */
    @Bean
    @SuppressWarnings("all")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        /*RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(factory);
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        template.setKeySerializer(stringRedisSerializer);// key采用String的序列化方式
        template.setHashKeySerializer(stringRedisSerializer);// hash的key也采用String的序列化方式
        template.setValueSerializer(jackson2JsonRedisSerializer);// value序列化方式采用jackson
        template.setHashValueSerializer(jackson2JsonRedisSerializer);// hash的value序列化方式采用jackson
        template.afterPropertiesSet();
        return template;*/
        RedisTemplate redisTemplate = new StringRedisTemplate(factory);
        StringRedisSerializer stringRedisSerializer =new StringRedisSerializer();
        redisTemplate.setValueSerializer(stringRedisSerializer);
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        redisTemplate.setHashValueSerializer(stringRedisSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

}
