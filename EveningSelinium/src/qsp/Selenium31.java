package qsp;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium31 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
	for(WebElement we:links)
	{
		String atti = we.getAttribute("href");
		System.out.println(atti);
		
	}
	driver.close();
	}
}


