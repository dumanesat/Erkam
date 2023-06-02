Feature: 11 pro

Scenario Outline: iphone 11 pro
Given User is on search page
When User enters Iphone model with storage "<model>"
And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
And User click storage check box "<storage>"
And User inconsistent prices according to condition
Examples:
| model                             | model1            | storage |
| iphone 11 Pro 64 gb unlocked      | iPhone 11 Pro     | 64 GB   |
| iphone 11 Pro 256 gb unlocked     | iPhone 11 Pro     | 256 GB  |
| iphone 11 Pro 512 gb unlocked     | iPhone 11 Pro     | 512 GB  |