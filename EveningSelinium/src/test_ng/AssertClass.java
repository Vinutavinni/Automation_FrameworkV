package test_ng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Generic_TestNg;

public class AssertClass extends Generic_TestNg
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
		//System.out.println(title);
        Assert.assertEquals(title,"Log in to Facebook");
		System.out.println("1");
	}
}
