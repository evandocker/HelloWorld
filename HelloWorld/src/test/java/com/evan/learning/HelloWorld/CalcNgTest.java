package com.evan.learning.HelloWorld;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalcNgTest {
	
	private CalcNg calcObj;


	
	@BeforeClass
	public void SetUp() {
		calcObj = new CalcNg();
	}

  @Test
  public void addngTest() {
    //throw new RuntimeException("Test not implemented");
	System.out.println("testng addTest start");
	assertEquals(5, this.calcObj.addng(2, 3));
	System.out.println("testng addTest over");
  }

  @Test
  public void mulngtest() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("testng mulTest start");
		assertEquals(15, this.calcObj.mulng(3, 5));
		System.out.println("junit mulTest over");
  }

  @Test
  public void subng() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("testng subTest start");
	    assertEquals(5, this.calcObj.subng(7, 2));
		System.out.println("testng subTest over");
  }
}
