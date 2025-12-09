package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.Calculator;

public class CalculatorTest {

	@Test
	public void testAddition() {
		System.out.println("Addition method from Test");
		assertEquals(10,Calculator.addition(5, 5));
	}

	@Test
	public void testSubtraction() {
		assertEquals(10,Calculator.subtraction(20, 10));
	}

	@Test
	public void testMultiplication() {
		assertEquals(25,Calculator.multiplication(5, 5));
	}

	@Test
	public void testDivision() {
		assertEquals(1,Calculator.division(5, 5));
	}
	
	@Test
	public void testFindFactorial() {
		assertEquals(120,Calculator.findFactorial(5));
	}

}
