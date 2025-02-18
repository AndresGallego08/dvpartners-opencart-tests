package com.doublevpartners.opencart.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.doublevpartners.opencart.automation.userinterfaces.HomePageLocators.BTN_BUSCAR_PRODUCTO;
import static com.doublevpartners.opencart.automation.userinterfaces.HomePageLocators.INPUT_SEARCH_PRODUCT;

public class Buscar implements Task {

    private final String nombreProducto;

    public Buscar(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static Buscar producto(String nombreProducto) {
        return Tasks.instrumented(Buscar.class, nombreProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreProducto).into(INPUT_SEARCH_PRODUCT),
                Click.on(BTN_BUSCAR_PRODUCTO)
        );
    }
}

