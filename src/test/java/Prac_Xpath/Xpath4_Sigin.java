package Prac_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath4_Sigin {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		//driver.findElement(By.xpath("//input[@id='password']/following-sibling::input[1]")).click();
		//driver.findElement(By.xpath("//div[@class='row'][2]/child::div[2]/child::input[2][@class='signinbtn']")).click();
		//driver.findElement(By.xpath("//i[@class='clear']/preceding::input[2][@class='signinbtn']")).click();
		//driver.findElement(By.xpath("//div[@class='row']/following-sibling::div/child::div[2]/child::input[@class='signinbtn']")).click();
		

	}

}
