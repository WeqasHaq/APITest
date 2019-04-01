
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  
  Scenario: Title of your scenario
    Given I navigate to Manifest Trade portal
    And I see Lilo Login account and click on it
    And I land on Dashboard page i should see Cards display for Crew,Shippers,Consignee,Equipment
    And Manifest Charts should display with Preliminary,Submit,Canceled,Closed,Partialy Closed
    Then Validate Cards are displaying data
    And Validate Manifest Chart is displaying information for these status



 Scenario: Post something
 Given I navigate to Manifest List Page
 And I enter Arrived for Status
 And I enter Baltimore for Arrival Port
 And I should see a list of manifest for those two requests