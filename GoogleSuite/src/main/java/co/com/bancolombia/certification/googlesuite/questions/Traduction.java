package co.com.bancolombia.certification.googlesuite.questions;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Traduction implements Question<Boolean> {
	

	@Override
	public Boolean answeredBy(Actor actor) {
		return Text.of(GoogleTranslatePage.TARGET_LANGUAGE_RESULT)
		.viewedBy(actor).asString().contains("Queso");
	}

	public static Traduction displayed() {
		return new Traduction();
	}

	
	
}
