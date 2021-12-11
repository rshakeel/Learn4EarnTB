package tesng_Fundamentals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependent_TestCases {
	public static WebDriver driver;

	@Test(priority=0, enabled = true)
	public void begin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
	}

	@Test(priority=1, enabled = true, dependsOnMethods="begin")
	public void signinLinkClick() {
		driver.findElement(By.className("signin")).click();
		}

	@Test(priority=2, enabled = true, dependsOnMethods={"begin","signinLinkClick"})
	public void loginpage() {
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		}

	@Test(priority=3, enabled = true, dependsOnMethods= {"begin","signinLinkClick","loginpage"})
	public void password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		}
		}

