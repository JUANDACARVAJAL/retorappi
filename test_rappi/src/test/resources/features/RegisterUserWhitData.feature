Feature: Rigister user whit data
  As a user I want to be able
  to create my user by filling in all the fields of the form

  @Register
  Scenario Outline: Rigister user with all data

    Given Upload test data values
      |email|clave|firstName|lastName|month|day|year|gender|country|area|phone|
      |<email>|<clave>|<firstName>|<lastName>|<month>|<day>|<year>|<gender>|<country>|<area>|<phone>|
    When the user try to register account
    Then the user is registered

    Examples:
      |email|clave|firstName|lastName|month|day|year|gender|country|area|phone|
      |juanda.carva21@gmail.com|Qwer1234|juanda|carva|April|1|1990|Male|Colombia|34|30055555|

  @Login
  Scenario Outline: Search cruser

    Given Upload test data values
      |email|clave|sailto|duration|
      |<email>|<clave>|<sailto>|<duration>|
    When the user try to search a $cruise
    Then the user can save the search

    Examples:
      |email|clave|sailto|duration|
      |juanda.carva@gmail.com|Qwer1234|The Bahamas|6 - 9 Days|

  @Change
  Scenario Outline: Change cruser

    Given Upload test data values
      |email|clave|sailto|duration|
      |<email>|<clave>|<sailto>|<duration>|
    When the user try to search a $cruise
    When the user try to change la busqueda
    Then the user can change

    Examples:
      |email|clave|sailto|duration|
      |juanda.carva@gmail.com|Qwer1234|The Bahamas|6 - 9 Days|