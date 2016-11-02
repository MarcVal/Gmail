Feature: Gmail log in
  Trying to connect with google account

 Scenario: Simple login and log out in Gmail account
   Given Go to "https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier"
   And Click on EmailField
   When Type "tesstarre@gmail.com" in the email field
   When Click Next
   And I wait 2000 seconds
   And Click on PasswordField
   When Enter Password "testiculareincercare2016"
   And I wait 2000 seconds
   And I Click Sign in
   And I Click on Usermenu
   And I wait 2000 seconds
   And I click on SignOut
   And I wait 2000 seconds
   Then Validate Logout

