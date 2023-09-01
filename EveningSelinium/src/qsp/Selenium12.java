package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium12 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("vinuta");
	driver.close();

	}

}
