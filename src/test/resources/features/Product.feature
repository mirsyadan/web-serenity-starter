Feature: Login
  As a admin
  I want to login
  So that I can see product page

  #positive
  Scenario: As a admin I can login with valid
    Given I on the login page
    When I input username with valid
    And I input password with valid
    And I click the login button
    Then I on the product page

  #negative
  Scenario: As a admin I can't login with invalid step
    Given I on the login page
    When I input username with valid
    And I click the login button
    Then I see error message Epic sadface: Password is required

  #negative
  Scenario: As a admin I can't login with empty input credential
    Given I on the login page
    When I input username with empty credential
    And I input password with empty credential
    And I click the login button
    Then I see error message Epic sadface: Username is required

  #negative
  Scenario: As a admin I can't login with didn't click login button
    Given I on the login page
    When I input username with valid
    Then I input password with valid