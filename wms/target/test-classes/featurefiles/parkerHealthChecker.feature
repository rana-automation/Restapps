Feature: Validate parker Services Health
  @parkerHealthChecker
  Scenario: Validate parker EndPoints
    When We Launch parker Services
    Then Validate parker-tools Endpoint Address
    And Validate parker Endpoint Address
