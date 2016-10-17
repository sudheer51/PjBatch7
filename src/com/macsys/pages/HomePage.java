package com.macsys.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.macsys.tests.MacysTests;

public class HomePage {
	WebDriver driver;
	Logger logger;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;

        logger=Logger.getLogger("HomePage");
      
       PropertyConfigurator.configure("Log4j.properties");

	}

	public void searchItem(String itemName)
	{

		try{
		
		driver.findElement(By.id("globalSearchInputField")).sendKeys(itemName);
		logger.info("Entering the itemName -->" + itemName);
		
		driver.findElement(By.id("subnavSearchSubmit")).click();
		logger.info("Clicking on Submit button to navigate to Search Results Page");
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
	}

}
