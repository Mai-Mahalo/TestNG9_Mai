package com.neotech.lesson01;

import org.testng.annotations.Test;

// Part 1-1

public class TestNGDemo { // Example: LoginTest
	
	@Test // = annotation is required.
	public void testOne() { // PositiveTest
		System.out.println("Test is test method 1");
				
	}
	@Test // This is a test method.
	public void testTwo() { // NegativeTest
		System.out.println("This is test method 2");
		
	}
	
	@Test
	public void testThree() {
		System.out.println("This is test method 3");
	}
		
	// To run the test: Right click -> Run As  -> TestNG
	// After run the test: Choose a project (Eg: TestNG_Mai) -> Refresh -> "test-output" folder will be shown
	// Right click "index" to choose "Open with" -> "Web Browser"
	// "Passed methods" will show all the test methods alphabetical order

}
