Feature: Buying 2 products from FirstKid eshop

  Scenario: Buying products

    Given I go to "https://qa.firstkid.ro"
    And I login as firstkid client;
    And I click on category menu
    And I move mouse over the 8th category of products and I click on the 7th subcategory of products;
    And I add to cart the first product on page
    And I increase the quantity in my cart for the both purchased products
    And I click on the Launch order button
    And I select the pay on delivery option
    And I complete the billing and delivery address
    And I check the agreement box of the store and I send the order
    Then I receive the order placement confirmation message

    //
