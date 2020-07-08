package testNG;

import org.testng.annotations.Test;

import sessions.MercuryToursFunctionLibrary;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class RegisterUserTest extends MercuryToursFunctionLibrary {
  @Test
  public void f() throws InterruptedException {
	  getCommands();
	  
	  driver.findElement(By.name("firstName")).sendKeys("Manish");
	  driver.findElement(By.name("lastName")).sendKeys("Jauhari");
	  driver.findElement(By.name("phone")).sendKeys("647-222-1212");
	  driver.findElement(By.id("userName")).sendKeys("abc@xyz.com");
	  
	  driver.findElement(By.name("email")).sendKeys("abc@xyz.com");
	  driver.findElement(By.name("password")).sendKeys("test2019");
	  driver.findElement(By.name("confirmPassword")).sendKeys("test2019");
	  
	  driver.findElement(By.name("register")).click();
	  
	  Assert.assertEquals(true,  driver.getCurrentUrl().contains("http://newtours.demoaut.com/create_account_success.php?os"));
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  invokeBrowser();
  }

  @AfterMethod
  public void afterMethod() {
  
	  closeBrowser();
  
  }

}
