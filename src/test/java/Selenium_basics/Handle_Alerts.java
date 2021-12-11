package Selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alerts {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("The text is : "+ alert.getText());
		alert.accept();
		//alert.dismiss(); //if there is a cross sign on the window, it will close
		
		WebElement username = driver.findElement(By.id("login1"));
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys("seleniumpanda@rediffmail.com");
		
	}

}
