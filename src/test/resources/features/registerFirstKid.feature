Feature: Registering a user on FirstKid website
  Testing version of the website will be used.

  Scenario:  As a new visitor of the website I am creating a client account by registering from "My account" menu.
    Given I open "https://qa.firstkid.ro"
    Then I move mouse over the My account menu
    And I wait for display
    And I click on registering text link
    Then I type in first name field "John"
    And I type in last name field "Smith"
    Then I type "email@address.com" in the email field
    And I type "25" in the day`s field
    And I type "10" in the month`s fiels
    And I type "1995" in the year`s field
    Then I type "passwordtest1" in password`s field
    And I type "passwordtest1" in password confirmation`s field
    Then I click on submision button
    Then I wait for display
    And I validate Registration.
