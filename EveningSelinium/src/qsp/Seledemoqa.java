package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seledemoqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=demoqa&oq=demo&aqs=chrome.0.69i59j69i57j0i67i650j46i433i512j69i60l4.1657j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Practice Form']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vinuta");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("vinni");
		driver.findElement(By.id("userEmail")).sendKeys("vinni@123");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("987654323");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys(Keys.CONTROL+"A");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("27 Nov 1988");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Civics");
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='uploadPicture']")).click();
		
		

	}

}
