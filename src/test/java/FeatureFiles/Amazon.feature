@All

Feature: Amazon
  Background: User is on Amazon website
    Given User is on Amazon website

  @GetSellTitle
  Scenario: Get title of Sell
    Then  i click on Sell
    And should get navigated to sell page

    @GetBestSellerTitle
  Scenario: Get title of Best Sellers
    Then i should click on Best sellers
    And i should get navigated to Bestseller's website

     @GetMobilesTitle
  Scenario: Get title of Mobiles
    Then i should click on Mobiles
    And i should get navigated to Mobiles website









