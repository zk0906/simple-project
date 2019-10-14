package com.ssm.service;
/**
 * redis接口
 * @author BPS
 * @time 2017年8月31日下午5:51:42
 *
 */
public interface RedisService {

	/**
	 * 根据key获取value
	 * @param key
	 * @return
	 */
	public Object get(String key);

	/**
	 * 存储value
	 * @param key
	 * @param value
	 */
	public void set(String key, Object value);

	/**
	 * 根据key删除
	 * @param key
	 */
	public void del(String key);
}
