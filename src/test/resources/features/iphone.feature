Feature: Search cheapest Iphone

  Scenario: User should be able to find cheapest Iphone model
    Given User is on search page
    When User enters Iphone model with storage "iphone 11 64 gb unlocked"
    And User click model checkboxes "iPhone 11"
  #  And User clicks condition check box "Good"
    And User click storage check box "64 GB"
    And User inconsistent prices according to condition
  @wip
  Scenario: User should be able to find cheapest Samsung model
    Given User is on search page
    When User enters Iphone model with storage "Samsung galaxy s21 Plus 5g 256 gb unlocked"
   And User click model checkboxes "Galaxy S21+ 5G"
    And User clicks condition check box "Galaxy S21 Plus 5G"
    And User click storage check box "256 GB"
    And User inconsistent prices according to condition..

  Scenario: Apple watch
    Given User is on search page
    When User enters Iphone model with storage "Apple Watch Series 8"
    And User click model checkboxes "Apple Watch Series 8"
   # And User clicks condition check box "Galaxy S21 Plus 5G"
    And User click storage check box "256 GB".
    And User inconsistent prices according to "cellular"