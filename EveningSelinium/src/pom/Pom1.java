package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	@FindBy(name = "email")
	private WebElement eTbox;
	@FindBy(name = "pass")
	private WebElement pTbox;
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginBtn;

	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void username(String un) {
		eTbox.sendKeys(un);
	}

	public void password(String pwd) {
		pTbox.sendKeys(pwd);
	}

	public void clickLogin() {
		loginBtn.click();
	}
}
