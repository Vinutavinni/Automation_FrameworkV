package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium28 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Lenovo/Desktop/check.html");
		Thread.sleep(2000);
		List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
		int count = checkbox.size();
		for(int i=0;i<count;i++)
		{
			WebElement we = checkbox.get(i);
			we.click();
		}
		for(int i=count-1;i>=0;i--)
		{
			WebElement we = checkbox.get(i);
			we.click();	
		}
			

	}

}
