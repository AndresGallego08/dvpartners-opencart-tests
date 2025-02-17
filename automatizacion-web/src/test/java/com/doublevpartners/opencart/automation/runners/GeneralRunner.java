package com.doublevpartners.opencart.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/feature.feature",
        glue = "com.doublevpartners.opencart.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GeneralRunner {
}
