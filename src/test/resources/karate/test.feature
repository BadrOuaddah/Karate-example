Feature: Simple API tests

  Background:
    * url 'http://localhost:8080'

  Scenario: Test GET method
    Given path '/players'
    When method GET
    Then status 200

  Scenario: Test POST method
    Given path '/players'
    And request {"id": 0,"fullName": "string","age": 0,"beltColor": "string"}
    When method POST
    Then status 201

  Scenario: Test PUT method
    Given url 'http://localhost:8080'
    Given path 'api/v1/players'
    And request { "id": 2, "fullName": "string", "age": 0, "beltColor": "string" }
    When method POST
    Then status 201

    Given path 'api/v1/players/2'
    And request { "fullName": "stringUpdated", "age": 0, "beltColor": "stringUpdated" }
    When method PUT
    Then status 200


  Scenario: Test DELETE method
    Given path '/players/1'
    When method DELETE
    Then status 204