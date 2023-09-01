package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium24 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.agoda.com/?site_id=1891440&tag=9a29538c-bb0f-4670-a58d-999587c49886&device=c&network=g&adid=577248493166&rand=13016151105264961462&expid=&adpos=&aud=kwd-296848862565&gclid=EAIaIQobChMIt_XD_6usgAMVhz8rCh3qCQyCEAAYASAAEgK10fD_BwE&pslc=1");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Flights']"));
		String txt = ele.getText();
		System.out.println(txt);
		

	}

}
