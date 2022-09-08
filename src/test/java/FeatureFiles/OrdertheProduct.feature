Feature: A101 website functionality

  Scenario: Order a product
    Given Go to Website
    When Search Giyim Click the Giyim tab
    And Click Black socks
    And Click Sepete Ekle and Sepeti Gor
    Then Enter the User Data and go to payment page
    And User should be display succes or not



