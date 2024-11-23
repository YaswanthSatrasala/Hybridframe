
Feature: Login

 
  Scenario: Succesful login
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enter Email as "admin@yourstore.com" and Password as "admin"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on logout
    Then page title should be "Your store. Login"
    And close browser

  