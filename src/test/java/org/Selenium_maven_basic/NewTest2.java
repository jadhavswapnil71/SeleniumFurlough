package org.Selenium_maven_basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest2 {
  @Test
  public void f() {
	  System.out.println(" inside Test 1");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println(" BEfore Test 1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" after Test 1");
  }

}
