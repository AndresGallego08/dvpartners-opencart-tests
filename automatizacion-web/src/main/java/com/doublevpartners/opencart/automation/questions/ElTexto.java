package com.doublevpartners.opencart.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.doublevpartners.opencart.automation.userinterfaces.LoginLocators.TXT_MY_ORDERS;


public class ElTexto implements Question<String> {

    public static ElTexto deConfirmacion() {
        return new ElTexto();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_MY_ORDERS).viewedBy(actor).asString();
    }
}
