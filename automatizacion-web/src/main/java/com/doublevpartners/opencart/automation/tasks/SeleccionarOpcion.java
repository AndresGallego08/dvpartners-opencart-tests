package com.doublevpartners.opencart.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.doublevpartners.opencart.automation.userinterfaces.HomePageLocators.*;
import static com.doublevpartners.opencart.automation.userinterfaces.LoginLocators.BTN_OLVIDO_PASSWORD;


public class SeleccionarOpcion implements Task {

    private String opcion;
    String producto;

    public SeleccionarOpcion(String opcion) {
        this.opcion = opcion;
    }

    public static SeleccionarOpcion opcion(String opcion) {
        return new SeleccionarOpcion(opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (opcion) {
            case "formulario de registro":
                actor.attemptsTo(
                        Click.on(BTN_MY_ACCOUNT),
                        Click.on(BTN_REGISTER)
                );
                break;
            case "login":
                actor.attemptsTo(
                        Click.on(BTN_MY_ACCOUNT),
                        Click.on(BTN_LOGIN)
                );
                break;
            case "recuperar contraseña":
                actor.attemptsTo(
                        Click.on(BTN_MY_ACCOUNT),
                        Click.on(BTN_LOGIN),
                        Click.on(BTN_OLVIDO_PASSWORD)
                );
                break;
            case "Laptops & Notebooks":
                actor.attemptsTo(
                        Click.on(CATEGORIA_LAPTOS_NOTEBOOKS)
                );
                break;
            case "Show All Laptops & Notebooks":
                actor.attemptsTo(
                        Click.on(SHOW_ALL_LAPTOS_NOTEBOOKS)
                );
                break;
            case "Shopping Cart":
                actor.attemptsTo(
                        Click.on(BTN_CART)
                );
                break;
            default:
                throw new IllegalArgumentException("Opción no soportada: " + opcion);
        }
    }
}



