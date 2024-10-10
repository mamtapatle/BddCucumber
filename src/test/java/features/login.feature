@E2E
Feature: Login functionality test
  
  As a user i should be able to login intop trhe application

  Background: user in on the sauce demo page
    Given i am on the login page

@Smoke
  Scenario: check login with valid username and password
    When i enter username and password
    And click on login button
    Then i should be able to see home page
    And close the browser

@Regression
  Scenario Outline: check login with valid username and password
    When i enter "<username>" and "<password>"
    And click on login button
    Then i should be able to see home page
    And close the browser

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
      | error_user    | secret_sauce |

@Sanity
  Scenario: user should be able to add products in the cart
    When i enter username and password
    And click on login button
    And  click on add to cart button
    Then Item should be added to the cart
