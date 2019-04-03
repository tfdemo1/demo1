Feature: Operations on the bank account


  Background:
    Given user types username "stefan10" and password "stefan10"
    When he clicks Log In button
    Then user will be logged into his account


  @SanityTest
  Scenario: New bank account creation

    Given user clicks Open New Account
    When Open New Account window is displayed he selects type of account "SAVINGS"
    And user submits creation
    Then new bank account is opened


  @RegTest
  Scenario: Check find transaction option using date

    Given user clicks Find Transactions
    When  he set today date
    And clicks Find Transactions
    Then transaction results are displayed







