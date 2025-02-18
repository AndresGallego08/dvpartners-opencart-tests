package com.doublevpartners.opencart.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginLocators extends PageObject {

    public static final Target INPUT_EMAIL = Target.the("Campo Email")
            .located(By.id("input-email"));
    public static final Target INPUT_PASSWORD = Target.the("Campo contraseña")
            .located(By.id("input-password"));
    public static final Target BTN_LOGIN = Target.the("Botón Login").
            locatedBy("//input[@class='btn btn-primary']");
    public static final Target TXT_MY_ORDERS = Target.the("Texto de confirmación: Registro exitoso").
            locatedBy("//*[text()='My Orders']");
    public static final Target BTN_OLVIDO_PASSWORD = Target.the("Linkd de olvió su password").
            locatedBy("//*[contains(text(),'Forgotten Password')]");
    public static final Target BTN_CONTINUAR_RECUPERACION_PASSWORD = Target.the("Botón recuperar password").
            locatedBy("//input[@value='Continue']");
    public static final Target TXT_CONFIRMACION_REESTABLECER_PASSWORD = Target.the("Texto de confirmación: Reestablecer Password").
            locatedBy("//*[text()=' An email with a confirmation link has been sent your email address.']");

}
