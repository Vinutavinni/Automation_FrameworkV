package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
