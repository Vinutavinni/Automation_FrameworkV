import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium51 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Blog']"));
		ArrayList<WebElement> list = new ArrayList<WebElement>();
		list.add(ele);
		list.add(ele1);
		list.add(ele2);
		list.add(ele3);
		list.add(ele4);
		Actions act = new Actions(driver);
        Robot r = new Robot();
        for(WebElement a:list)
        {
        	act.contextClick(a).perform();
        	Thread.sleep(1000);
        	r.keyPress(KeyEvent.VK_T);
             r.keyRelease(KeyEvent.VK_T);
             Thread.sleep(1000);
            
        	
        }
        
       Set<String> c = driver.getWindowHandles();
       ArrayList<String> d=new ArrayList<String>();
       d.addAll(c);
       driver.switchTo().window(d.get(3));
		

	}

}
