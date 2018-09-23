package com.lee.application;

/**
 * @author wei.li
 * @date 2018/9/18 21:55
 * @desc
 */
public interface CacheService {

    boolean addStringCache(String key,String value,long ttl);


}
