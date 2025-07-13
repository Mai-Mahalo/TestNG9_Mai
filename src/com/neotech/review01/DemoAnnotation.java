package com.neotech.review01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Part 1-1

public class DemoAnnotation {
	
	@Test
	public void test1() {
		System.out.println("Review test1");	
	}
	
	@Test
	public void test2() {
		System.out.println("Review test2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method runs just before each test method");		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This method runs just after each test method");
	}
	
	@BeforeTest
	private void beforeTest() {
		System.out.println("This method runs jsut once before all the tests in this clss");

	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This method runs just once afer all the tests in this class");
	}
	
	// @BeforeTest
	  // @BeforeMethod
	     // @Test 1
	  // @AfterMethod  
	  // @BeforeMethod
	     // @Test 2
	  // @AfterMehod
	// @AfterTest
	

}
