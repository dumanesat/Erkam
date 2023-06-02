Feature: Search cheapest all iphone 12 models

  Scenario Outline: iphone 12
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
    And User click storage check box "<storage>"
    And User inconsistent prices according to condition
    Examples:
      | model                             | model1            | storage |
      | iphone 12 64 gb unlocked          | iPhone 12         | 64 GB   |
      | iphone 12 128 gb unlocked         | iPhone 12         | 128 GB  |
      | iphone 12 256 gb unlocked         | iPhone 12         | 256 GB  |

