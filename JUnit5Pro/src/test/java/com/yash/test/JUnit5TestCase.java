package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JUnit5TestCase {
	
	@BeforeAll
	static void setUp() {
		System.out.println("--Before All--");
	}

	@AfterAll
	static void tearDown() {
		System.out.println("--After All--");
	}
	@BeforeEach
	void setUpCondition() {
		System.out.println("--Before Each test condition--");
	}
	@AfterEach
	void tearCondition() {
		System.out.println("--After Each test condition--");
	}
	@Tag("DEV")
	@Test
	void testAddDev() {
     int expected=15;
     int no1=10;
     int no2=5;
     int actual=no1+no2;
     System.out.println("--DEV test condition--");
     assertEquals(expected,actual);
	}

	@Tag("PROD")
	@Test
	void testAddProd() {
     int expected=15;
     int no1=10;
     int no2=5;
     int actual=no1+no2;
     System.out.println("--PROD test condition--");

     assertEquals(expected,actual);
	}
	@Test
	@Disabled
	void testDisabled() {
		
	}
}
