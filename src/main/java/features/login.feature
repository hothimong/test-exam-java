Feature: Login page

  Scenario Outline: Login page
    Given I open website <website>
    When  I input username as <username>
    When  I input password as <password>
    Then  I click submit

    Examples:
      | website                             | username | password |
      | http://localhost:8080/demo/#!/login | admin    | admin    |