/*
 * package sessions;
 * 
 * import static org.testng.Assert.assertFalse;
 * 
 * import java.io.File; import java.io.IOException; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.apache.commons.io.FileUtils; import
 * org.apache.poi.util.SystemOutLogger; import org.openqa.selenium.By; import
 * org.openqa.selenium.By.ByName; import org.openqa.selenium.OutputType; import
 * org.openqa.selenium.TakesScreenshot; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.remote.server.handler.FindElement;
 * 
 * import com.gargoylesoftware.htmlunit.WebConsole.Logger;
 * 
 * import org.xmlunit.*; import org.xmlunit.builder.DiffBuilder; import
 * org.xmlunit.diff.Diff;
 * 
 * import org.testng.junit.*;
 * 
 * public class SeleniumExample {
 * 
 * public enum WEBELEMENT_ACTION { CLICK, SENDKEYS };
 * 
 * 
 * WebDriver driver;
 * 
 * public static void main(String[] args) { // TODO Auto-gener'ated method stub
 * SeleniumExample s = new SeleniumExample(); s.invokeWebDriver(); //
 * s.xmlComparator();
 * 
 * } //.withNodeFilter(node -> !node.getNodeName().equals("note\from")) public
 * void xmlComparator(){ Diff diff = DiffBuilder
 * .compare("C:\\Manish Work\\JavaWorkspace\\testdata\\xmlfile1.xml")
 * .withTest("C:\\Manish Work\\JavaWorkspace\\testdata\\xmlfile1.xml")
 * .ignoreWhitespace() .build(); assertFalse(diff.hasDifferences());
 * System.out.println("Are the xmls different: " + diff.hasDifferences() ); ; }
 * 
 * private void invokeWebDriver() { // TODO Auto-generated method stub
 * 
 * try {
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Manish Work\\JavaWorkspace\\external jars\\chromedriver_win32\\chromedriver.exe"
 * ); driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().deleteAllCookies();
 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
 * this.getCommand(); this.closebrowser(); } catch (Exception e) {
 * e.printStackTrace(); }
 * 
 * }
 * 
 * private void getCommand() { // TODO Auto-generated method stub try {
 * driver.get("https://www.amazon.ca/"); String titleofthepage =
 * driver.getTitle(); System.out.println(titleofthepage);
 * 
 * String ACTION = "click()";
 * 
 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Priyanka");
 * 
 * // wait(3000);
 * 
 * driver.findElement(By.className("nav-input")).click();
 * 
 * WebElement we = driver.findElement(By.id("twotabsearchtextbox"));
 * 
 * // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Manish");
 * 
 * actupontheElements(we, "SENDKEYS", "Manish");
 * 
 * actupontheElements(we, "SCREENSHOT","");
 * 
 * Thread.sleep(3000);
 * 
 * // driver.findElement(ByName "twotabsearchtextbox"); //
 * ByName("twotabsearchtextbox")).sendkey("iphone");
 * 
 * 
 * int x = driver.findElement(By.name("Search in")).getLocation().getX();
 * System.out.println(x);
 * 
 * 
 * // closebrowser();
 * 
 * if (navigator("https://www.amazon.ca/ref=nav_logo", titleofthepage)) {
 * System.out.println("Navigator is working as expected!!"); } } catch
 * (Exception e) { e.printStackTrace(); }
 * 
 * }
 * 
 * 
 * method to navigate to a specified url; it returns true if the navigation is
 * successful
 * 
 * private boolean navigator(String url, String title) throws
 * InterruptedException { driver.navigate().to(url); if
 * ((driver.getTitle().toLowerCase()).equals((title).toLowerCase())) {
 * Thread.sleep(2000); return true; } return false; }
 * 
 * // method to close the active browser window private void closebrowser() {
 * System.out.println("\n" + "Browser Closed!!"); driver.close(); }
 * 
 * private void actupontheElements(WebElement element, String action, String
 * action_arg) { System.out.println("in actupon method"); switch
 * (WEBELEMENT_ACTIONS.valueOf(action)) { case CLICK: element.click(); break;
 * 
 * case SENDKEYS: System.out.println("Acting upon sendkeys");
 * element.sendKeys(action_arg); break; case SCREENSHOT: File scrshot =
 * ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
 * 
 * try{ FileUtils.copyFile(scrshot, new File("./resources/screenshot.png"));
 * }catch (IOException e) { System.out.println(e.getMessage()); } break;
 * 
 * default: element.clear(); element.submit(); element.isDisplayed();
 * element.isEnabled(); element.isSelected(); element.notify();
 * 
 * 
 * }
 * 
 * }
 * 
 * }
 */