Feature: Find prices in two platform
  @wip
Scenario: User should be able to find cheapest Iphone model
Given User is on search page
When User enters Iphone model with storage "iphone 12 64 gb unlocked"
And User click model checkboxes "iPhone 12"
  #  And User clicks condition check box "Good"
And User click storage check box "64 GB"
And User inconsistent prices according to condition "64 GB"
And User navigates swappa
    And User searches mobile phone