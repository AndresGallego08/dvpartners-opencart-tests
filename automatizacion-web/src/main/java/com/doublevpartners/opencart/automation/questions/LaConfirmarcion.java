package com.doublevpartners.opencart.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.doublevpartners.opencart.automation.userinterfaces.LoginLocators.TXT_CONFIRMACION_REESTABLECER_PASSWORD;


public class LaConfirmarcion implements Question<String> {

    public static LaConfirmarcion deRecuperacion() {
        return new LaConfirmarcion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_CONFIRMACION_REESTABLECER_PASSWORD).viewedBy(actor).asString();
    }
}
