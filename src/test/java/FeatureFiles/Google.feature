Feature: Google Test:
  Scenario: googleWebtitle validate
    Given openn browser
    Then open Google
    Then I should be navigated to Google website



  Scenario: Test Google search
    Given open browser
    Then I enter search input
    And I should get naviageted to searched item page
