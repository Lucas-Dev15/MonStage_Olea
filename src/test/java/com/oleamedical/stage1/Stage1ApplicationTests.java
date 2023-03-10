package com.oleamedical.stage1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class Stage1ApplicationTests {

	@Test
	void test1() {
		HelloProvider provider = new HelloProvider("XXX");
		String value = provider.getHello();
		Assertions.assertEquals("Hello XXX", value);
	}

}
