package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/frame.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("vinuta");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("p1")).sendKeys("12345678");
		driver.close();
		
		

	}

}
