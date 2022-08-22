Feature: Flipboard App Download

  Scenario: Download Flipboard app from Apple App Store
    Given click on Tools button
    And click on Available on iOS button
    Then verify that Apple App Store page is open properly


  Scenario: Download Flipboard app from Google Play Store
    Given click on Tools button
    And click on Available on Android button
    Then verify that Google Play Store page is open properly