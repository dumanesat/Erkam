Feature: Samsung Unlocked

  @wip
  Scenario Outline: User should be able to find cheapest Samsung model
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    #And User click model checkboxes "<model1>"
    And User clicks condition check box "<model1>"
    And User click storage check box "<storage>"
    And User inconsistent prices according to condition "Unlocked"
    Examples:
      | model                                          | model1                  | storage |
      | Samsung Galaxy S10 128 gb unlocked             | Galaxy S10              | 128 GB  |
      | Samsung Galaxy S10 512 gb unlocked             | Galaxy S10              | 512 GB  |

      | Samsung Galaxy S10 5G 256 gb unlocked          | Galaxy S10 5G           | 256 GB  |
      | Samsung Galaxy S10 5G 512 gb unlocked          | Galaxy S10 5G           | 512 GB  |


      | Samsung Galaxy S10 E 128 gb unlocked           | Galaxy S10e             | 128 GB  |
      | Samsung Galaxy S10 E 256 gb unlocked           | Galaxy S10e             | 256 GB  |


      | Samsung Galaxy S10 Plus 128 gb unlocked        | Galaxy S10 Plus         | 128 GB  |
      | Samsung Galaxy S10+ 512 gb unlocked            | Galaxy S10+             | 512 GB  |
      | Samsung Galaxy S10 Plus 1000 GB unlocked       | Galaxy S10 Plus         | 1000 GB |

      | Samsung Galaxy S20 5G 128 GB Unlocked          | Galaxy S20 5G           | 128 GB  |


      | Samsung Galaxy S20 Plus 128 GB Unlocked        | Galaxy S20 Plus         | 128 GB  |
      | Samsung Galaxy S20 Plus 256 GB Unlocked        | Galaxy S20 Plus         | 256 GB  |

      | Samsung Galaxy S20 Plus 5G 128 GB Unlocked     | Galaxy S20 Plus 5G      | 128 GB  |
     #sadece 128 var


      | Samsung Galaxy S20 ultra 5G 128 GB Unlocked    | Galaxy S20 Ultra 5G     | 128 GB  |
      | Samsung Galaxy S20 ultra 5G 512 GB Unlocked    | Galaxy S20 Ultra 5G     | 512 GB  |

      | Samsung Galaxy S20 FE 5G 128 GB Unlocked       | Galaxy S20 FE 5G        | 128 GB  |
      | Samsung Galaxy S20 FE 5G 256 GB Unlocked       | Galaxy S20 FE 5G        | 256 GB  |


      | Samsung Galaxy S21 5G 128 GB Unlocked          | Galaxy S21 5G           | 128 GB  |
      | Samsung Galaxy S21 5G 256 GB Unlocked          | Galaxy S21 5G           | 256 GB  |

      | Samsung Galaxy S21 ULTRA 5G 128 GB Unlocked    | Galaxy S21 Ultra 5G     | 128 GB  |
      | Samsung Galaxy S21 ULTRA 5G 256 GB Unlocked    | Galaxy S21 Ultra 5G     | 256 GB  |
      | Samsung Galaxy S21 ULTRA 5G 512 GB Unlocked    | Galaxy S21 Ultra 5G     | 512 GB  |

      | Samsung Galaxy S21 PLUS 128 GB Unlocked        | Galaxy S21 Plus         | 128 GB  |
      | Samsung Galaxy S21 PLUS 256 GB Unlocked        | Galaxy S21 Plus         | 256 GB  |

      | Samsung Galaxy S21 PLUS 5G 128 GB Unlocked     | Galaxy S21 Plus 5G      | 128 GB  |
      | Samsung Galaxy S21 PLUS 5G 256 GB Unlocked     | Galaxy S21 Plus 5G      | 256 GB  |

      | Samsung Galaxy S22 128 GB Unlocked             | Galaxy S22              | 128 GB  |
      | Samsung Galaxy S22 256 GB Unlocked             | Galaxy S22              | 256 GB  |

      | Samsung Galaxy S22 Plus 128 GB Unlocked        | Galaxy S22 Plus         | 128 GB  |
      | Samsung Galaxy S22 Plus 256 GB Unlocked        | Galaxy S22 Plus         | 256 GB  |

      | Samsung Galaxy S22 Plus 5G 128 GB Unlocked     | Galaxy S22 Plus 5G      | 128 GB  |
      | Samsung Galaxy S22 Plus 5G 256 GB Unlocked     | Galaxy S22 Plus 5G      | 256 GB  |

      | Samsung Galaxy S22 Ultra 128 GB Unlocked       | Galaxy S22 Ultra        | 128 GB  |
      | Samsung Galaxy S22 Ultra 256 GB Unlocked       | Galaxy S22 Ultra        | 256 GB  |
      | Samsung Galaxy S22 Ultra 512 GB Unlocked       | Galaxy S22 Ultra        | 512 GB  |
      | Samsung Galaxy S22 Ultra 1000 GB Unlocked      | Galaxy S22 Ultra        | 1000 GB |

      | Samsung Galaxy S22 Ultra 5G 128 GB Unlocked    | Galaxy S22 Ultra 5G     | 128 GB  |
      | Samsung Galaxy S22 Ultra 5G 256 GB Unlocked    | Galaxy S22 Ultra 5G     | 256 GB  |
      | Samsung Galaxy S22 Ultra 5G 512 GB Unlocked    | Galaxy S22 Ultra 5G    | 512 GB  |
      | Samsung Galaxy S22 Ultra 5G 1000 GB Unlocked   | Galaxy S22 Ultra 5G     | 1000 GB |

      | Samsung Galaxy S23 128 GB Unlocked             | Galaxy S23              | 128 GB  |
      | Samsung Galaxy S23 256 GB Unlocked             | Galaxy S23              | 256 GB  |


      | Samsung Galaxy S23 Ultra 256 GB Unlocked       | Galaxy S23 Ultra        | 256 GB  |
      | Samsung Galaxy S23 Ultra 512 GB Unlocked       | Galaxy S23 Ultra        | 512 GB  |

      | Samsung Galaxy S23 Plus 256 GB Unlocked        | Galaxy S23 Plus         | 256 GB  |
      | Samsung Galaxy S23 Plus 512 GB Unlocked        | Galaxy S23 Plus         | 512 GB  |

      | Samsung Galaxy S23+ 5G 512 GB Unlocked         | Galaxy S23+ 5G          | 512 GB  |

      | Samsung Galaxy Note 10 Lite 128 GB Unlocked    | Galaxy Note10 Lite      | 128 GB  |
      | Samsung Galaxy Note 10 256 GB Unlocked         | Galaxy Note 10          | 256 GB  |
      | Samsung Galaxy Note 10 512 GB Unlocked         | Galaxy Note 10          | 512 GB  |


      | Samsung Galaxy Note 10 Plus 256 GB Unlocked    | Galaxy Note10 Plus      | 256 GB  |
      | Samsung Galaxy Note 10 Plus 512 GB Unlocked    | Galaxy Note10 Plus      | 512 GB  |


      | Samsung Galaxy Note 10 Plus 5G 256 GB Unlocked | Galaxy Note10 Plus 5G   | 256 GB  |
      | Samsung Galaxy Note 10+ 5G 512 GB Unlocked | Galaxy Note 10+ 5G   | 512 GB  |


      | Samsung Galaxy Note 20  128 GB Unlocked        | Galaxy Note20           | 128 GB  |
      | Samsung Galaxy Note 20  256 GB Unlocked        | Galaxy Note20           | 256 GB  |


      | Samsung Galaxy Note 20 5G 128 GB  Unlocked     | Galaxy Note20 5G        | 128 GB  |
      | Samsung Galaxy Note 20 5G 256 GB Unlocked      | Galaxy Note20 5G        | 256 GB  |


      | Samsung Galaxy Note Ultra 128 GB  Unlocked     | Galaxy Note 20 Ultra    | 128 GB  |
      | Samsung Galaxy Note Ultra 256 GB Unlocked      | Galaxy Note 20 Ultra    | 256 GB  |
      | Samsung Galaxy Note Ultra 512 GB Unlocked      | Galaxy Note 20 Ultra    | 512 GB  |


      | Samsung Galaxy Note Ultra 5G 128 GB  Unlocked  | Galaxy Note 20 Ultra 5G | 128 GB  |
      | Samsung Galaxy Note Ultra 5G 512 GB Unlocked   | Galaxy Note 20 Ultra 5G | 512 GB  |

      | Samsung Galaxy z flip 3  128 GB  Unlocked      | Galaxy Z Flip 3         | 128 GB  |
      | Samsung Galaxy z flip 3  256 GB  Unlocked      | Galaxy Z Flip 3         | 256 GB  |


      | Samsung Galaxy z flip 3 5G 128 GB  Unlocked    | Galaxy Z Flip 3 5G      | 128 GB  |
      | Samsung Galaxy z flip 3 5G 256 GB  Unlocked    | Galaxy Z Flip 3 5G      | 256 GB  |



      | Samsung Galaxy z flip 4  128 GB  Unlocked      | Galaxy Z Flip4          | 128 GB  |
      | Samsung Galaxy z flip 4  256 GB  Unlocked      | Galaxy Z Flip4          | 256 GB  |

      | Samsung Galaxy z flip 4 5G 128 GB  Unlocked    | Galaxy Z Flip4 5G       | 128 GB  |
      | Samsung Galaxy z flip 3  256 GB  Unlocked      | Galaxy Z Flip4 5G       | 256 GB  |

      | Samsung Galaxy z fold 3 5G 256 GB  Unlocked    | Galaxy Z Fold 3 5G      | 256 GB  |
      | Samsung Galaxy z fold 3 5G 512 GB  Unlocked    | Galaxy Z Fold 3 5G      | 512 GB  |


      | Samsung Galaxy z fold 2 5G 256 GB  Unlocked    | Galaxy Z Fold 2 5G      | 256 GB  |
      | Samsung Galaxy z fold 2 5G 512 GB  Unlocked    | Galaxy Z Fold 2 5G      | 512 GB  |