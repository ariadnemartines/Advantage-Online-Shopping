package com.keeggo.casodeteste.login;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/Login.feature",
		glue = { "" }, 
		plugin = {"pretty"}, 
		dryRun = false)

public class LoginRunner {

}
