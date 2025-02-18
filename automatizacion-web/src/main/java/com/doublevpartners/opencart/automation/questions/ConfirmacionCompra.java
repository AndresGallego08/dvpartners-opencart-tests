package com.doublevpartners.opencart.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.doublevpartners.opencart.automation.userinterfaces.ComprarLocators.TXT_COMPRA_EXITOSA;

public class ConfirmacionCompra implements Question<String> {

    public static ConfirmacionCompra exitosa() {
        return new ConfirmacionCompra();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_COMPRA_EXITOSA).viewedBy(actor).asString();
    }
}
