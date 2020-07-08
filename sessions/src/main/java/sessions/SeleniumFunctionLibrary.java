package sessions;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Basic Selenium code
 *
 */

public class SeleniumFunctionLibrary 
{
	public static WebDriver driver;
	public static int counter = 1;
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Manish\\Documents\\Test Automation\\Software dumps\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.get("https://www.netflix.com/ca/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createAccount() throws InterruptedException {
		driver.findElement(By.id("gb_70")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ow242")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("jO7h3c")).click();
		
	}

	public void getCommands() {
		try {
			// TODO Auto-generated method stub
//		driver.get("https://www.google.ca/");
			driver.get("https://www.amazon.ca/");
			String titleofThePage = driver.getTitle();
			System.out.println("The title of the page is: " + titleofThePage);
			
//		Page source fetch
			
			/*
			 * String pageSource = driver.getPageSource();
			 * System.out.println("The page source is: " + pageSource);
			 */
			
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("keyboards");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		/*
			 * driver.findElement(By.linkText("Today's Deals")).click();
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"deals-shoveler-ns_HJVR9G2C2XEXF3WJ4CNN_4007_\"]/div[1]/h2/span")).
			 * click();
			 * 
			 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("keyboards");
			 * driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"))
			 * .click(); String newPageUrl = driver.getCurrentUrl();
			 * System.out.println(newPageUrl);
			 */ 
			  driver.findElement(By.linkText("Gift Cards")).click();
//			  driver.navigate().back();
			  
			  Thread.sleep(3000);
			  
//			  driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		
		
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void navigateCommands() {
		driver.navigate().to("https://www.amazon.ca/");
//		Thread.sleep(3000);
		driver.navigate().to("https://www.google.ca/");
//		Thread.sleep(3000);
		driver.navigate().back();
//		Thread.sleep(3000);
		driver.navigate().forward();
//		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	
	public void closeBrowser() {
		try {
			
			
			Thread.sleep(3000);
			driver.close();
			
//			for closing multiple tabs at once use quit instead of close
//			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void screenshot(String methodName) {
		try {
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String fileName = methodName +"_failshot_" + counter++ + ".png";
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Manish\\Documents\\Test Automation\\workspace_tutorials\\sessions\\screenshots\\" + fileName));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

