package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script1 {
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement sign;
	@FindBy(name="email")
	private WebElement etext;
	@FindBy(id="continue")
	private WebElement cont;
	@FindBy(name="password")
	private WebElement ptext;
	@FindBy(id="signInSubmit")
	private WebElement submit;
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	public Script1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void email(String e)
	{
		etext.sendKeys(e);
	}
	public void clickconti() 
	{
		cont.click();	
	}
	public void pwd(String p)
	{
		ptext.sendKeys(p);
	}
	public void submit()
	{
		submit.click();
	}
	public void search(String s)
	{
		search.sendKeys(s);
	}
}
