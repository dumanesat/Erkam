Feature: Search cheapest all iphone 14 models

  Scenario Outline: iphone 14 plus
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
    And User click storage check box "<storage>"
    And User inconsistent prices according to condition
    Examples:
      | model                              | model1            | storage |
      | iphone 14 plus 128 gb unlocked     | iPhone 14 Plus    | 128 GB  |
      | iphone 14 Plus 256 gb unlocked     | iPhone 14 Plus    | 256 GB  |
      | iphone 14 Plus 512 gb unlocked     | iPhone 14 Plus    | 512 GB  |

