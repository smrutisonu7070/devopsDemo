package com.devops.devopsDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DevopsDemoApplicationTests {

	Logger logger = LoggerFactory.getLogger(DevopsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Method Started....");
		Assertions.assertEquals(true,true);
	}

}
