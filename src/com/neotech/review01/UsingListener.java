package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Part 4-4 (40:00) (Need to solve the error for Line 11 (Need to add "Listeners" in "com.neotech.utils"

// @Listeners(com.neotech.utils.Listener.class) // specify the listener class to be used
public class UsingListener {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method runs just before each test method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This method runs just after each test method");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 is running");
		
		Assert.assertTrue(false, "This test is expected to fail");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 is running");
		
		Assert.assertEquals("A", "A", "This test is exepected to pass");
		
	}
	
}
