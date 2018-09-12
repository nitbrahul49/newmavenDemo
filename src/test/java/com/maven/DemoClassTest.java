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
		
<<<<<<< HEAD
		//changes for masters branch
=======
		//changes for dev branch
>>>>>>> 89a31aa6e024df4345274226b4b90d4cfb6ed78f
	}

}
