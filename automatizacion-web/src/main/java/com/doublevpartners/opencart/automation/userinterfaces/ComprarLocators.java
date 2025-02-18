package com.doublevpartners.opencart.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ComprarLocators {

    public static Target BTN_ADD_CART(String producto) {
        return Target.the("Botón 'Add to Cart' para el producto " + producto)
                .locatedBy("//a[text()='{0}']/ancestor::div[contains(@class, 'product-thumb')]//button[contains(@onclick, 'cart.add')]")
                .of(producto);
    }

    public static final Target TXT_PRODUCTO_AGREGADO_AL_CARRITO = Target.the("Texto de confirmación al agregar producto al carrito").
            locatedBy("//*[contains(text(),'Success: You have added')]");

    public static Target INPUT_CANTIDAD(String producto) {
        return Target.the("Input cantidad de producto desde el carrito " + producto)
                .locatedBy("(//td[a[text()='{0}']]/ancestor::tr//input[@class='form-control'])[1]")
                .of(producto);
    }

    public static Target ELIMINAR_PRODUCTO(String producto) {
        return Target.the("Boton para eliminar producto del carrito " + producto)
                .locatedBy("(//td[a[text()='{0}']]/ancestor::tr//button[@class='btn btn-danger'])[1]")
                .of(producto);
    }

    public static Target BTN_REFRESCAR_CANTIDAD(String producto) {
        return Target.the("Boton refrescar la cantidad del producto en el carrito para el producto:" + producto)
                .locatedBy("(//td[a[text()='{0}']]/ancestor::tr//button[@class='btn btn-primary'])[1]")
                .of(producto);
    }

    public static final Target BTN_CHECKOUT = Target.the("Botón checkout").
            locatedBy("//*[contains(text(),'Checkout')]");

    public static final Target BTN_CONTINUE_PAYMENT_ADDRESS = Target.the("Botón continuar direccion de facturación")
            .located(By.id("button-payment-address"));

    public static final Target BTN_CONTINUE_SHIPPIG = Target.the("Botón continuar direccion de envio")
            .located(By.id("button-shipping-address"));

    public static final Target BTN_CONTINUE_METHOD = Target.the("Botón continuar método de envio")
            .located(By.id("button-shipping-method"));

    public static final Target BTN_CONTINUE_PAYMENT = Target.the("Botón continuar pago")
            .located(By.id("button-payment-method"));

    public static final Target BTN_CONFIRMAR_ORDEN = Target.the("Botón confirmar orden")
            .located(By.id("button-confirm"));

    public static final Target TXT_COMPRA_EXITOSA = Target.the("Mensaje Confirmación compra exitosa").
            locatedBy("//p[contains(text(),'Your order has been successfully processed!')]");

}