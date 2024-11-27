package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_CustomerCreationpage{
	WebDriver driver;
	
	public New_CustomerCreationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="New Customer")
	WebElement newCustomer;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement customerName_tf;
	
	@FindBy(xpath="//input[@value='f']")
	WebElement gender_rb;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob_tf;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address_tf;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city_tf;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state_tf;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pincode_tf;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobile_num;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email_tf;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password_tf;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submit_btn;


	@FindBy(linkText = "Home")
	WebElement home_link;
	
	public void clickonNewCustomerLink()
	{
		newCustomer.click();
	}
	
	public void enterCustomerName(String name)
	{
		customerName_tf.sendKeys(name);
	}
	
	public void selectGender()
	{
		gender_rb.click();
	}
	
	public void enterDateOfBirth(String dob)
	{
		dob_tf.sendKeys(dob);
	}
	

	public void enterAddress(String address)
	{
		address_tf.sendKeys(address);
	}
	
/*	============================================= */
			
	public void enterCity(String city)
	{
		city_tf.sendKeys(city);
	}
	
	public void enterState(String state)
	{
		state_tf.sendKeys(state);
	}
	
	public void enterPin(String pin)
	{
		pincode_tf.sendKeys(pin);
	}
	
	public void enterMobileNum(String mob_num)
	{
		mobile_num.sendKeys(mob_num);
	}
	
	public void enterEmailid(String email)
	{
		email_tf.sendKeys(email);
	}
	 
	public void enterPassword(String password)
	{
		password_tf.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		submit_btn.click();
	}
	
	public void clickHomeLink()
	{
		home_link.click();
	}
}
