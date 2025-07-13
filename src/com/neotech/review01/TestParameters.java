package com.neotech.review01;

import org.testng.annotations.Test;

// Part 1-2 (35:00) / Attribute (Need to watch to create a XML file)
// TestNG does not use with "groups".
// Why do we set "groups"? -> controlling XML file

public class TestParameters {
	
	@Test (priority = 4, groups = "regression")
	public void MethodA() {
		System.out.println("Method A is running");
	}
	
	@Test(priority = 1, enabled = false, groups = "regression")
	public void MethodB() {
		System.out.println("Method B is running");
	}
	
	
}
