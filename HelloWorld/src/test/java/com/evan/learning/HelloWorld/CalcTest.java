package com.evan.learning.HelloWorld;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	private Calc calcObj;


	
	@Before
	public void SetUp() {
		calcObj = new Calc();
	}
	
	@Test
	public void addTest() {
		System.out.println("junit addTest start");
		assertEquals(5, this.calcObj.add(2, 3));
		System.out.println("junit addTest over");
	}
	
	@Test
	public void subTest() {
		System.out.println("junit subTest start");
		assertEquals(5, this.calcObj.sub(7, 2));
		System.out.println("junit subTest over");
	}
	
	@Test
	public void mulTest() {
		System.out.println("junit mulTest start");
		assertEquals(15, this.calcObj.mul(3, 5));
		System.out.println("junit mulTest over");
	}

}
