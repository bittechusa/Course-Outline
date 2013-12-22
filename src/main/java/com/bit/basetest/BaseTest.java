package com.bit.basetest;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest 
{
     public FirefoxDriver driver = new FirefoxDriver();
      
      @BeforeTest
      public void start()
      {
    	  driver.get("http://www.facebook.com");
      }
	
	  @AfterTest
	  public void end()
	  {
		  driver.quit();
	  }
	
	
	
	
	
	
	
	
}
