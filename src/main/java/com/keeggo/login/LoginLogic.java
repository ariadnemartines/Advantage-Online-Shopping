package com.keeggo.login;

import org.apache.log4j.LogManager;

import com.keeggo.utils.Utils;

public class LoginLogic {

	private LoginPage loginPage;
	private Utils utils;
	private static final org.apache.log4j.Logger LOG = LogManager.getLogger(LoginLogic.class);
	
	public LoginLogic() {
		loginPage = new LoginPage();
		utils = new Utils();
	}

	public void preencherUsuario(String usuario) {
		LOG.info("Preencho o campo usuario");
		utils.waitElement(loginPage.getTxtUsuario(), 60);
		utils.insertText(loginPage.getTxtUsuario(), usuario);
	}

	public void preencherSenha(String senha) {
		LOG.info("Preencho o campo senha");
		utils.waitElement(loginPage.getTxtSenha(), 60);
		utils.insertText(loginPage.getTxtSenha(), senha);		
	}

	public void clicarBtnLogin() {
		LOG.info("Clico no botao Login");
		utils.waitElement(loginPage.getBtnLogin(), 60);
		utils.click(loginPage.getBtnLogin());
	}
}
