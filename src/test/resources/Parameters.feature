Feature: Run Selenium Scenarios

  @sanity @parameters @parameterSoftpost
  Scenario: Check the title of website
    Given kolejny sparametryzowany test home page of the  "http://www.softpost.org"
    Then zawiera tytul "tutorials"

  @sanity @parameters @parameterGoogle
  Scenario: Check the title of website
    Given google strona home page of the  "http://www.google.com "
    Then zawiera tytul  "google"
    