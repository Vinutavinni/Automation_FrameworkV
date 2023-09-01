package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleframes2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		WebElement ele = driver.findElement(By.id("sampleHeading"));
	String text = ele.getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		WebElement ele1 = driver.findElement(By.id("sampleHeading"));
		String text1 = ele1.getText();
		System.out.println(text1);
		driver.close();

	}

}
