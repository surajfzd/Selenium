Feature: Validate the title of the Employee page.
  
  
  Scenario: Validate the title of the NextStep page
    Given The nextStep page is opening
    When The nextStep page is open
    Then then the title of nextStep must be next step 
    
    Scenario: when the name is blank
    Given The nextStep page is opening
    When The nextStep page is open
    Then then show alert message name can't be blank 