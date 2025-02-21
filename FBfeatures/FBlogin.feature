

Feature: login feature
  Here are validating the login feature Test cases

@errormessage
 Scenario: Validate the login funcationlity with Invalid username and password
    Given user is on login page
    When user enters Invalid username"maheshcknl@gmail.com"
    When user enters Invalid password"P3234"
    And user clicks on submit


 Scenario Outline:  Validate the login funcationlity with valid username and password
    Given user is on login page
    When user enters valid username "<username>"
    When user enters valid password "<password>"
    And user clicks on submit

      Examples: 
      | username  | password |
      | Testing@gmail.com | P234222 |
      | selenium@gmail.com | P343444 | 

    
    