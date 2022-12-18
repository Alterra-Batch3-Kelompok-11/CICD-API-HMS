Feature: Add Patients
  As a user
  I want to add patient data
  So I can add patient data

  Scenario: Add Patient data
    Given I set url for get add patient
    And I set body patient data
    When I request body patients
    Then I will get status code is 200