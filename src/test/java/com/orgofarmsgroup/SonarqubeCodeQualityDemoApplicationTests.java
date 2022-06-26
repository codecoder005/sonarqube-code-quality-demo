package com.orgofarmsgroup;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarqubeCodeQualityDemoApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SonarqubeCodeQualityDemoApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("contextLoads completed.");
	}

}
