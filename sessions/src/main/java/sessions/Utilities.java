/*
 * package sessions;
 * 
 * import java.io.File; import java.io.IOException; import java.net.URL; import
 * java.net.URLEncoder; import java.util.Scanner; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.apache.poi.hssf.model.Workbook; import
 * org.apache.poi.openxml4j.exceptions.InvalidFormatException; import
 * org.apache.poi.ss.usermodel.WorkbookFactory; import org.json.JSONObject;
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class Utilities { // private String rowid,colid; public static final
 * String SAMPLE_XLSX_FILE_PATH =
 * "C:\\Users\\Manish\\Google Drive\\Sessions\\SampleSheet.xlsx"; WebDriver
 * driver;
 * 
 * 
 * try { System.out.println( "Hello World!" ); App a = new App();
 * //a.geocoding("120 Homewood Ave Toronto");
 * a.geocoding("567 Amelia Crescent"); a.ExcelReader(); //this one works
 * 
 * // Selenium simple example
 * 
 * // a.SeleniumExample();
 * 
 * } catch (Exception e) { e.printStackTrace(); }
 * 
 * // priyankaJavaLearning();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public void SeleniumExample() { try {
 * 
 * System.setProperty(
 * "webdriver.chrome.driver","C:\\Users\\Manish\\Documents\\Test Automation\\Software dumps\\chromedriver.exe"
 * ); driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().deleteAllCookies();
 * driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
 * getCommand(); } catch (Exception e) { e.printStackTrace(); }
 * 
 * }
 * 
 * public void getCommand(){ try { driver.get("https://www.amazon.ca/"); String
 * titleofthepage = driver.getTitle(); System.out.println(titleofthepage); }
 * catch (Exception e) { e.printStackTrace(); } } // @Test
 * 
 * 
 * public void readExcelFile() { Workbook wb = WorkbookFactory.create(new
 * File(SAMPLE_XLSX_FILE_PATH));
 * 
 * }
 * 
 * 
 * public void ExcelReader() throws IOException, InvalidFormatException {
 * 
 * Workbook wb = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
 * 
 * Sheet ws = wb.getSheetAt(0);
 * 
 * DataFormatter dataFormatter = new DataFormatter();
 * 
 * for(Row row: ws){ for(Cell cell:row){ String cellvalue =
 * dataFormatter.formatCellValue(cell);
 * 
 * if(cell.getColumnIndex()==2) { System.out.print(cellvalue + "\t"); }
 * 
 * } System.out.println(); }
 * 
 * }
 * 
 * public void geocoding(String addr) throws Exception { try { // build a URL
 * String s = "http://maps.google.com/maps/api/geocode/json?" +
 * "sensor=false&address="; s += URLEncoder.encode(addr, "UTF-8");
 * System.out.println(s); URL url = new URL(s);
 * 
 * // read from the URL Scanner scan = new Scanner(url.openStream()); String str
 * = new String(); while (scan.hasNext()) str += scan.nextLine(); scan.close();
 * 
 * // build a JSON object JSONObject obj = new JSONObject(str); if (!
 * obj.getString("status").equals("OK")) return;
 * 
 * 
 * // get the first result JSONObject res =
 * obj.getJSONArray("results").getJSONObject(0);
 * System.out.println(res.getString("formatted_address")); JSONObject loc =
 * res.getJSONObject("geometry").getJSONObject("location");
 * System.out.println("lat: " + loc.getDouble("lat") + ", lng: " +
 * loc.getDouble("lng")); System.out.println(loc); System.out.println(obj); }
 * catch (Exception e) {
 * 
 * e.printStackTrace(); }
 * 
 * }
 * 
 * 
 * public String readdata(String rowid, String colid) {
 * 
 * 
 * 
 * // return true; }
 * 
 * 
 * }
 */