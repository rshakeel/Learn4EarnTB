package Selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Practice {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		
		
		 driver.findElement(By.xpath("//a[@ class = 'signin']")).click();
		 driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		 driver.findElement(By.xpath("//input[@ id = 'password']")).sendKeys("Selenium@123");
		 driver.findElement(By.xpath("//input[@ class = 'signinbtn']")).click();
		 driver.findElement(By.xpath("//a[@ class = 'rd_logout']")).click();
		 
		
		
	}

}
