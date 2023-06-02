Feature: Search cheapest all iphone 12 models


  Scenario Outline: iphone 13
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
    And User click storage check box "<storage>"
    And User inconsistent prices according to condition
    Examples:
      | model                              | model1            | storage |
      | iphone 13 128 gb unlocked          | iPhone 13         | 128 GB  |
      | iphone 13 256 gb unlocked          | iPhone 13         | 256 GB  |
      | iphone 13 512 gb unlocked          | iPhone 13         | 512 GB  |

