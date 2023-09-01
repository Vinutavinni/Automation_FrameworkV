package test_ng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.Generic_TestNg;

public class SoftAss extends Generic_TestNg
{
	@Test
	public void test1() throws InterruptedException
	{
		
		driver.findElement(By.id("email")).sendKeys("vinuta");
		driver.findElement(By.name("pass")).sendKeys("vinuta@1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "hi");
		System.out.println("1");
	s.assertAll();
}}
