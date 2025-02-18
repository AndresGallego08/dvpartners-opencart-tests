package com.doublevpartners.opencart.automation.stepdefinitions;

import com.doublevpartners.opencart.automation.exceptions.RegistroFallidoExceptions;
import com.doublevpartners.opencart.automation.models.TestData;
import com.doublevpartners.opencart.automation.questions.ElTexto;
import com.doublevpartners.opencart.automation.questions.LaConfirmarcion;
import com.doublevpartners.opencart.automation.tasks.Login;
import com.doublevpartners.opencart.automation.tasks.Recuperar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {

    @Cuando("^ingresa las credenciales$")
    public void ingresaLasCredenciales(List<TestData> testDataList) {
        theActorInTheSpotlight().attemptsTo(Login.enLaPagina(testDataList.get(0)));
    }

    @Cuando("^ingresa el correo$")
    public void ingresaCorreoRestablecerPassword(List<TestData> testDataList) {
        theActorInTheSpotlight().attemptsTo(Recuperar.password(testDataList.get(0)));
    }

    @Entonces("^puede ver el texto (.*)$")
    public void puedeVerElTexto(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ElTexto.deConfirmacion(), Matchers.containsString(mensaje)).
                orComplainWith(RegistroFallidoExceptions.class, "El texto esperado: - " + mensaje + " - no se visualiza correctamente"));
    }

    @Entonces("^se envia el correo de reestablecimiento (.*)$")
    public void seEnviaCorreoDeRecuperacion(String mensaje) {
        theActorInTheSpotlight().should(seeThat(LaConfirmarcion.deRecuperacion(), Matchers.containsString(mensaje)).
                orComplainWith(RegistroFallidoExceptions.class, "El texto esperado: - " + mensaje + " - no se visualiza correctamente"));
    }
}
