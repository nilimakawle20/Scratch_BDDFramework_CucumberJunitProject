package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage{
WebDriver driver;
	
	public Logoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText ="Log out")
	WebElement logOut;
	
	public void clickonLogoutLink()
	{
		logOut.click();
	}

}
