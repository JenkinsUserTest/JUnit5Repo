package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class InstanceTest {

	private int sum=0;
	
	
	@Test
	void a() {
     sum+=5;
	}
	@Test
	void b() {
		sum+=10;
	}

	@AfterEach
	void afterEach() {
		System.out.println("Sum is:"+sum);
	}
}
