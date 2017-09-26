package testes;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {
	
	protected static WebDriver driver;

	@BeforeClass
	public static void test() {

		System.setProperty("webdriver.chrome.driver", "c://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
		
	@After
	public void cleanUP() {
		driver.manage().deleteAllCookies();
		
		
	}
	
	@AfterClass
	public static void tearDown(){
		driver.close();
	}
	

}
