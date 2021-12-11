package tesng_Fundamentals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {
public static WebDriver driver;

@Test(priority=0)
public static void begin() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://rediff.com");
}

@Test(priority=1)
public static void signinLinkClick() {
	WebElement signinlink = driver.findElement(By.className("signin"));
	
	if (signinlink.isEnabled() == true) {
		signinlink.click();
		}
	else {
		System.out.println("The link is not working");
	}
}

@Test(priority=2)
public static void loginpage() {
	WebElement loginpage = driver.findElement(By.xpath("//input[@id='login1']"));
	
	if (loginpage.isEnabled() == true) {
		loginpage.sendKeys("seleniumpanda@rediffmail.com");
			}
	else {
		System.out.println("Username field is not working");
	}
	}

@Test(priority=3)
public static void password() {
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	
	if (password.isEnabled() == true) {
		password.sendKeys("Selenium@123");
	}
	else {
		System.out.println("Password field is not working");
	}
	}

@Test(priority=4)
public static void teardown() {
	driver.quit();
}
}
