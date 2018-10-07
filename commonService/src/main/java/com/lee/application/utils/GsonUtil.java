package com.lee.application.utils;

import com.google.gson.Gson;

/**
 * @author wei.li
 * @date 2018/9/18 22:35
 * @desc
 */
public class GsonUtil {

    private static final Gson GSON = new Gson();

    public static String obj2Json(Object obj){

        return GSON.toJson(obj);
    }



}
