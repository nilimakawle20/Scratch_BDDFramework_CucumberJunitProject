package StepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import PageFactory.Login_Guru99page;
import PageFactory.Logoutpage;
import PageFactory.New_CustomerCreationpage;
import Utilities.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions01 extends BaseClass{
	
	WebDriver driver=BaseClass.initializeDriver();
	Login_Guru99page obj=new Login_Guru99page(driver);
	New_CustomerCreationpage obj1=new New_CustomerCreationpage(driver);
	Logoutpage obj2=new Logoutpage(driver);
	
	/*=====Login step definitions=====*/
	@Given("User opens the demo application of guru99")
	public void user_opens_the_demo_application_of_guru99() {
		System.out.println("Application Launched");
	    
	}
	
	@Given("User will enter his username in username field as {string}")
	public void user_will_enter_his_username_in_username_field_as(String username) {
		obj.enterUsername(username);
	}

	@Given("User will enter his password in password field as {string}")
	public void user_will_enter_his_password_in_password_field_as(String password) {
		obj.enterPassword(password);
	}


	@When("User will click on Login button")
	public void user_will_click_on_login_button() {
		obj.clickonLogin();
	    
	}

	@Then("User will be navigated to the demo application of guru99")
	public void user_will_be_navigated_to_the_demo_application_of_guru99() {
		System.out.println(getTitle());
		
	}
	
    /*==================Logout step definition================*/
	@Given("the user clicks on the Log out link in the application guru99")
	public void the_user_clicks_on_the_log_out_link_in_the_application_guru99() {
	   obj2.clickonLogoutLink();
	}

	@When("successful logout message box popup appear")
	public void successful_logout_message_box_popup_appear() throws InterruptedException {
	    System.out.println("You Have Succesfully Logged Out!!");
	    Thread.sleep(2000);
	}

	@When("user clicks OK button")
	public void user_clicks_ok_button() {
	    driver.switchTo().alert().accept();
	}

	@Then("user should be able to see login page")
	public void user_should_be_able_to_see_login_page() {
		System.out.println("This is Guru99 login page");
	}

/*============New Customer Creation=============*/
    
	/*
	@Given("the user clicks on the new customer link in the application guru99")
	public void the_user_clicks_on_the_new_customer_link_in_the_application_guru99() {
		obj1.clickonNewCustomerLink();    
	}

	@Given("user enters the customer name in guru99 application as {string}")
	public void user_enters_the_customer_name_in_guru99_application_as(String customer_name) {
		obj1.enterCustomerName(customer_name);
	  
	}

	@Given("user selects the gender in the page")
	public void user_selects_the_gender_in_the_page() {
		obj1.selectGender();
	    
	}

	@Given("user enters the address in guru99 application as {string}")
	public void user_enters_the_address_in_guru99_application_as(String address) {
	  obj1.enterAddress(address);
	}
	
	@Given("user enters the date of birth in the field as {string}")
	public void user_enters_the_date_of_birth_in_the_field_as(String date_birth) {
		obj1.enterDateOfBirth(date_birth);

	}
	*/
	
	
	@Given("the user clicks on the new customer link in the application guru99")
	public void the_user_clicks_on_the_new_customer_link_in_the_application_guru99() {
		obj1.clickonNewCustomerLink();
	   
	}

	@When("user enters the following user details and clicks submit button")
	public void user_enters_the_following_user_details_with(DataTable dataTable) {
		List<Map<String, String>> addcustList=dataTable.asMaps(String.class, String.class);
		
	//   System.out.println(addcustList);
	//  System.out.println(addcustList.get(0).get("cust_name"));
		
		for(Map<String, String> e : addcustList) 
		{
		String cust_name1=e.get("customer_name");
		obj1.enterCustomerName(cust_name1);
		
		String gen=e.get("gender");
		obj1.selectGender();
		
		String dob1=e.get("date_birth");
		obj1.enterDateOfBirth(dob1);
		
		String addr=e.get("address");
		obj1.enterAddress(addr);
		
		String city1=e.get("city");
		obj1.enterCity(city1);
		
		String state1=e.get("state");
		obj1.enterState(state1);
		
		String pincode=e.get("pin");
		obj1.enterPin(pincode);
		
		String mob=e.get("mobile_num");
		obj1.enterMobileNum(mob);
			
		String email=e.get("email_id");
		obj1.enterEmailid(email);
		
		String pwd=e.get("passkey");
		obj1.enterPassword(pwd);
		
		obj1.clickSubmit();
		obj1.clickHomeLink();
	   }
	}
	
	@Then("new customer should be added successfully to the system")
	public void new_customer_should_be_added_successfully_to_the_system() {
	   System.out.println("New Customer added successfully");
	}

}
