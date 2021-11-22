Feature: Visit a page and click on a link

  Scenario: Visit a page and check the page title
  Given I navigate to BBC Website SignIn screen by entering valid logins
    When I navigate to Weather tab
    And search for Newcastle-upon-tyne location
    Then I can add Newcastle-upon-tyne to my location