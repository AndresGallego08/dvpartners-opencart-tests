package com.doublevpartners.opencart.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageLocators extends PageObject {

    public static final Target BTN_MY_ACCOUNT = Target.the("Botón My Account").
            locatedBy("//*[contains(text(),'My Account')]");

    public static final Target BTN_REGISTER = Target.the("Botón Register").
            locatedBy("//*[contains(text(),'Register')]");

    public static final Target BTN_LOGIN = Target.the("Botón Login").
            locatedBy("//*[contains(text(),'Login')]");

    public static Target CATEGORIA_LAPTOS_NOTEBOOKS = Target.the("Seleccionar la opción Laptops & Notebooks").
            locatedBy("//*[contains(text(),'Laptops & Notebooks')]");

    public static Target SHOW_ALL_LAPTOS_NOTEBOOKS = Target.the("Seleccionar la opción ver todo Laptops & Notebooks").
            locatedBy("//*[contains(text(),'Show All Laptops & Notebooks')]");

    public static final Target INPUT_SEARCH_PRODUCT = Target.the("Campo para buscar producto")
            .locatedBy("//input[@name='search']");

    public static Target BTN_BUSCAR_PRODUCTO = Target.the("Botón buscar producto").
            locatedBy("//i[@class='fa fa-search']");

    public static Target BTN_CART = Target.the("Botón del carrito de compras").
            locatedBy("//*[contains(text(),'Shopping Cart')]");

}
