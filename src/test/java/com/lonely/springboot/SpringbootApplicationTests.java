package com.lonely.springboot;

import com.lonely.springboot.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	private HomeController homeController;

	@Test
	public void contextLoads() {
//		TestCase.assertEquals(homeController.login(),"hello word");
	}

}
