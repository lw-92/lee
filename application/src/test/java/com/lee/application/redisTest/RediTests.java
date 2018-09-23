package com.lee.application.redisTest;

import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wei.li
 * @date 2018/9/23 11:03
 * @desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RediTests {

    @Autowired
    RedisTemplate<String,byte[]> template;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test1(){
        template.opsForValue().set("1","111".getBytes());
        final byte[] bytes = template.opsForValue().get("1");
        String s = new String(bytes);
        Assert.assertTrue("111".equals(  s));
    }
    @Test
    public void test2(){

        Map<String,String> map=new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");

        redisTemplate.opsForHash().putAll("mymap",map);
        final Object o = redisTemplate.opsForHash().get("mymap", "key1");
        System.out.println(o);
        Map<String,String> map2=new HashMap<String,String>();
        map2.put("key6","value6");
        map2.put("key7","value7");
        map2.put("key8","value8");
        map2.put("key9","value9");
        map2.put("key10","value10");
        map2.put("key5","value5");
        redisTemplate.opsForHash().putAll("mymap",map2);

        final Map<Object, Object> mymap = redisTemplate.opsForHash().entries("mymap");
        Boolean aBoolean = redisTemplate.opsForHash().hasKey("mymap", "key9");
        System.out.println(aBoolean);

    }

}
