package ssm;

import com.ssm.util.RedisUtil;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-application.xml" })
public class RedisTest {
	
	private static final Logger LOGGER = Logger.getLogger(RedisTest.class);
	@Autowired
	private RedisUtil redisUtil;

	@Test
	public void redisTest() {
		this.redisUtil.set("hello", "world");
		System.out.println(this.redisUtil.get("hello"));
	}
}
