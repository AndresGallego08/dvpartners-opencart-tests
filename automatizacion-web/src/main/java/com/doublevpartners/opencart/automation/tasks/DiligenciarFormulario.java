package com.doublevpartners.opencart.automation.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.doublevpartners.opencart.automation.userinterfaces.FormularioLocators.*;

public class DiligenciarFormulario implements Task {

    // Método estático para crear la tarea
    public static DiligenciarFormulario deRegistro() {
        return Tasks.instrumented(DiligenciarFormulario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker(); // Instancia de Faker para generar los datos

        // Generamos los datos aleatorios usando Faker
        String nombre = faker.name().firstName();
        String apellido = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String telefono = faker.phoneNumber().phoneNumber();
        String contrasena = faker.internet().password();

        // Aseguramos que la contraseña y la confirmación de la contraseña sean iguales
        String confirmarContrasena = contrasena;

        // Usamos el actor para diligenciar los campos en la UI
        actor.attemptsTo(
                Enter.theValue(nombre).into(INPUT_FIRSTNAME),
                Enter.theValue(apellido).into(INPUT_LASTNAME),
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(telefono).into(INPUT_TELEPHONE_NUMBER),
                Enter.theValue(contrasena).into(INPUT_PASSWORD),
                Enter.theValue(confirmarContrasena).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_AGREE),
                Click.on(BTN_CONTINUE)
        );
    }
}
