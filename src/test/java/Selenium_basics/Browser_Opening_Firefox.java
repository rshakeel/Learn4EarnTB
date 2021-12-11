package Selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Opening_Firefox {

	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		System.setProperty("webddriver.com.driver", "C:\\Rizwan\\Learn4Earn\\SELENIUM AUTOMATION\\Browser Drivers\\geckodrover.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Rizwan Shakeel");
		driver.findElement(By.id("userEmail")).sendKeys("shakeel.rizwan@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("30-5525 Palmerston Crescent, Mississauga, ON");
		driver.findElement(By.id("permanentAddress")).sendKeys("30-5525 Palmerston Crescent, Mississauga, ON");
		

	}

}
