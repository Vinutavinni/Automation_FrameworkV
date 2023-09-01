package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium9 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Lenovo/Desktop/fb.html");
			driver.findElement(By.linkText("facebook")).click();
			
//			driver.findElement(By.name("email")).sendKeys("vinuta");
//			Thread.sleep(2000);
//			driver.findElement(By.id("pass")).sendKeys("vinuta");
//			Thread.sleep(2000);
//			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);

	}

}
