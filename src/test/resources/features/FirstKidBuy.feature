Feature: Buying 2 products from FirstKid eshop

  Scenario:

    Given I go to "https://qa.firstkid.ro"
    And I login as firstkit client;
    And I wait 5 seconds
    And I click on category menu
    And I move mouse over the 8th category of products and I click on the 7th subcategory of products;
    And I wait 5 seconds
    And I click Add to cart button for the first and last product on page;
    And I increase the quantity in my cart for the both purchased products;
    And I click on the Launch order button;
    And I select the pay on delivery option;
    When I check the agreement box of the store and I send the order.
    Then I receive the order placement confirmation message;
