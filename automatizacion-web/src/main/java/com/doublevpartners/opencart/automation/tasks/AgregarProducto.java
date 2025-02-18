package com.doublevpartners.opencart.automation.tasks;

import com.doublevpartners.opencart.automation.userinterfaces.ComprarLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProducto implements Task {

    private final String producto;

    public AgregarProducto(String producto) {
        this.producto = producto;
    }

    public static AgregarProducto alCarrito(String producto) {
        return Tasks.instrumented(AgregarProducto.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ComprarLocators.BTN_ADD_CART(producto))
        );
    }
}

