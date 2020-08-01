
Feature: Order Confirmation Functionality

  Scenario: Verify Order confirmation
    Given Navigate to aoutomationpractice
    When Click on sing button and enter the username and password
    Then User should login successfully
    Given Navigate to dresses page
    When Click on the any item from the page, add to cart and proceed to check out
    Then Verify Total products + Total shipping = Total
    Given Click on the proceed to checkout button
    When Click on the I agree, proceed to checkout button,
    Then Click on Pay by bank wire, and i confirm my order button
    Then  Verify order confirmation text