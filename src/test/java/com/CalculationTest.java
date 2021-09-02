package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void testAdd() {
		Calculation cc = new Calculation();
		int result = cc.add(10, 20);
		assertEquals(30, result);
	}

}
