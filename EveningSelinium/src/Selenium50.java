import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium50 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
        Actions act = new Actions(driver);
        act.contextClick(rclick).perform();
        Thread.sleep(2000);
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    Thread.sleep(2000);
    Set<String> allwh = driver.getWindowHandles();
    
    
    
    
    

	}

}
