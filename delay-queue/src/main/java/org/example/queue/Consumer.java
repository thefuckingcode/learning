package org.example.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Set;

import static org.example.constant.Constant.DELETE_SUCCESS;

@Component
public class Consumer {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public String fetchOne(String key) {
        Set<String> sets = redisTemplate.opsForZSet().rangeByScore(key, 0, System.currentTimeMillis(), 0, 3);
        if (CollectionUtils.isEmpty(sets)) {
            return null;
        }
        for (String val : sets) {
            if (DELETE_SUCCESS.equals(redisTemplate.opsForZSet().remove(key, val))) {
                // 删除成功，表示抢占到
                return val;
            }
        }
        return null;
    }

}
