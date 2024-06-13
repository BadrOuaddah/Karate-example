Feature: Simple API tests

  Background:
    * url 'http://localhost:8080'

  Scenario: Test GET method
    Given path '/karatePlayers'
    When method GET
    Then status 200

  Scenario: Test POST method
    Given path '/karatePlayers'
    And request {"id": 0,"fullName": "string","age": 0,"beltColor": "string"}
    When method POST
    Then status 201

  Scenario: Test DELETE method
    Given path '/karatePlayers/1'
    When method DELETE
    Then status 204