Feature: User Login

  Scenario Outline: Check login By Email is Successful with valid credentials
    Given user visits login page
    When user Enter "<Email>" and "<Password>"
    And click on login button
    Then login successfully and validation of page title
    Examples:
      |          Email          |  Password   |
      | shamim30453@outlook.com | 963147@test |


  Scenario Outline: Check login By Facebook is Successful with valid credentials
    Given user visits login page
    When click on Facebook icon
    And user Enter Facebook credentials "<Phone>" and "<FbPassword>"
    And click on Facebook login button
    Then login successfully and validation of page title
    Examples:
      |    Phone     | FbPassword  |
      | 01647302338  |  30453@shmm  |