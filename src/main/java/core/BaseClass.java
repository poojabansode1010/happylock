 package core;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileReader fr;
	
	@BeforeTest
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\TOLQA\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.happylocate.com/");
		driver.manage().deleteAllCookies();

	}
	   public void time() throws InterruptedException {
		   Thread.sleep(2000);
	   }	
	
		public static void load_property_file() throws IOException
		{
	     prop=new Properties();
	     
	    
	   FileInputStream input = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\HappyLocate\\src\\test\\resources\\configfiles\\configfile.prop");
		prop.load(input);
		}
		
		//to get data from config property file
		public static String getobject(String Data) throws IOException
		{
			load_property_file();
			String data= prop.getProperty(Data);
			return data;
		
		}
//		if(driver==null) {
//			FileReader fr =new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\configfile.properties");
//			p.load(fr);
//			
//		}
//		if(p.getProperty("browser").equalsIgnoreCase("chrome")){
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			driver.get(p.getProperty("testURL"));
//			
//		}
//		else if (p.getProperty("browser").equalsIgnoreCase("Firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//			driver.get("https://www.happylocate.com/login");
//		}}
		/*
		 * else if(p.getProperty("browser").equalsIgnoreCase("IE")) {
		 * WebDriverManager.IEDriver.setup(); driver=new IEdriver();
		 * driver.get("https://www.happylocate.com/login");
		 */

		
		public static boolean isElementDisplay(WebElement element) throws InterruptedException
		{
			Thread.sleep(100000);
			boolean value = false;
			try {
				element.isDisplayed();
				value = true;
			} catch (NoSuchElementException e) {
			
				e.printStackTrace();
			}
			return value;
		}
		
		
		@AfterSuite
		public void flush()
		{
			driver.quit();
		}
	@AfterTest
	
	public void tearDown() {
		driver.close();
		System.out.println("URL is succesfully closed");
	}
}
