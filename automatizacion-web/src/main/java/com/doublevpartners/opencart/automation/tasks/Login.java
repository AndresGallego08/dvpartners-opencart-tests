package com.doublevpartners.opencart.automation.tasks;

import com.doublevpartners.opencart.automation.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.doublevpartners.opencart.automation.userinterfaces.LoginLocators.*;

public class Login implements Task {

    private TestData testData;

    public Login(TestData testData) {
        this.testData = testData;
    }

    public static Login enLaPagina(TestData testData) {

        return Tasks.instrumented(Login.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testData.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(testData.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

}
