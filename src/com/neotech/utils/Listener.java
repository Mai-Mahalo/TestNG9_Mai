package com.neotech.utils;

// NOT sure what lesson
// Need to watch it!!

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	
	public void onStart(ITestContext context)
	{
		System.out.println("Functionality Test Started!");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Functionality Test Finished!");
	}
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName() + " test is starting...");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName() + " test just failed!");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName() + " test just passed!");
	}
}