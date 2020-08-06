package com.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GoogleHomePageTitle {

	
	private WebDriver driver;
	String url="https://www.google.com/";
	@BeforeClass
	public void  setUp()
	{
		driver=new ChromeDriver();
		driver.navigate().to(url);
			}
	@Test
	public void googletitleVrification()
	{
		String getTtitle=driver.getTitle();
		Assert.assertEquals(getTtitle, "Google");
		
		Reporter.log("Executed succesfully",true);

	}
	@AfterClass
	public void tearDown()
	{
	driver.quit();	
	}
	
}
