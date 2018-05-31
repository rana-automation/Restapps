Feature: Validate bulkupload Services Health

  Scenario: Validate bulkupload EndPoints
    When We Launch bulkupload Services
    Then Validate bulkupload-tools Endpoint Address
    And Validate bulkupload Endpoint Address