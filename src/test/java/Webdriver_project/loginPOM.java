package Webdriver_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.Selenium_maven_POM.LoginPageObjectClass;
import org.Selenium_maven_POM.RegisterPageObjectClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class loginPOM {
	
	WebDriver driver;
    LoginPageObjectClass lp;
    RegisterPageObjectClass rp;
  @Test
  public void login() {
  
	  lp.username.sendKeys("swapnil");

      lp.password.sendKeys("swapnil");

      lp.login.click();
      
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium browser driver\\chromedriver.exe");

      driver = new ChromeDriver();

      driver.get("http://newtours.demoaut.com/");

lp=PageFactory.initElements(driver, LoginPageObjectClass.class);

rp=PageFactory.initElements(driver, RegisterPageObjectClass.class);

     
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
