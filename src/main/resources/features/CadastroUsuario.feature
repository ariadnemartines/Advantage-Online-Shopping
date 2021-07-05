@tag
Feature: Cadastro de usuario
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Cadastro de usuario
  	Given abro o menu pricipal
    When acesso o menu 'Login'
    And clico no botao 'Inscreva-se Hoje'
    And preencho o campo nome de usuario "<nomeDeUsuario>"
    And preencho o campo email "<email>"
    And preencho o campo senha "<senha>"
    And preencho o campo senha "<senha>" novamente
    And clico no botao 'Registrar'
    And abro o menu pricipal
    Then valido o usuario cadastrado
   

    Examples: 
      | nomeDeUsuario  |            email          | senha    |
      | tedoceg749     |    tedoceg749@nnacell.com | Senha123 |
    
