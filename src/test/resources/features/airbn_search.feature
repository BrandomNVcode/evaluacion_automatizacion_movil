Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda simple de hospedaje

    Given que me encuentro en el login de Airbnb
    When busco "Hoteles en Vichayito"
    Then valido que estoy en el formulario "When's your trip?"
    When clic en SKIP
    Then valido el texto del formulario "Who's coming?"
    When clic en Search
    Then muestra el texto "Over 1,000 places"
    And valido resultados mayores a 1
