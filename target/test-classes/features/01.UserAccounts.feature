Feature: Create user account


  @SanityTest
  Scenario Outline: User accounts creation
    Given user clicks Register button
    When he populates required data <firstname>, <lastname>, <address>, <city>, <state>, <zipCode>, <phone>, <ssn>, <username>, <password>
    And he submits registration
    Then user will be logged into his account

    Examples:
      | firstname | lastname | address | city | state    | zipCode | phone | ssn | username | password |
      | dambo123  | accc2    | bbb     | ddfd | fdfdfdfd | 44      | 1212  | 33  | stefan10 | stefan10 |
      | dstefan41 | ccc      | bbb     | ddfd | fdfdfdfd | 44      | 1212  | 33  | stefan11 | stefan11 |



