@smoke
@regression

Feature: Validate Login Functionality for Demo Application Guru99

  Scenario Outline: To Validate the login functionality for Guru99 application
    Given User opens the demo application of guru99
    And User will enter his username in username field as "<username>"
    And User will enter his password in password field as "<password>"
    When User will click on Login button
    Then User will be navigated to the demo application of guru99

    Examples: 
      | username   | password |
      | mngr601503 | YqepusU  |
