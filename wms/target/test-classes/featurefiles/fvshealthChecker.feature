Feature: Validate fvs Services Health

  Scenario: Validate fvs EndPoints
    When We Launch fvs Services
    Then Validate fvs-tools Endpoint Address
    And Validate fvs Endpoint Address