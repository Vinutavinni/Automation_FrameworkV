package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/vin.html");
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//input"));
		Thread.sleep(2000);
		a.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.xpath("//input[3]"));
		b.sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000);
		WebElement c=driver.findElement(By.xpath("//input[2]"));
		c.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement d=driver.findElement(By.xpath("//input[1]"));
		d.sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//input[3]"));
		e.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement f=driver.findElement(By.xpath("//input[2]"));
		f.sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000);
		driver.close();

	}

}
