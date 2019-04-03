Feature: Login option

  @SanityTest
  Scenario: User login verification

    Given user types username "stefan10" and password "stefan10"
    When he clicks Log In button
    Then user will be logged into his account


  @RegTest
  Scenario: Verification of not existing user account

    Given user types data
      | stefan01 | stefan01 |
    When he clicks Log In button
    Then he will receive error that user account could not be verified
