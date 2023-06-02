Feature: Search cheapest Iphone


  Scenario: User should be able to find cheapest Iphone model
    Given User is on search page
    When User enters Iphone model with storage "iphone 12 64 gb unlocked"
    And User click model checkboxes "iPhone 12"
  #  And User clicks condition check box "Good"
    And User click storage check box "64 GB"
    And User inconsistent prices according to condition

  Scenario: User should be able to find cheapest Samsung model
    Given User is on search page
    When User enters Iphone model with storage "Samsung galaxy s21 Plus 5g 256 gb unlocked"
    And User click model checkboxes "Galaxy S21+ 5G"
    And User clicks condition check box "Galaxy S21 Plus 5G"
    And User click storage check box "256 GB"
    And User inconsistent prices according to condition..

  Scenario: Apple watch
    Given User is on search page
    When User enters Iphone model with storage "apple watch series 7 cellular 41 mm"
    And User click model checkboxes "Apple Watch Series 7"
   # And User clicks condition check box "Galaxy S21 Plus 5G"
    And User click storage check box "32 GB".
    And User inconsistent prices according to "Cellular"


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

      | iphone 11 Pro 64 gb unlocked      | iPhone 11 Pro     | 64 GB   |
      | iphone 11 Pro 256 gb unlocked     | iPhone 11 Pro     | 256 GB  |
      | iphone 11 Pro 512 gb unlocked     | iPhone 11 Pro     | 512 GB  |

      | iphone 11 Pro Max 64 gb unlocked  | iPhone 11 Pro Max | 64 GB   |
      | iphone 11 Pro Max 256 gb unlocked | iPhone 11 Pro Max | 256 GB  |
      | iphone 11 Pro Max 512 gb unlocked | iPhone 11 Pro Max | 512 GB  |



      | iphone 12 64 gb unlocked          | iPhone 12         | 64 GB   |
      | iphone 12 128 gb unlocked         | iPhone 12         | 128 GB  |
      | iphone 12 256 gb unlocked         | iPhone 12         | 256 GB  |


