package testCases;

import org.testng.annotations.Test;

import config.propertyFile;
import master.Main;
import pages.PageElems;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Login {
	Main main = new Main();
	propertyFile props =new propertyFile();
	WebDriver driver;
	PageElems elems;
	
  @Test(description = "aa")
  public void f() throws InterruptedException {
	  elems =new PageElems(driver);
	  Thread.sleep(3000);
	  Assert.assertTrue(elems.loginButton.getText().contains("Login"));
	  System.out.println("Ael");
	  
  }
  
  @Test(description = "")
  public void g() throws InterruptedException {
	  elems =new PageElems(driver);
	  elems.loginButton.click();
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  String url=props.url();
	  driver=main.launchApp(url);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
