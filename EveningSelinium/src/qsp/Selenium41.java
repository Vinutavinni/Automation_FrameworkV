package qsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium41 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("months"));
		ArrayList<String> l=new ArrayList<String>();
		Select s=new Select(ele);
		List<WebElement> opt=s.getOptions();
		int count=opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{
			String t=we.getText();
			l.add(t);
		}
		Collections.sort(l);
		for(String t1:l)
		{
			System.out.println(t1);
		}
		}
		
		

	}


