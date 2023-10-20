package com.junitproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class TestCalculator {
	
	Calculator calc = new Calculator();
	
	@Before
	public void print() {
		System.out.println("Hello");
	}
	@After
	public void printBye() {
		System.out.println("Bye");
	}
	
	 @Test
	public void testAdd() {
		System.out.println(calc.add(20, 11));
	}
	 @Test
	 public void testSub() {
		 System.out.println(calc.sub());
	 }
	 @Test
	 public void testMulti() {
		 calc.multi(10, 3);
	 }
	@Test
	public void testDiv() {
		calc.div();
	}
	

}
