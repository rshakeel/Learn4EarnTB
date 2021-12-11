package classassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertHW {
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	public static ChromeOptions options = new ChromeOptions();
	
	@Test(priority=0)
		public static void start() {
		WebDriverManager.chromedriver().setup();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		softassert.assertEquals(driver.getCurrentUrl(), "https://www.rediff.com/");
		softassert.assertAll();
	}
	
	@Test(priority=1)
		public static void title() {
		softassert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		softassert.assertAll();
	}
	
	@Test(priority=2)
		public static void signin() {
		softassert.assertEquals(driver.findElement(By.xpath("//a[@class='signin']")).isEnabled(), true);
		softassert.assertAll();
		driver.findElement(By.xpath("//a[@class='signin']")).click();
	}
	
	@Test(priority=3)
		public static void username() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		softassert.assertEquals(driver.findElement(By.xpath("//input[@id='login1']")).isDisplayed(), true);
		softassert.assertAll();
	}

	@Test(priority=4)
		public static void password() {
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		softassert.assertEquals(driver.findElement(By.id("password")).isDisplayed(), true);
		softassert.assertAll();
	}

	@Test(priority=5)
	public static void signinbutton() {
		driver.findElement(By.className("signinbtn")).click();
		softassert.assertEquals(driver.findElement(By.className("signinbtn")).isEnabled(), false);
		//softassert.assertEquals(driver.findElement(By.xpath("//input[@class='signinbtn']")).isEnabled(), true);
		softassert.assertAll();
	}

	@Test(priority=6)
	public static void logout() {
		driver.findElement(By.className("rd_logout")).click();
		softassert.assertEquals(driver.findElement(By.xpath("//a[@class='rd_logout']")).isEnabled(), false);
		softassert.assertAll();
	}

	@Test(priority=7)
	public static void rediffhome() {
		driver.findElement(By.xpath("//a[@class='logo']/following-sibling::span/child::a[2]/child::b[1]")).click();
		softassert.assertEquals(driver.findElement(By.xpath("//a[@class='logo']/following-sibling::span/child::a[2]/child::b[1]")).isEnabled(), false);
		softassert.assertAll();
	}
}
