Feature: Validate mls Services Health
  Scenario: Validate mls EndPoints
    When We Launch mls Services
    Then Validate transformation Endpoint Address
    And Validate akamai-listener Endpoint Address
    And Validate mls-tools Endpoint Address
    And Validate exec Endpoint Address

