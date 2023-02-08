Feature: Login

  Background: User want to login
    Given User open URL User open URL tinggal.id web
    When User click button account
    And User clik button masuk

  @positive_case @user @LGN1001
  Scenario: User want to login using correct credential
    And User input correct credantial
    And User click button masuk
    Then User successfully login

  @negative_case @user @LGN1002
  Scenario: User want to login using incorrect credential (wrong password)
    And User input incorrect credential
    And User click button of Masuk on Login page
    Then User will see a popup or notification that explains if the password was wrong

  @negative_case @user @LGN1003
  Scenario: User want to login using incorrect credential (wrong email)
    And User input incorrect email
    And User click button of Masuk on Login page
    Then User will see a popup or notification that explains if the email was wrong

  @negative_case @user @LGN1004
  Scenario: User want to login without password
    And User input incorrect email
    And User click button of Masuk on Login page
    Then User will see a popup or notification that explains if user need input password
