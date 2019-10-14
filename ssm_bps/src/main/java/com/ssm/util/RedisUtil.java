package com.ssm.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
/**
 * redis工具类
 * @author BPS
 * @time 2017年8月31日下午5:39:34
 *
 */
@Component
public class RedisUtil {
	
	private static final Logger LOGGER = Logger.getLogger(RedisUtil.class);
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	
	
	public Object get(String key) {
		return this.redisTemplate.boundValueOps(key).get();
	}

	public void set(String key, Object value) {
		this.redisTemplate.boundValueOps(key).set(value);
	}

	public void del(String key) {
		this.redisTemplate.delete(key);
	}
}
