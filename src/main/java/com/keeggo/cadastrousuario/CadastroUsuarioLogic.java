package com.keeggo.cadastrousuario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.LogManager;

import com.keeggo.utils.DriverMobile;
import com.keeggo.utils.Utils;

public class CadastroUsuarioLogic {
	
	private CadastroUsuarioPage cadastroUsuarioPage;
	private Utils utils;
	private static final org.apache.log4j.Logger log = LogManager.getLogger(CadastroUsuarioLogic.class);
	
	
	public CadastroUsuarioLogic() {
		cadastroUsuarioPage = new CadastroUsuarioPage();
		utils = new Utils(DriverMobile.getDriver());
	}

	public void clicarBtnMenuPrincipal() {
		log.info("Clico no menu principal");
		utils.waitElement(cadastroUsuarioPage.getBtnMenuPrincipal(), 60);
		utils.click(cadastroUsuarioPage.getBtnMenuPrincipal());
	}

	public void ClicarMenuLogin() {
		log.info("Clico no menu Login");
		utils.waitElement(cadastroUsuarioPage.getBtnMenuLogin(), 60);
		utils.click(cadastroUsuarioPage.getBtnMenuLogin());
	}

	public void clicarBtnInscrevaseHoje() {
		log.info("Clico no botao Inscreva-se Hoje");
		utils.waitElement(cadastroUsuarioPage.getBtnInscrevaseHoje(), 60);
		utils.click(cadastroUsuarioPage.getBtnInscrevaseHoje());
	}

	public void preencherUsuario(String nomeDeUsuario) {
		log.info("Preencho o campo usuario");
		utils.waitElement(cadastroUsuarioPage.getTxtNomeDeUsuario(), 60);
		utils.insertText(cadastroUsuarioPage.getTxtNomeDeUsuario(), nomeDeUsuario);
	}

	public void preencherEmail(String email) {
		log.info("Preencho o campo email");
		utils.waitElement(cadastroUsuarioPage.getTxtEmail(), 60);
		utils.insertText(cadastroUsuarioPage.getTxtEmail(), email);		
	}

	public void preencherSenha(String senha) {
		log.info("Preencho o campo senha");
		utils.waitElement(cadastroUsuarioPage.getTxtSenha(), 60);
		utils.insertText(cadastroUsuarioPage.getTxtSenha(), senha);				
	}

	public void preencherConfirmacaoDeSenha(String senha) {
		log.info("Preencho a confirmacao no campo senha");
		utils.waitElement(cadastroUsuarioPage.getTxtConfirmarSenha(), 60);
		utils.insertText(cadastroUsuarioPage.getTxtConfirmarSenha(), senha);					
	}

	public void validarUsuarioCadastrado(String usuario) {
		log.info("Valido o cadastro de usuario");
		utils.waitElement(cadastroUsuarioPage.getTxtUsuarioLogado(), 60);
		assertEquals(usuario, utils.getText(cadastroUsuarioPage.getTxtUsuarioLogado()));
	}

	public void clicarBtnRegistrar() {
		log.info("clico no botao Registrar");
		//inserir swipe
		utils.click(cadastroUsuarioPage.getBtnRegistrar());
	}

}
