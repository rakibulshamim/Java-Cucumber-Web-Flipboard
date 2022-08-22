Feature: Exploring Flipboard Home Features

  Background:
    Given user visits login page
    And user Enter username "shamim30453@outlook.com"
    And user Enter password "963147@test"
    Then click on login button


  Scenario: Check that For You page is visible
    Given click on For You
    Then verify that For You page is visible


  Scenario: Check that The Daily Edition page is visible
    Given click on The Daily Edition
    Then verify that The Daily Edition page is visible


  Scenario: Check that user can personalize favorite news topics
    Given click on personalize icon
    When verify that personalize tab is open
    And user select favorite topic from list
    And click on save button
#    And click on confirm save button
    Then verify that followed or unfollowed notification popup is displayed properly