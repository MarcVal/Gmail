Feature: Registering a user on FirstKid website
  Testing version of the website will be used.

  Scenario:  As a new visitor of the website I am creating a client account by registering from "My account" menu.
    Given I open "https://qa.firstkid.ro"
    And I move mouse over the My account menu
    And I click on registering text link
    And I type in first name field "John"
    And I type in last name field "Smith"
    And I type "tesstarre@gmail.com" in the email field
    And I type "25" in the day`s field
    And I type "10" in the month`s fiels
    And I type "1995" in the year`s field
    And I type "kinderesti" in password`s field
    And I type "kinderesti" in password confirmation`s field
    And I click on submision button
    Then I validate Registration.
