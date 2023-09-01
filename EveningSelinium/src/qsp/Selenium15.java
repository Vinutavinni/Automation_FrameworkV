package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium15 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("vinuta");

driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123456789");

driver.findElement(By.xpath("//button[@type='submit']")).click();
//Thread.sleep(2000);
driver.close();


	}

}
