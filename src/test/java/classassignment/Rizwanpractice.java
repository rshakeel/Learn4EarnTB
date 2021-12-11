package classassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rizwanpractice {
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	public static ChromeOptions options = new ChromeOptions();
	
	@Test
		public static void begin() {
		WebDriverManager.chromedriver().setup();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		softassert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping"); // to pass the run, if we use any other title, fail
		softassert.assertAll();
		
		
	}
	
	@Test
	public static void signinclick() {
		softassert.assertEquals(driver.findElement(By.className("signin")).isEnabled(),true); // to pass the run, if we use false at the end it will fail
		softassert.assertAll();
		
	}
}
