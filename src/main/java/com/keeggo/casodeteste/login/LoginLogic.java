package com.keeggo.casodeteste.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.keeggo.casodeteste.cadastrousuario.CadastroUsuarioPage;
import com.keeggo.core.DriverMobile;
import com.keeggo.core.Utils;

import lombok.extern.log4j.Log4j;

@Log4j
public class LoginLogic {

	private LoginPage loginPage;
	private CadastroUsuarioPage cadastroUsuarioPage;
	private Utils utils;

	public LoginLogic() {
		loginPage = new LoginPage();
		cadastroUsuarioPage = new CadastroUsuarioPage();
		utils = new Utils(DriverMobile.getDriver());
	}

	public void preencherUsuario(String usuario) {
		log.info("Preencho o campo usuario");
		utils.waitElement(loginPage.getTxtUsuario(), 60);
		utils.insertText(loginPage.getTxtUsuario(), usuario);
		utils.takeScreenShot();
	}

	public void preencherSenha(String senha) {
		log.info("Preencho o campo senha");
		utils.waitElement(loginPage.getTxtSenha(), 60);
		utils.insertText(loginPage.getTxtSenha(), senha);
		utils.takeScreenShot();
	}

	public void clicarBtnLogin() {
		log.info("Clico no botao Login");
		utils.waitElement(loginPage.getBtnLogin(), 60);
		utils.takeScreenShot();
		utils.click(loginPage.getBtnLogin());
	}

	public void validarUsuarioLogado(String usuario) {
		log.info("Valido usuario logado");
		utils.waitElement(cadastroUsuarioPage.getTxtUsuarioLogado(), 60);
		assertEquals(usuario, utils.getText(cadastroUsuarioPage.getTxtUsuarioLogado()));
		utils.takeScreenShot();
	}
}
