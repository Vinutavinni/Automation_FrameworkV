package runnerScript;

import org.testng.annotations.Test;

import genericScript.Script2;
import pomScript.Script1;

public class Script3 extends Script2
{
	@Test
	public void perform() throws InterruptedException
	{
	Script1 s1=new Script1(driver);
	s1.sign();
	Thread.sleep(2000);
	s1.email("+919739317205");
	Thread.sleep(2000);
	s1.clickconti();
	Thread.sleep(2000);
	s1.pwd("vinuta@7205");
	Thread.sleep(2000);
	s1.submit();
	Thread.sleep(2000);
	s1.search("iphone");
	
	}
}
