package Webdriver_project;

import org.testng.annotations.Test;

import utility.BrowerFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class LaunchTC {
  private WebDriver driver;
  
	@Test
  public void launch() {
		driver.get("http://www.newtours.demoaut.com/");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	
	  driver=BrowerFactory.getdriver("chrome");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
