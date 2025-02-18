package com.doublevpartners.opencart.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.doublevpartners.opencart.automation.userinterfaces.FormularioLocators.TXT_CONFIRMAR_REGISTRO_EXITOSO;


public class ElMensaje implements Question<String> {

    public static ElMensaje deConfirmacion() {
        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_CONFIRMAR_REGISTRO_EXITOSO).viewedBy(actor).asString();
    }
}
