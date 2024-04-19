Feature: OrangeHrm Login
#Background tag below works as before method so, for every data entry it will do the thing below Background tag
  Background: Open orangeHRM Login page
    Given I am on Login page of OrnageHrm

  Scenario Outline: Login
    Then I enter validd "<Username>" and "<Password>"
    And CLick on login button
    Then I am navigatedd to home page
      Examples:
      | Username  | Password |
      |  Admin    |admin123  |
      | dsd       |ffdf      |
      | Addminnn  |admin12333|
      | Admin     |admin123  |
