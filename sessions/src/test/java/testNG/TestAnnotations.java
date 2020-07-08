package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
 @Test (enabled=true)
  
	public void f1() {
	  System.out.println("I am inside f1");
	  assertEquals(1, 1);
  }
  
  @Test
  public void f2() {
	  System.out.println("I am inside f2");
  }
  
  @BeforeTest
  public void beforeAllTheTests() {
	  System.out.println("This is Executed before any Tests");
  }
  
  @AfterTest
  public void afterAllTheTests() {
	  System.out.println("This is Executed after any Tests");
	  
  }
  
  @BeforeMethod
  public void beforeEveryMethods() {
	  System.out.println("This is Executed before every Methods");
  }
  
  @AfterMethod
  public void afterEveryMethods() {
	  System.out.println("This is Executed after every Methods");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Executed before Class");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("This is Executed after Class");
  }
  
}
