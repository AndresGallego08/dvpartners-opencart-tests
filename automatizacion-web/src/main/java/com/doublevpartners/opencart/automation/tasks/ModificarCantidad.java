package com.doublevpartners.opencart.automation.tasks;

import com.doublevpartners.opencart.automation.userinterfaces.ComprarLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Attribute;

public class ModificarCantidad implements Task {

    private final String producto;
    private final String cantidadProducto;

    public ModificarCantidad(String cantidadProducto, String producto) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
    }

    public static ModificarCantidad deProducto(String cantidadProducto, String producto) {
        return Tasks.instrumented(ModificarCantidad.class, cantidadProducto, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Obtener el valor actual del input como String
        String valorCantidadStr = Attribute.of(ComprarLocators.INPUT_CANTIDAD(producto))
                .named("value")
                .viewedBy(actor)
                .asString();

        // Convertir los valores a enteros
        int valorCantidad = Integer.parseInt(valorCantidadStr);
        int cantidadAAgregar = Integer.parseInt(cantidadProducto);

        // Sumar los valores
        int nuevoValor = valorCantidad + cantidadAAgregar;

        // Guardar el nuevo valor en una variable
        String nuevoValorStr = String.valueOf(nuevoValor);

        actor.attemptsTo(
                Enter.theValue(nuevoValorStr).into(ComprarLocators.INPUT_CANTIDAD(producto)),
                Click.on(ComprarLocators.BTN_REFRESCAR_CANTIDAD(producto))
        );
    }
}

