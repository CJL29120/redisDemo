package com.demo.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.redis.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RedisApplicationTests {

	@Test
	public void contextLoads() {
		User user = new User();
		user.setId(123l);
		user.setEmail("123@qq.com");
		user.setPassword("123456");
		user.setPhone("19925587215");
		user.setCreated(new Date());
		String s = JSONObject.toJSONString(user);
		log.warn(s);

	}

}
