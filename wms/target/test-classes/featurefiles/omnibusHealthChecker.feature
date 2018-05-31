Feature: Validate omnibus Services Health
  @omnibusHealthChecker
  Scenario: Validate omnibus EndPoints
    When We Launch omnibus Services
    Then Validate omnibus-Tools Endpoint Address
    And Validate omnibus Endpoint Address
