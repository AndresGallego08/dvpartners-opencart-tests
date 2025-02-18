package com.doublevpartners.opencart.automation.tasks;

import com.doublevpartners.opencart.automation.userinterfaces.ComprarLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Eliminar implements Task {
    private final String producto;

    public Eliminar(String producto) {
        this.producto = producto;
    }

    public static Eliminar productoDelCarrito(String producto) {
        return Tasks.instrumented(Eliminar.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ComprarLocators.ELIMINAR_PRODUCTO(producto))
        );
    }
}
