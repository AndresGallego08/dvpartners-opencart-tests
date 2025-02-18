package com.doublevpartners.opencart.automation.stepdefinitions;

import com.doublevpartners.opencart.automation.exceptions.RegistroFallidoExceptions;
import com.doublevpartners.opencart.automation.questions.ConfirmacionCompra;
import com.doublevpartners.opencart.automation.questions.ConfirmacionProducto;
import com.doublevpartners.opencart.automation.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompletarCompraSteps {

    @Cuando("^agrega el producto (.*) al carrito$")
    public void agregarProductoDesdedListadoDeProductos(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarrito(producto));
    }

    @Entonces("^el producto se agrega exitosamente al carrito (.*)$")
    public void puedeVerElTexto(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ConfirmacionProducto.productoAgregado(), Matchers.containsString(mensaje)).
                orComplainWith(RegistroFallidoExceptions.class, "Producto no pudo ser agregado al carrito"));
    }

    @Y("^el usuario busca el producto (.*)$")
    public void buscarAgragarProductoAlCarrito(String producto) {
        theActorInTheSpotlight().attemptsTo(Buscar.producto(producto));
    }

    @Y("^el usuario elimina del carrito el producto (.*)$")
    public void eliminarProductoDelCarrito(String producto) {
        theActorInTheSpotlight().attemptsTo(Eliminar.productoDelCarrito(producto));
    }

    @Y("^agrega (.*) unidad del producto (.*)$")
    public void modificarCantidadProducto(String cantidadProducto, String producto) {
        theActorInTheSpotlight().attemptsTo(ModificarCantidad.deProducto(cantidadProducto, producto));
    }

    @Cuando("^el usuario completa la compra$")
    public void completarCompra() {
        theActorInTheSpotlight().attemptsTo(CompletarCompra.exitosamente());
    }

    @Entonces("^la compra es completada con exito (.*)$")
    public void mensajeCompraExitosa(String mensajeCompraExitosa) {
        theActorInTheSpotlight().should(seeThat(ConfirmacionCompra.exitosa(), Matchers.containsString(mensajeCompraExitosa)).
                orComplainWith(RegistroFallidoExceptions.class, "La compra no pudo ser completada"));
    }
}
