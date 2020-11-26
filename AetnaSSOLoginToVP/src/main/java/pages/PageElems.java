package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageElems {
	WebDriver pageDriver;
	public PageElems(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		pageDriver=driver;
	}
@FindBy(xpath="//*[contains(text(),'Login')]")
public
WebElement loginButton;

}
