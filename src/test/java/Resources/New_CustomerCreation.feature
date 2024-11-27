Feature: Creation of new customer for Guru99 application

  Background: 
    Given User opens the demo application of guru99
    And User will enter his username in username field as "mngr601503"
    And User will enter his password in password field as "YqepusU"
    When User will click on Login button
    Then User will be navigated to the demo application of guru99

  #Scenario Outline: Creation of New Customer
  # Given the user clicks on the new customer link in the application guru99
  #And user enters the customer name in guru99 application as "<customer_name>"
  #And user selects the gender in the page
  #And user enters the date of birth in the field as "<date_birth>"
  #And user enters the address in guru99 application as "<address>"
  #Examples:
  # | customer_name | address  |date_birth|
  #| Nilima        | Delhi    |12-05-1990|
  Scenario Outline: Adding New Customer with different data with columns
    Given the user clicks on the new customer link in the application guru99
    When user enters the following user details and clicks submit button
      | customer_name | gender | date_birth | address      | city      | state | pin    | mobile_num | email_id       | passkey    |
      | Sakshi        | female | 20-05-1990 | Kranti nagar | New Delhi | Delhi | 100056 | 8543654789 | sakshi@xyz.com | sakshi@123 |
    Then new customer should be added successfully to the system
