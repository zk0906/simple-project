package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.ssm.service.RedisService;

@Service("redisService")
public class RedisServiceImpl implements RedisService{

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	public Object get(String key) {
		return redisTemplate.boundValueOps(key).get();
	}

	public void set(String key, Object value) {
		redisTemplate.boundValueOps(key).set(value);
	}

	public void del(String key) {
		redisTemplate.delete(key);		
	}

	
}
