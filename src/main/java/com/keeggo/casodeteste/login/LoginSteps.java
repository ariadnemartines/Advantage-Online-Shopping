package com.keeggo.casodeteste.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	private LoginLogic loginLogic;
	
	public LoginSteps() {
		loginLogic = new LoginLogic();
	}
	
	@When("^preencho o campo usuario \"([^\"]*)\" em Login$")
	public void preencho_o_campo_usuario_em_Login(String usuario) throws Throwable {
		loginLogic.preencherUsuario(usuario);
	}

	@When("^preencho o campo senha \"([^\"]*)\" em Login$")
	public void preencho_o_campo_senha_em_Login(String senha) throws Throwable {
		loginLogic.preencherSenha(senha);
	}

	@When("^clico no botao 'Login'$")
	public void clico_no_botao_Login() throws Throwable {
		loginLogic.clicarBtnLogin();
	}

	@Then("^valido o usuario logado \"([^\"]*)\"$")
	public void valido_o_usuario_logado(String usuario) throws Throwable {
		loginLogic.validarUsuarioLogado(usuario);
	}



}
