package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium32 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Lenovo/Desktop/dd.html");
	WebElement ele = driver.findElement(By.id("countries"));
	Select s=new Select(ele);
	s.selectByValue("Pakistan");
	Thread.sleep(2000);
	driver.close();

	}

}
