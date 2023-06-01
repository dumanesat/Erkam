Feature: Search cheapest all iphone xr models

  Scenario Outline: iphone xr
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
    And User click storage check box "<storage>"
    And User inconsistent prices according to condition
    Examples:
      | model                             | model1            | storage |
      | iphone XR 64 gb unlocked          | iPhone XR         | 64 GB   |
      | iphone XR 128 gb unlocked         | iPhone XR         | 128 GB  |
      | iphone XR 256 gb unlocked         | iPhone XR         | 256 GB  |

