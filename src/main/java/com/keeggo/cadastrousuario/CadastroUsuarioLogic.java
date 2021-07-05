package com.keeggo.cadastrousuario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.LogManager;

import com.keeggo.utils.Utils;

public class CadastroUsuarioLogic {
	
	private CadastroUsuarioPage cadastroUsuarioPage;
	private Utils utils;
	private static final org.apache.log4j.Logger LOG = LogManager.getLogger(CadastroUsuarioLogic.class);
	
	
	public CadastroUsuarioLogic() {
		cadastroUsuarioPage = new CadastroUsuarioPage();
		utils = new Utils();
	}

	public void clicarBtnMenuPrincipal() {
		LOG.info("Clico no menu principal");
		utils.waitElement(cadastroUsuarioPage.getBtnMenuPrincipal(), 60);
		utils.click(cadastroUsuarioPage.getBtnMenuPrincipal());
	}

	public void ClicarMenuLogin() {
		LOG.info("Clico no menu Login");
		utils.waitElement(cadastroUsuarioPage.getBtnMenuLogin(), 60);
		utils.click(cadastroUsuarioPage.getBtnMenuLogin());
	}

	public void clicarBtnInscrevaseHoje() {
		LOG.info("Clico no botao Inscreva-se Hoje");
		utils.waitElement(cadastroUsuarioPage.getBtnInscrevaseHoje(), 60);
		utils.click(cadastroUsuarioPage.getBtnInscrevaseHoje());
	}

	public void preencherUsuario(String nomeDeUsuario) {
		LOG.info("Preencho o campo usuario");
		utils.waitElement(cadastroUsuarioPage.getTxtNomeDeUsuario(), 60);
		utils.insertText(cadastroUsuarioPage.getTxtNomeDeUsuario(), nomeDeUsuario);
	}

	public void preencherEmail(String email) {
		LOG.info("Preencho o campo email");
		utils.waitElement(cadastroUsuarioPage.getTxtEmail(), 60);
		utils.insertText(cadastroUsuarioPage.getTxtEmail(), email);		
	}

	public void preencherSenha(String senha) {
		LOG.info("Preencho o campo senha");
		utils.waitElement(cadastroUsuarioPage.getTxtSenha(), 60);
		utils.insertText(cadastroUsuarioPage.getTxtSenha(), senha);				
	}

	public void preencherConfirmacaoDeSenha(String senha) {
		LOG.info("Preencho a confirmacao no campo senha");
		utils.waitElement(cadastroUsuarioPage.getTxtConfirmarSenha(), 60);
		utils.insertText(cadastroUsuarioPage.getTxtConfirmarSenha(), senha);					
	}

	public void validarUsuarioCadastrado(String usuario) {
		LOG.info("Valido o cadastro de usuario");
		utils.waitElement(cadastroUsuarioPage.getTxtUsuarioLogado(), 60);
		assertEquals(usuario, utils.getText(cadastroUsuarioPage.getTxtUsuarioLogado()));
	}

}
