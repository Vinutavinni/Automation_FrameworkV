package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium18 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/Sele.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Insidious']/../td[3]")).click();

	}

}
