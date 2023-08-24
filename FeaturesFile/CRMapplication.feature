Feature: Crm Application login Page testing

  Scenario: test sign in feature with valid data
    Given open sigin page in Crm App
    When User Enter Valid EmailId "test@gmail" and valid "test123" password
    When click on submit button
    Then user should successfully Login
