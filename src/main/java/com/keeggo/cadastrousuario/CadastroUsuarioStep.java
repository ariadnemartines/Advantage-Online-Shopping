package com.keeggo.cadastrousuario;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroUsuarioStep {

	private CadastroUsuarioLogic cadastroUsuarioLogic;
	
	public CadastroUsuarioStep() {
		cadastroUsuarioLogic = new CadastroUsuarioLogic();
	}
	
	@Given("abro o menu pricipal")
	public void abro_o_menu_pricipal() {
		cadastroUsuarioLogic.clicarBtnMenuPrincipal();
	}

	@When("acesso o menu {string}")
	public void acesso_o_menu(String string) {
	    cadastroUsuarioLogic.ClicarMenuLogin();
	}

	@And("clico no botao {string}")
	public void clico_no_botao(String string) {
	    cadastroUsuarioLogic.clicarBtnInscrevaseHoje();
	}

	@And("preencho o campo nome de usuario {string}")
	public void preencho_o_campo_nome_de_usuario(String nomeDeUsuario) {
	    cadastroUsuarioLogic.preencherUsuario(nomeDeUsuario);
	}

	@And("preencho o campo email {string}")
	public void preencho_o_campo_email(String email) {
		cadastroUsuarioLogic.preencherEmail(email);
	}

	@And("preencho o campo senha {string}")
	public void preencho_o_campo_senha(String senha) {
		cadastroUsuarioLogic.preencherSenha(senha);
	}

	@And("preencho o campo senha {string} novamente")
	public void preencho_o_campo_senha_novamente(String senha) {
		cadastroUsuarioLogic.preencherConfirmacaoDeSenha(senha);
	}

	@Then("valido o usuario cadastrado")
	public void valido_o_usuario_cadastrado(String usuario) {
		cadastroUsuarioLogic.validarUsuarioCadastrado(usuario);
	}
	
	
}
