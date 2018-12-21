package org.Selenium_maven_POM;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

 

public class LoginPageObjectClass {

 

      @FindBy(name="userName")

      public static WebElement username;

     

      @FindBy(name="password")

      public static WebElement password;

     

      @FindBy(name="login")

      public static WebElement login;

     

      @FindBy(linkText="REGISTER")

      public static WebElement register;

 

}

