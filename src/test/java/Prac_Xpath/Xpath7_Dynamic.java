package Prac_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath7_Dynamic {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//span[@id='username' and @class='username']/following::a[@class='signin']")).click();
		driver.findElement(By.xpath("//div[@class='row']/child::div[2]/child::input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//div[@class='row']/following-sibling::div/child::div[2]/child::input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='login1']/following::input[2][@class='signinbtn']")).click();
		driver.findElement(By.xpath("//cite[@class='rd_logo']/following-sibling::div[2]/child::a[2][@class='rd_logout']")).click();
		driver.findElement(By.xpath("//a[@class='logo']/following-sibling::span/child::a/following-sibling::a/child::b[1]")).click();
		

	}

}
