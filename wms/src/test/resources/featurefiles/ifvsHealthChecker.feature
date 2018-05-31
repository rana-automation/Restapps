Feature: Validate ifvs Services Health

  Scenario: Validate ifvs EndPoints
    When We Launch ifvs Services
    Then Validate lcs-zip Endpoint Address
    And Validate ifvs-tools Endpoint Address
    And Validate geyser-integration Endpoint Address
    And Validate ifvs Endpoint Address