Feature: Search documentation
  User case description

  Scenario: Search with one result
    Given Go to "http://phptravels.com/demo/"
    And Go to "http://phptravels.com/documentation/"
    And I wait 5 seconds
    When Type "FAQ" in the search field
    Then  One result is given

