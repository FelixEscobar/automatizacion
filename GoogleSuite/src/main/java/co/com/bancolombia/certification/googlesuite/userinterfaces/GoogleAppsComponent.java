package co.com.bancolombia.certification.googlesuite.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));
    public static final Target GOOGLE_TRANSLATE = Target.the("Google Traslate Option").located(By.id("gb51"));
}
