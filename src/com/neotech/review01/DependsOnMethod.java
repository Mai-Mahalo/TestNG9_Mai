package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.Test;

// Part 2-1 (7:00)

// dependsOnMethod = The second one will run if the first one passed.

public class DependsOnMethod {
	
	@Test
	public void firstTest() {
		System.out.println("First test is running");
		
		Assert.assertEquals("a", "b", "This test is failing intentionally.");
		// The first one is "failed".
		// "a", "b" = different character = make it fail
		// if "a" and "a" = will succeed
	}
	
	@Test(dependsOnMethods = "firstTest")
	public void secondTest() {
		System.out.println("Second test is running");
	}
	
	// First test will executed first.
	// First test will fail.
	// Second test will be skipped because it depends on the first test.
	// Results: First test: FAILED, // Second test: SKIPPED

}
