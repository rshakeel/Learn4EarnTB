package Prac_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath3_Pass {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//div[@class = 'cell']/descendant::div[9]/child::input[1]")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//div[@class = 'row'][2]/child::div/following-sibling::div/child::input[1]")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//div[@class = 'cell'][2]/following::div[3]/child::input[@id = 'password']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//div[starts-with(@class, 'floatR')]/preceding::input[2]/preceding-sibling::input[@id = 'password']")).sendKeys("Selenium@123");
		

	}

}
