package com.java.selfdeveloped.cloud.jenkins.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MySpringJenkinAppApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(MySpringJenkinAppApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}