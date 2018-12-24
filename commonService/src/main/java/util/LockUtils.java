package util;

import common.CallBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author wei.li
 * @date 2018/12/4 21:52
 * @desc
 */
@Component
public class LockUtils {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    private static final long LOCK_TIMEOUT = 60 * 1000;

    public void lockDo(String key, CallBack callBack){
        Long lock_timeout = System.currentTimeMillis() + LOCK_TIMEOUT + 1; //锁时间
        //获取锁
        if(redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                JdkSerializationRedisSerializer jdkSerializer = new JdkSerializationRedisSerializer();
                byte[] value = jdkSerializer.serialize(lock_timeout);
                return redisConnection.setNX(key.getBytes(), value);

            }
        })){
            System.out.println("get lock");
            redisTemplate.expire(key, LOCK_TIMEOUT, TimeUnit.MILLISECONDS); //设置超时时间，释放内存

        }
    }


}
