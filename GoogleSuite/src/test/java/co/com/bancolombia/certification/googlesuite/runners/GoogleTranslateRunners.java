package co.com.bancolombia.certification.googlesuite.runners;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src\\test\\resources\\features\\google_traslate.feature",
		glue = "co.com.bancolombia.certification.googlesuite.stepdefinitions",
		snippets = SnippetType.CAMELCASE)

public class GoogleTranslateRunners {

}
