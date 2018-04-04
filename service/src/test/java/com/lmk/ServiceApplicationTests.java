package com.lmk;

import com.lmk.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testName() {
		User user = new User();
		System.out.println("");
	}
}
