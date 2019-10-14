package ssm;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ssm.pojo.User;
import com.ssm.service.EchacheService;
import com.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-application.xml"}) 
public class EhcacheTest {

	private final static Logger LOGGER = Logger.getLogger(EhcacheTest.class);

	@Autowired
	private EchacheService echacheService;
	
	@Test
	public void echacheTest() throws InterruptedException{
		System.out.println("第一次调用结果为"+echacheService.getTimes("param"));
		Thread.sleep(3000);
		System.out.println("第二次调用结果为"+echacheService.getTimes("param"));
		Thread.sleep(15000);
		System.out.println("第三次调用结果为"+echacheService.getTimes("param"));
	}
}
