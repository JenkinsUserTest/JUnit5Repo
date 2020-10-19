package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.yash.meta.FastTest;

class MetaAnnotationTestCase {

	@DisplayName("Assert if true")
	@FastTest
	void test() {
    assertTrue(true);
	}

}
