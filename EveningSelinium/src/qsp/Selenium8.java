package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium8 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/fb.html");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("face")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("vinuta");
	Thread.sleep(2000);

	}

}
