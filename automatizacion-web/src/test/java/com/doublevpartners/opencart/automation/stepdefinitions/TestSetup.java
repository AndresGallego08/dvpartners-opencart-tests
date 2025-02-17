package com.doublevpartners.opencart.automation.stepdefinitions;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class TestSetup {

    private Actor actor;

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        actor = theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

}
