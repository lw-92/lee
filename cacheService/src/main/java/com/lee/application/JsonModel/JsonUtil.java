package com.lee.application.JsonModel;

import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;

/**
 * @author wei.li
 * @date 2018/12/3 23:09
 * @desc
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String convertObj2String(Object object) {
        String s = null;
        try {
            s = objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public static <T> T convertString2Obj(String s, Class<T> clazz) {
        T t = null;
        try {
            t = objectMapper.readValue(s, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }
}
