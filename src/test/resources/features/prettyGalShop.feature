Feature: Shopping for fashion products test case

  Scenario: As a visitor of the website I add products to cart and I proceed to checkout.

    Given I open "http://gabikis.wixsite.com/fashion"
    Then I click on Sale text link
    And I wait 3 seconds
    Then I click on first product listed
    And I wait 3 seconds
    Then I click on quantity box
    Then I select 5 pieces into quantity field
    And I click Add to cart button
    And I wait 3 seconds
    Then I click on View Cart button
    And I wait for display
    Then I decrease the product quantity
    And I click on Checkout button
    And I wait 3 seconds



