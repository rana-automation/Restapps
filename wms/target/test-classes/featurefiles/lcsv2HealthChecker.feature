
Feature: Validate lcsv2 Services Health
  Scenario: Validate lcsv2 EndPoints
    When We Launch lcsv2 Services
    Then Validate previews Endpoint Address
    Then Validate ds Endpoint Address
    And Validate lcsv2-tools Endpoint Address
    And Validate parker Endpoint Address
    And Validate ws Endpoint Address
