package com.keeggo.casodeteste.login;

import org.openqa.selenium.By;

import lombok.Getter;

@Getter
public class LoginPage {
	
	private By txtUsuario = By.xpath("(//*[@class='android.widget.EditText'])[1]");
	private By txtSenha = By.xpath("(//*[@class='android.widget.EditText'])[2]");
	private By btnLogin = By.xpath("//*[contains(@text, 'LOGIN')]");
	
}
