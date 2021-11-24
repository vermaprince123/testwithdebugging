package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TestwithdebuggingApplicationTests {

	Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testMethod(){
		int expectedSum = 7;
		int expectedMultiply = 12;

		int finalSum = c.sum(3, 4);
		int finalMultiply = c.multiply(3, 4);
		assertThat(finalSum).isEqualTo(expectedSum);
		assertThat(finalMultiply).isEqualTo(expectedMultiply);
	}
}
