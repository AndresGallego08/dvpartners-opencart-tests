package com.doublevpartners.opencart.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.doublevpartners.opencart.automation.userinterfaces.ComprarLocators.TXT_PRODUCTO_AGREGADO_AL_CARRITO;

public class ConfirmacionProducto implements Question<String> {

    public static ConfirmacionProducto productoAgregado() {
        return new ConfirmacionProducto();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_PRODUCTO_AGREGADO_AL_CARRITO).viewedBy(actor).asString();
    }
}
