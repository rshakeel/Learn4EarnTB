package Prac_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath5_Logout {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[@class='signin']")).click();
		driver.findElement(By.xpath("//div[@class='cell'][2]/child::input[1][@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//div[@class='cell'][2]/following::div[3]/child::input[1]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='password']/following-sibling::input[@class='signinbtn']")).click();
		//driver.findElement(By.xpath("//i[@class='clear'][2]/preceding::a[20][@class='rd_logout']")).click();
		//driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		//driver.findElement(By.xpath("//ul[@class='setAccount']/preceding-sibling::a/following::a[@class='rd_logout']")).click();
		//driver.findElement(By.xpath("//div[@class='filtBy']/following::a[3]")).click();
		//driver.findElement(By.xpath("//cite[@class='rd_logo']/following-sibling::div[2]/child::a[2][@class='rd_logout']")).click();
		

	}

}
