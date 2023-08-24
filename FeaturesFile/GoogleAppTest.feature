Feature: Test google Application

  Background: 
  Given open Google applicatio

  Scenario: Test Google homePage Tiitle
    When iget Actual Tiitle of the Application
    Then actual title Should be Equal expected tittle

  Scenario: test searching in google
    When i search valid keyword "testing"
    Then i should get valid result
