package com.doublevpartners.opencart.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioLocators extends PageObject {

    public static final Target INPUT_FIRSTNAME = Target.the("Campo Nombre")
            .located(By.id("input-firstname"));
    public static final Target INPUT_LASTNAME = Target.the("Campo Apellido")
            .located(By.id("input-lastname"));
    public static final Target INPUT_EMAIL = Target.the("Campo correo electronico")
            .located(By.id("input-email"));
    public static final Target INPUT_TELEPHONE_NUMBER = Target.the("campo número de telefono")
            .located(By.id("input-telephone"));
    public static final Target INPUT_PASSWORD = Target.the("Campo para ingresar passwrod")
            .located(By.id("input-password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Campo de confirmación de password")
            .located(By.id("input-confirm"));
    public static final Target CHECK_AGREE = Target.the("CheckBox Politica de privacidad").
            locatedBy("//input[@name='agree']");
    public static final Target BTN_CONTINUE = Target.the("Botón Register").
            locatedBy("//input[@class='btn btn-primary']");
    public static final Target TXT_CONFIRMAR_REGISTRO_EXITOSO = Target.the("Texto de confirmación: Registro exitoso").
            locatedBy("//*[text() = 'Congratulations! Your new account has been successfully created!']");

}
