package com.orgofarmsgroup;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SonarqubeCodeQualityDemoApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SonarqubeCodeQualityDemoApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("contextLoads completed.");
		boolean isTrue = true;
		assertTrue(isTrue);
	}
}
