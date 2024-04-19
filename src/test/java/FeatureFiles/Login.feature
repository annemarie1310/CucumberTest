Feature: OrangeHRM Login
  Scenario Outline: Login Test

    Given I Launch BBrowser
    Then I Open Orangehrm webssite Login page
    Then I enter Valid "<username>" and "<password>"
    And Click on login
    Then I am navigated to home page

    Examples:
      | username | password |
      |   Admin  | admin123 |

