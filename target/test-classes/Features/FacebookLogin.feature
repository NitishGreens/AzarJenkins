@TCAR4793835
Feature: Validation of Login Page in facebook Web Application

  @Smoke @Reg
  Scenario: TC01_Validation of Login page with valid username and valid password
    Given User launch Facebook Web Application
    When User enters valid username "mani@gmail.com" and valid password "mani@123" and click on login Button
    Then User verify Home Page is displayed

  @Sanity @Reg
  Scenario Outline: TC02_Validation of Sign page with invalid inputs
    Given User launch Facebook Web Application
    When User Click on createNewAccount Button
    And User enters "<firstName>"and "<lastName>" and click on signUp Button
    Then User verify Error message is displayed

    Examples: 
      | firstName | lastName |
      | mani      | java     |
      | abu       | selenium |
