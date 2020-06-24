package com.ms.assignment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestAppTest {

	@Test
	public void contextLoads() {
		assertThat(new Object()).isNotNull();
	}
}
