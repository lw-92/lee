package com.lee.application;

import com.lee.application.JsonModel.JsonUtil;
import com.lee.application.callback.RedisCallBack;
import com.lee.application.callback.RedisData;
import org.apache.commons.lang3.StringUtils;
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
    private RedisTemplate<String,String> stringRedisTemplate;

    @Override
    public boolean addStringCache(String key, String value, long ttl) {
        if(ttl>0){
            stringRedisTemplate.opsForValue().set(key,value,ttl);
        }else{
            stringRedisTemplate.opsForValue().set(key,value);
        }
        return true;
    }

    @Override
    public <T> T getStringAndConvert(String s, Class<T> clazz) {
        String s1 = stringRedisTemplate.opsForValue().get(s);
        if(StringUtils.isNotEmpty(s1)){
            return JsonUtil.convertString2Obj(s1,clazz);
        }
        return null;
    }
}
