package com.actitime;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestingClass {
	
	
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("Before class method");
	}
	
	
	@Test
	public void testingpgm()
	{
		Reporter.log("Running testingpgm",true);
		Reporter.log("Running testingpgm",true);
		Reporter.log("Running testingpgm",true);
		Reporter.log("Running testingpgm",true);
		Reporter.log("Running testingpgm",true);
		Reporter.log("Running testingpgm",true);
		Reporter.log("Running testingpgm",true);
		Reporter.log("Running testingpgm",true);
		
	}
	
	@AfterClass
	public void afterclass()
	{
		Reporter.log("After class method");
	}

}
