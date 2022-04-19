@FirstTest
Feature: Basic syntax

  @FirstSceanrio
  Scenario: This is scenario 1
    Given user is on the TS homepage
    When user clicks on the about us button
    Then the user is redirected to the about us page
    And Close the browser