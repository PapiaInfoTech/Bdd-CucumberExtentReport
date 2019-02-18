@FunctionalTest
Feature: Login Feature

 #The Scenario Outline keyword can be used to run the same Scenario multiple times,
 # with different combinations of values.
 # The keyword Scenario Template is a synonym of the keyword Scenario Outline.

  Scenario Outline: Login with invalid credentials
    Given User has to be in log in page
    When Try log in by invalid "<userName>" and "<password>"
    Then Unable to log in
    Examples:
      | userName     |password|
      |mnaque72@gmail.com|Love143$|
