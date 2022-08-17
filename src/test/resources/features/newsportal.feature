@NewsPortal
Feature: News Portal

  Background:
    Given User access kumparan homepage

  Scenario: Verify User can open Trending page
    When User click "Trending" in top menu homepage
    Then User see top menu "Trending" page is opened

  Scenario: Verify User can open any news from Trending page
    When User click "Trending" in top menu homepage
    And User click any news in Trending page
    Then User see news page opened

  Scenario: Verify User can open News page
    When User click "News" in top menu homepage
    Then User see channel menu "News" page is opened

  Scenario: Verify User can access login via facebook page from login page
    And User click Masuk button
    When User click facebook button in login page
    Then User see facebook login page appears

  Scenario: Verify User can access login via google page from login page
    And User click Masuk button
    When User click google button in login page
    Then User see google login page appears

  Scenario: Verify User can access login via facebook page from register page
    And User click Masuk button
    And User click Daftar Sekarang button
    When User click facebook button in login page
    Then User see facebook login page appears

  Scenario: Verify User can access login via facebook page from register page
    And User click Masuk button
    And User click Daftar Sekarang button
    When User click google button in login page
    Then User see google login page appears

  Scenario: Verify User cannot register without input any email
    And User click Masuk button
    When User click Daftar Sekarang button
    Then User see register button is disabled

  Scenario: Verify User cannot register by input invalid email
    And User click Masuk button
    And User click Daftar Sekarang button
    When User input "test" as email in register page
    Then User see register button is disabled

  Scenario: Verify User can register using valid email
    And User click Masuk button
    And User click Daftar Sekarang button
    When User input "test@mail.com" as email in register page
    And User click register button
    Then User see verification popup appears

  Scenario: Verify User cannot register by input number and special characters as email
    And User click Masuk button
    And User click Daftar Sekarang button
    When User input "123!#$" as email in register page
    Then User see register button is disabled