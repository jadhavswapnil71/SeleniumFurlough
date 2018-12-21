package org.Selenium_maven_basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println(" Inside Test ");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println(" BEfore Test ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" After Test ");
  }

}
