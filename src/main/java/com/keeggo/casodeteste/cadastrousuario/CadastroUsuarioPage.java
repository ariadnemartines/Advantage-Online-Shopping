package com.keeggo.casodeteste.cadastrousuario;

import org.openqa.selenium.By;

import lombok.Getter;

@Getter
public class CadastroUsuarioPage {
	
	
	private By btnMenuPrincipal = By.id("com.Advantage.aShopping:id/imageViewMenu");
	private By btnMenuLogin = By.xpath("//*[contains(@text, 'LOGIN')]");
	private By btnInscrevaseHoje = By.xpath("//*[contains(@text, 'SIGN UP TODAY')]/..");
	private By txtNomeDeUsuario = By.xpath("(//*[@class='android.widget.EditText'])[1]");
	private By txtEmail = By.xpath("(//*[@class='android.widget.EditText'])[2]");
	private By txtSenha = By.xpath("(//*[@class='android.widget.EditText'])[3]");
	private By txtConfirmarSenha = By.xpath("(//*[@class='android.widget.EditText'])[4]");
	private By btnRegistrar = By.xpath("//*[contains(@text, 'REGISTER')]");
	private By txtUsuarioLogado = By.xpath("//*[@resource-id='com.Advantage.aShopping:id/textViewMenuUser']");
	
}
