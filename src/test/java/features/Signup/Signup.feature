Feature: User Registration


  Scenario Outline: user register Successfully with valid credentials
    Given user visits signup page
    When user Enter "<Email>", "<FullName>" and "<Password>"
    And click on Continue button
    And click on three topics
    And click on Continue button
    Then verify that home page is visible
    Examples:
      | Email                 | FullName     | Password           |
      | werstest220@gmail.com | Dilder Hasan | 78963#jdK@woplj258 |


  Scenario Outline: user register Successfully with valid email
    Given user visits signup page
    When user Enter "<email>" in the Enter your email field
    And click on Continue button
    And verify that registering text is displayed
    And click on Got it Button
    And click on Skip for now
    Then verify that home page is visible
    Examples:
      | email                 |
      | retest12345@gmail.com |


  Scenario Outline: user register Successfully with Facebook's valid credentials
    Given user visits signup page
    When click on Facebook
    And user Enter Facebook credentials "<Phone>" and "<FbPassword>"
    And click on Facebook login button
    Then signup successfully and validation of page title
    Examples:
      | Phone       | FbPassword |
      | 01647302338 | 30453@shmm |