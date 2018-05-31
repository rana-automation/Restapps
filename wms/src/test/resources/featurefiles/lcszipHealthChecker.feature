Feature: Validate lcszip Services Health
  Scenario: Validate lcszip EndPoints
    When We Launch lcsv2 Services
    Then Validate lcs-zip Endpoint Address
    And Validate lcszip-tools Endpoint Address
    And Validate geyser-integration Endpoint Address
    And Validate ifvs Endpoint Address
