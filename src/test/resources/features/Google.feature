Feature: Google search
  Searching for results on Google

  Scenario: Searching for "IT Cluj"
    Given Go to "https://www.google.ro"
    When Type "IT Cluj" in the search field
    When I press the Search button
    Then New page loads
