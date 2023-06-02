Feature: Search cheapest all iphone 11 models

Scenario Outline: iphone 11
Given User is on search page
When User enters Iphone model with storage "<model>"
And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
And User click storage check box "<storage>"
And User inconsistent prices according to condition
Examples:
| model                             | model1            | storage |
| iphone 11 64 gb unlocked          | iPhone 11         | 64 GB   |
| iphone 11 128 gb unlocked         | iPhone 11         | 128 GB  |
| iphone 11 256 gb unlocked         | iPhone 11         | 256 GB  |
