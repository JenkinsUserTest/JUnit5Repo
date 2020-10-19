package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.yash.helper.StringCheck;

class JUnit5ParameterizedTest {

	@ParameterizedTest
	@ValueSource(strings = {"sabbbir","sachin","sumeet"})
	void testNames(String str) {
		StringCheck stringCheck=new StringCheck();
		String pattern="s";
		boolean actual=stringCheck.checkStartingChar(str,pattern);
        assertTrue(actual);
	}

	@RepeatedTest(value=5)
	void repeatedTest() {
		assertEquals("HelloWorld","HelloWorld");
	}
}
