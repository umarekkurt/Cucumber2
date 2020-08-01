Feature: Total Price Functionality

  Scenario: Verify the total price
    Given Navigate to aoutomationpractice
    When Click on sing button and enter the username and password
    Then User should login successfully
    Given Navigate to dresses page
    When Click on the any item from the page, add to cart and proceed to check out
    Then Verify Total products + Total shipping = Total