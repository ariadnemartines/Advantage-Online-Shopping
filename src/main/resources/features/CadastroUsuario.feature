@tag
Feature: Cadastro de usuario
  Eu quero realizar cadastro de usuario

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
    Then valido o usuario cadastrado "<nomeDeUsuario>"
   

    Examples: 
      | nomeDeUsuario  |            email          | senha    |
      | tedoceg750     |    tedoceg750@nnacell.com | Senha123 |
    
