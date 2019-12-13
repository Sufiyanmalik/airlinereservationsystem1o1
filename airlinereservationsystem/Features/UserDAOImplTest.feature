#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: User functionality on the page of Application

  @tag1
  Scenario: Verification of Register functionality
    Given Open the Chrome and launch the application
    When Enter all the valid details asked
    Then Register the user

  @tag2
  Scenario Outline: Verification of Login functionality
    Given Open the chrome and launch the application
    When Enter the valid username and password and click on submit button
    Then Login successful else error

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
