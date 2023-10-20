package com.junitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class AssertProgram {
	
	
	
	@Test
	public void testAssertEquals() {
		assertEquals(10,10);
	}
	@Test
	public void testNull() {
		assertNull(null,null);
	}
	@Test
	public void testTrue() {
		boolean a=10>3;
		assertTrue(a);
	}
	@Test
	public void testSame() {
		assertSame("vinesh","vinesh");
	}
	@Test
	public void testArray() {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		assertArrayEquals(a,b);
	}
	
	@Test
	public void testAnEquals() {
		assertNotEquals(10,6);
	}
	@Test
	public void testNnull() {
		String a = "a"; String b = "b";
		assertNotNull(a,b);
	}
	@Test
	public void testFalse() {
		boolean ab = 2>3;
		assertFalse(ab);
	}
	@Test
	public void testNsame() {
		assertNotSame("vinesh","jaga");
	}
	 
	 Maxnumber mn = new Maxnumber();
	 
	@Test
	public void testArra() {		
		int[] maxi = {10,45,32,78};
		assertEquals(mn.findMax(maxi),10);
	
	}
	
}
	
	


