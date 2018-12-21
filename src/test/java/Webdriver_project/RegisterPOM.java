package Webdriver_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.Selenium_maven_POM.LoginPageObjectClass;
import org.Selenium_maven_POM.RegisterPageObjectClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RegisterPOM {
	WebDriver driver;

    LoginPageObjectClass lp;

    RegisterPageObjectClass rp;

	
  @Test
  public void Register() {
  

      lp.register.click();

      rp.username.sendKeys("amruta");

      rp.password.sendKeys("amruta");

      rp.confirmPassword.sendKeys("amruta");

      rp.register.click();

    String title= driver.getTitle();

    Assert.assertEquals(title, "Register: Mercury Tours");

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
  public void afterTest() {driver.close();
  }

}
