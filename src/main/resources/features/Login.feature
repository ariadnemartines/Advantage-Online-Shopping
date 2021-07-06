@tag
Feature: Login de Usuario
  Eu quero realizar login no app

  Scenario Outline: Login de Usuario
    Given abro o menu pricipal
    When acesso o menu 'Login'
    And preencho o campo usuario "<usuario>" em Login
    And preencho o campo senha "<senha>" em Login
    And clico no botao 'Login'
    And abro o menu pricipal
    Then valido o usuario logado "<usuario>"

    Examples: 
      | usuario    | senha    |
      | tedoceg749 | Senha123 |
