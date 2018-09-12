package com.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoClassTest {

	@Test
	public void testAddTwoNumbers() {
		//fail("Not yet implemented");
		DemoClass demo= new DemoClass();
		int r = demo.addTwoNumbers(100, 200);
		assertEquals(300, r);
		
		//changes for master branch
	}

}
