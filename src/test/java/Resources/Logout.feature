Feature: Validating Logout functionality for Guru99 application

  Background: 
    Given User opens the demo application of guru99
    And User will enter his username in username field as "mngr601503"
    And User will enter his password in password field as "YqepusU"
    When User will click on Login button
    Then User will be navigated to the demo application of guru99

  Scenario Outline: Logout from Guru99 application
    Given the user clicks on the Log out link in the application guru99
    When successful logout message box popup appear
    And user clicks OK button
    Then user should be able to see login page
