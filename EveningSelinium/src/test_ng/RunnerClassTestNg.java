package test_ng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.Generic_TestNg;

public class RunnerClassTestNg extends Generic_TestNg
{
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vinuta");
		driver.findElement(By.name("pass")).sendKeys("vinuta@1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void test2()
	{
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("email")).sendKeys("vinuta");
		driver.findElement(By.id("continue")).click();
	}

}
