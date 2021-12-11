	package Prac_Xpath;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Xpath1_Practice {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		//driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[1]")).click();
		//driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//span[@id = 'username']/following-sibling::p/child::a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//div[@class = 'cell']/following-sibling::div[2]/child::span/following-sibling::p/child::a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//span[@ class = 'username']/following-sibling::p/child::a[starts-with(@class, 'sign')]")).click();
		
		

	}

}
