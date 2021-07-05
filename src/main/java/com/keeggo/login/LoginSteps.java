package com.keeggo.login;

import io.cucumber.java.en.And;

public class LoginSteps {
	
	private LoginLogic loginLogic;
	
	public LoginSteps() {
		loginLogic = new LoginLogic();
	}

	@And("preencho o campo usuario {string} em Login")
	public void preencho_o_campo_usuario_em_login(String usuario) {
		loginLogic.preencherUsuario(usuario);
	}

	@And("preencho o campo senha {string} em Login")
	public void preencho_o_campo_senha_em_login(String senha) {
	    loginLogic.preencherSenha(senha);
	}
	
	@And("clico no botao 'Login'")
	public void clico_no_botao_login() {
		loginLogic.clicarBtnLogin();
	}
}
