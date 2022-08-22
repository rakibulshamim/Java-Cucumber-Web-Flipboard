Feature: Like, Flip, Comment, Share and Report on Post

  Background:
    Given user visits login page
    And user Enter username "shamim30453@outlook.com"
    And user Enter password "963147@test"
    Then click on login button


  Scenario Outline: Check that user can share a post on Facebook
    Given click on Share icon in home page
    When click on Share on Facebook button
    And user Enter Facebook credentials "<Phone>" and "<FbPassword>"
    And click on Facebook login Button
    Then click on Post To Facebook button
    Examples:
      | Phone       | FbPassword |
      | 01647302338 | 30453@shmm |


  Scenario: Check that user can copy link from share tab
    Given click on Share icon in home page
    When click on share the link below box and copy the link
    Then verify that copied message is displayed


  Scenario Outline: Check that user can type in search magazines box
    Given click on Flip icon in home page
    When user enter "<magazine_name>" search magazines box
    Then verify that search result is displayed correctly
    Examples:
      | magazine_name |
      | Test          |


  Scenario Outline: Check that user can create magazine
    Given click on Flip icon in home page
    When click on Create Magazine button
    And user enter magazine "<title>" in magazine name box
    And user enter magazine "<description>" magazine description box
    And click on save button
    Then verify that magazine created successfully
    Examples:
      | title              | description      |
      | The New York Times | Test description |


  Scenario Outline: Check that user can flipped post successfully
    Given click on Flip icon in home page
    When user enter a "<comment>" in Add a comment box
    And click on comment Flip button
    Then verify that flipped popup is displayed
    Examples:
      | comment      |
      | Test comment |


  Scenario: Check that user can click on Heart icon
    Given click on Heart icon
    Then verify that Heard icon is clicked


  Scenario: Check that user can click on Like button in Daily Edition page
    Given click on The Daily Edition
    When click on menu button
    And click on Like button
    Then verify that Like button is clicked


  Scenario: Check that user can click on Flip button in Daily Edition page
    Given click on The Daily Edition button
    When click on menu button
    And click on Flip button
    Then verify that Flip button is clicked


  Scenario: Check that user can click on share button in Daily Edition page
    Given click on The Daily Edition button
    When click on menu button
    Then click on Share button in Daily Edition page
    Then verify that Share button in Daily Edition page is clicked


  Scenario: Check that user can report content in Daily Edition page
    Given click on The Daily Edition button
    When click on menu button
    And click on report button
    And click on report button in report content
    Then verify that content is reported successfully


  Scenario: Check that user can click on follow or unfollow in Daily Edition page
    Given click on The Daily Edition button
    Then click on follow or unfollow button
    Then verify that follow or unfollow button is clicked


  Scenario: Check that profile page is visible
    Given click on avatar icon
    When click on profile
    Then verify that profile page is visible

