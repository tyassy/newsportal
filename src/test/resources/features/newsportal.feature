@NewsPortal
Feature: News Portal

  Background:
    Given User access kumparan homepage

  Scenario: see news positif
    When User click "Trending" in top menu homepage
    Then User see top menu "Trending" page is opened

  Scenario: see news positif
    When User click "Trending" in top menu homepage
    And User click any news in Trending page
    Then User see news page opened

  Scenario: put comment after login
    When User click "News" in top menu homepage
    Then User see channel menu "News" page is opened

  Scenario: put comment before login
    And User click Masuk button
    When User click facebook button in login page
    Then User see facebook login page appears

  Scenario: put comment before login
    And User click Masuk button
    When User click google button in login page
    Then User see google login page appears

  Scenario: put comment before login
    And User click Masuk button
    And User click Daftar Sekarang button
    When User click facebook button in login page
    Then User see facebook login page appears

  Scenario:
    And User click Masuk button
    When User click Daftar Sekarang button
    Then User see register button is disabled

  Scenario:
    And User click Masuk button
    And User click Daftar Sekarang button
    When User input "test" as email in register page
    Then User see register button is disabled

  Scenario:
    And User click Masuk button
    And User click Daftar Sekarang button
    When User input "test@mail.com" as email in register page
    And User click register button
    Then User see verification popup appears

  Scenario:
    And User click Masuk button
    And User click Daftar Sekarang button
    When User input "123!#$" as email in register page
    Then User see register button is disabled