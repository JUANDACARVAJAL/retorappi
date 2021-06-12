Feature: Rigister user whit data
  As a user I want to be able
  to create my user by filling in all the fields of the form


  Scenario Outline: Rigister user with all data

    Given that the user tries to register on the page
      |email|clave|firstName|lastName|month|day|year|genere|country|area|phone|
      |<email>|<clave>|<firstName>|<lastName>|<month>|<day>|<year>|<genere>|<country>|<area>|<phone>|
    When the user enters all the data
    Then the user is registered

    Examples:
      |email|clave|firstName|lastName|month|day|year|genere|country|area|phone|
      |juanda.carva@gmail.com|Qwer1234|juanda|carva|April|1|1990|Male|Colombia|34|30055555|


  Scenario Outline: Search cruser

    Given that the user login on page
      |email|clave|firstName|lastName|month|day|year|genere|country|area|phone|
      |<email>|<clave>|<firstName>|<lastName>|<month>|<day>|<year>|<genere>|<country>|<area>|<phone>|
    When the user enters to search her cruser
    Then the user can save the search

    Examples:
      |email|clave|firstName|lastName|month|day|year|genere|country|area|phone|
      |juanda.car