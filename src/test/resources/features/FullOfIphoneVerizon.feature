Feature: Search cheapest all iphone 11 models

  Scenario Outline: iphone 11
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
    And User click storage check box "<storage>"
    And User inconsistent prices according to condition "Verizon"
#Unlocked,AT&T.T-Mobile, Verizon
    Examples:
      | model                             | model1            | storage |
      | iphone XR 64 gb Verizon           | iPhone XR         | 64 GB   |
      | iphone XR 128 gb Verizon          | iPhone XR         | 128 GB  |
      | iphone XR 256 gb Verizon          | iPhone XR         | 256 GB  |
      | iphone 11 64 gb Verizon           | iPhone 11         | 64 GB   |
      | iphone 11 128 gb Verizon          | iPhone 11         | 128 GB  |
      | iphone 11 256 gb Verizon          | iPhone 11         | 256 GB  |
      | iphone 11 Pro 64 gb Verizon       | iPhone 11 Pro     | 64 GB   |
      | iphone 11 Pro 256 gb Verizon      | iPhone 11 Pro     | 256 GB  |
      | iphone 11 Pro 512 gb Verizon      | iPhone 11 Pro     | 512 GB  |
      | iphone 11 Pro Max 64 gb Verizon   | iPhone 11 Pro Max | 64 GB   |
      | iphone 11 Pro Max 256 gb Verizon  | iPhone 11 Pro Max | 256 GB  |
      | iphone 11 Pro Max 512 gb Verizon  | iPhone 11 Pro Max | 512 GB  |
      | iphone 12 64 gb Verizon           | iPhone 12         | 64 GB   |
      | iphone 12 128 gb Verizon          | iPhone 12         | 128 GB  |
      | iphone 12 256 gb Verizon          | iPhone 12         | 256 GB  |
      | iphone 12 mini 64 gb Verizon      | iPhone 12 Mini    | 64 GB   |
      | iphone 12 mini 128 gb Verizon     | iPhone 12 Mini    | 128 GB  |
      | iphone 12 mini 256 gb Verizon     | iPhone 12 Mini    | 256 GB  |
      | iphone 12 Pro 128 gb Verizon      | iPhone 12 Pro     | 128 GB  |
      | iphone 12 Pro 256 gb Verizon      | iPhone 12 Pro     | 256 GB  |
      | iphone 12 Pro 512 gb Verizon      | iPhone 12 Pro     | 512 GB  |
      | iphone 12 Pro Max 128 gb Verizon  | iPhone 12 Pro Max | 128 GB  |
      | iphone 12 Pro Max 256 gb Verizon  | iPhone 12 Pro Max | 256 GB  |
      | iphone 12 Pro Max 512 gb Verizon  | iPhone 12 Pro Max | 512 GB  |
      | iphone 13 128 gb Verizon          | iPhone 13         | 128 GB  |
      | iphone 13 256 gb Verizon          | iPhone 13         | 256 GB  |
      | iphone 13 512 gb Verizon          | iPhone 13         | 512 GB  |
      | iphone 13 mini 128 gb Verizon          | iPhone 13 mini       | 128 GB  |
      | iphone 13 mini 256 gb Verizon         | iPhone 13 mini        | 256 GB  |
      | iphone 13 mini 512 gb Verizon          | iPhone 13 mini         | 512 GB  |

      | iphone 13 Pro 128 gb Verizon      | iPhone 13 Pro     | 128 GB  |
      | iphone 13 Pro 256 gb Verizon      | iPhone 13 Pro     | 256 GB  |
      | iphone 13 Pro 512 gb Verizon      | iPhone 13 Pro     | 512 GB  |
      | iphone 13 Pro 1000 gb Verizon     | iPhone 13 Pro     | 1000 GB |
      | iphone 13 Pro Max 128 gb Verizon  | iPhone 13 Pro Max | 128 GB  |
      | iphone 13 Pro Max 256 gb Verizon  | iPhone 13 Pro Max | 256 GB  |
      | iphone 13 Pro Max 512 gb Verizon  | iPhone 13 Pro Max | 512 GB  |
      | iphone 13 Pro Max 1000 gb Verizon | iPhone 13 Pro Max | 1000 GB |
      | iphone 14 128 gb Verizon          | iPhone 14         | 128 GB  |
      | iphone 14 256 gb Verizon          | iPhone 14         | 256 GB  |
      | iphone 14 512 gb Verizon          | iPhone 14         | 512 GB  |
      | iphone 14 plus 128 gb Verizon     | iPhone 14 Plus    | 128 GB  |
      | iphone 14 Plus 256 gb Verizon     | iPhone 14 Plus    | 256 GB  |
      | iphone 14 Plus 512 gb Verizon     | iPhone 14 Plus    | 512 GB  |
      | iphone 14 Pro 128 gb Verizon      | iPhone 14 Pro     | 128 GB  |
      | iphone 14 Pro 256 gb Verizon      | iPhone 14 Pro     | 256 GB  |
      | iphone 14 Pro 512 gb Verizon      | iPhone 14 Pro     | 512 GB  |
      | iphone 14 Pro 1024 gb Verizon     | iPhone 14 Pro     | 1024 GB |
      | iphone 14 Pro Max 128 gb Verizon  | iPhone 14 Pro Max | 128 GB  |
      | iphone 14 Pro Max 256 gb Verizon  | iPhone 14 Pro Max | 256 GB  |
      | iphone 14 Pro Max 512 gb Verizon  | iPhone 14 Pro Max | 512 GB  |
      | iphone 14 Pro Max 1024 gb Verizon | iPhone 14 Pro Max | 1024 GB |
