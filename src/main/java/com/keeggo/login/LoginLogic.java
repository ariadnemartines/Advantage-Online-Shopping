package com.keeggo.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.LogManager;

import com.keeggo.cadastrousuario.CadastroUsuarioPage;
import com.keeggo.utils.DriverMobile;
import com.keeggo.utils.Utils;

public class LoginLogic {

	private LoginPage loginPage;
	private CadastroUsuarioPage cadastroUsuarioPage;
	private Utils utils;
	private static final org.apache.log4j.Logger log = LogManager.getLogger(LoginLogic.class);
	
	public LoginLogic() {
		loginPage = new LoginPage();
		cadastroUsuarioPage = new CadastroUsuarioPage();
		utils = new Utils(DriverMobile.getDriver());
	}

	public void preencherUsuario(String usuario) {
		log.info("Preencho o campo usuario");
		utils.waitElement(loginPage.getTxtUsuario(), 60);
		utils.insertText(loginPage.getTxtUsuario(), usuario);
	}

	public void preencherSenha(String senha) {
		log.info("Preencho o campo senha");
		utils.waitElement(loginPage.getTxtSenha(), 60);
		utils.insertText(loginPage.getTxtSenha(), senha);		
	}

	public void clicarBtnLogin() {
		log.info("Clico no botao Login");
		utils.waitElement(loginPage.getBtnLogin(), 60);
		utils.click(loginPage.getBtnLogin());
	}

	public void validarUsuarioLogado(String usuario) {
		log.info("Clico no botao Login");
		utils.waitElement(cadastroUsuarioPage.getTxtUsuarioLogado(), 60);
		assertEquals(usuario, utils.getText(cadastroUsuarioPage.getTxtUsuarioLogado()));
	}
}
