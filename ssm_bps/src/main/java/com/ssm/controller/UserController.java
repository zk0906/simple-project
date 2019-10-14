package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.User;
import com.ssm.service.UserService;

/**
 * User控制层
 * @author BPS
 * @time 2017年8月30日下午4:08:53
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	private final static Logger LOGGER = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * 查找user
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/findUser")
	public ModelAndView findUser(HttpServletResponse response,HttpServletRequest request){
		LOGGER.info("进入查找User方法");
		ModelAndView mv = new ModelAndView("showUser");
		User user = userService.findUser();
		mv.addObject("user", user);
		return mv;
	}
}
