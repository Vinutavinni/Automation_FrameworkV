package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium23 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://auth.trivago.com/en-IN");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Next']"));
		String txt = ele.getText();
		System.out.println(txt);
		

	}

}
