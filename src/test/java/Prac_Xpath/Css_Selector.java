package Prac_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		driver.findElement(By.cssSelector("div.row>div:nth-child(2)>input[id=login1]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input[id=password][name=passwd]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("div.row input[class = signinbtn]")).click();
		driver.findElement(By.cssSelector("div.setting_rd>a.rd_logout")).click();
		driver.findElement(By.cssSelector("div.header>div>span>a:nth-of-type(2)>b:nth-of-type(1)")).click();
		

	}

}
