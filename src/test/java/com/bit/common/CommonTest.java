package com.bit.common;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bit.basetest.BaseTest;


public class CommonTest extends BaseTest 
{
  
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("zia1959@yahoo.com");
	}
	
	@Test
	public void signup()
	{
		driver.findElement(By.id("u_0_0")).sendKeys("Mohd");
		driver.findElement(By.id("u_0_1")).sendKeys("Islam");
	}
	
	
}
