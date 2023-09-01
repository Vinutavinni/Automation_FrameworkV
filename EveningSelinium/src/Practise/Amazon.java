package Practise;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//String psc = driver.getPageSource();
		//System.out.println(psc);
		//driver.close();
	driver.navigate().to("https://www.amazon.in/Baby/b/?ie=UTF8&node=1571274031&ref_=nav_cs_baby");
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
	String attr = ele.getAttribute("href");
	System.out.println(attr);
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.xpath("//a[text()='Sell']"));
	String txt = ele1.getText();
	System.out.println(txt);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Dimension d = new Dimension(200,300);
	driver.manage().window().setSize(d);
	Point p = new Point(200,300);
	driver.manage().window().setPosition(p);
	WebElement ele2 = driver.findElement(By.xpath("//a[text()='Baby']"));
	Point loc = ele2.getLocation();
	System.out.println(loc);
	WebElement ele3 = driver.findElement(By.id("twotabsearchtextbox"));
	String css = ele3.getCssValue("font-size");
	System.out.println(css);
	
	
	
	
	
	
		

	}

}
