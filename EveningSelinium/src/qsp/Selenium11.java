package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Lenovo/Desktop/u.html");
driver.findElement(By.linkText("youtube")).click();
driver.get("https://www.youtube.com/watch?v=-TxS3XTz3hQ");
Thread.sleep(300000);
driver.close();
	}

}
