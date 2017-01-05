Feature: I search products by price

  Scenario: I search the lowest priced products on the page grid

    Given I go to "https://qa.firstkid.ro/scaune-auto-pentru-copii.html"
    And I search for the products with price lower than 60 Ron and I add to cart the 2nd product cheaper than 60 Ron


    Scenario: I search products between a minimum and a maximum price

      Given I go to "https://qa.firstkid.ro/articole-bebelusi.html"
      And I select price range between 150 and 170 Ron;
      Then I check if all products have the price in range;
