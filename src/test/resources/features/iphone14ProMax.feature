Feature: Search cheapest all iphone 14 models
  @wip
  Scenario Outline: iphone 14
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
    And User click storage check box "<storage>"
    And User inconsistent prices according to condition
    Examples:
      | model                              | model1            | storage |
      | iphone 14 Pro Max 128 gb unlocked  | iPhone 14 Pro Max | 128 GB  |
      | iphone 14 Pro Max 256 gb unlocked  | iPhone 14 Pro Max | 256 GB  |
      | iphone 14 Pro Max 512 gb unlocked  | iPhone 14 Pro Max | 512 GB  |
      | iphone 14 Pro Max 1024 gb unlocked | iPhone 14 Pro Max | 1024 GB |