Feature: Rigister user whit data
  As a user I want to be able
  to create my user by filling in all the fields of the form


  Scenario Outline: Rigister user with all data

    Given that the user tries to register on the page
      |email|clave|
      |<email>|<clave>|
    When the user enters all the data
    Then the user is registered

    Examples:
      |email|clave|
      |juanda.carva@gmail.com|Qwer1234|