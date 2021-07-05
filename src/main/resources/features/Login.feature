@tag
Feature: Login de Usuario
  I want to use this template for my feature file

  Scenario Outline: Login de Usuario
    Given abro o menu pricipal
    When acesso o menu 'Login'
    And preencho o campo usuario "<usuario>" em Login
    And preencho o campo senha "<senha>" em Login
    And clico no botao 'Login'
     And abro o menu pricipal
    Then valido o usuario cadastrado
  
    Examples: 
      | usuario        |  senha   |
      | tedoceg749     | Senha123 |
