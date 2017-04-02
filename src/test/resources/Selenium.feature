Feature: First Feature

  @Selenium @Softpost1
  Scenario: First scenerio, log In to www.softpost.org
    Given User is on www.softpost.org
    When User cliks Contact us
    Then user is redirected to contact website

  @Selenium @Onet @Onet1
  Scenario: Second scenerio, change to shoping on onet.pl
    Given User is on www.onet.pl
    When User cliks poczta
    Then user is redirected to email website

  @Selenium  @Onet @Onet2
  Scenario: Second scenerio, change to shoping on onet.pl
    Given User is on www.onet.pl
    When User cliks shoping
    Then user is redirected to shoping website