package Webdriver_project;

import org.testng.annotations.Test;

import utility.BrowerFactory;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class LoginTC {
	private WebDriver driver;
	
  @Test
  public void login() {
	  driver.findElement(By.name("userName")).clear();
	  driver.findElement(By.name("userName")).sendKeys("invalidUN");
	  driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("password")).sendKeys("invalidPW");
	  driver.findElement(By.name("login")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=BrowerFactory.getdriver("chrome");
	  driver.manage().window().maximize();
	  
		driver.get("http://www.newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
