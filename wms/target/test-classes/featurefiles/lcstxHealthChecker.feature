Feature: Validate lcstx Services Health
  @lcstxHealthChecker
  Scenario: Validate lcstx EndPoints
    When We Launch lcstx Services
    Then Validate orchestration Endpoint Address
    And Validate lcstxtools Endpoint Address
