import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("+919739317205");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("vinuta@7205");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
        Thread.sleep(2000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 3 Lite 5G (Chromatic Gray, 8GB RAM, 128GB Storage)']")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
       


	}
	}



