package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		//browser to launch
		String value="./Software/geckodriver.exe";
		//path of the drivers
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();

	}

}
