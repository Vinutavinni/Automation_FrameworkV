package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium19 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String a="Facebook – log in or sign up";
		String t=driver.getTitle();
		System.out.println(t);
		if(t.equals(a))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
		driver.quit();

	}

}
