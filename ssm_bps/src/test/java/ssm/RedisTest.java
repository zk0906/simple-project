package ssm;

import com.ssm.util.RedisUtil;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-application.xml"})
public class RedisTest {

	private static final Logger LOGGER = Logger.getLogger(RedisTest.class);
	@Autowired
	private RedisUtil redisUtil;

	@Test
	public void redisTest() {
		this.redisUtil.set("hello1", "world1");
		this.redisUtil.set("hello2", "world2");
		this.redisUtil.set("hello3", "world3");
		this.redisUtil.set("hello4", "world4");
		this.redisUtil.set("hello5", "world5");
		System.out.println(this.redisUtil.get("hello"));
//		System.out.println(this.redisUtil.get("zk"));
	}
}
