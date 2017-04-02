Feature: Run Selenium Scenarios

  @sanity @regression @outlineExample
  Scenario Outline: Check the title of website
    Given przechodzimy na strone home page of the  <website>
    Then znajdziemy tam  <word>
    Examples:
      | website                 | word      |
      | http://www.softpost.org | tutorials |
      | http://www.google.com   | google    |
