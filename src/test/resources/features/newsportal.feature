@NewsPortal
Feature: News Portal

  Background:
    Given User access kumparan homepage

#  @case1
#  Scenario: see news positif
#    When User search for "G20"
#    And User choose any search suggestion
#    And User choose any news result
#    Then User see news page opened

  @case2
  Scenario: see news positif
    When User click any headline news in homepage
    Then User see news page opened

  @case3
  Scenario: put comment after login
    And User login with provided account
    And User click any headline news in homepage
    When User put comment "comments" in news page
    Then User see put comment is succeeded

  @cas4
  Scenario: put comment before login
    And User click any headline news in homepage
    When User put comment "comments" in news page
    Then User see login page appears

  @case5
  Scenario: register without password
    And User click Masuk button
    And User see Daftar Sekarang button	in login page
    When User input "lala@gmail.com" in email textfield in register page
    And User click register button in register page
    Then User see popup notification appears in register page

  @case6
  Scenario: register negatif
    And User click Masuk button
    And User see Daftar Sekarang button in login page
    When User click register button in register page
    Then User see wording to input email appears in register page

  @case7
  Scenario: register negatif
    And User click Masuk button
    And User see Daftar Sekarang button in login page
    When User input "lala" in email textfield in register page
    And User click register button in register page
    Then User see wording to input email appears in register page

  @case8
  Scenario: login (fb) positif
    And User click Masuk button in login page
    When User click facebook button in login page
    Then User see facebook login page appears

  @case9
  Scenario: login (fb) positif from register page
    And User click Masuk button in login page
    And User see Daftar Sekarang button in login page
    When User click facebook button in register page
    Then User see facebook login page appears

  @case10
  Scenario: login (google) positif
    And User click Masuk button in login page
    When User click google button in login page
    Then User see google login page appears

  @case11
  Scenario: login (google) positif
    And User click Masuk button in login page
    And User see Daftar Sekarang button in login page
    When User click google button in register page
    Then User see google login page appears