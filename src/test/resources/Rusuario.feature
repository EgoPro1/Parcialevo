Feature: El App permite el registro de un nuevo usuario

  Scenario: Registro de un usuario
    Given El usuario ingresa y hace click en registrar
    And Seleciona tipo de cuenta y rellena los datos
    When Hace click registrarse
    Then Debe iniciar sesión como usuarui nuevo
