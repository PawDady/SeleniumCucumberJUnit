Feature: Atm card feature

  @sanity @regression @PIN @correctPIN
  Scenario: Enter correct PIN at ATM
    Given I insert the ATM card in the ATM machine
    And I am asked to enter the PIN
    When I enter the correct PIN
    Then I should be able to see option to withdraw money
    Then I withdraw money

  @sanity @regression @PIN @inCorrectPIN
  Scenario: Enter wrong PIN at ATM
    Given I insert the ATM card in the ATM machine
    And I am asked to enter the PIN
    When I enter the wrong PIN
    Then I should not be able to see option to withdraw money
