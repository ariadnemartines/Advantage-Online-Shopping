package com.keeggo.casodeteste.cadastrousuario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroUsuarioStep {

	private CadastroUsuarioLogic cadastroUsuarioLogic;
	
	public CadastroUsuarioStep() {
		cadastroUsuarioLogic = new CadastroUsuarioLogic();
	}
	
	@Given("^abro o menu pricipal$")
	public void abro_o_menu_pricipal() throws Throwable {
		cadastroUsuarioLogic.clicarBtnMenuPrincipal();
	}

	@When("^acesso o menu 'Login'$")
	public void acesso_o_menu_Login() throws Throwable {
	    cadastroUsuarioLogic.ClicarMenuLogin();
	}

	@When("^clico no botao 'Inscreva-se Hoje'$")
	public void clico_no_botao_Inscreva_se_Hoje() throws Throwable {
		cadastroUsuarioLogic.clicarBtnInscrevaseHoje();
	}

	@When("^preencho o campo nome de usuario \"([^\"]*)\"$")
	public void preencho_o_campo_nome_de_usuario(String nomeDeUsuario) throws Throwable {
		cadastroUsuarioLogic.preencherUsuario(nomeDeUsuario);
	}

	@When("^preencho o campo email \"([^\"]*)\"$")
	public void preencho_o_campo_email(String email) throws Throwable {
		cadastroUsuarioLogic.preencherEmail(email);
	}

	@When("^preencho o campo senha \"([^\"]*)\"$")
	public void preencho_o_campo_senha(String senha) throws Throwable {
		cadastroUsuarioLogic.preencherSenha(senha);
	}

	@When("^preencho o campo senha \"([^\"]*)\" novamente$")
	public void preencho_o_campo_senha_novamente(String senha) throws Throwable {
		cadastroUsuarioLogic.preencherConfirmacaoDeSenha(senha);
	}

	@When("^clico no botao 'Registrar'$")
	public void clico_no_botao_Registrar() throws Throwable {
		cadastroUsuarioLogic.clicarBtnRegistrar();
	}

	@Then("^valido o usuario cadastrado \"([^\"]*)\"$")
	public void valido_o_usuario_cadastrado(String usuario) throws Throwable {
		cadastroUsuarioLogic.validarUsuarioCadastrado(usuario);
	}
}
