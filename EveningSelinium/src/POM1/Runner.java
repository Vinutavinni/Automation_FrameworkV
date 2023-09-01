package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Pom1;

public class Runner {

	@Test
	public void click() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Pom1 p1 = new Pom1(driver);
		p1.username("admin");
		Thread.sleep(2000);
		p1.password("admin123");
		Thread.sleep(2000);
		p1.clickLogin();

	}
}

