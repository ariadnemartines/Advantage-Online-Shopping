package com.keeggo.casodeteste.cadastrousuario;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/CadastroUsuario.feature",
		glue = { "" }, 
		plugin = {"pretty"}, 
		dryRun = false)

public class CadastroUsuarioRunner{

}
