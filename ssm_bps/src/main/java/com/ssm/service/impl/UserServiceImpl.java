package com.ssm.service.impl;

import org.springframework.stereotype.Service;

import com.ssm.pojo.User;
import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	public User findUser() {
		User user = new User();
		user.setId(1);
		user.setUserName("张三");
		return user;
	}

	
}
