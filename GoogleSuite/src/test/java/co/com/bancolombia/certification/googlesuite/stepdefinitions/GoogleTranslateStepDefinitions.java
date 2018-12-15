package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.questions.Traduction;
import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "Chrome")
	private WebDriver herBrowser; // his browser

	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomePage;
			
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() {
	    // precondiciones: Estar en google translate
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
		                GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}


	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() {
	    // Condiciones: Traducir una palabra de español a ingles
		susan.wasAbleTo(Translate.the());
	  
	}

	@Then("^she would see the word queso in the screen$")
	public void sheWouldSeeTheWordQuesoInTheScreen() {
	   susan.should(seeThat((Traduction.displayed())));
	    
	}
	
}
