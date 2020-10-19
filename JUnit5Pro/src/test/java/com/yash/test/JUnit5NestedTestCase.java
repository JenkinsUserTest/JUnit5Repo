package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class JUnit5NestedTestCase {


   @Nested
   class NestedTest{
	   int no1;
	   @BeforeEach
	   void setUp() {
		   no1=10;
	   }
	   @Test
	   void test() {
		   assertTrue(no1>5);
	   }
	   
   }
	
	
}
