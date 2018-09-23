package com.lee.application;

import com.lee.application.callback.RedisCallBack;
import com.lee.application.callback.RedisData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;

/**
 * @author wei.li
 * @date 2018/9/18 22:26
 * @desc
 */
@Service
public class CacheServiceImpl implements  CacheService{

    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Override
    public boolean addStringCache(String key, String value, long ttl) {
        if(ttl>0){
            redisTemplate.opsForValue().set(key,value,ttl);
        }else{
            redisTemplate.opsForValue().set(key,value);
        }
        /*Executors.newFixedThreadPool(1).submit();*/


        return true;
    }

    public <T>RedisData<T> getString(RedisCallBack<T> callBack, String key){
        final String s = redisTemplate.opsForValue().get(key);
        return  callBack.execute(s);
    }
}
