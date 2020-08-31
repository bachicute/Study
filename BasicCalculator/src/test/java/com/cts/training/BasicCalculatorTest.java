package com.cts.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicCalculatorTest {

	@Test
	public void addTest() {
		BasicCalculator calc  = new BasicCalculator();
		//assertEquals(10, calc.add(5, 5));
		assertEquals(10, calc.add(5, 5));
		
	}
	@Test
	public void subTest() {
		BasicCalculator calc  = new BasicCalculator();
		//assertEquals(5, calc.sub(10, 5));
		assertEquals(0, calc.sub(5, 5));
	}

}
