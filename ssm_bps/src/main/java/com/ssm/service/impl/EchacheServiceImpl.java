package com.ssm.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ssm.service.EchacheService;

@Service("echacheService")
public class EchacheServiceImpl implements EchacheService{

	@Cacheable(value="cacheOne",key="#param")  //value值和ehcache.xml中的name一样
	public String getTimes(String param) {
		return System.currentTimeMillis()+"";
	}

}
