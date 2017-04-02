Feature: Run Selenium Scenarios

  @sanity @regression @outlineData
  Scenario Outline: Check the title of website first name and last name
    Given I am on the website "http://www.softpost.org/selenium-test-page"
    Then I verify that I can enter first name as <firstName>
    Then I verifythat I can enter last nam`e as <lastName>

    Examples:
      | firstName | lastName |
      | shoun     | loh      |
      | tim1      | wilson   |