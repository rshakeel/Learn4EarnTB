package Prac_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2_Practice {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//div[@class = 'row']/child::div[2]/child::input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//div[@class = 'table']/child::div/child::div[2]/child::input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//i[@class = 'clear']/preceding-sibling::div[starts-with(@class, 'floatL')]/child::div[2]/child::div/child::div[2]/child::input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//form[@class = 'loginform']/descendant::div[6]/child::input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		
		

	}

}
