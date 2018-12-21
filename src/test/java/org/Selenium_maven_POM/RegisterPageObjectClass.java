package org.Selenium_maven_POM;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

 

public class RegisterPageObjectClass {

     

      @FindBy(name="firstName")

      public static WebElement firstName;

      @FindBy(name="lastName")

      public static WebElement lastName;

      @FindBy(name="phone")

      public static WebElement phone;

      @FindBy(name="userName")

      public static WebElement email;

      @FindBy(name="address1")

      public static WebElement address;

      @FindBy(name="city")

      public static WebElement city;

      @FindBy(name="email")

      public static WebElement username;

      @FindBy(name="password")

      public static WebElement password;

      @FindBy(name="confirmPassword")

      public static WebElement confirmPassword;

      @FindBy(name="register")

      public static WebElement register;


 

}
