package testNG;

import org.testng.Assert;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

import sessions.SeleniumFunctionLibrary;

@Listeners(CustomListner.class)
public class ScreenshotTest extends SeleniumFunctionLibrary {
	
	@BeforeMethod
	public void setup() {
		invokeBrowser();
	}
	
	@AfterMethod
	public void teardown() {
		closeBrowser();
	}
	
	@Test (priority=2)
	public void takeScreenShotTest1() {
		getCommands();
		Assert.assertEquals(false, true);
	}
	
	
	@Test(priority=3, enabled=true )
	public void takeScreenShotTest2() {
//		getCommands();
		driver.get("https://www.amazon.ca/");
		Assert.assertEquals(driver.getTitle(), "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	}
	
	@Test(priority=1)
	public void takeScreenShotTest3() {
//		getCommands();
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	}
	
	
}
