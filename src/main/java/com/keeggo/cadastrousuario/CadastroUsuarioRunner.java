package com.keeggo.cadastrousuario;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features/CadastroUsuario.feature"}, glue = { "com.keeggo.cadastrousuario" }, plugin = {"pretty"}, dryRun = false)

public class CadastroUsuarioRunner{

}
