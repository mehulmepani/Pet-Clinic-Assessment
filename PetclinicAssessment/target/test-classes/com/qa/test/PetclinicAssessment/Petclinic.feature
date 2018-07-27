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
Feature: Title of your feature
  As an Admin,
I want to manage the details of owners in the system,
So that I can keep up to date information about all owners.


  @tag1
  Scenario: Title of your scenario
    Given The correct website
    When I navigate to the 'owners' tab
    And then the 'all' Tab
    Then I can click on 'George Franklin' to update his information
    And then click edit owner
    Then I update the owners phonenumber
    And click update owner
    Then check that the owners information is updated

