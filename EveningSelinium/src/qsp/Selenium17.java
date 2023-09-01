package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/@13.0453132,77.5733936,15z?entry=ttu");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Beagles Basketball Club");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Beagles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Choose destination...']")).sendKeys("Home");
		Thread.sleep(2000);
		driver.close();
	}
	

}
