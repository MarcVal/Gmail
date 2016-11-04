Feature: Search documentation
  User case description

  Scenario: Search with one result
    Given Go to "http://phptravels.com/demo/"
    And Go to "http://phptravels.com/documentation/"
    When Type "FAQ" in the search field
    Then  One result is given

Scenario: ContactUs textLink
  Given Go to "http://phptravels.com/demo/"
  When Click on Contact Us
  Then Contact page is loaded

Scenario:
  Given: