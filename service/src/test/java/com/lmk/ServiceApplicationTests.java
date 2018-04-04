package com.lmk;

import com.lmk.mapper.UserMapper;
import com.lmk.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
public class ServiceApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testName() {
		User user = new User();
		System.out.println("");
	}

	@Test
	public void testInsert() {
		User user = new User("2","kkk");
		userMapper.insert(user);

	}

}
