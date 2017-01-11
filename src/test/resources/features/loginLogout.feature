Feature: Gmail log in


  Scenario: Simple login and log out in Gmail account
    Given I go to "https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier"
    And Click on EmailField
    And Type address in the email field
    And Click Next
    And Enter Password
    And I Click Sign in
    And I Click on Usermenu
    And I click on SignOut
    Then Validate Logout

