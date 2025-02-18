package com.doublevpartners.opencart.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.doublevpartners.opencart.automation.userinterfaces.ComprarLocators.*;
import static com.doublevpartners.opencart.automation.userinterfaces.FormularioLocators.CHECK_AGREE;

public class CompletarCompra implements Task {

    public static CompletarCompra exitosamente() {
        return Tasks.instrumented(CompletarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CHECKOUT),
                Click.on(BTN_CONTINUE_PAYMENT_ADDRESS),
                Click.on(BTN_CONTINUE_SHIPPIG),
                Click.on(BTN_CONTINUE_METHOD),
                Click.on(CHECK_AGREE),
                Click.on(BTN_CONTINUE_PAYMENT),
                Click.on(BTN_CONFIRMAR_ORDEN)
        );
    }
}
