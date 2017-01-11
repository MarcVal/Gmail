Feature: Sending and email using gmail.

  Scenario: Sending an email using gmail.
    Given I go to "https://mail.google.com"
    And I login with existing email address
    And I compose new message
    And I send new composed message
    And I check if the message was sent
    Then I log out from the email account