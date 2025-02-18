package com.doublevpartners.opencart.automation.stepdefinitions;

import com.doublevpartners.opencart.automation.utils.UrlCertificacion;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TestSetup {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;  // Usamos @Managed para que Serenity maneje el WebDriver

    @Before
    public void setUp() {
        // WebDriverManager configura el ChromeDriver automáticamente
        WebDriverManager.chromedriver().setup();

        // Configura las opciones de Chrome para ignorar los errores de certificado
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");

        // Configura el navegador con las opciones configuradas
        hisBrowser = new ChromeDriver(options);  // Establecemos el WebDriver con las opciones
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

        // Se abre la url de la página de pruebas
        theActorInTheSpotlight().wasAbleTo(Open.url(UrlCertificacion.OPEN_CART_ABSTRACTA));
    }
}
