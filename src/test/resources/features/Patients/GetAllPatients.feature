Feature: Get All Patients
  As a user
  I want to get all patients
  So I can manage all patients

  Scenario: Get All Patients
    Given I set url for get all patients
    When I request list patients
    Then I will get status code is 200