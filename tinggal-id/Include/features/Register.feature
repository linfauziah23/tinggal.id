Feature: Register

  @positive_case @REG01
  Scenario: User want to register using correct credential
    Given User open URL tinggal.id web
    When User click button account
    And User clik button daftar
    And User input correct credential
    And User clik checklist saya setuju
    And User click button daftar
    Then User input correct OTP

  @negative_case @REG02
  Scenario: User want to register but doesn't fill email and password
    Given User open URL tinggal.id web
    When User click button account
    And User clik button daftar
    And User click button daftar
    Then User stay in register page