package ssm;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ssm.pojo.User;
import com.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class test {

	private final static Logger LOGGER = Logger.getLogger(test.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testOne(){
		User user = userService.findUser();
		System.out.println(JSON.toJSONString(user));
	}
}
