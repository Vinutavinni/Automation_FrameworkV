package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium49 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='✕']"));
Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("//span[text()='Fashion']"));
Actions act = new Actions(driver);
act.moveToElement(ele).perform();
driver.close();


	}

}
