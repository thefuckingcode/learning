package org.example.queue;

import org.example.utl.JsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
public class Producer {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private Set<String> topic = new CopyOnWriteArraySet<>();

    public void publish(String key, Object val, long delayTime) {
        topic.add(key);
        String strVal = val instanceof String ? (String) val : JsonHelper.marshal(val);
        stringRedisTemplate.opsForZSet().add(key, strVal, System.currentTimeMillis() + delayTime);
    }
}
