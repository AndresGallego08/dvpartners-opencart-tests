package com.doublevpartners.opencart.automation.stepdefinitions;

import com.doublevpartners.opencart.automation.exceptions.RegistroFallidoExceptions;
import com.doublevpartners.opencart.automation.questions.ElMensaje;
import com.doublevpartners.opencart.automation.tasks.DiligenciarFormulario;
import com.doublevpartners.opencart.automation.tasks.SeleccionarOpcion;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioRegistroSteps {

    @Dado("^que el usuario ingresa a la opción (.*)")
    @Y("^el usuario ingresa a la opción (.*)")
    public void queElUsuarioIngresaAlFormularioDeRegistro(String opcion) {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.opcion(opcion));
    }

    @Y("^diligencia el formulario de registro")
    public void diligenciaElFormularioDeRegistro() {
        theActorInTheSpotlight().attemptsTo(DiligenciarFormulario.deRegistro());
    }

    @Entonces("^puede ver el mensaje (.*)$")
    public void puedeVerElMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ElMensaje.deConfirmacion(), Matchers.containsString(mensaje)).
                orComplainWith(RegistroFallidoExceptions.class, "No se pudo completar el registro"));
    }
}