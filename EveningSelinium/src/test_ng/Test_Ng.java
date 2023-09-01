package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Ng {
	@Test
	public void data1()
	{
		Reporter.log("hello",true);
	}
@Test
public void data2()
{
	Reporter.log("world",true);	
}

}
